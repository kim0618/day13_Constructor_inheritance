package day13_Constructor_inheritance;

import java.util.Calendar;

class Singleton04{
	private static Singleton04 si;
	private Singleton04() {
		System.out.println("기본 생성자 실행");
	}
	public static Singleton04 getInstance() {
		System.out.println("si : "+si);
		return si;
	}
	
	
}

public class Ex04_Singleton {
	public static void main(String[] args) {
		
		//싱클던 = 객체를 하나만 만들어서 사용하는 방식
		
		Singleton04 si01 = Singleton04.getInstance();
		System.out.println("si01 : "+si01);
		Singleton04 si02 = Singleton04.getInstance();
		System.out.println("si02 : "+si02);
		
		
		
		
		
	}
	
}
