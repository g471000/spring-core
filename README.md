# Spring Core

Project to understand Spring Core Basic. This project will cover about OOP, Spring Container & Spring Bean. 

Also, the project will focus to understand how to architect OOP and Spring using SOLID (especially SRP, OCP and DIP). 

The core goal of this project is understanding about Spring container and the Spring Bean.
* Spring Container -IoC, DI
* Add Dependencies
* Understanding Bean Cycle and Scope

## Business Model
This is imaginary business model: 
* User 
    * User can join and search
    * There are 2 levels of users: regular/VIP
    * (Undecided) Can store user data into DB and the data can be accessed from outside system.
* Order and Discount
    * User can oder a product.
    * There is discount policy depends on the user's level.
    * All VIPs get $1 discount, but the discount amount can be changed later.
    * The discount policy can be changed with high possibility. This company do not have any discount rule, and delaying the decision about it. It is possible to NOT to use discount for the users.
    
## SOLID
In this project, I tried to use 3 of the good OOP programing rules:
* SRP, DIP and OCP

### SRP (Single Responsibility Principle)
One class has only one class.
* Client object creates the object and running responsibility
* Separate interest
* AppConfig has responsibility to create the object and connect with other objects
* Client object has responsibility to run, but not connect

### DIP (Dependency Inversion Principle)
Programmer should depend on abstract, not objectification.
* Tried to make client code only depends on an abstract interface.
* But client code cannot run only with an interface.
* AppConfig create object instance instead of the client code, and insert dependency into the clientcode. In this way, we were able to keep the DIP rule.

### OCP (Open Closed Principle)
Software should be open for extension but not for the change.
* By using polymorphism, client was able to safe for DIP.
* Divide application into usage and construction.
* AppConfig can change dependencies, such as `FixedDiscountPolicy` -> `RatedDiscountPolicy`, so insert the relationship into the object, so programmer/developer do not need to edit client code.
* It is open to extend new logic, but closed for the usage (client code)


 


This is educated by inflearn: Spring Core Basic:
https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%ED%95%B5%EC%8B%AC-%EC%9B%90%EB%A6%AC-%EA%B8%B0%EB%B3%B8%ED%8E%B8
