# The Shendall Project

## Personnel
Matthew Kendall  
Benjamin Shen

## Statement of problem
Return the boolean value of the statement “there exists a path through a maze starting at a designated beginning ending at treasure”, with looping (redundant pathing) disallowed.

## Recursive abstraction
When I am asked to evaluate whether there exists a path from a node to the treasure, the recursive abstraction can evaluate whether there exists a path to the treasure from one of the adjacent nodes.

## Base case
if (current node is treasure) return true  
else if (current node is null or current node is marked) return false

## English or pseudocode description of algorithm
for each neighboring node:  
&nbsp;&nbsp; mark current node  
&nbsp;&nbsp; if (recursive abstraction called on the current node is true) return true  
unmark current node  
return false

## Additional notes
Every node has 4 neighboring nodes; each node has a distinct location and can be null.  
Marked nodes represent the path that the program is testing.

## Classes, with fields and methods
**Maze**
**Node**
**MazeSolver**
**UserOfMaze**
**UserOfNode**
**UserOfMazeSolver**

## Version *n* wish list
* count solution(s)
* record solution(s)
* encompass non-rectangular mazes
