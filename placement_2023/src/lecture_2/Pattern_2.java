package lecture_2;

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int totalrow=sc.nextInt();
		for(int row=1;row<=totalrow;row++) {
			for(int i=1;i<=totalrow-row+1;i++) {
				System.out.print("*" +" ");
			}
			System.out.println();
		}
	}

}
