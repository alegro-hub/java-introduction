
public class Chapter05 {
	public static void main(String[] args) {
		introduceOneself();
		email("タイトル","アドレス","本文");
		email("アドアド","テキスト");
		System.out.println("三角形の面積は"+calcTriangleArea(10.0,5.0)+"円の面積は"+calcCircleArea(5.0));
		Chapter04.rensyu4_2();
	}

	//練習5-1
	public static void introduceOneself() {
		String name;
		int age;
		double height;
		char eto;

		name = "taro";
		age = 27;
		height = 180.5;
		eto= '子';
		System.out.println("私の名前は"+name+"です");
	}

	//練習5-2
	public static void email(String title,String address,String text) {
		System.out.println(address+"に、以下のメールを送信しました");
		System.out.println("件名："+title);
		System.out.println("本文："+text);
	}
	//練習5-3
	public static void email(String address,String text) {
		System.out.println(address+"に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文："+text);
	}

	//練習5-4
	public static double calcTriangleArea(double bottom,double height) {
		return bottom*height/2.0;
	}

	public static double calcCircleArea(double radius) {
		return radius*radius*3.14;
	}

}
