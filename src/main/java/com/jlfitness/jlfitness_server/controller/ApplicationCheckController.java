package com.jlfitness.jlfitness_server.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app/check")
public class ApplicationCheckController {

    @GetMapping()
    public ResponseEntity<String> checkApp(){
        return new ResponseEntity<String>("App is running.....", HttpStatus.OK);
    }


}
