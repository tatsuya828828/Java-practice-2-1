
public class Main {
	public static void main(String[] args) {
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		String s4 = "";

		if(s3.equals(s2)) {
			System.out.println("s2とs3は全く同じ文字です。");
		}
		if(s3.equalsIgnoreCase(s2)) {
			System.out.println("s2とs3は、文字の大きさを考えなければ同じ文字です。");
		}
		System.out.println("s1の文字の長さは"+s1.length()+"文字です");
		if(s4.isEmpty()) {
			System.out.println("s4は、空文字です");
		}
	}
}
