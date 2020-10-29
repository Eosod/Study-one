package b;

import java.util.Scanner;

public class Test {
	static doctor[] d = new doctor[50];
	static int index = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("输入姓名");
			String name = sc.next();
			boolean b = verifyName(name);
			if(b==false)
			{
				System.out.println("1.主任医师2.主治医师3.住院医师4.无职称");
				int bh = sc.nextInt();
				switch (bh) {
				//⑤完成医生或专家的实例化并调用方法完成医生的添加（挂号费规则：医生（无职称）20，专家中，主任医师100  主治医师80  住院医师50）
				case 1:
					zj zhu = new zj(name,100,"主任医师");
					add(zhu);
					break;
				case 2:
					zj zhu2 = new zj(name,80,"主治医师");
					add(zhu2);
					break;
				case 3:
					zj zhu3 = new zj(name,50,"住院医师");
					add(zhu3);
					break;
				case 4:
					zj zhu4 = new zj(name,20,"无职称");
					add(zhu4);
					break;
				default:
					break;
				}
				
				System.out.println("继续请按1，退出请按2");
				int pd = sc.nextInt();
				//④正确按照效果图实现多个医生的添加
				if (pd==2) {
					break;
				}
			}
			else
			{
				System.out.println("名字不允许重复");
			}
		}
		showAllDoc();
		
	}
	public static boolean verifyName(String name)//①定义boolean verifyName(String name)方法判断姓名是否重复（重名医生不能增加）（5分）
	{
		for (int i = 0; i <index; i++) {
			if (d[i]!=null) {
				if (d[i].getName().equals(name)) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	public static void add(doctor doc)
	{
		//②定义add方法用于添加医生（参数为医生类型，医生姓名不能重复）
		d[index]=doc;
		index++;
		System.out.println("添加成功");
	}
	
	public static void showAllDoc()
	{
		//③定义showAllDoc方法显示所有医生详细信息
		for (int i = 0; i <d.length; i++) {
			if (d[i]!=null) {
				System.out.println(d[i]);
			}
		}
	}
}
