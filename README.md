# Docker Compose
Task1 : Kaiburr Task3

# Project Title

The project is about REST API implementation where application is running inside Docker Container.Two containers are running parallely using Docker Compose. First contaier has REST API application running and Second container has Mongo Database running .The application provides a REST API with endpoints for searching,creating ,deleting and updating “server” objects. The variety of Software Platforms are available as a resource on the server side.The REST API are created and client can request for a resource over this URL. 

## Getting Started

1.git clone https://github.com/bharatprakashparakh/Kaiburr-Task3.git

### Prerequisites

* Downlaod Java version 1.8
* Downlaod SpringToolSuite version 4.6.0
* Install Postman REST Client
* Downlaod Docker Tool for Windows



## Running the tests

* Create Docker File for mongo with persistent storage in host machine and another file for image having springboot dependencies.
* Generate jar file inside SpringBoot by "Maven Install" Dockerfile of springboot.
* Start the Docker tool/Docker Service.
* Build the  Docker File and create two docker images.
* Create the docker-compose file with details of above created images and mention the container name to be launched.
* Run the docker-compose.yml file and two containers will get launched.
* Open Postman and send client request to REST API present inside Docker Container

### Break down into end to end tests

* **Find all platforms available.[GET Request]**


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management


## Contributing

Contributions are welcome.

 ## Author

* **Bharat Prakash Parakh** 



