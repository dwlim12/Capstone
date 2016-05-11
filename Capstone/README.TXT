------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Final Capstone Project
PURPOSE OF PROJECT: To explore and learn about Java
VERSION or DATE: v1 4/12/2016
AUTHORS: Darren Lim

Game: Chess

Java concepts we learned in class:
- GridWorld
- Abstract Class
- Recursion
- ArrayLists
- For Loops
- Nested if-else

Java concepts researched outside of class:
- Custom Images
- Algorithms

Pseudocode:
- Movement algorithms for each class that extends ChessPiece

INSTRUCTIONS TO RUN CODE:
1. Run the main method of class Board
2. In order to move a piece:
    a. Click on the piece you would like to move
    b. Call the method getAvailableLocations for the piece
    c. Call the method move for the piece and input one of the location values you received from 
    the call to getAvailableLocations
3. Take turns moving black and white pieces until the one side's king is captured

BUGS:
- The pawn can only move two spaces if you do not call getAvailableLocations first,
this is because I put a boolean variable hasStarted for the Pawn class which while false
lets it move 2 spaces at a time, but it turns to true once you call getAvailableLocations.
So if call move before getAvailableLocations it can move two spaces, but if you call move
after getAvailableLocations it can only move one space.
- Once a pawn reaches the end, technically you are supposed to be able to switch it out for
another class of ChessPiece, but as of currently you can only call removeSelfFromGrid instead of
the world's remove call. And you would also need to add in the new piece through a call of class
World's add method which I am not sure how to call from the grid itself. Due to this the new piece
added through the Grid's add method does not have the ability to call its move method.