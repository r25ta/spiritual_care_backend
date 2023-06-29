package br.com.r25ta.spiritual_care_backend.controller;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.r25ta.spiritual_care_backend.model.Goer;
import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.r25ta.spiritual_care_backend.service.GoerService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/goer")
@AllArgsConstructor
@JsonFormat
public class GoerController {
    
    private GoerService goerService;

    @GetMapping
    public ResponseEntity<List<Goer>>getAllGoers(){
        try{
            return new ResponseEntity<List<Goer>>(goerService.getAllGoer(), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<List<Goer>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
