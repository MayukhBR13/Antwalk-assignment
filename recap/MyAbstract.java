package recap;

public class MyAbstract implements MyInterface,MyInterface2{
	int num;
	String str;
	public MyAbstract(int num, String str) {
		super();
		this.num = num;
		this.str = str;
	}
	void foo() {
		System.out.println("foo from MyAbstract class");
	}
	//abstract void abstractMethod();
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		MyInterface.super.m2();
		System.out.println(getClass().getCanonicalName());
	}
	public static void main(String args[]) {
		MyAbstract a=new MyAbstract(0, null);
		a.m2();
	}
}
