package view;

import sudoku_generator.model.Sudoku;

import static sudoku_generator.constants.Constants.SUDOKU_SIZE;

public class SudokuViewer {

    public static void viewSudoky(Sudoku sudoku){
        for (int x =0; x<SUDOKU_SIZE; x++) {
            for (int y = 0; y < SUDOKU_SIZE; y++) {
                System.out.print(sudoku.get(x, y) + " ");
                if ((y+1)%3 ==0)
                    System.out.print(" ");
            }
            if ((x+1)%3 ==0)
                System.out.println();
            System.out.println();
        }
        viewLine();
    }
    public static void viewLine(){
        for (int y = 0; y < SUDOKU_SIZE*2; y++)
            System.out.print("-");
        System.out.println();
    }
}
