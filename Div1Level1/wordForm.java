# WordForm - Division 1 Level 1 SRM 173

import java.io.*;
import java.util.*;
import java.lang.*;

public class WordForm{
	public String getSequence(String word){
		boolean itsVowel = true;
		String temp = word.toLowerCase();
		StringBuilder sb1 = new StringBuilder();
		Set<Character> set = new HashSet<>(Arrays.asList('a','i','e','o','u'));
		for(int i=0;i<temp.length();i++){
			if(set.contains(temp.charAt(i))){
				sb1.append('V');
				itsVowel = true;
			}
			else if(temp.charAt(i) == 'y' && itsVowel == false){
				sb1.append('V');
				itsVowel = true;
			}
			else{
				sb1.append('C');
				itsVowel = false;
			}
		}
		StringBuilder sb = new StringBuilder();
		String val = sb1.toString();
		sb.append(val.charAt(0));
		for(int i=1;i<val.length();i++){
			if(val.charAt(i) != val.charAt(i-1)){
				sb.append(val.charAt(i));
			}
		}
		return sb.toString();
	}
}