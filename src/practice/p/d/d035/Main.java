package practice.p.d.d035;

import java.util.Scanner;

public class Main {
    public static void main(String args[] ) throws Exception {
    	try(Scanner sc = new Scanner(System.in);){
        	String date = sc.nextLine().replace(" ","/");
        	System.out.println(date);
    	}
    }
}