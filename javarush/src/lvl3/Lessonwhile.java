package lvl3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lessonwhile {
public static void main(String[] args) throws IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	int a = 0;
	int sum = 0;
	while(a != -1) {
		 a = Integer.parseInt(bf.readLine());
	sum +=a;
	}
	System.out.println(sum);
}
}
