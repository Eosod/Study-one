package b;

public class zj extends doctor {
	private String zc;

	public zj(String name, int i, String string) {
		super();
		// TODO Auto-generated constructor stub
	}
	//（2）专家类代码正确（需重写toString方法，定义带姓名、挂号费和职称3个参数的构造方法，并借助父类构造方法对姓名和挂号费初始化）
	public zj(String name, int money) {
		super(name, money);
		// TODO Auto-generated constructor stub
	}

	public String getZc() {
		return zc;
	}

	public void setZc(String zc) {
		this.zc = zc;
	}

	@Override
	public String toString() {
		return super.toString()+"职称" + zc;
	}
	
	
}
