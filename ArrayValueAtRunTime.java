package ArrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayValueAtRunTime {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size of array");
	int size=s.nextInt();
	int s2[]	=new int[size];
	for(int i=0;i<s2.length;i++) {
		System.out.println("enter the value at indeex<<<<<"+i);
		s2[i]=s.nextInt();
	}System.out.println(Arrays.toString(s2));
	s.close();
}
}
