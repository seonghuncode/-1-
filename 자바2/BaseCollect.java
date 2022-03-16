package 자바2;

public class BaseCollect {
	//Collect와 Reply의 공통적인 것을 뽑아 만들어 extends를 사용할 수 있도록 부모 상속의 요건을 만들어 준다.
	
	public int id;
	public String body; //collect에서는 body, Reply에서는 command로 사용??
	public String regDate;
	public int members_id;
	public String nickname;
	
	
}
