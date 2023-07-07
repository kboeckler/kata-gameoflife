Kata Game of Life
==============

A java version for the game of life kata. Forked from https://github.com/fabricejeannet/kataGameOfLife. 

# Description

The universe of the Game of Life is an infinite, two-dimensional orthogonal grid of square cells, each of which is in one of two possible states, live or dead (or populated and unpopulated, respectively). Every cell interacts with its eight neighbours, which are the cells that are horizontally, vertically, or diagonally adjacent. At each step in time, a transition occurs.

## Rules

You start with a two-dimensional grid of cells, where each cell is either alive or dead. In this version of the problem, the grid is finite, and no life can exist off the edges. When calculating the next generation of the grid, follow these rules:

1. Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
2. Any live cell with more than three live neighbours dies, as if by overcrowding.
3. Any live cell with two or three live neighbours lives on to the next generation.
4. Any dead cell with exactly three live neighbours becomes a live cell.

## Existing classes

Implement your solution within the ```GameOfLifeImpl``` class.
1. Decide how to store your cells within this class.
2. Write the transition logic within ***computeNextGeneration()***

The ```GameOfLifeIntegTest``` can be run to simulate some rounds, which will call your implementation and renders it to the console.

## Exceution

Run ``` ./gradlew test ``` to execute all tests.