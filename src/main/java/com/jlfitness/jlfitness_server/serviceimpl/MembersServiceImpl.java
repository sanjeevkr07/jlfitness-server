package com.jlfitness.jlfitness_server.serviceimpl;

import com.jlfitness.jlfitness_server.dto.MembersDto;
import com.jlfitness.jlfitness_server.entity.Members;
import com.jlfitness.jlfitness_server.mapper.MembersMapper;
import com.jlfitness.jlfitness_server.repository.MembersRepository;
import com.jlfitness.jlfitness_server.service.MembersService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class MembersServiceImpl implements MembersService {

    @Autowired
    private MembersRepository membersRepository;

    @Autowired
    private MembersMapper membersMapper;

    public MembersDto addMember(MembersDto membersDto) {

        Members member = membersMapper.toEntity(membersDto);
        Members savedMember = membersRepository.save(member);

        return membersMapper.toDto(savedMember);
    }
}
