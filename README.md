# The Shendall Project

## Personnel
Matthew Kendall  
Benjamin Shen

## Statement of problem
Return the boolean value of the statement “there exists a path through a maze starting at a designated beginning ending at treasure”, with looping (redundant pathing) disallowed.

## Recursive abstraction
When I am asked to evaluate whether there exists a path from a position to the treasure, the recursive abstraction can evaluate whether there exists a path to the treasure from one of the adjacent positions.

## Base case
if (current position is treasure) return true  
else if (current position is a wall) return false  

## English or pseudocode description of algorithm
drop a wall on current position  
for each neighboring node:  
&nbsp;&nbsp;
  if (recursive abstraction called on this node is true) return true  
drop a path on current position  
return false  

## Additional notes
A position can be a stepping stone, a wall, or a treasure.  
Each position has 4 adjacent positions.  

## Version *n* wish list
* [ ] count solution(s)
* [ ] record solution(s)
* [ ] encompass non-rectangular mazes
* [ ] accept diagonally connected nodes as valid paths  

## Known Bugs
- When setting explorer coordinates, the client cannot write coordinates that are outside of the boundary (e.g. `java UserOfMazeSolver mazes/4cell_treasureWest.txt -1 -1`  will fail)
