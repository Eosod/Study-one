package b;

public class doctor {
	private String name;
	private int money;
	public doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	//��1��ҽ���������ȷ������������͹Һŷ�2�������Ĺ��췽������дtoString��������5�֣�
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
		return "ҽ������" + name + "�Һŷ�" + money ;
	}
	
	
}
