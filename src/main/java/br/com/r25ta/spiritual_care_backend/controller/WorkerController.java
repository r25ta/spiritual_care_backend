package br.com.r25ta.spiritual_care_backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;
import br.com.r25ta.spiritual_care_backend.model.Worker;
import br.com.r25ta.spiritual_care_backend.service.WorkerService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/worker")
@JsonFormat
@AllArgsConstructor
public class WorkerController {
    private WorkerService workerService;

    @GetMapping
    public ResponseEntity<List<Worker>>getAllWorkers(){
        try{
            return new ResponseEntity<List<Worker>>(workerService.getAllWorker(),HttpStatus.OK);
        
        }catch(Exception e){
            return new ResponseEntity<List<Worker>>(HttpStatus.INTERNAL_SERVER_ERROR);

        }
        
    }
}
