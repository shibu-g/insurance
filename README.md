# insurance
Firstly you need to setup this project in your Machine locally.         


Step 1) use this command to copy the project.             

```"git clone https://github.com/shibu-g/insurance.git"```


Step 2) refresh the project to setup all the dependency.              

Step 3 ) run the main file ```"InsuranceApplication.java"``` as a spring boot project.

Now after setup the project in your local machine you can make certain functionality
With this there are 3 Model class present "Client","Policy","Claim" 
You can do crud operation with there model classes

For Client base url is :- "/api/clients"

   ``` Get operations:---
               You can get all the Clients present on
                    the database by heating the base url+"/".
               You can get specific clients by using id 
                    By heating base url+"/{id}"
       Post operation :---
                You can add new clients to the database by
                heating the base url+"/add" and passing the client object
                as a Request Body
                {
                "name":"client name",
                 "address":"client address",
                 "dob" :"client date of birth year-month-day",
                 "contact ":"client contact "
                 }
       Put operation:---
               You can update specific user by passing there id as a request param
               and client object as a request body By heating the base url+"{id}"
               {
                "name":"client name",
                 "address":"client address",
                 "dob" :"client date of birth year-month-day",
                 "contact ":"client contact "
                 }
     Delete operation:---
            You can delete specific client form the database
            by heating the base url+{id}
            
            
For Policy base url is :- "/api/policies"


       ```
       Get operations:---
       
          You can get all the Policy present on

         the database by heating the base url+"/".
          You can get specific Policy by using id 
               By heating base url+"/{id}"
       Post operation :---
                You can add new Policy to the database by heating
                the base url+"/add" and passing the Policy object as a Request Body
                {
                "type" : "policy type",
                "covarage":covarage amount,
                "premium ": premium amount,
                "start":"start date of client policy year-month-day in this format"
                "end":"end date of client policy year-month-day in this format"
                "clientid":client id
                 }
       Put operation:---
               You can update specific Policy by passing there id as a request param
               and Policy object as a request body By heating the base url+"{id}"
{
                "type" : "policy type",
                "covarage":covarage amount,
                "premium ": premium amount,
                "start":"start date of client policy year-month-day in this format"
                "end":"end date of client policy year-month-day in this format"
                "clientid":client id
                 }
     Delete operation:---
            You can delete specific Policy form the database by heating the base url+{id}
            
```

For Claim base url is :- "/api/claims"


       Get operations:---
               You can get all the Claims present on 
               the database by heating the base url+"/".
               You can get specific claim by using id 
               By heating base url+"/{id}"
       Post operation :---
                You can add new claims to the database by heating
                the base url+"/add" and passing the claims object as a Request Body
                {
               "description" :"claims description",
               "status":"claim status",
               "data":"claim date year-month-day in this format",
               "policy_no":policy no
                 }
       Put operation:---
               You can update specific claim by passing there I'd as a request param
               and claim object as a request body By heating the base url+"{id}"
               {
               "description" :"claims description",
               "status":"claim status",
               "data":"claim date year-month-day in this format",
               "policy_no":policy no
                 }
     Delete operation:---
            You can delete specific claim form the database by heating the base url+{id}
            
                   
