package chapter15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws ParseException {
		Calendar c = Calendar.getInstance();
		c.set(2019,8,22,1,23,45);
		c.set(Calendar.MONTH,9);
		Date d = c.getTime();
		System.out.println(d);

		Date now = new Date();

		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は"+y+"年です");

		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		Date d2 = f.parse("2020/09/22 01:23:45");
		System.out.println(d2);

		Date now2 = new Date();
		String s = f.format(now);
		System.out.println(s);

		rensyu15_1();

		rensyu15_2("\\net\\","file");

		rensyu15_4();

		rensyu15_5();

	}

	public static void rensyu15_1() {
		StringBuilder sb = new StringBuilder();

		for(int i=1; i<101; i++) {
			sb.append(i);
			sb.append(",");
		}

		String[] words = sb.toString().split(",");

		for(String s:words) {
			System.out.print(s);
		}
		System.out.println();


	}

	public static void rensyu15_2(String folderName, String fileName) {

		if(!folderName.endsWith("\\")) {
			folderName = folderName+"\\";
		}
		System.out.println(folderName+fileName);
	}

	public static void rensyu15_3() {
		//1 全ての文字列を正規表現で。
		//  .*
		//2 最初の１文字はA.２文字目は数字、３文字目は数字か無し
		//  A[0-9]{1,2}
		//3 最初の１文字はU,２～４文字目は英大文字
		//  U[A-Z]{3}
	}

	public static void rensyu15_4() {
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH)+100);
		Date afterHumdred = c.getTime();

		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		String s = f.format(afterHumdred);

		System.out.println(s);


	}

	public static void rensyu15_5() {
		LocalDate ldate = LocalDate.now();
		ldate = ldate.plusDays(100);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");

		String s = ldate.format(dtf);

		System.out.println(s);
	}

}
