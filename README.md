# Java Application Dockerization

## Project Overview

This project provides a Docker container for a Java application using OpenJDK 17 (Oracle). The Dockerfile enables packaging, configuring, and running the Java app in a portable, isolated environment. By leveraging Docker, it simplifies deployment across various systems without worrying about environmental inconsistencies.

## Prerequisites

- [Docker](https://docs.docker.com/get-docker/) installed on your system.
- Java application built and packaged as a `.jar` file.

## Dockerfile Breakdown

- **Base Image**: The container is built using the `openjdk:17-oracle` image, which includes OpenJDK 17 from Oracle.
- **Working Directory**: Sets the working directory to `/opt`.
- **Environment Variable**: Sets the default application port to `8080`.
- **Expose Port**: The Docker container exposes port `8080` to allow network communication.
- **Copy Application**: Copies the compiled `.jar` file from the `target` directory to `/opt/app.jar` in the container.
- **Entry Point**: Defines the command to execute the Java application, with additional options for opening up module access.

## How to Build and Run the Docker Image

### Build the Docker image:

```bash
docker build -t buid_img_name .
docker run -p 8080:8080 image_name


## Docker
With Docker, your application is always packed and ready for an adventure! It is the ultimate problem-solver in the developer’s toolkit.

Docker is a development tool and a virtualization technology used to simplify and automate the deployment of applications by putting it, along with its dependencies and settings, into a tidy container. A container, on the other hand, is a standard way to package an application that contains all the configuration files and other dependencies to operate the application. This eliminates problems like conflicting versions, inconsistent environments, and frustrating nights spent chasing mysterious bugs.

**Portability**: Docker containers run consistently across various environments, from development to production.

**Efficiency**: Containers share the host OS kernel, minimizing overhead and maximizing resource utilization.

**Isolation**: Each container encapsulates its dependencies, ensuring application independence and preventing conflicts.

**Scalability**: Docker enables easy scaling by swiftly replicating containers, and responding dynamically to workload demands.

**Version Control**: Docker’s versioning system allows easy rollback to previous container states, promoting code stability and reproducibility.


Now, let’s explore some terminologies that you’ll encounter regularly in the container lifecycle.

**Container**: An isolated unit that encapsulates an application along with its dependencies and runtime.

**Image**: A lightweight, standalone, and executable package that includes everything needed to run an application, including the code, runtime, libraries, and system tools.

**Dockerfile**: A script containing instructions for building a Docker image.

**Registry**: A centralized repository for storing and distributing Docker images.

**Compose**: A tool for defining and running multi-container Docker applications using a YAML file.

**Volume**: A persistent data storage mechanism in Docker that allows data to persist beyond the lifecycle of a container. etc.


Thank you ☺️ 

