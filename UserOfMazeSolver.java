/**
  test MazeSolver
 */

public class UserOfMazeSolver {
    private static Displayer displayer;

    public static void main( String[] commandLine) 
	throws java.io.FileNotFoundException {

        // /**
        //   test the three base cases
        //  */
         
        // Maze basecaseTreasure = new Maze("./mazes/basecase_treasure.txt", 0, 0);
        // MazeSolver basecaseTreasureSolver = new MazeSolver(basecaseTreasure);
        // System.out.println( "Base Case treasure:" 
        //                     + System.lineSeparator()
        //                     + basecaseTreasure
        //                     + basecaseTreasureSolver.isThereSolution()
        //                     + System.lineSeparator()
        //                     + "Expecting: True");

        // Maze basecaseWall = new Maze("./mazes/basecase_wall.txt", 0, 0);
        // MazeSolver basecaseWallSolver = new MazeSolver(basecaseWall);
        // System.out.println( "Base Case wall:" 
        //                     + System.lineSeparator()
        //                     + basecaseWall
        //                     + basecaseWallSolver.isThereSolution()
        //                     + System.lineSeparator()
        //                     + "Expecting: False");

        // Maze basecasePath = new Maze("./mazes/basecase_path.txt", 0, 0);
        // MazeSolver basecasePathSolver = new MazeSolver(basecasePath);
        // System.out.println( "Base Case path:" 
        //                     + System.lineSeparator()
        //                     + basecasePath
        //                     + basecasePathSolver.isThereSolution()
        //                     + System.lineSeparator()
        //                     + "Expecting: False");

	
        // /**
        //   test small recursive cases
        // */

        // Maze smallRecursiveCase0 = new Maze("./mazes/smallRecursiveCase0.txt", 0, 0);
        // MazeSolver smallRecursiveCase0Solver = new MazeSolver(smallRecursiveCase0);
        // System.out.println( "Small recurisve case 0:" 
        //                     + System.lineSeparator()
        //                     + smallRecursiveCase0
        //                     + smallRecursiveCase0Solver.isThereSolution()
        //                     + System.lineSeparator()
        //                     + "Expecting: False");

        // Maze smallRecursiveCase1 = new Maze("./mazes/smallRecursiveCase1.txt", 0, 0);
        // MazeSolver smallRecursiveCase1Solver = new MazeSolver(smallRecursiveCase1);
        // System.out.println( "Small recurisve case 1:" 
        //                     + System.lineSeparator()
        //                     + smallRecursiveCase1
        //                     + smallRecursiveCase1Solver.isThereSolution()
        //                     + System.lineSeparator()
        //                     + "Expecting: True");

        System.out.println();

        Maze maze = new Maze( commandLine[0]
                            , Integer.parseInt( commandLine[1])
                            , Integer.parseInt( commandLine[2])
                            );
        MazeSolver mazeSolver = new MazeSolver(maze, Integer.parseInt( commandLine[3]));
        System.out.println( maze 
                            + System.lineSeparator()
                            + "Can it be solved?"
                            + System.lineSeparator()
                            + mazeSolver.isThereSolution());

    }

    /**
      Display changes to a maze.
      Run by using the height of your shell window as a final argument, like...
          java UserOfMaze mazes/4cell_treasureWest.txt 0 3 25
     */
    private static void displayerTest( Maze m) {
        int step = 0;

        displayer.atTopOfWindow( m + "step " + step++);

        // move past west edge, Displaying as we go
        while( step < 5) {
            m.go( Maze.WEST);
            displayer.atTopOfWindow( m + "step " + step++);
        }
    }
}
