package chapter13;

public class Wand {
	private String name;
	private double power;

	public double getPower() {
		return this.power;
	}

	public void setPower(double power) {
		if(power < 0.5 || power > 100.0) {
			throw new IllegalArgumentException("値が異常です");
		}else {
			this.power = power;
		}
	}

	public void setName(String name) {

		if(name.length() < 3) {
			throw new IllegalArgumentException("名前が短い。処理を中断。");
		}else {
			this.name = name;
		}

	}

}
