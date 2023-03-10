package test;

import org.testng.annotations.Test;

public class testng {
@Test
	public static void demo() {
		String str="Nagalakshmi";
		String rev="";
		char []arr= str.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
