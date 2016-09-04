# Spring Rest App Example

Example of an application that uses spring rest services. 

It is a basic CRUD to be used as a base project for those who wants to start to develop rest web services with spring.


#### Available Services

**GET**
	
http://<localhost:8080/spring-rest/rest/
- *get a list of Messages*

http://<localhost:8080/spring-rest/rest/{name}
- *get a Message by a given name*
	
**POST**

http://<localhost:8080/spring-rest/rest
- *Adds a new Message in the list*
- *body example: { "name": "message name", "text": "any text" }*
	
**PUT**

http://<localhost:8080/spring-rest/rest/{name}
- *Update a Message in the list. A name of a message should be passed as a url parameter*
- *body example: { "name": "message name", "text": "any text" }*

**DELETE** 

http://<localhost:8080/spring-rest/rest/{name}
- *Deletes a Message in the list by a given name* 


###### Examples of other services

http://<localhost:8080/spring-rest/welcome
 - *simple welcome text message*
 
http://<localhost:8080/spring-rest/hello/{name}
 - *say hello to my little friends!*
 
###### Installation 
It is a Maven based project. To run in eclipse it is necessary to import this project as a Existing Maven Project:
- (Import->Maven->Existing Maven Project).
 
 
###### Developer
> Danilo Braga

> https://br.linkedin.com/in/bragadanilo



 
