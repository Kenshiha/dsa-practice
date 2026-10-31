package Sudoku;

public class SudokuSolver {

    private static final int GRID_SIZE = 9;

    public static boolean isNumInRow(int[][] sudoku, int number, int row){

        for(int i = 0; i < GRID_SIZE; i++){
            if(sudoku[row][i] == number){
                return true;
            }
        }
        return false;
    }

    public static boolean isNumInColumn(int[][] sudoku, int number, int column){

        for(int i = 0; i < GRID_SIZE; i++){
            if(sudoku[i][column] == number){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){

        int[][] sudoku = {
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0}
        };



    }
}
