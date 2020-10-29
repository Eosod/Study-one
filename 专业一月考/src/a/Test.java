package a;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//（3）测试类中实例化语文和英语老师（声明为Teacher类型）并调用各自的teach方法
		ChineseTeacher c = new ChineseTeacher();
		EnglishTeacher e = new EnglishTeacher();
		c.teach();
		e.teach();
	}

}
