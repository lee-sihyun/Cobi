package site.itwill07.aop;

public class JoinPointBean {
	public void add() {
		System.out.println("*** JoinPointBean 클래스의 add() 메소드 호출 ***");
	}
	
	public void modify(int num,String name) {
		System.out.println("*** JoinPointBean 클래스의 modify() 메소드 호출 ***");
	}
	
	public void remove(int num) {
		System.out.println("*** JoinPointBean 클래스의 remove() 메소드 호출 ***");
	}
	
	public String getName() {
		System.out.println("*** JoinPointBean 클래스의 getName() 메소드 호출 ***");
		return "홍길동";
	}
	
	public void calc(int num1,int num2) {
		System.out.println("*** JoinPointBean 클래스의 calc() 메소드 호출 ***");
		System.out.println("몫 = "+(num1/num2));
	}
}
