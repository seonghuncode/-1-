package 자바2;

import java.util.ArrayList;
import java.util.Scanner;

import 자바2.util.My_util;

public class Board {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<BoardCollect> boardCollects = new ArrayList<>();
	ArrayList<Member> members = new ArrayList<>();
	ArrayList<ReplyCollect> replies = new ArrayList<>(); 
	ArrayList<Like> likes = new ArrayList<>();
	
	int boardCollects_num= 4;//게시물 번호
	int members_num = 4;//멤버 고유의 번호
	int replyCollect_num = 1;
	
	String dateFormat = "yyyy-MM-dd";
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
				if(check_login() == true) {
					print_add();
				}
			}
			else if(cmd.equals("list")) {
				list(boardCollects);
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
				if(check_login() == true) {
					print_logout();
				}
			}
			else if(cmd.equals("testdata")) {
				test_list(boardCollects); // --> test_list()때문에 list()사용시 번호가 4번 부터 시작한다.
			}
			
				
						
				

			
		}// -> while문
		
		
		
		

	} //---------------------------------------------------------------------------->public class
	
	private boolean check_login() {
		if(logined_id == null) {
			System.out.println("로그인이 필요한 기능입니다. 로그인 후 사용해 주세요.");
			return false;
		}
		return true;
	} // --> 로그인이 되었는지 체크하는 기능.

	
	private void print_logout() {
		
			logined_id = null;
			System.out.println("로그아웃 되었습니다. 감사합니다.");
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

//				if(result instanceof SpecialMember) {
//					SpecialMember specialmember = (SpecialMember)result;//result의 상황에서 point를 사용하기 위해서는 spcialmember에 넣어주고 형변환을 해주어야 한다.
//					System.out.println("안녕하게요 우수회원" + result.member_nickname + "님 사랑합니다. 회원님의 남은 포인트는 현재" + specialmember.point + "입니다.");
//				}
//				else if(result instanceof GeneralMember) {
//					System.out.println("안녕하세요 일반회원" + result.member_nickname + "님 환영 합니다!!");
//				}
				
				result.greeting();  //위의 instanceof를 사용하지 않고 더 간단하게 하는 방법.
				
				is_exist_id = true;
				logined_id = result;
				break;
			}
			
		} // -> for문
			if(is_exist_id == false) {
				System.out.println("비밀번호를 틀렸거나 잘못된 회원정보입니다.");
			}
		
		
	}


	private void print_sign_up() {

		System.out.println("=== 회원가입을 진행 합니다 ===");
		
		int sel = 0;
		System.out.print("원하는 회원 유형을 선택해 주세요(1. 우수회원 2. 일반회원) :");
		sel = Integer.parseInt(sc.nextLine());
	
		System.out.print("아이디를 입력해 주세요 :");
		String my_id = sc.nextLine();
	
		System.out.print("비밀번호를 입력해 주세요 :");
		String my_pw = sc.nextLine();
		
		System.out.print("닉네임을 입력해 주세요 :");
		String nickname = sc.nextLine();
		
		Member member = null;
		
		if(sel == 1) {
			 member = new SpecialMember(members_num, my_id, my_pw, nickname, 0);
		}
		else if(sel == 2) {
			member = new GeneralMember(members_num, my_id, my_pw, nickname);
		}
		
		members.add(member);
		
		System.out.println("=== 회원가입이 완료 되었습니다 ===");
		members_num++;
	}


	private void print_read() {
		
		
		while(true) {
			list(boardCollects);  
			
			
			System.out.print("상세보기할 게시물 번호를 입력 주세요(취소 : 0) :");
			int read = Integer.parseInt(sc.nextLine());
			
			
			BoardCollect boardCollect = getBoardCollectByNo(read);
			
			if(read == 0) {
				break;
			}
			else if(boardCollect == null) {
				System.out.println("없는 게시물 입니다.");
			}
			else {
//				방법1				
//				System.out.println("===" + BoardCollects.get(read - 1).id + "게시물 ===");
//				System.out.println("번호 :" + BoardCollects.get(read-1).id);
//				System.out.println("제목 :" + BoardCollects.get(read-1).title);
//				System.out.println("----------------");
//				System.out.println(BoardCollects.get(read-1).body);
//				System.out.println("----------------");
//				System.out.println("================");
				
				//방법2
				
				
				boardCollect.hit++; // 상세보기(read)할때마다 조회수를 증가시켜 저장한다.
				
				readInformation(boardCollect);
				
				readfunction(boardCollect);
				
			} // --> else문 
			
		}// -> while문
		
	}
	
	private void readInformation(BoardCollect boardCollect) {
		System.out.println("===" + boardCollect.id + "게시물 ===");
		System.out.println("번호 :" + boardCollect.id);
		System.out.println("제목 :" + boardCollect.title);
		System.out.println("----------------");
		System.out.println("내용 :" + boardCollect.body);
		System.out.println("작성자 :" + boardCollect.nickname);  // 작성자가 숫자로 나온다????
		System.out.println("작성일" + boardCollect.regDate);
		System.out.println("조회수" + boardCollect.hit);
		System.out.println("----------------");
		System.out.println("================");
		System.out.println("======댓 글======");
		for(int i = 0; i < replies.size(); i++) {
			ReplyCollect currentReplyCollect = replies.get(i);
			
			
			
			//현재 게시물과 보여지는 게시물의 댓글을 보여주어야 하므로 대조 해주는 코드가 필요하다.
			if(currentReplyCollect.parentId == boardCollect.id ) {
				
				currentReplyCollect = (ReplyCollect)setNickname(currentReplyCollect);
				//ReplyCollect보다 BaseCollect가 상위개념이기 때문에 ReplyCollect에 BaseCollect를 넣으려면 자동형변화이 이루어지지 않기 때문에 수동형변환을 해준다.
				
				System.out.println("내용 :" + currentReplyCollect.body);
				System.out.println("작성자 :" + currentReplyCollect.nickname);
				System.out.println("작성일 :" + currentReplyCollect.regDate);
				System.out.println("================================");
			}
			
		}
	}
	
//	private ReplyCollect setReplyCollectNickname(ReplyCollect ReplyCollect) {
//		//null이 아니면 게시물에 닉네임을 세팅해주고 반환 아니면 null을 반환
//		if(ReplyCollect != null) {
//			Member member = getMemberByMemberNo(ReplyCollect.member_Id);  //member_Id를 통해 해당 멤버의 정보를 찾는다
//			ReplyCollect.nickname = member.member_nickname; //ReplyCollect의 닉네임을 설정해준다
//		}
//		return ReplyCollect;
//	} setReplyCollectNickname과 setBoardCollectNickname이 중복을 setNickname으로 통일하여 사용해준다.
	
	private void readfunction(BoardCollect boardCollect) {
		
		while(true) {
			
			System.out.println("상세보기 기능을 선택해주세요 (1. 댓글 등록, "
					+ "2. 좋아요, "
					+ "3. 수정, "
					+ "4. 삭제, "
					+ "5. 목록으로) :");
			
			int sel = Integer.parseInt(sc.nextLine());
			
			if(sel == 1) {
				comment(boardCollect);
			}
			else if(sel == 2) {
				System.out.println("[좋아요 기능]");
				//boardCollect ==> 현재 게시물에 대한 정보를 담고 있다.(매개뱐수로 받고 있는 boardCollect를 초입 까지 따라가서 이해.)
				Like like = new Like(boardCollect.id, logined_id.id, My_util.getCurrentDate(dateFormat));
				// 1. 어떤 게시물? -> 게시물 번호
				// 2. 누가 체크했나? -> 회원 번호
				// 3. 언제 작성됐는가? -> 등록날짜
				likes.add(like);
				System.out.println("해당 게시물을 좋아요 합니다.");
			}
			else if(sel == 3) {
				System.out.println("[수정 기능]");
			}
			else if(sel == 4) {
				System.out.println("[삭제 기능]");
			}
			else if(sel == 5) {
				System.out.println("[목록으로]");
				break;
			}
			
		}// --> 상세보기 while문
		
	}
	
	
	
	
	
	private void comment(BoardCollect BoardCollect) {
		System.out.println("===[댓글 기능]===");
		System.out.print("댓글 내용을 입력해 주세요 :");
		String write = sc.nextLine();
		
		int member_id = logined_id.id;
		String regDate = My_util.getCurrentDate(dateFormat); // -> 댓글 다는 당시의 시간으로 설정
		
		ReplyCollect replyCollect = new ReplyCollect(replyCollect_num, BoardCollect.id,  write, member_id, regDate);//BoardCollect.id를 ReplyCollect.parentId로 넣어준다.
		replies.add(replyCollect);
		
		System.out.println("댓글이 등록 되었습니다.");

		 readInformation(BoardCollect); //댓글 등록후 게시물에 대한 정보를 다시 보여준다.
		
		
		

		
	}


	private void test_data() {  //우선 BoardCollects에 저장을 해놀고 list를 하면 저장된 값이 잘 보여진다.
//		String currentDate = My_util.getCurrentDate("yyyy-mm-dd");
//		
//		BoardCollects.add(new BoardCollect(1, "제목1", "입니다", "익명", currentDate, 0));
//		BoardCollects.add(new BoardCollect(2, "제목2", "입니다", "익명", currentDate, 0));
//		BoardCollects.add(new BoardCollect(3, "제목3", "입니다", "익명", currentDate, 0));
		
		String date = My_util.getCurrentDate(dateFormat);
		
		boardCollects.add(new BoardCollect(1, "제목1", "입니다", 1, date, 0));
		boardCollects.add(new BoardCollect(2, "제목2", "입니다", 2, date, 0));
		boardCollects.add(new BoardCollect(3, "제목3", "입니다", 3, date, 0));
		members.add(new GeneralMember(1, "아이디1", "비밀번호1", "닉네임1"));
		members.add(new GeneralMember(2, "아이디2", "비밀번호2", "닉네임2"));
		members.add(new SpecialMember(3, "아이디3", "비밀번호3", "닉네임3", 0));
		
		//BoardCollects.add(new BoardCollect(3, "제목3", "입니다", members.get(2).member_nickname, date, 0));
		
		//loginedMember = members.get(0);
	}
	
	private void print_search() {
		
		//방법1. 스스로 풀었던 방법
//		while(true) {
//			System.out.print("검색 키워드를 입력해 주세요 :");
//			String search = sc.nextLine();
//			
//			for(int i = 0; i < BoardCollects.size(); i++) {
//				
//				if(BoardCollects.get(i).title.contains(search)) {
//					System.out.println(BoardCollects.get(i).id);
//					System.out.println(BoardCollects.get(i).title);
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
		
		ArrayList<BoardCollect> search_BoardCollects = new ArrayList<>();
		
		for(int i = 0; i < boardCollects.size(); i++) {
			if(boardCollects.get(i).title.contains(keyword)) {
				search_BoardCollects.add(boardCollects.get(i));
			}
		}
		list(search_BoardCollects);
		
	}
		
			
		
	

	private void print_delete() {
		while(true) {
			
			list(boardCollects);
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
			
			BoardCollect boardCollect = getBoardCollectByNo(target);
			
			if(boardCollect == null) {
				System.out.println("없는 게시물 번호 입니다. 다시 입력해 주세요.");
			}
			else {
				
				boardCollects.remove(boardCollect);
				
				System.out.println("게시물이 삭제 되었습니다.");
				list(boardCollects);
				break;
			}
		}
	}

	private void print_update() {
		
		while(true) {
			
			list(boardCollects);
			
			System.out.print("수정할 게시물 번호 :");
			int target = Integer.parseInt(sc.nextLine());
			
			BoardCollect BoardCollect = getBoardCollectByNo(target);
			
			if(BoardCollect == null) {
				System.out.println("없는 게시물 입니다. 다시 입력해 주세요.");
			}
			else {
				
				System.out.print("새제목 :");
				String new_title = sc.nextLine();
				
				System.out.print("새내용 :"); 
				String new_body = sc.nextLine();
			
				//업데이트시 등록날짜가 변하면 안되므로 등록날짜에 대한 부분 수정 필요=================================================
				//String currnetDate = My_util.getCurrentDate(dateFormat);//---------->업데이트시 시간과 조회수 처리 방법??
				
				BoardCollect.title = new_title;
				BoardCollect.body = new_body;
				
				System.out.println("수정이 완료 되었습니다.");
				list(boardCollects);
				break;
			}
		 }
	}

	private void print_add() {
		
			System.out.print("제목을 입력해 주세요 :");
			String title = sc.nextLine();
			
			System.out.print("내용을 입력해 주세요 :");
			String body = sc.nextLine();
			
			String CurrentDate = My_util.getCurrentDate(dateFormat);
			BoardCollect boardCollect = new BoardCollect(boardCollects_num, title, body, logined_id.id, CurrentDate, 0);// --> class의 인스턴스를 만들어 사용한다.
			boardCollects.add(boardCollect); // --> BoardCollects의 배열에 BoardCollect를 저장해 준다.
			
			System.out.println("게시물 저장 되었습니다.");
			boardCollects_num++;			
			// logined.member_nickname -> logined_id.id(이름이 중복되면 구분할 수 없기 때문에 id로 중복되지 않는 값으로 만들어 준다.)
	}

	private void print_help() {
		System.out.println("================");
		System.out.println("add  : 게시물 등록");
		System.out.println("list : 게시물 목록 조회");
		System.out.println("update : 게시물 수정");
		System.out.println("delete : 게시물 삭제");
	}

	// 게시물 데이터를 찾을 때 index가 아닌 게시물 데이터 그 자체를 찾는 것으로 변경
	// 회원이름을 게시물에 적용시켜 조립된 상태로 얻기 위함.
	public BoardCollect getBoardCollectByNo(int targetNo) {
		
		BoardCollect targetBoardCollect = null;
		
		//찾고자 하는 게시물 찾기
		for(int i = 0; i < boardCollects.size(); i++) {
			//int current_num = BoardCollects.get(i).id;
			BoardCollect current_num = boardCollects.get(i);  //배열의 순서를 넘겨준것이 아니라 ~번째 배열의 값을 보여준다.(ex.0번째 -> 1저장)
			if(targetNo == current_num.id) {
			
				targetBoardCollect = current_num;
				break;
			}
		}
		//닉네임 세팅
		targetBoardCollect = (BoardCollect)setNickname(targetBoardCollect); //수동 형변환
		//반환
		return targetBoardCollect;
	}
		
	
	// 게시물을 받아 해당 게시물의 작성자 번호에 맞는 작성자 닉네임을 세팅해주는 메서드
//	private BoardCollect setBoardCollectNickname(BoardCollect BoardCollect) {
//		// null이 아니면 게시물에 닉네임을 세팅해주고 반환 아니면 null 그대로 반환
//		if(BoardCollect != null) {
//			Member member = getMemberByMemberNo(BoardCollect.members_id);
//			BoardCollect.nickname = member.member_nickname;
//		}
//		return BoardCollect;
//	}     setBoardCollectNickname과 setReplyCollectNickname을 하나의 setNickname으로 통일 시켜 사용해준다.
	
	
	// 게시물을 받아 해당 게시물의 작성자 번호에 맞는 작성자 닉네임을 세팅해주는 메서드(setBoardCollectnickname,setReplyCollectnickname을 같이 사용)
	private BaseCollect setNickname(BaseCollect baseCollect) {
		// null이 아니면 게시물에 닉네임을 세팅해주고 반환 아니면 null 그대로 반환
		if(baseCollect != null) {
			Member member = getMemberByMemberNo(baseCollect.members_id);
			baseCollect.nickname = member.member_nickname;
		}
		return baseCollect;
	}   
	
	
	
	// 게시물 찾기와 마찬가지로 역시 회원 정보 그 자체를 찾은 것으로 변경
	private Member getMemberByMemberNo(int memberId) {
		
		Member targetMember = null;
		
		for(int i = 0; i < members.size(); i++) {
			Member currentMember = members.get(i);
			if(memberId == currentMember.id) {
				targetMember = currentMember;
				break;
			}
		}
		return targetMember;
	}
	
	
	public void list(ArrayList<BoardCollect> list) {
		for(int i = 3; i < list.size(); i++) {
			
			BoardCollect BoardCollect = list.get(i);
			BoardCollect = (BoardCollect)setNickname(BoardCollect);  
			//---> BoardCollect 생성자에 있는 memeber고유의 id를 통해서 작성자 닉네임을 찾아 저장해준다.
			// == // 모든 게시물의 닉네임을 작성자에 맞게 세팅

			System.out.println("번호 :" + BoardCollect.id);
			System.out.println("제목 :" + BoardCollect.title);
			System.out.println("작성자 :" + BoardCollect.nickname);
			System.out.println("등록날짜 :" + BoardCollect.regDate );
			System.out.println("조회수 :" + BoardCollect.hit);
			System.out.println("===================");
		}
	}
	
	
	public void test_list(ArrayList<BoardCollect> list) {
		for(int i = 0; i < list.size(); i++) {
			
			BoardCollect BoardCollect = list.get(i);
		
			System.out.println("번호 :" + BoardCollect.id);
			System.out.println("제목 :" + BoardCollect.title);
			System.out.println("작성자 :" + BoardCollect.members_id);
			System.out.println("등록날짜 :" + BoardCollect.regDate );
			System.out.println("조회수 :" + BoardCollect.hit);
			System.out.println("===================");
		}
		for(int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			System.out.println(member.member_nickname + "님 횐영합니다!!");
			logined_id = member;   //testdata의 경우 로그인이 아이디외 비밀번호를 미리 지정해 두기 때문에 list시 자동 로그인이 되게 만들어
		}							//주었다.
	}
	
	


	
	

}// -----------------------------------------------------> main 메서드
