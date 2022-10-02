package edu.uta.daa.graphs;

//https://leetcode.com/problems/number-of-islands/
//Graph Traversals
/*Given an m x n 2D binary grid which represents a map of '1's (land) and '0's (water), return the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
You may assume all four edges of the grid are all surrounded by water.

Example 1:

Input: grid = [
['1','1','1','1','0'],
['1','1','0','1','0'],
['1','1','0','0','0'],
['0','0','0','0','0']
]
Output: 1
Example 2:

Input: grid = [
['1','1','0','0','0'],
['1','1','0','0','0'],
['0','0','1','0','0'],
['0','0','0','1','1']
]
Output: 3


Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 300
grid[i][j] is '0' or '1'.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NumberOfIslands {


    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int numOfIslands = numIslands(grid);
        System.out.println("The number of islands in the given grid is: " + numOfIslands);
    }

    private static int numIslands(char[][] grid) {
        int numOfIslands = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (!visited[i][j])
                    numOfIslands += dfs(i, j, grid, visited);
            }
        }
        return numOfIslands;
    }

    private static int dfs(int row, int col, char[][] grid, boolean[][] visited) {
        int temp = 0;
        Stack<List<Integer>> nodesToExplore = new Stack<>();
        nodesToExplore.push(Arrays.asList(row, col));
        while (!nodesToExplore.empty()) {
            List<Integer> currentNode = nodesToExplore.pop();
            row = currentNode.get(0);
            col = currentNode.get(1);
            if (visited[row][col] || grid[row][col] == '0')
                continue;
            visited[row][col] = true;
            temp++;
            List<List<Integer>> unvisitedNeighbors = getUnvisitedNeighbors(grid, row, col, visited);
            nodesToExplore.addAll(unvisitedNeighbors);
        }
        return temp > 0 ? 1 : 0;
    }

    private static List<List<Integer>> getUnvisitedNeighbors(char[][] matrix, int i, int j, boolean[][] visitedArray) {
        List<List<Integer>> list = new ArrayList<>();
        if (i - 1 >= 0 && !visitedArray[i - 1][j] && matrix[i - 1][j] == '1') {
            list.add(Arrays.asList(i - 1, j));
        }
        if (i + 1 <= matrix.length - 1 && !visitedArray[i + 1][j] && matrix[i + 1][j] == '1') {
            list.add(Arrays.asList(i + 1, j));
        }
        if (j - 1 >= 0 && !visitedArray[i][j - 1] && matrix[i][j - 1] == '1') {
            list.add(Arrays.asList(i, j - 1));
        }
        if (j + 1 <= matrix[i].length - 1 && !visitedArray[i][j + 1] && matrix[i][j + 1] == '1') {
            list.add(Arrays.asList(i, j + 1));
        }
        return list;
    }
}
