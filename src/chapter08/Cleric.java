package chapter08;

import java.util.Random;

//練習問題
public class Cleric {
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;

	public void selfAid() {
		this.mp -= 5;
		this.hp = MAXMP;
	}

	public void pray(int sec) {
		int ransu = new Random().nextInt(3);
		this.mp += sec+ransu;
		if(this.mp > MAXMP) {
			this.mp = MAXMP;
		}
	}

}
