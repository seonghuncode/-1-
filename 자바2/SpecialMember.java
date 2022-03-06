package 자바2;
 
public class SpecialMember extends Member {

	int point;
	
	public SpecialMember(int id, String member_id, String member_pw, String member_nickname, int point) {
		
		this.id = id;
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_nickname = member_nickname;
		this.point = point;
	}
	
	public void greeting() {
		System.out.println("안녕하세요 우수회원" + member_nickname + "님 사랑합니다. 회원님의 남은 포인트는 현재" + point + "입니다.");
	}
	
}
