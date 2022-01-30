package 자바2;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Collect> collects = new ArrayList<>();
	
	
	int count_numbers = 4;
	
	public Board() {
		test_data();
	}
	

	public void runboard(){
		
		//자바2 연습하기----------------------------------------------------------------------------------------------------
	
		//class만들어서 구조화 했음 -> 데이터구조화 까지 하고 프로젝트 새로 만들어서 데이터 구조화 부분 한번더 하고 넘어가기!!
		
		while(true) {
			
			System.out.print("명령어를 입력해 주새요 : ");
			String cmd = sc.nextLine();
			
			if(cmd.equals("help")) {
				print_help();
			}
			else if(cmd.equals("add")) {
				print_add();
			}
			else if(cmd.equals("list")) {
				list(collects);
			}
			else if(cmd.equals("update")) {
				print_update();
				}
			else if(cmd.equals("delete")) {
				print_delete();
			}
			else if(cmd.equals("search")) {
				print_search();
			}
			
				
						
				

			
		}// -> while문
		
		
		
		

	} //---------------------------------------------------------------------------->public class
	
	
	private void test_data() {  //우선 collects에 저장을 해놀고 lisk를 하면 저장된 값이 잘 보여진다.
		collects.add(new Collect(1, "제목1", "입니다"));
		collects.add(new Collect(2, "제목2", "입니다"));
		collects.add(new Collect(3, "제목3", "입니다"));
	}
	
	private void print_search() {
		
		//방법1. 스스로 풀었던 방법
//		while(true) {
//			System.out.print("검색 키워드를 입력해 주세요 :");
//			String search = sc.nextLine();
//			
//			for(int i = 0; i < collects.size(); i++) {
//				
//				if(collects.get(i).title.contains(search)) {
//					System.out.println(collects.get(i).id);
//					System.out.println(collects.get(i).title);
//					System.out.println("=====================");
//					break;
//				}
//				else {
//					System.out.println("존재 하지 않는 키워드 입니다. 다시 입력해 주세요.");
//				}
//				break;
//			}	
//			
//		}
		
	//방법2. 강사님 방법
		
		System.out.print("검색어 : ");
		String keyword = sc.nextLine();
		
		ArrayList<Collect> search_collects = new ArrayList<>();
		
		for(int i = 0; i < collects.size(); i++) {
			if(collects.get(i).title.contains(keyword)) {
				search_collects.add(collects.get(i));
			}
		}
		list(search_collects);
		
	}
		
			
		
	

	private void print_delete() {
		while(true) {
			
			list(collects);
			System.out.print("삭제할 게시물 번호 : ");
			int target = Integer.parseInt(sc.nextLine());
			
//			int target_real_num = -1;
//			for(int i = 0; i < numbers.size(); i++) {
//				int current_num = numbers.get(i); //numbers에 들어가 있는 번호 1,2,3..을 가지고 비교한다.
//				if(current_num == delete) {
//					target_real_num = i;
//					break;
//				}
//			}
			
			int target_real_num = check_exist(target);
			
			if(target_real_num == -1) {
				System.out.println("없는 게시물 번호 입니다. 다시 입력해 주세요.");
			}
			else {
				
				collects.remove(target_real_num);
				
				System.out.println("게시물이 삭제 되었습니다.");
				list(collects);
				break;
			}
		}
	}

	private void print_update() {
		
		while(true) {
			
			list(collects);
			
			System.out.print("수정할 게시물 번호 :");
			int target = Integer.parseInt(sc.nextLine());
			
			int target_real_num = check_exist(target);
			
			if(target_real_num == -1) {
				System.out.println("없는 게시물 입니다. 다시 입력해 주세요.");
			}
			else {
				
				System.out.print("새제목 :");
				String new_title = sc.nextLine();
				
				System.out.print("새내용 :"); 
				String new_body = sc.nextLine();
			
				Collect collect = new Collect(target, new_title, new_body);
				collects.set(target_real_num, collect);
				
				System.out.println("수정이 완료 되었습니다.");
				list(collects);
				break;
			}
		 }
	}

	private void print_add() {
		System.out.print("제목을 입력해 주세요 :");
		String title = sc.nextLine();
		
		System.out.print("내용을 입력해 주세요 :");
		String body = sc.nextLine();
		
		Collect collect = new Collect(count_numbers, title, body);// --> class의 인스턴스를 만들어 사용한다.
		collects.add(collect); // --> collects의 배열에 collect를 저장해 준다.
		
		System.out.println("게시물 저장 되었습니다.");
		count_numbers++;
	}

	private void print_help() {
		System.out.println("================");
		System.out.println("add  : 게시물 등록");
		System.out.println("list : 게시물 목록 조회");
		System.out.println("update : 게시물 수정");
		System.out.println("delete : 게시물 삭제");
	}

	public int check_exist(int target) {
		
		for(int i = 0; i < collects.size(); i++) {
			//int current_num = collects.get(i).id;
			Collect current_num = collects.get(i);
			if(target == current_num.id) {
				return i;
			}
		}
		return -1;
	}
		
		
	
	public void list(ArrayList<Collect> list) {
		for(int i = 0; i < list.size(); i++) {
			
			Collect collect = list.get(i);
			
			System.out.println("번호 :" + collect.id);
			System.out.println("제목 :" + collect.title);
			System.out.println("===================");
		}
	}
	

}// -----------------------------------------------------> main 메서드
