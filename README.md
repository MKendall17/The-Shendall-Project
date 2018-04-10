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
else if (current node is a wall) return false  

## English or pseudocode description of algorithm
drop a wall on current node  
for each neighboring node:  
&nbsp;&nbsp;
  if (recursive abstraction called on this node is true) return true  
drop a path on current node  
return false  

## Additional notes
Every node has 4 neighboring nodes.  
Each node has a distinct location and can be null.  
Nodes are referred to in class as stepping stones.  

## Version *n* wish list
* [ ] count solution(s)
* [ ] record solution(s)
* [ ] encompass non-rectangular mazes
* [ ] accept diagonally connected nodes as valid paths
