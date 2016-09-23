package practice.p.d.d036;

import java.util.Scanner;

public class Main {
    public static void main(String args[] ) throws Exception {
    	try(Scanner sc = new Scanner(System.in);){
        	String date = sc.nextLine().replace("at","@");
        	System.out.println(date);
    	}
    }
}