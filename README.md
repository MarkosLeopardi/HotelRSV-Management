<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#about-the-project">About The Project</a></li>
    <li><a href="#SQL-FUNCTIONS">SQL Functions</a></li>
    <li><a href="#intercode">Interface Code</a></li>
    <li><a href="#interface">Interface</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## About The Project
a hotel reservation application from the perspective of the business. The application was created to meet the requirement for a computerized hotel information system. The database was implemented using PgAdmin III, in the PostgreSQL language. The GUI was implemented in NetBeans, using the Java Swing language. The application aims to facilitate hotel employees in creating, processing, completing, and deleting reservations with as few steps as possible. It also includes automated room selection processes and the ability to maintain a history of reservations and customers.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- Database -->
## Database

The database consists of 6 data tables. The tables are as follows:

The "Guests" table refers to the hotel's customers.
The "Rooms" table refers to the total number of rooms in the hotel.
The "Room Categories" table refers to the types of rooms (single, double, triple).
The "Reserved Rooms" table refers to the reservations that have been made and are active.
The "Past Reservations" table refers to the history of completed reservations.
The "Log Table" refers to the history of actions taken in the database.
The "Room Categories" and "Rooms" tables have constant rows and do not change. The "Room Categories" table consists of the columns "categoryid" of type int and "categoryname" of type varchar. The "Rooms" table consists of the columns "idroom" of type int, which represents the room number and serves as the primary key, "roomcategory" of type int, which is a foreign key referencing the "categoryid" column of the "Room Categories" table, and "price" of type numeric, indicating the room's price.

The "Guests" table consists of the columns "idguest" of type int, representing the customer's identification number, "guest name," "guest surname," and "guest mobile," indicating the customer's name, surname, and mobile number, respectively. The "Guests" table is automatically updated and maintained with the appropriate procedures after each creation or modification of a reservation in the "Reserved Rooms" table.

The "Reserved Rooms" table consists of the columns "idreservation" of type int, indicating the unique number of each reservation, serving as the primary key with auto-increment. The columns "room id" and "guest id" are foreign keys referring to the "idroom" column of the "Rooms" table and the "idguest" column of the "Guests" table, respectively. The "since when" and "check out" columns of type text represent the reservation dates. When a reservation is deleted, it corresponds to its cancellation, and no other action follows. In the case of completing a reservation, meaning the customer has left, the reservation is copied to the "Past Reservations" table as a historical record and is deleted from the "Reserved Rooms" table, which only contains active reservations.

The "Past Reservations" table is a copy of the "Reserved Rooms" table and serves as a historical record of past reservations.

The "Log Table" is the table that serves the need for a log file. It consists of the columns "stamp" of type timestamp, representing the time of the row insertion and serving as the primary key, "operation" of type varchar, accepting the letters I, U, D for insert, update, and delete, respectively, depending on the action that triggered the insertion of the new row. The "userid" column of type varchar indicates the user who performed the action in the database. The columns "room id," "guest id," "checkin," and "checkout" take the old or new values of the "Reserved Rooms" table depending on the action performed.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- SQL FUNCTIONS-->
## SQL FUNCTIONS
To maintain database security through the interface, table or column names are not mentioned in the code. Instead, appropriate procedures called functions are stored in the database. These functions are invoked in the code to execute corresponding actions.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- INTERFACE CODE -->
## INTERFACE CODE

The interface code is written in Java Swing using the NetBeans program. It consists of a main class where methods for interface operations are written and a DateSelectionHandler class that displays the date selection table for creating a new reservation.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- INTERFACE -->
## INTERFACE
The user interface consists of 4 screens, and screen switching is done through tabs at the top of the screen. The screens are as follows:

"Check IN" is the screen where information is entered to create a new reservation using text boxes, radio buttons, and pop-ups for dates.
"Reservations" is the screen where a reservation is searched based on Guest ID, check-in date, or room number. On this screen, completion and cancellation of a reservation, or selection of a reservation for updating, can be performed.
"Update" is the screen where current details of the selected reservation from the "Reservations" screen are displayed, and they can be modified and updated.
"Log" is the screen displaying the log file, a list of all actions executed. The display is triggered by pressing the "Show Log" button, and each press refreshes the log.

<p align="right">(<a href="#readme-top">back to top</a>)</p>
