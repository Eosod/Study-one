package jinengthree;

public class Son extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			synchronized (Test.obj) {//��2����ȷʹ��synchronized�������������л�����ʣ�5�֣�
				if (Test.tz>0) {
					Test.tz--;
					System.out.println("���ӳ����ӣ�������ʣ����������Ϊ"+Test.tz);
						Test.obj.notify();
				}
				else {
					try {
						Test.obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	
}
