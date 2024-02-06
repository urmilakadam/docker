### **Docker**

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


Docker Commands used to build image and container:

docker build -t buid_img_name .
docker run -p 8080:8080 image_name




