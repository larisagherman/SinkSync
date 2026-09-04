package com.schedule.SinkSync.mapping;

import com.schedule.SinkSync.dto.PersonResponseDto;
import com.schedule.SinkSync.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMap{
    PersonResponseDto personToPersonResponseDto(Person person);

}
