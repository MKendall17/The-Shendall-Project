/**
  solve Maze
  
  Input maze object and
  return the boolean value of the statement 
    "there exists a path through a maze starting at 
    a designated beginning ending at treasure",
  with looping (redundant pathing) disallowed.
 */

public class MazeSolver {

    private Maze inProgress;
    
    public MazeSolver(Maze maze) {
        inProgress = new Maze(maze);
    }
    
    /**
      solve Maze
     */
    public boolean isThereSolution() {
        return true;
    }
}