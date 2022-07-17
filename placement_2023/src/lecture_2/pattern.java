package lecture_2;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int totalrow=sc.nextInt();
		for(int row=1;row<=totalrow;row++) {
			for(int i=1;i<=row;i++) {
				System.out.print("*" +" ");
			}
			System.out.println();
		}
	}

}
