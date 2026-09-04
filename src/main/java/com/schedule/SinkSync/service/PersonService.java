package com.schedule.SinkSync.service;

import com.schedule.SinkSync.dto.PersonRequestDto;
import com.schedule.SinkSync.dto.PersonResponseDto;
import com.schedule.SinkSync.mapping.PersonMap;
import com.schedule.SinkSync.model.Person;
import com.schedule.SinkSync.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class PersonService {
    private final PersonRepository personRepository;
    private PersonMap personMap;

    public void createPerson(PersonRequestDto personRequestDto) {
        Person person = new Person();
        person.setName(personRequestDto.getName());
        person.setActive(personRequestDto.getActive());
        personRepository.save(person);
    }
    public PersonResponseDto getPersonById(Long id) {
        Person person=personRepository.findById(id).orElseThrow(()->new RuntimeException("Person not found"));
        return personMap.personToPersonResponseDto(person);
    }

}
