# Monopoly lite

A simplified version of the game "Monopoly" in the form of a console JAVA aplication.

## My motivation
This is my second object-oriented programming project. I coded it in December of 2022.

This project is based on an assignment originally given in the "Object-Oriented Programming" course at my university.
Although I had not yet taken the course at the time, I found the assignment on the course website and decided to complete it as a self-directed challenge.
My goal was to deepen my understanding of Java and object-oriented programming principles, as well as to prepare myself for the actual course.

I also completed three other assignments from the same course (from previous years) as part of this initiative. 
These projects can be found on my GitHub: [Duck hunt](https://github.com/amj-j/duck-hunt-java), [Reversi](https://github.com/amj-j/reversi-java), and [Rook in maze](https://github.com/amj-j/rook-in-maze-java).

### Goal
This assignment focuses on practicing the basic principles of object-oriented programming.

## Prerequisites
You need to have JDK 8 or higher installed on you computer to compile and run this app.

## Installation
1. Open your terminal and navigate to folder in which you wish to clone this repository.
2. Clone this repository using ```git clone https://github.com/amj-j/monopoly-lite-java.git```
3. In your terminal, navigate inside the new directory created by cloning the repository.
4. Execute this command to compile the source code: ```javac -d bin $(find src -name "*.java")``` (This command works on Linux, macOS, and Git Bash on Windows but not in Command Prompt or PowerShell. For Windows, use Git Bash terminal for compatibility, or list the source files manually.)
5. Execute this command to run the app: ```java -cp bin Main```
6. The app will run in your terminal.

#### ```property_list.txt```
  - contains the list of properties (currently streets), that the players can buy
  - you can add properties of your own or replace/edit the current ones by editing the file with your editor
  - each line is one property
  - the line format is ```<name> <price> <visit_cost>```
  - property name musn't contain spaces
  - always keep at least 16 properties in the list

## Gameplay

Simplified version of the Monopoly game, with only properties \(without hotels\), limited chance cards, jail and tax tile. The game is for 2-5 players. 

### Board
There are 24 tiles on the board, of which 16 are properties, 4 are chance tiles and the last four tiles are START, jail (just visiting), pay tax, go to jail. The last mentioned foru tiles are distributed evenly in this order along the board.

### Chance
There are these types of chance cards:
- You have birthday TODAY, you get 1000.
- Your car is broken! You need to pay for repair 2000.
- You WIN in LOL competition, you get 3000.
- You are arrested! Go to jail!
- You need to pay 20% of your money as taxes!

### Rules
- Each player starts on the START tile with 20000 money.
- Players take turns in rolling the dice. The result of dice roll can be 1-6, which determines how far the player should move along the board.
- If the player steps on a property that noone owns, they get the opportunity to buy.
- If the player steps on a property that someone already owns, they must pay them the visit cost.
- If the player steps on "jail \(just visiting\)" tile, they cannot do anything and must wait for their next turn.
- If the player steps on "pay tax" tile, they must pay 500 to the bank.
- If the player steps on "go to jail" tile, they go to "jail" tile and stay there for three rounds, unless they throw 6 in any of those rounds or pay 500 to get out.
- If the player steps on chance, they draw the chance card.
- If the player passes the START tile, they get 1000.
- If the player steps on the START tile, they get 2000.
- Player who must currently pay more money than they have loses.

### Controls
Since this is a console app, the last line in the console always gives instructions for the user about what to enter next. Every user input must be comitted by pressing ENTER. No mouse input is possible.
