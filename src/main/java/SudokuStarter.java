

import sudoku_generator.model.Sudoku;

import static sudoku_generator.SudokuGenerator.compliteSudoku;
import static sudoku_generator.SudokuGenerator.generateSudoku;
import static sudoku_generator.solver.SudokuChecker.canBeSolved;
import static view.SudokuViewer.viewSudoky;

public class SudokuStarter {

    public static void main(String[] args) {
        Sudoku sudoku = generateSudoku(1);
        viewSudoky(sudoku);
    }
}
