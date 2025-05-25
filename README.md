# Expense-Tracker-WebApplication
A simple web-based expense tracker built with Java Spring Boot. This application allows users to add, edit, and delete expenses and view expense summaries. It features with Thymeleaf (or React, if applicable). Ideal for personal finance management.

Tech Stack
----------
FrameWork -> Springboot
Frontend  -> BootStrap
Server    -> Thymeleaf
DataBase  -> H2(Database is not connected to this project)

Project Contraints
------------------
1>In Description there is word limit upto 20 and it can't be null a "Description is required" message will show.
2>The Amount must be numbers. we can't input any words or characters there.It can't be null.

Spring Boot includes an embedded Tomcat, so you don’t have to install it separately.

Client (Browser)
   |
[HTTP Request]
   |
[ Tomcat Server ]
   ├── Web Container (Servlet Engine)
   ├── JSP Compiler
   └── Connectors (HTTP/HTTPS, AJP)
   |
[Servlet or JSP Response]
   |
Client (Browser).

