package c;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer b = new StringBuffer();
		for (int i = 0; i < 6; i++) {
			//（1）获取6个100以内的随机数
			//获取6个100以内的随机数，使用StringBuffer将数字拼接到一起以-区分。
			//然后按照“-”分割后，将数字放入数组，给数组内元素进行冒泡排序然后输出

			int num = (int)(Math.random()*(100+1));
			//（2）使用StringBuffer将数字拼接到一起以“-”区分（例如：2-34-12-4-66-1）（5分）
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
			//（3）字符串按照“-”分割后放入数组
			strss[i] =Integer.parseInt(strs[i]);
		}
		for (int i = 0; i < strs.length-1; i++) {
			//数组内的数字进行冒泡排序
			for (int j = 0; j < strs.length-i-1; j++) {
				if (strss[j]>strss[j+1]) {
					int temp = strss[j];
					strss[j] = strss[j+1];
					strss[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < strss.length; i++) {
			
			/（5）输出数组内的数据
			System.out.print(strss[i]+"\t");
			
		}

	}

}
