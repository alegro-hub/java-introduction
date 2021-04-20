package comment;

public class Kouhan {
	public static void callDeae() {
		System.out.println("ええい、こしゃくな。曲者だ！であえい！");
	}

	public static void showMondokoro()throws Exception{
		System.out.println("飛車さん、角さん。もういいでしょう。");
		System.out.println("このもんどころが目に入らぬか");
		//3秒待つ
		Thread.sleep(3*1000);

		Zenhan.doTogame();
	}

}
