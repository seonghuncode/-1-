package 자바2;

import java.util.ArrayList;
import java.util.Scanner;

public class 자바2 {

	public static void main(String[] args) {
		
		//자바2 연습하기----------------------------------------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);
		ArrayList<String> All_title = new ArrayList<>();
		ArrayList<String> All_body = new ArrayList<>();
		
		while(true) {
			
			System.out.print("명령어를 입력해 주새요 : ");
			String cmd = sc.nextLine();
			
			if(cmd.equals("help")) {
				System.out.println("add  : 게시물 등록");
				System.out.println("list : 게시물 목록 조회");
			}
			else if(cmd.equals("add")) {
				System.out.print("제목을 입력해 주세요 :");
				String title = sc.nextLine();
				All_title.add(title);
				
				System.out.print("내용을 입력해 주세요 :");
				String body = sc.nextLine();
				All_body.add(body);
				
				System.out.println("게시물 저장 되었습니다.");
			}
			else if(cmd.equals("list")) {
				for(int i = 0; i < All_title.size(); i++) {
					System.out.println("번호 :" + i + 1);
					System.out.println("제목 :" + All_title.get(i));
					System.out.println("내용 :" + All_body.get(i)); 
					System.out.println("===================");
				}
			}
					
			
			
		}// -> while문
		
		
		// 명령어를 입력해주세요 : (출력) help(입력)
		// add  : 게시물 등록 (출력)
		// list : 게시물 목록 조회 (출력)
		// 명령어를 입력해주세요 : (출력) add(입력)
		// 제목을 입력해주세요 : (출력) 안녕하세요(입력)
		// 내용을 입력해주세요 : (출력) 반갑습니다(입력)
		// 게시물이 저장되었습니다. (출력)
		// 명령어를 입력해주세요 : (출력) list(입력)
		// 번호 : 1(출력)
		// 제목 : 안녕하세요(출력)
		// 내용 : 반갑습니다(출력)
		// ====================================(출력)
		// 명령어를 입력해주세요 : (출력) add(입력)
		// 제목을 입력해주세요 : (출력) 안녕하세요2(입력)
		// 내용을 입력해주세요 : (출력) 반갑습니다2(입력)
		// 게시물이 저장되었습니다. (출력)
		// 명령어를 입력해주세요 : (출력) list(입력)
		// 번호 : 1(출력)
		// 제목 : 안녕하세요(출력)
		// 내용 : 반갑습니다(출력)
		// ====================================(출력)
		// 번호 : 2(출력)
		// 제목 : 안녕하세요2(출력)
		// 내용 : 반갑습니다2(출력)
		// ====================================(출력)

		
		
		
		

	}

}
