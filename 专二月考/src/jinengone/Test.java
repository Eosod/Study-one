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
		//��2��ָ�����������¼�������Ϣ����װPet����5�֣�������List���ϣ�3�֣�����ͼ��
		System.out.println("������Ҫ��ӳ���ĸ���");
		int i = sc.nextInt();
		for (int j = 0; j<i; j++) {
			System.out.println("�����������Ϣ����ʽΪ��1�����֣�2.5��false��");
			String str1 = sc.next();
			String[] str2 = str1.split(",");
			Pet p = new Pet(Integer.parseInt(str2[0]),str2[1],Float.parseFloat(str2[2]),Boolean.parseBoolean(str2[3]));
			arr.add(p);
		}
		System.out.println("����ɹ���ӵ�������");
		System.out.println("�����������");//��3���Լ��������ݰ���Ž�������
		Collections.sort(arr);
		for (Pet pet : arr) {
			System.out.println(pet);
		}
		System.out.println("�����������,����������");
		float d = sc.nextFloat();//��4������������ҳ��5�֣�
		for (Pet pet : arr) {
			if (pet.getAge()==d) {
				System.out.println(pet);
			}
			else {
				System.out.println("û�и��������");
			}
		}
		System.out.println("--------------------------");
		Iterator<Pet> it = arr.iterator();
		while(it.hasNext())
		{
			//��5��ʹ�õ������������ϲ������5�֣�
			System.out.println(it.next());
		}
		FileOutputStream fos = new FileOutputStream("pet.txt");
		ObjectOutputStream obj1 = new ObjectOutputStream(fos);
		for (Pet pet : arr) {
			//��6������List���ϣ���Pet������������ֵд�뵽pet.txt�ļ��У�5��
			obj1.writeObject(pet);
		}
		fos.close();
		obj1.close();
		
		System.out.println("�����л����");
		FileInputStream fis = new FileInputStream("pet.txt");
		ObjectInputStream obj2 = new ObjectInputStream(fis);
		for (Pet pet : arr) {
			Pet readObject = (Pet) obj2.readObject();
			System.out.println(readObject);
		}
	}
}
