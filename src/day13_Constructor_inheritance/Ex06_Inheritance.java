package day13_Constructor_inheritance;

class Calc06{
	public int n= 12345;
	public String s = "부모 문자열";
	private String ss = "private 변수";
	protected String sss = "protected 변수";		// 자식한테는 허용해준다
	public Calc06(String s) { 
		System.out.println(s+" 부모 생성자");
	}
	public void test() {
		System.out.println("부모 test 실행");
	}
}

class Computer06 extends Calc06{
	
	public Computer06(String ss) {
		super(ss);
		System.out.println(ss+" : 자식 생성자");
		super.test();
		this.test();
		System.out.println("this.n : "+n);
		System.out.println("super.n : "+super.n);
		System.out.println("super.s : "+s);
	//	System.out.println("super private ss : "+super.ss); // 안되는거임 private이라
		System.out.println("super protected sss : "+super.sss);
	}
	public void test() {
		System.out.println("자식 test  실행");
	}
	
}

public class Ex06_Inheritance {
	public static void main(String[] args) {
		
		Computer06 com = new Computer06("전달");
		
		
		
		
		
		
		
		
	}
}
