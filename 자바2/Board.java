package 자바2;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {

	public void runboard(){
		
		//자바2 연습하기----------------------------------------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);
		ArrayList<String> All_title = new ArrayList<>();
		ArrayList<String> All_body = new ArrayList<>();
		
		while(true) {
			
			System.out.print("명령어를 입력해 주새요 : ");
			String cmd = sc.nextLine();
			
			if(cmd.equals("help")) {
				System.out.println("================");
				System.out.println("add  : 게시물 등록");
				System.out.println("list : 게시물 목록 조회");
				System.out.println("update : 게시물 수정");
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
				list(All_title, All_body);
			}
			else if(cmd.equals("update")) {
				list(All_title, All_body);
				
				System.out.print("수정할 게시물 번호 :");
				int target = Integer.parseInt(sc.nextLine());
				
		
					if(target > All_title.size() || target < 1) {
						System.out.println("없는 게시물 입니다. 다시 입력해 주세요.");
					}
					else {
						
						System.out.print("새제목 :");
						String new_title = sc.nextLine();
						All_title.set((target - 1), new_title);
						
						System.out.print("새내용 :"); 
						String new_body = sc.nextLine();
						All_body.set((target - 1), new_body);
						
						System.out.println("수정이 완료 되었습니다.");
						list(All_title, All_body);
					}
				}
			else if(cmd.equals("")) {
				
			}
						
			
			
			
			
		}// -> while문
		
		
		
		
		

		
		
		
		

	} //---------------------------------------------------------------------------->public class
	
	public static void list(ArrayList<String> All_title, ArrayList<String> All_body) {
		for(int i = 0; i < All_title.size(); i++) {
			System.out.println("번호 :" + (i + 1));
			System.out.println("제목 :" + All_title.get(i));
			System.out.println("내용 :" + All_body.get(i)); 
			System.out.println("===================");
		}
	}
	

}// -----------------------------------------------------> main 메서드
