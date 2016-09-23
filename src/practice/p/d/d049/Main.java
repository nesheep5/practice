package practice.p.d.d049;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = s.endsWith("noaki") ? s.replace("noaki", "") : s;
		System.out.println(ans);
	}
}