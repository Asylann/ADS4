# Algorithms and Data Structures 4-Assignment
This project implements graph traversal and shortest path algorithms 
(BFS and Dijkstra's algorithm) using a vertex-weighted approach for representing graphs. 
Unlike traditional implementations that use separate Edge objects, this implementation stores edge information directly within Vertex objects.
## Core Classes

- **Vertex.java:** Represents a graph vertex that maintains its own adjacency list with weights
- **WeightedGraph.java:** Graph implementation using the vertex-weighted approach
- **Search.java:** Interface for search algorithms

## Search Algorithms

- **BreadthFirstSearch.java:** Finds shortest paths based on number of edges
- **DepthFirstSearch.java:** Explores full depth of each branch before backtracking
- **DijkstraSearch.java:** Finds shortest paths based on edge 

## Key Features

- Vertex-Based Design: Graph structure is defined by vertices and their connections, rather than edge objects
- Generic Implementation: Works with any data type
- Multiple Search Algorithms: Same graph structure works with different search algorithms via common interface

