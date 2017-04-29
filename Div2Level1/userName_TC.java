# UserName - Single Round Match 203 Round 1 - Division II, Level One

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Bart4", "Bart5", "Bart6", "Bart7", 
		"Bart8", "Bart9", "Bart10", "Lisa", "Marge", "Homer", "Bart", "Bart1", "Bart2", "Bart3",
 		"Bart11", "Bart12", "Bart400"));
 		String s = "Random";
 		String temps = s;
 		int i=1;
 		while(list.contains(temps)){
 			temps = s;
 			StringBuilder sb = new StringBuilder();
 			sb.append(temps);
 			sb.append(i);
 			temps = sb.toString();
 			i++;
 		}
 		if(i == 1){
 			list.add(s);
 		}
 		else{
 			list.add(temps);
 		}
 		System.out.println(Arrays.toString(list.toArray()));
	}
}