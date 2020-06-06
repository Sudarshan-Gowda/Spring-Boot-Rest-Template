# Spring-Boot-Rest-Template

To consume the exposed Restfull web services in Spring Application, Rest Template is also one of the popular library or helper class available in spring framework. This example is ellustrated with how to consume the restfull api by using `Rest Template` class.
<br>

Rest Template class will provide many helper methods to consume the Restfull webservices like 
 <ul>
  <li>getForEntity</li>
  <li>postForEntity</li>
  <li>put</li>
  <li>delete</li>
 </ul> 

<img src="https://github.com/Sudarshan-Gowda/Spring-Boot-Rest-Template/blob/master/docs/Pic3.PNG" width="100%"/>
<br>

If you dont want to use different methods for each of the API means, you can go for the single function `exchange` and pass the specific Http Method type to consume API's. 

<img src="https://github.com/Sudarshan-Gowda/Spring-Boot-Rest-Template/blob/master/docs/Pic1.PNG" width="100%"/>
<br>

Before using the Rest Client , you need to initailize, that can be done in any of your class as below,
<img src="https://github.com/Sudarshan-Gowda/Spring-Boot-Rest-Template/blob/master/docs/Pic2.PNG" width="100%"/>
<br>

You can then access application by using Url here: http://localhost:8080/  <br>


## In case you find a bug/suggested improvement for Spring Restfull Webservices
Our issue tracker is available here: https://github.com/Sudarshan-Gowda/Spring-Boot-Rest-Template/issues


## Working with this project in Spring Tool Suite or Eclipse

### prerequisites
The following items should be installed in your system:
* STS - 3.0 Plus
* Postman or Any Rest API Testing tool

### Steps:

1) Download this Project and do maven import.
```
git clone https://github.com/Sudarshan-Gowda/Spring-Boot-Rest-Template
```
2) To Import the Praject Using STS or Eclipse
```
File -> Import -> Maven -> Existing Maven project
```

## Looking for something in particular?

|Spring Boot Configuration | Class or Java property files  |
|--------------------------|---|
|Main Class - Expose | [ExposeController](https://github.com/Sudarshan-Gowda/Spring-Boot-Rest-Template/blob/master/src/main/java/com/star/sud/rest/expose/controller/ExposeController.java) |
|Main Class - Consume | [ConsumeController](https://github.com/Sudarshan-Gowda/Spring-Boot-Rest-Template/blob/master/src/main/java/com/star/sud/rest/consume/controller/ConsumeController.java) |

## Steps to test the application:

1) Run the Application by using CLI, <br> `mvn spring-boot:run`
2) Test the API by using Rest API Testing tool.

<br>
### Find the exposed restfull APIS as below

Place the below urls and select appropicate Http  Methods to test the APIs

<img src="https://github.com/Sudarshan-Gowda/Spring-Boot-Rest-Template/blob/master/docs/Pic4.PNG" width="100%"/>
<br>

a. To get the list of employees <br>
http://localhost:8080/employees <br>

b. To fetch the employee by id <br>
http://localhost:8080/employees/1 <br>

c. To create the employee record <br>
http://localhost:8080/employees   <br>
 ``
 {
        "empId": 1,
        "empName": "Sudarshan",
        "empDept": "PD",
        "empSalary": 1234567
 }``
 
 d. To update the employee record <br>
 http://localhost:8080/employees <br>
 ``{
        "empId": 1,
        "empName": "Sudarshan",
        "empDept": "PD",
        "empSalary": 1234567
 }``
 
 e. To delete the employee record <br>
 http://localhost:8080/template/employees/1  <br>
 
 
 ### Find the Consuming restfull APIS as below

a. To get the list of employees <br>
http://localhost:8080/template/employees <br>

b. To fetch the employee by id <br>
http://localhost:8080/template/employees/1 <br>

c. To create the employee record <br>
http://localhost:8080/template/employees   <br>
 ``
 {
        "empId": 1,
        "empName": "Sudarshan",
        "empDept": "PD",
        "empSalary": 1234567
 }``
 
 d. To update the employee record <br>
 http://localhost:8080/template/employees <br>
 ``{
        "empId": 1,
        "empName": "Sudarshan",
        "empDept": "PD",
        "empSalary": 1234567
 }``
 
 e. To delete the employee record <br>
 http://localhost:8080/template/employees/1  <br>
 
 
   
# Contributing

The [issue tracker](https://github.com/Sudarshan-Gowda/Spring-Boot-Rest-Template/issues) is the preferred channel for bug reports, features requests and submitting pull requests.

For pull requests, editor preferences are available in the [editor config](.editorconfig) for easy use in common text editors. 

