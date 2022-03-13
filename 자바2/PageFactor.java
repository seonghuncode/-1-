package 자바2;

public class PageFactor {
	//page기능시 필요한 것을 넣어두는 class
	
	int currentNum = 1;
	int totalCount = 0;
	
	//생성자 totalPageNum을 직접 받아서 위의 totalPageNum에 넣어 준다.
	public PageFactor(int totalCount) {
		this.totalCount = totalCount;
	}
	
	
	public int currentBlockNum() {
		return (int)Math.ceil((double)currentNum/5);
	}
	
	public int startNum() {
		return (5 * (currentBlockNum() - 1)) + 1;
	}
	
	public int endNum() {
		int endNum = startNum() + 4;
		
		if(endNum > LastPageNum()) {
			endNum = LastPageNum();
		}
		return endNum;
	}
	
	//게시물을 보여주는 시작수와 끝수를 정해주는 코드
	public int startCollectNum() {
		return 3 * (currentNum - 1);
	}
	
	public int endCollectNum() {
		int endCollectNum =  startCollectNum() + 3;
		
		if(endCollectNum > totalCount){
			endCollectNum = totalCount;
		}
		return endCollectNum;
	}
	
	
	public int  LastPageNum() {
		//ex. 총게시물 : 30 / 한쪽에 보여주는 게시물 3 ==> 10  --> 
		//   24 /3 -> 8
					
		int last = (int)Math.ceil((double)totalCount/3);
		return last;
	}
}
