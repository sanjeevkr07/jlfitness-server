package com.jlfitness.jlfitness_server.mapper;

import com.jlfitness.jlfitness_server.dto.MembersDto;
import com.jlfitness.jlfitness_server.entity.Members;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MembersMapper {
    // DTO to Entity
    Members toEntity(MembersDto membersDto);

    // Entity to DTO
    MembersDto toDto(Members members);
}
