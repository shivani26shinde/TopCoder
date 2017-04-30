# Tall People - Single Round Match 208 Round 1 - Division I, Level One

import java.util.*;
import java.lang.*;
import java.io.*;

public class TallPeople{
	public int[] getPeople(String[] people){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    	for(int i=0;i<people.length;i++){
        	ArrayList<Integer> temp = new ArrayList<>();
            String s = people[i];
            for(int j=0;j<s.length();j++){
            	if(s.charAt(j) != ' '){
                	temp.add(Character.getNumericValue(s.charAt(j)));
                }
            }
            list.add(temp);
        }
        ArrayList<Integer> row = new ArrayList<>();
        for(int i=0;i<list.size();i++){
        	ArrayList<Integer> temp1 = list.get(i);
            row.add(Collections.min(temp1));
        }
        ArrayList<Integer> col = new ArrayList<>();
        for(int i=0;i<list.get(0).size();i++){
            ArrayList<Integer> temp3 = new ArrayList<>();
        	for(int j=0;j<list.size();j++){
            	temp3.add(list.get(j).get(i));
            }
            col.add(Collections.max(temp3));
        }
        int[] finalAns = new int[2];
        finalAns[0] = Collections.max(row);
        finalAns[1] = Collections.min(col);
        return finalAns;
    }
}