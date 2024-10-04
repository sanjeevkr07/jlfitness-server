package com.jlfitness.jlfitness_server.controller;

import com.jlfitness.jlfitness_server.dto.MembersDto;
import com.jlfitness.jlfitness_server.service.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/members")
public class MembersController {

    @Autowired
    private MembersService memberService;

    @PostMapping
    public ResponseEntity<MembersDto> addMember(@RequestBody MembersDto membersDto) {

        MembersDto savedMemberDto = memberService.addMember(membersDto);
        return new ResponseEntity<>(savedMemberDto, HttpStatus.CREATED);
    }
}
