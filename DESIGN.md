# Design

### Move class

We wanted an easy and intuitive way to represent moves. To simplify implementation, we made a Move class that is capable of handling the different types of chess moves.

### Square class

Each square represents a square on a chessboard and is capable of holding a piece.

### Board class

A chessboard is represented by a 2D array of squares.

### Chess class

This class is used to play the game of chess. The user can choose which players, human or computer, should play, and the class handles gameplay, alternating turns between the two players.

## Pieces package

Since there are multiple different pieces in chess, we created a separate package for piece classes to keep our project organized.

### Piece abstract class

The piece abstract class does most of the work for pieces, providing methods to easily gather possible moves and get relevant piece information.

#### Color enum

To keep track of piece color, the Piece class has a public Color enum with helpful methods relating to piece colors.

### King class

### Queen class

### Rook class

### Bishop class

### Knight class

### Pawn class

## Players package

### Player abstract class

### HumanPlayer class

### RandomPlayer class

### MinimaxPlayer class

Used sorted set instead of priority queue to iterate over it without destroying it

### SuboptimalMinimaxPlayer class

### WorstMinimaxPlayer class

## Heuristics package

### Heuristic interface

### MaterialHeuristic class

### PositionalHeuristic class

### CombinationHeuristic class