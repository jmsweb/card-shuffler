# Jason's Unicode Card Shuffler
[![CircleCI](https://dl.circleci.com/status-badge/img/gh/jmsweb/card-shuffler/tree/master.svg?style=svg)](https://dl.circleci.com/status-badge/redirect/gh/jmsweb/card-shuffler/tree/master)


## Requirement

- Java 18+ for running jar as application
- Maven for building application into a jar

## Installation

1. Clone the repository to a local machine
2. Navigate to card-shuffler
3. Run command 'mvn clean package' in a terminal
4. Run command 'java -jar card-deck/target/card-deck.jar'

## Explanation
The code is developed with Javax Swing components as a standalone application. There are two ways to execute the application; double-click on card-deck.jar, or run `java -jar card-deck.jar` command. By doing so, the operating system should detect the JVM to load the graphical user interface on a computer screen. The application cannot be resized, and the exit button would exit the application. This is essentially a basic application with two buttons one to reset the card deck and the other to shuffle the deck. This application cannot be resized and the exit button on the top corner would exit the application.  

Refer to the two screenshots to illustrate the states:

Initial

<img src="screenshot/InitialState.png" width="300" />

Shuffled

<img src="screenshot/ShuffledState.png" width="300" />