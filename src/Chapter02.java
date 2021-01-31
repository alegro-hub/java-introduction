
public class Chapter02 {
	public static void main(String[] args) {
		//コード2-3 エスケープシーケンスを用いた例
		//",',\,改行は\を使わないと記述できない
		System.out.println("私の好きな記号は二重引用符（\"）です");

		//コード2-7 強制的な型変換
		//(int)のようなキャスト演算子を入れると、型変換ができる
		int age = (int)3.2;
		System.out.println(age);

		//コード2-11 改行なし画面出力の命令
		//printを使えば改行しないで画面出力できるため、2つ続ければ繋がって、文章になる
		String name = "すがわら";
		System.out.print("私の名前は");
		System.out.print(name+"\n");

		//コード2-12 大きいほうの数値を代入する命令
		//Math.max関数を用いれば、大きいほうを代入する
		int a = 5;
		int b = 3;
		int m = Math.max(a, b);
		System.out.println("比較実験："+a+"と"+b+"とで大きいほうは・・・"+m);

		//コード2-13 String型をint型に変換する命令
		String age2 = "31";
		int n =Integer.parseInt(age2);
		System.out.println("あなたは来年、"+(n+1)+"歳になりますね");

		//コード2-14 ランダムな数を生成する命令
		//nextInt()の中に好きな数字を入れれば、1以上、90未満のランダムな数が生成される
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん、"+r+"歳ですね？");

		//コード2-15 キーボードから入力を受け付ける命令
		System.out.println("あなたの名前を入力してください。");
		String name2 = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		int age3 = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ"+age3+"歳の"+name2+"さん");

		rensyu2_1();
		rensyu2_3();
	}

	public static void rensyu2_1(){
		int x = 5;
		int y = 10;
		String ans = "x+yは"+(x+y);
		System.out.println(ans);
	}

	public static void rensyu2_3() {
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		fortune += 1;
		System.out.println("占いの結果が出ました！");
		System.out.println(age+"歳の"+name+"さん、あなたの運気番号は"+fortune+"です");
		System.out.println("1:大吉 2:中吉 3:吉 4:凶");
	}


}
