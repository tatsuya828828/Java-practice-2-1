
public class Main {
	static boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
	public static void main(String[] args) {
		System.out.println(isValidPlayerName("SATOTARO"));
		// ピリオドはその部分に任意の位置文字があれば良い
		System.out.println("Java".matches("J.va"));
		// アスタリスクは、直前の文字の0回以上の繰り返し
		System.out.println("Jaaaaaava".matches("Ja*va"));
		// .*で全ての文字列を許すという指示になる
		System.out.println("jfifjkhgi;ejrlf3943".matches(".*"));
	}
}
