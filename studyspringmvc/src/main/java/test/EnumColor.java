package test;

public class EnumColor {
	
	public static void main(String[] args) {
		for (Color c :Color.values()) {
			System.out.println(c.name()+"--->"+c.ordinal());
		}
	}

}
