package 자바2;

import java.util.ArrayList;
import java.util.Scanner;

import 자바2.util.My_util;

public class Board {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Collect> collects = new ArrayList<>();
	ArrayList<Member> members = new ArrayList<>();
	
	int count_numbers = 4;
	Member logined_id = null;
	
	public Board() {
		test_data();
	}
	
	
	public void runboard(){
		
		//자바2 연습하기----------------------------------------------------------------------------------------------------
	
		//class만들어서 구조화 했음 -> 데이터구조화 까지 하고 프로젝트 새로 만들어서 데이터 구조화 부분 한번더 하고 넘어가기!!
		
		while(true) {
			
			if(logined_id == null) {
				System.out.print("명령어를 입력해 주새요 : ");
			}
			else {
				System.out.print("명령어를 입력해 주새요 : " + "[" + logined_id.member_id + "(" + logined_id.member_nickname + ")]");
			}
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
			else if(cmd.equals("read")) {
				print_read();
			}
			else if(cmd.equals("signup")) {
				print_sign_up();
			}
			else if(cmd.equals("signin")) {
				print_sign_in();
			}
			else if(cmd.equals("logout")) {
				print_logout();
			}
			
				
						
				

			
		}// -> while문
		
		
		
		

	} //---------------------------------------------------------------------------->public class
	

	
	private void print_logout() {
		
		if(logined_id != null) {
			logined_id = null;
			System.out.println("로그아웃 되었습니다. 감사합니다.");
		}
		else{
			System.out.println("로그인이 필요한 기능 입니다. 로그긴 후 사용해 주세요!");
		}
		
	}


	private void print_sign_in() {


		System.out.print("아이디 :");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 :");
		String pw = sc.nextLine();
		
		boolean is_exist_id = false;
		
		for(int i = 0; i < members.size(); i++) {
			Member result = members.get(i);
			if(result.member_id.equals(id) && result.member_pw.equals(pw)) {  //문자를 비교할때는 .equals() 시용.
				System.out.println(result.member_nickname + "님 환영 합니다!!");
				is_exist_id = true;
				logined_id = result;
				break;
			}
			else if(is_exist_id == false) {
				System.out.println("비밀번호를 틀렸거나 잘못된 회원정보입니다.");
			}
		} // -> for문
	
		
		
	}


	private void print_sign_up() {

		System.out.println("=== 회원가입을 진행 합니다 ===");
		
		System.out.print("아이디를 입력해 주세요 :");
		String my_id = sc.nextLine();
	
		System.out.print("비밀번호를 입력해 주세요 :");
		String my_pw = sc.nextLine();
		
		System.out.print("닉네임을 입력해 주세요 :");
		String nickname = sc.nextLine();
		
		Member member = new Member(my_id, my_pw, nickname);//Member의 member라는 인스턴스를 만들어 그에 맞게 저장을 해준다?
		members.add(member);  //그 후 members에 member를 통으로 저장한다.
		
		System.out.println("=== 회원가입이 완료 되었습니다 ===");
	}


	private void print_read() {
		  /*
		  명령어를 입력해주세요 : read
		  상세보기할 게시물 번호를 입력해주세요 : 1
		  ==== 1번 게시물 ====
		  번호 : 1
		  제목 : 제목1
		  -------------------
		  내용 : 안녕하세요 ~
		  -------------------
		  ===================
		  명령어를 입력해주세요 : read
		  상세보기할 게시물 번호를 입력해주세요 : 5
		  없는 게시물입니다.
		*/
		
		list(collects);  // -> 왜 debug경고문이 뜨는지???????
		
		while(true) {
			
			System.out.print("상세보기할 게시물 번호를 입력 주세요 :");
			int read = Integer.parseInt(sc.nextLine());
			
			int target_real_num = check_exist(read);
			if(target_real_num == -1) {
				System.out.println("없는 게시물 입니다.");
			}
			else {
//				방법1				
//				System.out.println("===" + collects.get(read - 1).id + "게시물 ===");
//				System.out.println("번호 :" + collects.get(read-1).id);
//				System.out.println("제목 :" + collects.get(read-1).title);
//				System.out.println("----------------");
//				System.out.println(collects.get(read-1).body);
//				System.out.println("----------------");
//				System.out.println("================");
				
				//방법2
				Collect collect = collects.get(read - 1);
				
				collect.hit++; // 상세보기(read)할때마다 조회수를 증가시켜 저장한다.
				
				System.out.println("===" + collect.id + "게시물 ===");
				System.out.println("번호 :" + collect.id);
				System.out.println("제목 :" + collect.title);
				System.out.println("----------------");
				System.out.println("내용 :" + collect.body);
				System.out.println("작성자 :" + collect.writer);
				System.out.println("작성일" + collect.regDate);
				System.out.println("조회수" + collect.hit);
				System.out.println("----------------");
				System.out.println("================");
				
				break;
			}
			
		}// -> while문
		
	}


	private void test_data() {  //우선 collects에 저장을 해놀고 list를 하면 저장된 값이 잘 보여진다.
//		String currentDate = My_util.getCurrentDate("yyyy-mm-dd");
//		
//		collects.add(new Collect(1, "제목1", "입니다", "익명", currentDate, 0));
//		collects.add(new Collect(2, "제목2", "입니다", "익명", currentDate, 0));
//		collects.add(new Collect(3, "제목3", "입니다", "익명", currentDate, 0));
		
		String date = My_util.getCurrentDate("yyyy-MM-dd");
		
		collects.add(new Collect(1, "제목1", "입니다", "닉네임1", date, 0));
		collects.add(new Collect(2, "제목2", "입니다", "닉네임2", date, 0));
		collects.add(new Collect(3, "제목3", "입니다", "닉네임3", date, 0));
		members.add(new Member("아이디1", "비밀번호1", "닉네임1"));
		members.add(new Member("아이디2", "비밀번호2", "닉네임2"));
		members.add(new Member("아이디3", "비밀번호3", "닉네임3"));
		
		//collects.add(new Collect(3, "제목3", "입니다", members.get(2).member_nickname, date, 0));
		
		
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
			
				//업데이트시 등록날짜가 변하면 안되므로 등록날짜에 대한 부분 수정 필요=================================================
				String currnetDate = My_util.getCurrentDate("yyyy-MM-dd");//---------->업데이트시 시간과 조회수 처리 방법??
				Collect collect = new Collect(target, new_title, new_body, "익명", currnetDate, 0);//--------------????
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
		
		String CurrentDate = My_util.getCurrentDate("yyyy-MM-dd");
		Collect collect = new Collect(count_numbers, title, body, "익명", CurrentDate, 0);// --> class의 인스턴스를 만들어 사용한다.
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
			Collect current_num = collects.get(i);  //배열의 순서를 넘겨준것이 아니라 ~번째 배열의 값을 보여준다.(ex.0번째 -> 1저장)
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
			System.out.println("작성자 :" + collect.writer);
			System.out.println("등록날짜 :" + collect.regDate );
			System.out.println("조회수 :" + collect.hit);
			System.out.println("===================");
		}
		for(int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			System.out.println(member.member_nickname + "님 횐영합니다!!");
			logined_id = member;
		}
	}
	
	


	
	

}// -----------------------------------------------------> main 메서드
