package com.microservice.microservice.resources;

import com.microservice.microservice.entity.Worker;
import com.microservice.microservice.repository.WorkerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

    private Logger logger = LoggerFactory.getLogger(WorkerResource.class);

    @Autowired
    private Environment environment;

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        List<Worker> list = workerRepository.findAll();
        return  ResponseEntity.ok(list);
    }
    @GetMapping(value = "/{id}")
    public  ResponseEntity<Worker> findById(@PathVariable Long id){
        logger.info("PORT = " + environment.getProperty("local.server.port"));


        Worker obj = workerRepository.findById(id).get();
        return  ResponseEntity.ok(obj);
    }

}
