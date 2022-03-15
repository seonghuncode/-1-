package test_practice;

import 자바2.BoardCollect;
import 자바2.FileManager;

public class test_3 {
	
	public static void main(String[] args) {
		
		
		FileManager fm = new FileManager();
		BoardCollect a1 = new BoardCollect(9,"제목","내용",2,"22.22.22",23);
		fm.saveCollectToFile(a1);
	}
	
}
