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
			System.out.println("��������");
			String name = sc.next();
			boolean b = verifyName(name);
			if(b==false)
			{
				System.out.println("1.����ҽʦ2.����ҽʦ3.סԺҽʦ4.��ְ��");
				int bh = sc.nextInt();
				switch (bh) {
				//�����ҽ����ר�ҵ�ʵ���������÷������ҽ������ӣ��Һŷѹ���ҽ������ְ�ƣ�20��ר���У�����ҽʦ100  ����ҽʦ80  סԺҽʦ50��
				case 1:
					zj zhu = new zj(name,100,"����ҽʦ");
					add(zhu);
					break;
				case 2:
					zj zhu2 = new zj(name,80,"����ҽʦ");
					add(zhu2);
					break;
				case 3:
					zj zhu3 = new zj(name,50,"סԺҽʦ");
					add(zhu3);
					break;
				case 4:
					zj zhu4 = new zj(name,20,"��ְ��");
					add(zhu4);
					break;
				default:
					break;
				}
				
				System.out.println("�����밴1���˳��밴2");
				int pd = sc.nextInt();
				//����ȷ����Ч��ͼʵ�ֶ��ҽ�������
				if (pd==2) {
					break;
				}
			}
			else
			{
				System.out.println("���ֲ������ظ�");
			}
		}
		showAllDoc();
		
	}
	public static boolean verifyName(String name)//�ٶ���boolean verifyName(String name)�����ж������Ƿ��ظ�������ҽ���������ӣ���5�֣�
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
		//�ڶ���add�����������ҽ��������Ϊҽ�����ͣ�ҽ�����������ظ���
		d[index]=doc;
		index++;
		System.out.println("��ӳɹ�");
	}
	
	public static void showAllDoc()
	{
		//�۶���showAllDoc������ʾ����ҽ����ϸ��Ϣ
		for (int i = 0; i <d.length; i++) {
			if (d[i]!=null) {
				System.out.println(d[i]);
			}
		}
	}
}
