package sudoku_generator.solver;

import sudoku_generator.model.Sudoku;

public class SudokuChecker {

    public static boolean canBeSolved(Sudoku sudoku){
        SudokuSolver solver = new SudokuSolver(sudoku);
       return solver.solve();
    }
}
