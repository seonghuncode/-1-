package 자바2;

public class Reply {
	
	int id; // -> 식별데이터
	int parentId; // -> 부모글 번호
	String command; // -> 댓글
	int member_Id; // -> 작성자
	String nickname; // --> 댓글 작성자
	String regDate; // -> 작성일
	
	public Reply(int id, int parentId, String command, int member_Id, String regDate) {
		super();
		this.id = id;
		this.parentId = parentId;
		this.command = command;
		this.member_Id = member_Id;
		this.regDate = regDate;
	}
	
}
