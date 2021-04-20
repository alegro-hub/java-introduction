
public class Chapter04 {
	public static void main(String args[]) {
		//コード4-14 拡張for文
		int[] scores = {20,30,40,50,80};
		for(int value :scores) {
			System.out.println(value);
		}

		rensyu4_1();
		rensyu4_2();
		rensyu4_4();
	}

	public static void rensyu4_1() {
		int[] points = new int[4];
		double[] weights = new double[5];
		boolean[] answers = new boolean[3];
		String[] names = new String[3];
	}

	public static void rensyu4_2() {
		int[] moneyList = {121902,8302,55100};
		for(int i=0;i<3;i++) {
			System.out.println(moneyList[i]);
		}
		for(int value :moneyList) {
			System.out.println(value);
		}
	}

	public static void rensyu4_4() {
		int[] numbers = {3,4,9};
		System.out.println("1桁の数字を入力してください");

		int input = new java.util.Scanner(System.in).nextInt();

		for(int value:numbers) {
			if(value == input) {
				System.out.println("あたり");
			}
		}
	}

}
