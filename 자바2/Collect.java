package 자바2;

public class Collect {

	int id;
	String title;
	String body;
	int members_id;
	String regDate;
	int hit;
	
	public Collect(int id, String title, String body, int members_id, String regDate, int hit) {  //생성자를 사용하기 위해 만들어 주어야 한다.
		this.id = id; 								//class명과 똑깉은 이름으로 사용해야 한다.
		this.title = title;
		this.body = body;
		this.members_id = members_id;
		this.regDate = regDate;
		this.hit = hit;
	}
	
}
