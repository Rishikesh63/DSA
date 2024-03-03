package Graphs;
import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        char[][] map = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        int rooms = countRooms(map, n, m);
        System.out.println(rooms);
    }

    private static int countRooms(char[][] map, int n, int m) {
        int rooms = 0;
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == '.' && !visited[i][j]) {
                    dfs(map, visited, i, j);
                    rooms++;
                }
            }
        }
        return rooms;
    }

    private static void dfs(char[][] map, boolean[][] visited, int i, int j) {
        if (i < 0 || i >= map.length || j < 0 || j >= map[0].length || map[i][j] == '#' || visited[i][j]) {
        }
        visited[i][j] = true;
        dfs(map, visited, i + 1, j);
        dfs(map, visited, i - 1, j);
        dfs(map, visited, i, j + 1);
        dfs(map, visited, i, j - 1);
    }
}

