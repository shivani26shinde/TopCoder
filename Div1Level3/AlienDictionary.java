# Alien Dictionary 

import java.io.*;
import java.util.*;
import java.lang.*;

public class AlienDictionary{
    static HashSet<String> allSet = new HashSet<>();
    static HashSet<String> notSet = new HashSet<>();
	public String[] getWords(int wordLength, String[] forbiddenSubstrings, int[] wordNumbers){
        HashSet<String> forbSet = new HashSet<>();
    	for(int i=0;i<forbiddenSubstrings.length;i++){
			String temp = forbiddenSubstrings[i];
			if(temp.contains("?")){
				int ind = temp.indexOf('?');
				String one = temp.substring(0,ind)+"A"+temp.substring(ind+1,temp.length());
				String two = temp.substring(0,ind)+"B"+temp.substring(ind+1,temp.length());
				forbSet.add(one);
				forbSet.add(two);
			}
			else{
				forbSet.add(temp);
			}
		}
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<=wordLength;i++){
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<i;j++){
				sb.append("B");
			}
			for(int k=0;k<wordLength-i;k++){
				sb.append("A");
			}
            list.add(sb.toString()); 
		}
        for(int i=0;i<list.size();i++){
        	Permutation("", list.get(i));
            PermutationNot("", list.get(i), forbSet);
        }
        ArrayList<String> sorted = new ArrayList<String>(allSet);
        Collections.sort(sorted);
        String[] haveToRet = new String[wordNumbers.length];
        for(int i=0;i<wordNumbers.length;i++){
            String str = sorted.get(wordNumbers[i]);
        	if(notSet.contains(str)){
            	haveToRet[i] = str;
            }
            else{
            	haveToRet[i] = "NO PAGE";
            }
        }
        return haveToRet;
    }
    public void Permutation(String pref, String suff){
		if(suff.length() == 0){
			allSet.add(pref);
		}
		for(int i=0;i<suff.length();i++){
			Permutation(pref + suff.charAt(i), suff.substring(0,i)+suff.substring(i+1,suff.length()));
		}
	}
    public void PermutationNot(String pref, String suff, HashSet<String> forbSet){
		if(suff.length() == 0){
			notSet.add(pref);
		}
		if(forbSet.contains(pref) || forbSet.contains(suff)){
			return;
		}
		for(int i=0;i<suff.length();i++){
			PermutationNot(pref + suff.charAt(i), suff.substring(0,i)+suff.substring(i+1,suff.length()), forbSet);
		}
	}
}