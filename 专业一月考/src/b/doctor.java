package b;

public class doctor {
	private String name;
	private int money;
	public doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	//（1）医生类代码正确（定义带姓名和挂号费2个参数的构造方法，重写toString方法）（5分）
	public doctor(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "医生姓名" + name + "挂号费" + money ;
	}
	
	
}
