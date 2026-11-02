package Sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuSolver {

    private static final int GRID_SIZE = 9;

    // checks if number is in whole row
    private static boolean isNumInRow(int[][] sudoku, int number, int row){

        for(int i = 0; i < GRID_SIZE; i++){
            if(sudoku[row][i] == number){
                return true;
            }
        }
        return false;
    }

    // checks if number is in whole column
    private static boolean isNumInColumn(int[][] sudoku, int number, int column){

        for(int i = 0; i < GRID_SIZE; i++){
            if(sudoku[i][column] == number){
                return true;
            }
        }
        return false;
    }

    // checks if number is in local 3x3 box
    private static boolean isNumInBox(int[][] sudoku, int number, int row, int column){
        int gridRow = row - row % 3;
        int gridColumn = column - column % 3;

        for(int i = gridRow; i < gridRow + 3; i++){
            for(int j = gridColumn; j < gridColumn + 3; j++){
                if(sudoku[i][j] == number){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValid(int[][] sudoku, int number, int row, int column){
        return !isNumInRow(sudoku,number,row) &&
                !isNumInColumn(sudoku,number,column) &&
                !isNumInBox(sudoku,number,row,column);
    }

    private static boolean solveSudoku(int[][] sudoku){
        for(int row = 0; row < GRID_SIZE; row++){
            for(int column = 0; column < GRID_SIZE; column++){
                if(sudoku[row][column] == 0){

                    int bestRow = -1;
                    int bestColumn = -1;
                    int minCandidate = 10;
                    List<Integer> bestCandidates = null;
                    List<Integer> candidates = new ArrayList<>();

                    for(int numToTry = 1; numToTry <= GRID_SIZE; numToTry++){
                        if(isValid(sudoku,numToTry,row,column)){
                            //sudoku[row][column] = numToTry;
                            candidates.add(numToTry);

//                            if(solveSudoku(sudoku)){
//                                return true;
//                            }else {
//                                sudoku[row][column] = 0;
//                            }
                        }
                    }

                    if(candidates.size() < minCandidate){
                        minCandidate = candidates.size();

                        bestRow = row;
                        bestColumn = column;
                        bestCandidates = candidates;
                    }
                   // return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){

        System.out.println("Program Running");
        int[][] sudoku = {
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,5,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0}
        };

        if(solveSudoku(sudoku)){
            System.out.println("Sudoku Solved Successfully");
        }else{
            System.out.println("Sudoku can not be solved");
        }

        for(int row = 0; row < GRID_SIZE; row++){
            if(row % 3 == 0 && row != 0){
                System.out.println("------------");
            }
            for(int column = 0; column < GRID_SIZE; column++){
                if(column % 3 == 0 && column != 0){
                    System.out.print("|");
                }
                System.out.print(sudoku[row][column]);
            }
            System.out.println();
        }


    }
}
