package jinengthree;

public class Test {
	public static int tz = 0 ;
	public static Object obj = new Object();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father father = new Father();//��1��������ӺͰְ������߳��ࣨ4�֣�
		Son son = new Son();
		father.start();
		son.start();
		//��6�������������ȷ�������ӺͰְ������̵߳���������4�֣�
	}

}
