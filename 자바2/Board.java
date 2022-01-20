package 자바2;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<String> All_title = new ArrayList<>();
	ArrayList<String> All_body = new ArrayList<>();
	ArrayList<Integer> numbers = new ArrayList<>();
	
	int count_numbers = 1;
	
	

	public void runboard(){
		
		//자바2 연습하기----------------------------------------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);
		
		
	
		
		while(true) {
			
			System.out.print("명령어를 입력해 주새요 : ");
			String cmd = sc.nextLine();
			
			if(cmd.equals("help")) {
				System.out.println("================");
				System.out.println("add  : 게시물 등록");
				System.out.println("list : 게시물 목록 조회");
				System.out.println("update : 게시물 수정");
				System.out.println("delete : 게시물 삭제");
			}
			else if(cmd.equals("add")) {
				numbers.add(count_numbers);
				
				System.out.print("제목을 입력해 주세요 :");
				String title = sc.nextLine();
				All_title.add(title);
				
				System.out.print("내용을 입력해 주세요 :");
				String body = sc.nextLine();
				All_body.add(body);
				
				System.out.println("게시물 저장 되었습니다.");
				count_numbers++;
			}
			else if(cmd.equals("list")) {
				list(All_title, All_body);
			}
			else if(cmd.equals("update")) {
				
				while(true) {
					
					list(All_title, All_body);
					
					System.out.print("수정할 게시물 번호 :");
					int target = Integer.parseInt(sc.nextLine());
					
					int target_real_num = check_exist(target);
					
					if(target_real_num == -1) {
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
						break;
					}
				 }
					
				}
			else if(cmd.equals("delete")) {
				
				while(true) {
					
					list(All_title, All_body);
					System.out.print("삭제할 게시물 번호 : ");
					int target = Integer.parseInt(sc.nextLine());
					
//					int target_real_num = -1;
//					for(int i = 0; i < numbers.size(); i++) {
//						int current_num = numbers.get(i); //numbers에 들어가 있는 번호 1,2,3..을 가지고 비교한다.
//						if(current_num == delete) {
//							target_real_num = i;
//							break;
//						}
//					}
					
					int target_real_num = check_exist(target);
					
					if(target_real_num == -1) {
						System.out.println("없는 게시물 번호 입니다. 다시 입력해 주세요.");
					}
					else {
						All_title.remove(target_real_num);
						All_body.remove(target_real_num);
						
						numbers.remove(target_real_num);
						count_numbers--;
						
						System.out.println("게시물이 삭제 되었습니다.");
						list(All_title, All_body);
						break;
					}
				}
			}
				
						
				
					
					
				
				
			
			
			
			
			
			
			
		}// -> while문
		
		
		
		

	} //---------------------------------------------------------------------------->public class
	
	public int check_exist(int target) {
		
		for(int i = 0; i < numbers.size(); i++) {
			int current_num = numbers.get(i);
			if(target == current_num) {
				return i;
			}
		}
		return -1;
	}
		
		
	
	public static void list(ArrayList<String> All_title, ArrayList<String> All_body) {
		for(int i = 0; i < All_title.size(); i++) {
			System.out.println("번호 :" + (i + 1));
			System.out.println("제목 :" + All_title.get(i));
			System.out.println("내용 :" + All_body.get(i)); 
			System.out.println("===================");
		}
	}
	

}// -----------------------------------------------------> main 메서드
