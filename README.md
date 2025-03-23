# Chess960 Kata

## Positions

### Normal Chess
This is the initial position of chess everyone knows:

![rook](pieces/rook.png)
![knight](pieces/knight.png)
![bishop](pieces/bishop.png)
![queen](pieces/queen.png)
![king](pieces/king.png)
![bishop](pieces/bishop.png)
![knight](pieces/knight.png)
![rook](pieces/rook.png)

### Chess960
But in Chess960 also these can be valid initial positions:

![bishop](pieces/bishop.png)
![rook](pieces/rook.png)
![knight](pieces/knight.png)
![bishop](pieces/bishop.png)
![king](pieces/king.png)
![rook](pieces/rook.png)
![knight](pieces/knight.png)
![queen](pieces/queen.png)

![bishop](pieces/bishop.png)
![bishop](pieces/bishop.png)
![knight](pieces/knight.png)
![queen](pieces/queen.png)
![rook](pieces/rook.png)
![knight](pieces/knight.png)
![king](pieces/king.png)
![rook](pieces/rook.png)


## Rules

### King and Rooks

The king has to be between the two rooks.

![rook](pieces/rook.png)
![king](pieces/king.png)
![rook](pieces/rook.png)

### Bishops

The two bishops have to be on squares of different color.

![bishop](pieces/bishop.png)
![bishop](pieces/bishop.png)

## Now here is your task

Write a piece of code, that gives back a list of all valid positions possible!

### Hints

1. There are in total 960 valid positions
2. For simplicity, you can use a string to represent a position with one character for each piece
