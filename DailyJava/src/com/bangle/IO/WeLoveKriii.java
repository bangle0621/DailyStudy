package com.bangle.IO;

public class WeLoveKriii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두 줄에 걸쳐 "강한친구 대한육군"을 한 줄에 한 번씩 출력한다.
		//A가 강한친구 B가 대한육군 이야. 값을 넘겨줘서 그 값이 
		
		String Strong = "강한친구";
		String Armi = "대한육군";
		
			
		StrongArmi(Strong,Armi);
		StrongArmi(Strong,Armi);
	}
	public static void StrongArmi(String A, String B) {
		String StrongArmi = A + " " + B;
		System.out.println(StrongArmi);
	}

}
