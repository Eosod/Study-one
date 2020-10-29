package jinengone;

import java.io.Serializable;

public class Pet implements Comparable<Pet>,Serializable{
	//��Pet��������Ϊ�����int���͡�����String������float���Ƿ�����boolean
	private int bh;
	private String name;
	private float age;
	private boolean mai;
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pet(int bh, String name, float age, boolean mai) {
		super();
		this.bh = bh;
		this.name = name;
		this.age = age;
		this.mai = mai;
	}
	public int getBh() {
		return bh;
	}
	public void setBh(int bh) {
		this.bh = bh;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public boolean isMai() {
		return mai;
	}
	public void setMai(boolean mai) {
		this.mai = mai;
	}
	@Override
	public String toString() {
			return "�����ţ�" + bh + "����������" + name + "�������䣺" + age +"   ������δ������";
	}
	@Override
	public int compareTo(Pet o) {
		// TODO Auto-generated method stub
		return this.bh-o.bh;
	}
	
}
