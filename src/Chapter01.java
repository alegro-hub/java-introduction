
public class Chapter01 {
	public static void main(String[] args) {
		//コード1-3 変数の再代入
		//変数は以下の通り
		//整数はint,小数はdouble,1文字ならchar,文字列ならString
		int age = 20;
		System.out.println("私の年齢は"+ age);
		age = 31;
		System.out.println("・・・いや、本当の年齢は"+ age);

		//コード1-5 円周率に定数を利用する
		//上書きする必要のない変数は、finalをつけて定数にする。なお、その際、大文字にする。
		final double PI = 3.14;
		System.out.println(PI);

		//練習1-2 3*5の結果表示
		int a = 3;
		int b = 5;

		int c = a*b;

		System.out.println("縦幅"+a+"横幅"+b+"の長方形の面積は"+c+"です");

		//練習1-3 変数の初期化
		boolean x = true;
		char ichimoji = '駆';
		final double PIPI = 3.14;
		long number = 3141592685333333333L;
		String mojiretu = "港の攻撃！敵に１５ポイントのダメージを与えた。";

		System.out.println(PIPI+number+mojiretu);
	}

}
