package jinengthree;

public class Father extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			synchronized (Test.obj) {
				if (Test.tz<3) {
					Test.tz++;
					System.out.println("�ְַ����ӣ���������������Ϊ"+Test.tz);
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
