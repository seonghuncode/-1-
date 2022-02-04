package 자바2;

public class Member {
	int id;
	String member_id;
	String member_pw;
	String member_nickname;
	
	public Member(int id, String member_id, String member_pw, String member_nickname) {
		super(); //부모의 생성자를 의미?? 구분하기 위해 사용한다?, 
				//자식 클래스가 자신을 생성할 때 부모 클래스의 생성자를 불러 초기화 할때 사용됩니다. (기본적으로 자식 클래스의 생성자에 추가됩니다.)
		this.id = id;
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_nickname = member_nickname;
	}

}
