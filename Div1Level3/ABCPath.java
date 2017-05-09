# ABCPath

import java.io.*;
import java.lang.*;
import java.util.*;

public class ABCPath{
    public int Count(char[][] matrix, int row, int col, char ch, HashSet<Character> set){
    	if(row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length){
        	  return 0;  
        }
        if(ch != matrix[row][col]){
        	return 0;    
        }
        if(set.contains(matrix[row][col])){
        	return 0;    
        }
        set.add(matrix[row][col]);
        int size = 1;
        for(int r=row-1;r<=row+1;r++){
        	for(int c=col-1;c<=col+1;c++){
                if(r != row || c != col){
                    size = size + Count(matrix, r, c, (char)(ch+1), set);
                }
            }
        }
        return size;
    }
	public int length(String[] grid){
    	char[][] matrix = new char[grid.length][grid[0].length()];
        for(int i=0;i<grid.length;i++){
        	for(int j=0;j<grid[0].length();j++){
                char c = grid[i].charAt(j);
                matrix[i][j] = c;
            }
        }
        int ans = 0;
        for(int row=0;row<matrix.length;row++){
        	for(int col=0;col<matrix[0].length;col++){
            	if(matrix[row][col] =='A'){
                    HashSet<Character> set = new HashSet<>();
                	int len = Count(matrix, row, col, 'A', set);
                    ans = Math.max(ans, len);
                }
       		} 
        }
        return ans;
    }
}