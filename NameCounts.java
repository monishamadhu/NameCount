package week4.nameCounts;

import java.io.*;
import java.util.*;
import acm.program.ConsoleProgram;

public class NameCounts extends ConsoleProgram {
	HashMap<String,Integer> name= new HashMap<String,Integer>();
	public void run() { 
		while(true) {
		String st = readLine("Enter name: "); //reads each name and stores as key
		int c=1;							//c is the value initialized to 1 corresponding to each key.
		if(name.containsKey(st)) {			//if hashmap already contains the name entered i.e. st
			 c= (int)(name.get(st))+1;		// then add 1 to the value corresponding to st
		}
		if(st.equals("")) break;
		name.put(st,c);						//then it's put into hashmap
		}
		for(String n:name.keySet()) {
			int k = name.get(n);
			System.out.println("entry " + n + " has count: "+k);
		}
	}
}
	
