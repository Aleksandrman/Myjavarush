package lvl8;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Timer;

public class Lesson {

	

	    public static void main(String[] args) throws NumberFormatException, IOException {
ArrayList<Integer> list = new ArrayList<>();
BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
int max = 0, temp = 0, token = 1;

for(int i = 0;i < 5;i++) {
	list.add(Integer.parseInt(bf.readLine()));
	
}

temp = list.get(0);
for(int i = 1;i < list.size();i++) {
	
	if(temp == list.get(i)) {
		
		token++;
		 			
	}
	if(token>max) {
		
		max = token;
	}
	else
		token = 1; 
	temp = list.get(i);
}
System.out.println(max);

	    }
	}