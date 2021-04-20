package chapter10;

public class PoisonMatango extends Matango {

	int poisonEnableNumber;

	public PoisonMatango(char moji) {
		super(moji);
		this.poisonEnableNumber=5;
	}

	public attack(Hero h) {
		super.attack(h);
		if(this.poisonEnableNumber != 0) {
			System.out.println("さらに毒まいた");
			h.hp -= h.hp/5;
			System.out.pritnln(h.hp/5+"ポイントのダメージ");
			this.poisonEnableNumber -= 1;
		}
	}

}
