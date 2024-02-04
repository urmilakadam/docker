package com.docker.docker.service;

import com.docker.docker.entity.Docker;
import com.docker.docker.repository.DockerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DockerService {

    DockerRepository dockerRepository;

    public Docker saveDocker(Docker docker){
        Docker dockerDetails = dockerRepository.save(docker);
        return dockerDetails;
    }

    public List<Docker> getAllDockers() {
        return dockerRepository.findAll();
    }
}
