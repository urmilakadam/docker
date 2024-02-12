package com.docker.docker.controller;

import com.docker.docker.entity.Docker;
import com.docker.docker.service.DockerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/docker")
@AllArgsConstructor
@Slf4j
public class DockerController {

    private DockerService dockerService;
    private final Clock clock;

    @GetMapping
    public String test(){
        LocalDateTime dateTime = LocalDateTime.now(clock);
        log.info("Get Current date and time: {}" , dateTime);
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
