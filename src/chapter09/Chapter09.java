package chapter09;

//練習9-1
public class Chapter09 {
	String name;
	int hp;
	int mp;
	
	public Chapter09(String name) {
		this.name = name;
	}
	
	public Chapter09(String name, int hp) {
		this(name);
		this.hp = hp;
	}
	
	public Chapter09(String name, int hp, int mp) {
		this(name,hp);
		this.mp = mp;
	}

}
