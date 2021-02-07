
public class Chapter03 {
	public static void main(String[] args) {
		//コード3-1 天気による行動の変化をJavaで表す
		boolean tenki = true;
		if(tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");

		}else {
			System.out.println("DVDを観ます");
		}

		sent_for();
		kuku();

		rensyu3_1();
		rensyu3_5();
	}



	//コード3-2 トイレの空きを待つ繰り返し処理
	public static void toile() {
		boolean doorClose = false;

		while(doorClose == true) {
			System.out.println("ノックする");
			System.out.println("1分待つ");
		}

	}
	//while文とdo-while文の違いは、条件式を評価した後、実行するか、実行した後、評価するかの違い
	//コード3-7 基本的なfor文
	public static void sent_for() {
		for(int i =0;i < 10;i++) {
			System.out.println("こんにちは");
		}
	}

	//コード3-9 for文のループを2重にして九九の表を出力する
	public static void kuku() {
		for(int i = 1; i <= 9; i++) {
			System.out.print(i+" ");
			for(int j = 1; j <= 9; j++) {
				System.out.print(i*j+" ");
			}
			System.out.print("\n");
		}
	}

	public static void rensyu3_1() {
		//練習3-3
		int isHungry = 0;
		String food = "mikan";
		System.out.println("こんにちは");
		if(isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
			System.out.println(food+"をいただきます");
		}

		System.out.println("ごちそうさまでした");

	}

	public static void rensyu3_5() {
		System.out.print("［メニュー］1:検索2:登録3:削除4:変更");

		int selected = new java.util.Scanner(System.in).nextInt();

		switch(selected) {
			case 1:
				System.out.println("検索します");
				break;
			case 2:
				System.out.println("登録します");
			    break;
			case 3:
				System.out.println("削除します");
			    break;
			case 4:
				System.out.println("変更します");
			    break;

			default :

				break;
		}
	}


}
