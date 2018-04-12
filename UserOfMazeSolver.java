/**
  test MazeSolver
 */

public class UserOfMazeSolver {

    public static void main( String[] commandLine) 
	throws java.io.FileNotFoundException {
        /**
          test base case
         */
         
        Maze basecaseTreasure = new Maze("./mazes/basecase_treasure.txt", 0, 0);
        MazeSolver basecaseTreasureSolver = new MazeSolver(basecaseTreasure);
        System.out.println( basecaseTreasureSolver.isThereSolution());

        Maze basecaseWall = new Maze("./mazes/basecase_wall.txt", 0, 0);
        MazeSolver basecaseWallSolver = new MazeSolver(basecaseWall);
        System.out.println( basecaseWallSolver.isThereSolution());

        Maze basecasePath = new Maze("./mazes/basecase_path.txt", 0, 0);
        MazeSolver basecasePathSolver = new MazeSolver(basecasePath);
        System.out.println( basecasePathSolver.isThereSolution());
	
        
    }
}
