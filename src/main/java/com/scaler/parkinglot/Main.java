package com.scaler.parkinglot;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}


/*
Notes :-

BaseModel -> id attribute is present in all the Model classes, we can
have a common class to store the id attribute i.e BaseModel, Now every model
class will extend the BaseModel class.


Requirement-1 : Operator should be able to generate the Ticket.

Model - View - Controller

TicketController -> Takes the request from the client and passes it
as it is to the corresponding Services.

Create Controller, service and repository for each model (wherever required).

TicketController. [Waiter]
TicketService.    [Chef]
TicketRepository. [Helper]

 */