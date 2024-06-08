package Yeni;

import java.util.List;

public class Labirent {
	
	private static final String direction = "DLRU";
	private static final int[] dr = { 1, 0, 0, -1 };
	private static final int[] dc = { 0, -1, 1, 0 };
	
	private static boolean isValid(int r, int c, int n,int[][] maze){
        	return r >= 0 && c >= 0 && r < n && c < n && maze[r][c] == 1;
	}
	
	private static void findPath(int r, int c, int[][] maze,int n, List<String> ans, StringBuilder currentPath){

		
	}

	public static void main(String[] args) {
		

	}

}
