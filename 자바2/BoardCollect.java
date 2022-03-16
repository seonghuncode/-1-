package 자바2;

public class BoardCollect extends BaseCollect{
	
	//extends를 해주고 받아오게 될것은 가지고 있을 필요가 없으므로 지워준다.(이때 BaseInfo가 더 상위의 개념이다.)
	 String title;
	 int hit;
	
	 
	 public BoardCollect() {}
	 
	// -->출력시 회원의 닉네임을 얻어와 저장하기 위한 용도
	
	public BoardCollect(int id, String title, String body, int members_id, String regDate, int hit) {  //생성자를 사용하기 위해 만들어 주어야 한다.
		this.id = id; 								//class명과 똑깉은 이름으로 사용해야 한다.
		this.title = title;
		this.body = body;
		this.members_id = members_id;
		this.regDate = regDate;
		this.hit = hit;
	}
	 
}
