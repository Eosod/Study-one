package jinengtwo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("��map�������û����������û���������û���֮���ö��ŷָ���������Ĭ��Ϊ123");
		String str1 = sc.next();
		String[] str2 = str1.split(",");
		for (int i = 0; i < str2.length; i++) {
			map.put(str2[i],"123");
		}
		System.out.println("���ӳɹ�!");
		for (Map.Entry<String, String> strin : map.entrySet()) {
			System.out.println(strin);
		}
		System.out.println("��map�����е������޸�����,�������û���");
		String str3 = sc.next();
		if (map.containsKey(str3)) {
			System.out.println("������������");
			String str4 = sc.next();
			System.out.println("���ٴ�����������");
			String str5 = sc.next();
			if (str4.equals(str5)) {
				System.out.println("�޸ĳɹ�");
				map.put(str3, str4);
			}
			else{
				System.out.println("�������벻һ�£��޸�ʧ��");
			}
			
		}
		for (Map.Entry<String, String> strin : map.entrySet()) {
			System.out.println(strin);
		}
		System.out.println("ɾ���û�");
		System.out.println("������Ҫɾ�����û���");
		String str6 =sc.next();
		map.remove(str6);
		System.out.println("ɾ���ɹ�");
		for (Map.Entry<String, String> strin : map.entrySet()) {
			System.out.println(strin);
		}
		System.out.println("��¼");
		System.out.println("�������û�������  ; �ָ�");
		String str7 = sc.next();
		String[] str8 = str7.split(";");
		String str9 = str8[0];
		String str10 = str8[1];
		if (str10.equals(map.get(str9))) {
			System.out.println("��½�ɹ�");
		}
		else{
			System.out.println("��¼ʧ��");
		}
	}

}
