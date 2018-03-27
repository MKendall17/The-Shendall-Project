# The Shendall Project

### Personnel
Matthew Kendall  
Benjamin Shen

## Statement of problem
Return the boolean value of the statement “there exists a path through a maze starting at a designated beginning ending at treasure”, where looping is disallowed.

## Recursive abstraction
When I am asked to know whether there exists a path from a node to the treasure, the recursive abstraction can know whether there exists a path to the treasure from one of the adjacent nodes.

## Base case
if node is null return false
if node is treasure return true

## English or pseudocode description of algorithm
for each neighbor node:
  if (abstraction(neighbor node) is true) return true
return false

notes:
A neighboring node is connected to every node but the one it came from (including the null connections).

## version*n* wish list
record solution(s)?
