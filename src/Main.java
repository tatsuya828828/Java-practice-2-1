
public class Main {
	public static void main(String[] args) {
		String s1 = "Java and JavaScript";
		// contains: 一部に引数の文字列が、含まれているかどうか調べる。
		if(s1.contains("Java")) {
			System.out.println("文字列s1は、Javaを含んでいます");
		}
		// endWith: 引数の文字列で終わっているか確かめる。
		if(s1.endsWith("Java")) {
			System.out.println("文字列s1は、Javaが末尾にあります。");
		}
		// indexOf: 引数の文字列が最初に登場するのは何文字目か調べる。
		System.out.println("文字列s1で最初にJavaが登場する位置は"+(s1.indexOf("Java")+1)+"文字目");
		// lastIndexOf: 引数の文字列が最後に登場する位置が何文字目か調べる。
		System.out.println("文字列s1で最後にJavaが登場する位置は"+(s1.lastIndexOf("Java")+1)+"文字目");

		String s2 = "Java programming";
		// substring: 指定一から始まる文字列を任意の長さだけ切り出す
		// 先頭を指定する時は0
		System.out.println("文字列s2の4文字目以降は"+s2.substring(3));
		System.out.println("文字列s2の4〜8文字目は"+s2.substring(3, 8));
		System.out.println("s2の内容は"+s2);

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 100; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
		System.out.println(s);
	}
}
