package Graphs;

// Java code to implement the above approach

// import java.io.*;

class GFG {

	static int m, n;

	// Function to check if there is a valid path
	static boolean isValid(int i, int j, int x,
						boolean[][] visited, int[][] arr,
						long parent)
	{
		// Check if we go outside the matrix or
		// cell(i, j) is visited or absolute
		// difference between consecutive cell
		// is greater than our assumed maximum
		// energy required If true,
		// then return false
		if (i < 0 || j < 0 || i >= m || j >= n
			|| visited[i][j]
			|| Math.abs(arr[i][j] - parent) > x) {
			return false;
		}

		// Check if we reach at bottom-right
		// cell If true, then return true
		if (i == m - 1 && j == n - 1) {
			return true;
		}

		// Make the current cell(i, j) visited
		visited[i][j] = true;

		// Make all four direction call and
		// check if any path is valid If true,
		// then return true.
		if (isValid(i + 1, j, x, visited, arr, arr[i][j]))
			return true;
		if (isValid(i - 1, j, x, visited, arr, arr[i][j]))
			return true;
		if (isValid(i, j + 1, x, visited, arr, arr[i][j]))
			return true;
		if (isValid(i, j - 1, x, visited, arr, arr[i][j]))
			return true;

		// Otherwise, return false
		return false;
	}

	// Function to find the minimum value among
	// the maximum adjacent differences
	static int minimumEnergyPath(int[][] arr)
	{
		// Initialize a variable start = 0
		// and end = maximum possible
		// energy required
		int start = 0, end = 10000000;

		// Initialize a variable result
		int result = arr[0][0];

		// Loop to implement the binary search
		while (start <= end) {
			int mid = (start + end) / 2;

			// Initialize a visited array
			// of size (m * n)
			boolean[][] visited = new boolean[m][n];

			// Check if mid energy is valid
			// energy required by choosing any
			// path into the matrix If true,
			// update the result and
			// move end to mid - 1
			if (isValid(0, 0, mid, visited, arr,
						arr[0][0])) {
				result = mid;
				end = mid - 1;
			}

			// Otherwise, move start to mid + 1
			else {
				start = mid + 1;
			}
		}

		// Return the result
		return result;
	}

	public static void main(String[] args)
	{
		int[][] arr
			= { { 4, 2, 4 }, { 2, 8, 2 }, { 2, 4, 2 } };

		m = arr.length;
		n = arr[0].length;
		// Function call
		System.out.print(minimumEnergyPath(arr));
	}
}


