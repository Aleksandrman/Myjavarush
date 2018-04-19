package lvl7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapPrive {

	public static void main(String[] args) throws IOException {
		 String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

	        HashMap<String, Cat> map = addCatsToMap(cats);

	        for (Map.Entry<String, Cat> pair : map.entrySet()) {
	            System.out.println(pair.getKey() + " - " + pair.getValue());
	        }
	    }


	    public static HashMap<String, Cat> addCatsToMap(String[] cats) {
	    	HashMap<String, Cat> map = new HashMap<>();
	    	for(int i = 0; i < cats.length; i++) {
	        	Cat cat = new Cat(cats[i]);
	        	map.put(cats[i], cat);
	        }
	    	return map;
	    }


	    public static class Cat {
	        String name;

	        public Cat(String name) {
	            this.name = name;
	        }

	        @Override
	        public String toString() {
	            return name != null ? name.toUpperCase() : null;
	        }
	
		
	}//end method
	


}
