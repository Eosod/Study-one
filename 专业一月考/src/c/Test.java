package c;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer b = new StringBuffer();
		for (int i = 0; i < 6; i++) {
			//��1����ȡ6��100���ڵ������
			//��ȡ6��100���ڵ��������ʹ��StringBuffer������ƴ�ӵ�һ����-���֡�
			//Ȼ���ա�-���ָ�󣬽����ַ������飬��������Ԫ�ؽ���ð������Ȼ�����

			int num = (int)(Math.random()*(100+1));
			//��2��ʹ��StringBuffer������ƴ�ӵ�һ���ԡ�-�����֣����磺2-34-12-4-66-1����5�֣�
			if (i<5)
			{
				b.append(num+"-");
			}
			else {
				b.append(num);
			}
			System.out.println(b);
		}
		String str = b.toString();
		String[] strs =str.split("-");
		int [] strss = new int[strs.length];
		for (int i = 0; i < strss.length; i++) {
			//��3���ַ������ա�-���ָ���������
			strss[i] =Integer.parseInt(strs[i]);
		}
		for (int i = 0; i < strs.length-1; i++) {
			//�����ڵ����ֽ���ð������
			for (int j = 0; j < strs.length-i-1; j++) {
				if (strss[j]>strss[j+1]) {
					int temp = strss[j];
					strss[j] = strss[j+1];
					strss[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < strss.length; i++) {
			
			/��5����������ڵ�����
			System.out.print(strss[i]+"\t");
			
		}

	}

}
