package test_practice;

import java.util.Scanner;

public class test_2 {


	public static void main(String[] args) {
	
	//페이지 기능만들기 연습.	
		
		int currentNum = 1;
		
	while(true) {
		
		
		for(int i = 1; i <= 5; i++ ) {
			
			
			
			if(i == currentNum) {
				System.out.print("[" + i + "]");
			}
			else {
				System.out.print(i + " ");
			}
			
			
		}
		
		System.out.println();
		
		System.out.print("1번 : 이전, 2번 : 다음 :");
		Scanner sc = new Scanner(System.in);
		int move = Integer.parseInt(sc.nextLine());
		
		if(move == 1) {
			currentNum--;
		}
		else if(move == 2) {
			currentNum++;
		}
	
	}
		
	
	
	
	
	
	
	
	}
}
