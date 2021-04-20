package chapter17;

import java.io.FileWriter;
import java.io.IOException;

//try-with-resources文
//tryの後にリソースを入れておけば、勝手にcloseしてくれる！
public class Main {
	public static void main(String args[]) throws IOException {
		try(FileWriter fw = new FileWriter("data.txt");){
			fw.write("hello!");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		}

		FileWriter fw2 = new FileWriter("data2.txt");

		String s=null;

		try {
			System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("ーースタックトレース（ここから）ーー");
			e.printStackTrace();
			System.out.println("ーースタックトレース（ここまで）ーー");
		}

		try {
			int i = Integer.parseInt("三");
		} catch (NumberFormatException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		throw new IOException();

	}



}
