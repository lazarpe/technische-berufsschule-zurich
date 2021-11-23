package com.company;

/**
 * Created by lazar on 10/28/2021.
 * Project name: Sudoku-Solver
 **/
public class Sudoku {
    private final int GRID_SIZE = 9;

    // Sudoku verifications
    public boolean checkIfNumberInRow(int[][] board, int number, int row) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    public boolean checkIfNumberInCol(int[][] board, int number, int column) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    public boolean checkIfNumberIsInSmallBox(int[][] board, int number, int row, int column) {
        for (int i = row - row % 3; i < row - row % 3; i++) {
            for (int j = column - column % 3; j < column - column % 3 + 3; j++) {
                if (board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkIfIsValidPlacement(int[][] board, int number, int row, int column) {
        return !checkIfNumberInRow(board, number, row)
                && !checkIfNumberInCol(board, number, column)
                && !checkIfNumberIsInSmallBox(board, number, row, column);
    }

    public boolean solveBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                if (board[row][col] == 0) {
                    for (int numberToTry = 1; numberToTry <= 9; numberToTry++) {
                        if (checkIfIsValidPlacement(board, numberToTry, row, col)) {
                            board[row][col] = numberToTry;
                            if (solveBoard(board)) {
                                return true;
                            } else {
                                board[row][col] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void printBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println(" * * * * * * * * * * * * * *");
            }
            for (int col = 0; col < GRID_SIZE; col++) {
                if (col % 3 == 0 && col != 0) {
                    System.out.print("|");
                }
                System.out.print(" " + board[row][col] + " ");
            }
            System.out.println();
        }
    }
}
