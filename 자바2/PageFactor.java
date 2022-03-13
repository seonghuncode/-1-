package 자바2;

public class PageFactor {
	//page기능시 필요한 것을 넣어두는 class
	
	int currentNum = 1;
	
	
	
	//게시물을 보여주는 시작수와 끝수를 정해주는 코드
	
	
	
	
	public int currentBlockNum() {
		return (int)Math.ceil((double)currentNum/5);
	}
	
	public int startNum() {
		return (5 * (currentBlockNum() - 1)) + 1;
	}
	
	public int endNum() {
		return startNum() + 4;
	}
	
	//게시물을 보여주는 시작수와 끝수를 정해주는 코드
	public int startCollectNum() {
		return 3 * (currentNum - 1);
	}
	
	public int endCollectNum() {
		return startCollectNum() + 3;
	}
	
	
	

}
