package day13_Constructor_inheritance;

class Calc01{
	public Calc01(String s) {
		System.out.println(s + " calc 부모 생성자");
	}
	public void disply() {
		System.out.println("나는 계산기야");
	}
	
	
	
}

class Computer01 extends Calc01{
	public Computer01() {
		super("값 전달");
		System.out.println("com 자식 생성자");
	}
	public void print() {
		System.out.println("나는 컴퓨터야");
	}
}


public class Ex05_Inheritance {
	public static void main(String[] args) {
		/*
		 상속
		 - Extends를 통해 만든다.
		 - 새로운 기능을 추가한다.
		 */
		
	//	Calc01 ca = new Calc01();
	//	ca.disply();
		Computer01 com = new Computer01();
		com.print();
		com.disply();
		
		
		
		
		
	}
}
