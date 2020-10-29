package jinengtwo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("向map中增加用户：请输入用户名（多个用户名之间用逗号分隔），密码默认为123");
		String str1 = sc.next();
		String[] str2 = str1.split(",");
		for (int i = 0; i < str2.length; i++) {
			map.put(str2[i],"123");
		}
		System.out.println("增加成功!");
		for (Map.Entry<String, String> strin : map.entrySet()) {
			System.out.println(strin);
		}
		System.out.println("给map中已有的数据修改密码,请输入用户名");
		String str3 = sc.next();
		if (map.containsKey(str3)) {
			System.out.println("请输入新密码");
			String str4 = sc.next();
			System.out.println("请再次输入新密码");
			String str5 = sc.next();
			if (str4.equals(str5)) {
				System.out.println("修改成功");
				map.put(str3, str4);
			}
			else{
				System.out.println("两次输入不一致，修改失败");
			}
			
		}
		for (Map.Entry<String, String> strin : map.entrySet()) {
			System.out.println(strin);
		}
		System.out.println("删除用户");
		System.out.println("请输入要删除的用户名");
		String str6 =sc.next();
		map.remove(str6);
		System.out.println("删除成功");
		for (Map.Entry<String, String> strin : map.entrySet()) {
			System.out.println(strin);
		}
		System.out.println("登录");
		System.out.println("请输入用户和密码  ; 分隔");
		String str7 = sc.next();
		String[] str8 = str7.split(";");
		String str9 = str8[0];
		String str10 = str8[1];
		if (str10.equals(map.get(str9))) {
			System.out.println("登陆成功");
		}
		else{
			System.out.println("登录失败");
		}
	}

}
