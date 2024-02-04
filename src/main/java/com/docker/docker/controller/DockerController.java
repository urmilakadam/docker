package com.docker.docker.controller;

import com.docker.docker.entity.Docker;
import com.docker.docker.service.DockerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docker")
@AllArgsConstructor
public class DockerController {

    private DockerService dockerService;

    @GetMapping
    public String test(){
        return "Docker testing API";
    }

    @PostMapping("/add")
    public ResponseEntity<Docker> addDocker(@RequestBody Docker docker){
        Docker savedDocker = dockerService.saveDocker(docker);
        return new ResponseEntity<>(savedDocker, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Docker>> allDockers(){
        List<Docker> allDockers = dockerService.getAllDockers();
        return new ResponseEntity<>(allDockers, HttpStatus.OK);
    }

}
