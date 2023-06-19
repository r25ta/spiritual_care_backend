package br.com.r25ta.spiritual_care_backend.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloWord {
    
    @GetMapping
    public ResponseEntity<String> hello(@RequestHeader(HttpHeaders.ACCEPT_LANGUAGE) String language){
        String resp = "Your browser language is" + language;
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }


}
