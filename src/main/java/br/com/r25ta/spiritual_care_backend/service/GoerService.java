package br.com.r25ta.spiritual_care_backend.service;

import java.util.List;


import org.springframework.stereotype.Service;

import br.com.r25ta.spiritual_care_backend.model.Goer;
import br.com.r25ta.spiritual_care_backend.repository.GoerRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GoerService {
    
    GoerRepository goerRepository;

    public List<Goer> getAllGoer(){
        return goerRepository.findAll();
    }
}
