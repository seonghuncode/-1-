package 자바2;

public class GeneralMember extends Member{

	
	public GeneralMember(int id, String member_id, String member_pw, String member_nickname) {
		
		this.id = id;
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_nickname = member_nickname;
	}
	
	public void greeting() {
		System.out.println("안녕하세요 일반회원" + member_nickname + "님 반갑습니다");
	}
	
}
