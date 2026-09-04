package com.schedule.SinkSync.controller;

import com.schedule.SinkSync.dto.PersonRequestDto;
import com.schedule.SinkSync.dto.PersonResponseDto;
import com.schedule.SinkSync.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
@AllArgsConstructor
public class PersonController {
    private final PersonService personService;

    @PostMapping
    public void createPerson(PersonRequestDto personRequestDto) {
        personService.createPerson(personRequestDto);
    }
    @GetMapping("/{id}")
    public PersonResponseDto getPersonById(@PathVariable Long id) {
        return personService.getPersonById(id);
    }
}
