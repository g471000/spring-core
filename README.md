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
    * User can join and also search
    * There are 2 levels of users: regular/VIP
    * (Undecided) Can store user data into DB and the data can be accessed from outside system.
* Order and Discount
    * User can oder a product.
    * There is discount policy depends on the user's level.
    * All VIPs get $1 discount, but the discount amount can be changed later.
    * The discount policy can be changed with high possibility. This company do not have any discount rule, and delaying the decision about it. It is possible to NOT to use discount for the users.