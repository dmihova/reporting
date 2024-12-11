package com.tinqin.academy.reporting.apiadapter.mappers;

import com.tinqin.academy.reporting.api.operations.postevent.CreateEventInput;
import com.tinqin.academy.reporting.api.operations.postevent.CreateEventOutput;
import com.tinqin.academy.reporting.apiadapter.operations.postevent.ReportingCreateEventInput;
import com.tinqin.academy.reporting.apiadapter.operations.postevent.ReportingCreateEventOutput;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = ModelMapper.class)
public interface CreateEventMapper {

    CreateEventMapper INSTANCE = Mappers.getMapper(CreateEventMapper.class);

    ReportingCreateEventInput toReporting(CreateEventInput input);

    CreateEventOutput toApiResult(ReportingCreateEventOutput output);
}
