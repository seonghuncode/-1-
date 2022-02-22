package 자바2;

public class ReplyCollect extends BaseCollect {
	
	
	int parentId; // -> 부모글 번호
	
	
	public ReplyCollect(int id, int parentId, String body, int members_id, String regDate) {
		super();
		this.id = id;
		this.parentId = parentId;
		this.body = body;  //이때 BaseInfo에서 정보를 가지고 오기 때문에 기존의 변수명을 BaseInfo와 같은 변수명으로 바꾸어 준다.
		this.members_id = members_id;  //이때 BaseInfo에서 정보를 가지고 오기 때문에 기존의 변수명을 BaseInfo와 같은 변수명으로 바꾸어 준다.
		this.regDate = regDate;
	}
	
}
