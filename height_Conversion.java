package study_17_9_15;

import java.util.Scanner;

	 public class height_Conversion {
	
	 private static Scanner in;
	
	 public static void main(String[] args) {
	 // TODO Auto-generated method stub
		 int foot;//英尺
		 int inch;//英寸
		 double meter;//米
		 //OK
		 in = new Scanner(System.in);
		 System.out.println("foot=");
		 foot=in.nextInt();
		 System.out.println("inch=");
		 inch=in.nextInt();
		 meter=(foot+inch/12.0)*0.3048;
		 System.out.println("meter=" + meter);
	 }

}
