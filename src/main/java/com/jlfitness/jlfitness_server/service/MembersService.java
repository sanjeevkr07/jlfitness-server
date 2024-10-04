package com.jlfitness.jlfitness_server.service;

import com.jlfitness.jlfitness_server.dto.MembersDto;
import org.springframework.stereotype.Service;

@Service
public interface MembersService {
    public MembersDto addMember(MembersDto membersDto);
}
