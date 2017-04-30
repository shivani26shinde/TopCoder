# Yahtzee Score

import java.util.*;
import java.io.*;
import java.lang.*;

public class YahtzeeScore{
	public int maxPoints(int[] toss){
    	HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<toss.length;i++){
        	if(map.containsKey(toss[i])){
            	int val = map.get(toss[i]);
                map.put(toss[i], val+toss[i]);
            }
            else{
                map.put(toss[i], toss[i]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int key : map.keySet()){
        	list.add(map.get(key));
        }
        return Collections.max(list);
    }
}