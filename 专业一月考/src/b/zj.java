package b;

public class zj extends doctor {
	private String zc;

	public zj(String name, int i, String string) {
		super();
		// TODO Auto-generated constructor stub
	}
	//��2��ר���������ȷ������дtoString������������������ҺŷѺ�ְ��3�������Ĺ��췽�������������๹�췽���������͹Һŷѳ�ʼ����
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
		return super.toString()+"ְ��" + zc;
	}
	
	
}
