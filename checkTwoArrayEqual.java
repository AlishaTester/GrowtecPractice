package ArrayProgram;

import java.util.Arrays;

public class checkTwoArrayEqual {
public static void main(String[] args) {
	int array1[]=new int[4];
    array1[0]=100;
    array1[1]=120;
    array1[2]=500;
    array1[3]=540;

    int array2[]=new int[array1.length];
    array2[0]=900;
    array2[1]=120;
    array2[2]=500;
    array2[3]=540;
 boolean s=   Arrays.equals(array1, array2);
 System.out.println(s);
}
}
