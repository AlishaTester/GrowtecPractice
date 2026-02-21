package ArrayProgram;

public class check100ispartofarray {
	public static void main(String[] args) {

		int numcheck=100;
		int array1[]=new int[4];
	    array1[0]=100;
	    array1[1]=120;
	    array1[2]=500;
	    array1[3]=540;
	    for (int i=0;i<array1.length;i++) {
	    	if (array1[i]==100) {
	    	System.out.println("100 is present");
	    	System.out.println(i);
	    	}
	    	
}
}}