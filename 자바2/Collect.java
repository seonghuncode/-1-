package 자바2;

public class Collect {

	int id;
	String title;
	String body;
	int members_id;
	String regDate;
	int hit;
	String nickname; //nickname을 적게만 해주면 되므로 여기에만 적어주어도 된다.
	// -->출력시 회원의 닉네임을 얻어와 저장하기 위한 용도
	
	public Collect(int id, String title, String body, int members_id, String regDate, int hit) {  //생성자를 사용하기 위해 만들어 주어야 한다.
		this.id = id; 								//class명과 똑깉은 이름으로 사용해야 한다.
		this.title = title;
		this.body = body;
		this.members_id = members_id;
		this.regDate = regDate;
		this.hit = hit;
	}
	
}
