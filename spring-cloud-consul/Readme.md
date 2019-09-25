# Spring Cloud Consul
Here I have used the Consul as a service discovery. When any application's main file contains the @EnableDiscoveryClient annotation and application.properties file contains the related properties, consul agent running on the machine will automatically register the service with the consul server.

### Installation
To install consul follow the link https://www.consul.io/docs/install/index.html

### Run the agent
First we need to start the consul agent in your system. To run the consul agent use the following command.

consul agent -dev -bind=127.0.0.1

### Important Links
https://www.consul.io/
