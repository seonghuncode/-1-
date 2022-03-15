package 자바2;

import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

	public void saveCollectToFile(BoardCollect collects) {
		
		try {
			FileWriter writer = new FileWriter("c:/java2/collect_" + collects.id + ".txt");
		
			writer.write("id:" + collects.id + ",");
			
			writer.write("title:" + collects.title + ",");
			
			writer.write("body:" + collects.body + ",");
			
			writer.write("members_id:" + collects.members_id + ",");
			
			writer.write("regDate:" + collects.regDate + ",");
			
			writer.write("hit:" + collects.hit + ",");
			
			writer.close();
			
		} catch (IOException e) {
			System.out.println("파일 쓰기 중 문제가 발생 하였습니다.");
			e.printStackTrace();
		}
		
	}
	
}
