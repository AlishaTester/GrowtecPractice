package ArrayProgram;

public class AVGofarray {
	public static void main(String[] args) {
		int avg;
		int sum=0;
		int array1[]=new int[4];
	    array1[0]=100;
	    array1[1]=120;
	    array1[2]=500;
	    array1[3]=540;
	    for (int i=0;i<array1.length;i++) {
	    sum=sum+array1[i];//0
	    }System.out.println(sum);
	    avg=sum/array1.length;
	    System.out.println(avg);
}
}