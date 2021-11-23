/**
 * Created by lazar on 11/2/2021.
 * Project name: SudokuVideoSolver
 **/
public class Main {
    public static void main(String[] args) {
        int[][] board1 = {
                {0, 2, 0, 5, 0, 1, 0, 9, 0},
                {8, 0, 0, 2, 0, 3, 0, 0, 6},
                {0, 3, 0, 0, 6, 0, 0, 7, 0},
                {0, 0, 1, 0, 0, 0, 6, 0, 0},
                {5, 4, 0, 0, 0, 0, 0, 1, 9},
                {0, 0, 2, 0, 0, 0, 7, 0, 0},
                {0, 9, 0, 0, 3, 0, 0, 8, 0},
                {2, 0, 0, 8, 0, 4, 0, 0, 7},
                {0, 1, 0, 9, 0, 7, 0, 6, 0},
        };
        Display display = new Display();
        display.start();

        Sudoku sudokuField = new Sudoku(display);
        System.out.println("Unsolved board: ");
        sudokuField.printBoard(board1);

        System.out.println();
        if (sudokuField.solveBoard(board1)) {
            System.out.println("Solved Board:");
        } else {
            System.out.println("Field unsolvable");
        }
        sudokuField.printBoard(board1);

    }
}
