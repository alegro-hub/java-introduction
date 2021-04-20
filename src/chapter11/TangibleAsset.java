package chapter11;

public class TangibleAsset extends Asset implements Thing{
	String color;

	public String getColor() {
		return this.color;
	}

	public TangibleAsset(String name,int price,String color) {
		super(name,price);
		this.color = color;
	}

	@Override
	public double getWeight() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void setWeight(double weight) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
