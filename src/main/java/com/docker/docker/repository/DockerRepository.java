package com.docker.docker.repository;

import com.docker.docker.entity.Docker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DockerRepository extends JpaRepository<Docker, Integer> {
}
