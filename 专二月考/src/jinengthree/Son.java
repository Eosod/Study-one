package jinengthree;

public class Son extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			synchronized (Test.obj) {//（2）正确使用synchronized对桃子数量进行互斥访问（5分）
				if (Test.tz>0) {
					Test.tz--;
					System.out.println("儿子吃桃子，盘子里剩余桃子数量为"+Test.tz);
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
