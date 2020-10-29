package jinengone;

import java.io.DataOutput;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Pet> arr = new ArrayList<>();
		//（2）指定宠物个数，录入宠物信息，封装Pet对象（5分）并加入List集合（3分）（见图）
		System.out.println("请输入要添加宠物的个数");
		int i = sc.nextInt();
		for (int j = 0; j<i; j++) {
			System.out.println("请输入宠物信息（格式为：1，闹闹，2.5，false）");
			String str1 = sc.next();
			String[] str2 = str1.split(",");
			Pet p = new Pet(Integer.parseInt(str2[0]),str2[1],Float.parseFloat(str2[2]),Boolean.parseBoolean(str2[3]));
			arr.add(p);
		}
		System.out.println("宠物成功添加到集合里");
		System.out.println("按照序号排序");//（3）对集合中数据按编号进行排序
		Collections.sort(arr);
		for (Pet pet : arr) {
			System.out.println(pet);
		}
		System.out.println("按照年龄查找,请输入年龄");
		float d = sc.nextFloat();//（4）按照年龄查找宠物（5分）
		for (Pet pet : arr) {
			if (pet.getAge()==d) {
				System.out.println(pet);
			}
			else {
				System.out.println("没有该年龄宠物");
			}
		}
		System.out.println("--------------------------");
		Iterator<Pet> it = arr.iterator();
		while(it.hasNext())
		{
			//（5）使用迭代器遍历集合并输出（5分）
			System.out.println(it.next());
		}
		FileOutputStream fos = new FileOutputStream("pet.txt");
		ObjectOutputStream obj1 = new ObjectOutputStream(fos);
		for (Pet pet : arr) {
			//（6）遍历List集合，将Pet对象所有属性值写入到pet.txt文件中（5分
			obj1.writeObject(pet);
		}
		fos.close();
		obj1.close();
		
		System.out.println("反序列化输出");
		FileInputStream fis = new FileInputStream("pet.txt");
		ObjectInputStream obj2 = new ObjectInputStream(fis);
		for (Pet pet : arr) {
			Pet readObject = (Pet) obj2.readObject();
			System.out.println(readObject);
		}
	}
}
