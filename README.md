# Ducky Duck

<p align="center">
<img src="src/main/resources/assets/Yellow Duck.png" alt="Yellow duck" title="yellow duck">
</p>


## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [Running the application locally](#running-the-application-locally)
* [Running test](#running-test)


## General Info

This program is designed to solve the "Duck Backpack Problem"... or the backpack problem which is well-known optimization problem in computer science and mathematics. 
We have a backpack that can hold a certain maximum weight, and we want to fill it with a selection of items that maximize their total value without exceeding the maximum weight capacity.
So, generally speaking, we have to choose the maximum score possible from a set of ducks that each have a weight and a score.

## Technologies

-   Java 17
-   JUnit5 for testing
-   Maven for building and managing dependencies (version 3.8.6)

## Setup

To run this program, you need to have the Java Development Kit (JDK) installed on your computer. If you don't have it, you can download it from the official Oracle website. The project includes the Maven wrapper, so there is no need to install Maven to run the app.

## Running the Application Locally

Open a terminal or command prompt and navigate to the directory where you saved the Main.java file. Compile the program by typing ```javac Main.java``` and pressing Enter.

Run the program by typing ```java Main``` and pressing Enter.

Enter the input values when prompted. The first line should contain two integers: n and m, where n is the number of ducks and m is the maximum weight that can be carried. The next n lines should contain two integers each: the score and weight of each duck.

Press Enter and the program will output the maximum score that can be achieved.
Example input:

```
3 5
1 2
2 3
5 4
```

Example output:

```5```

## Running test

To run the JUnit5 test suite, navigate to the project directory in the command line and run the following command:

```mvn test```

This will compile the source code and run all the tests in the project using the JUnit5 testing framework.
