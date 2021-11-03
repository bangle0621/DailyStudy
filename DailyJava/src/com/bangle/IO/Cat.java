package com.bangle.IO;

public class Cat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		\    /\
//		 )  ( ')
//		(  /  )
//		 \(__)|

		cat();
	}
	
	public static void cat() {
		
		String[] catLine = new String[4];
		
		catLine[0] = "\\    /\\";
		catLine[1] = " )  ( ')";
		catLine[2] = "(  /  )";
		catLine[3] = " \\(__)|";
		
		
		for(int i= 0; i<4;i++) {
			System.out.println(catLine[i]);
		}	
	}

}
