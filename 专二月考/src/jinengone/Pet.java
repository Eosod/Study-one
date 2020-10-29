package jinengone;

import java.io.Serializable;

public class Pet implements Comparable<Pet>,Serializable{
	//①Pet类中类型为：编号int类型、名字String，年龄float，是否买走boolean
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
			return "宠物编号：" + bh + "宠物姓名：" + name + "宠物年龄：" + age +"   宠物尚未被买走";
	}
	@Override
	public int compareTo(Pet o) {
		// TODO Auto-generated method stub
		return this.bh-o.bh;
	}
	
}
