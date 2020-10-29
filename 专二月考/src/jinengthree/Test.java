package jinengthree;

public class Test {
	public static int tz = 0 ;
	public static Object obj = new Object();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father father = new Father();//（1）定义儿子和爸爸两个线程类（4分）
		Son son = new Son();
		father.start();
		son.start();
		//（6）测试类代码正确（含儿子和爸爸两个线程的启动）（4分）
	}

}
