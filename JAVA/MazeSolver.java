/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.afloriano.mazesolver;

import java.util.*;
/**
 *
 * @author andre
 */

public class MazeSolver {
    private static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public static void main(String[] args) {
        char[][] maze = {
            {'S', '#', '#', '#', '#', '#'},
            {'.', '.', '.', '.', '.', '#'},
            {'#', '.', '#', '#', '#', '#'},
            {'#', '.', '#', '.', '.', '.'},
            {'#', '.', '#', '.', '#', 'E'},
            {'#', '.', '.', '.', '.', '#'}
        };

        System.out.println("This is the Maze: Start S, End E, Wall # and Path . ");
        for(char[] row:maze){
            System.out.println(Arrays.toString(row));
        }
        System.out.println("");
        boolean solved = solveMaze(maze);

        if (solved) {
            System.out.println("Maze solved!");
            for (char[] row : maze) {
                System.out.println(Arrays.toString(row));
            }
        } else {
            System.out.println("No solution found");
        }
    }

    public static boolean solveMaze(char[][] maze) {
        Point start = findStart(maze);
        return dfs(maze, start.x, start.y);
    }

    private static Point findStart(char[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 'S') {
                    return new Point(i, j);
                }
            }
        }
        throw new RuntimeException("No starting point found!");
    }

    private static boolean dfs(char[][] maze, int x, int y) {
        if (maze[x][y] == 'E') {
            return true;
        }
        maze[x][y] = '#';
        for (int[] direction : DIRECTIONS) {
            int newX = x + direction[0];
            int newY = y + direction[1];
            if (isValidMove(maze, newX, newY) && dfs(maze, newX, newY)) {
                maze[newX][newY] = 'V';
                return true;
            }
        }
        return false;
    }

    private static boolean isValidMove(char[][] maze, int x, int y) {
        if (x < 0 || x >= maze.length || y < 0 || y >= maze[x].length) {
            return false;
        }
        return maze[x][y] != '#' && maze[x][y] != 'S';
    }

    private static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
