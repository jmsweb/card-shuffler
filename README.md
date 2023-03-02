# Jason's Unicode Card Shuffler
[![CircleCI](https://dl.circleci.com/status-badge/img/gh/jmsweb/card-shuffler/tree/master.svg?style=svg)](https://dl.circleci.com/status-badge/redirect/gh/jmsweb/card-shuffler/tree/master)


## Requirement

- OpenJDK 19.0+ java development
- Maven 3+ for building JAR and running Java application

## Installation

1. Clone the repository to a local machine
2. Navigate to card-shuffler
3. Run command `mvn clean package` in a terminal
4. Run command `java -jar card-deck/target/card-deck.jar`, or
  1. Run command `mvn -pl card-deck compile exec:java`

## Explanation
The code is developed with Javax Swing components as a standalone application. There are three ways to execute the application; double-click on card-deck.jar, run `java -jar card-deck.jar` command, or run `mvn -pl card-deck compile exec:java` command. By doing so, the operating system should detect the JVM to load the graphical user interface on a computer screen. The application cannot be resized, and the exit button would exit the application. This is essentially a basic application with two buttons one to reset the card deck and the other to shuffle the deck. This application cannot be resized and the exit button on the top corner would exit the application.

Refer to the two screenshots to illustrate the states:

Initial

<img src="screenshot/InitialState.png" width="300" />

Shuffled

<img src="screenshot/ShuffledState.png" width="300" />