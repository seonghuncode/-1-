package 자바2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
	
	
	public BoardCollect ReadFromFileData(int id) {
		
		BoardCollect collects = null;

		try {
			FileReader reader = new FileReader("C:/java2/collect_" + id + ".txt");
			BufferedReader reader2 = new BufferedReader(reader);
			String line = reader2.readLine();
			
			while(line != null) {
				System.out.println(line);
				reader2.readLine();
			}
			
			reader2.close();
			reader.close();
			collects = Devide(line);
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다");
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("파일을 읽어 오는 중 문제가 발생 했습니다.");
		}
		
		return collects;
	}
	
	
	
	

	public static void saveCollectToFile(BoardCollect collects) {
		
		
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
	
	
	
	
	public BoardCollect Devide(String target) {
		
		//정보가 이렇게 있으면 배열에 원하는 쪼개고 싶은 단위로 나누어 그것을 묶음으로 따로 따로 저장
		//id:1,title:제목,body:내용,members_id:2,regDate:22.22.22,hit:23,
		
		BoardCollect collects = null;//for문 밖에서 리턴을 해야하기 때문에 지역변수 밖에 먼저 만들어 사용
		String[] Info = target.split(","); //우선 정보를 ,단위로 나눈다
		
		for(int i = 0; i < Info.length; i++) {
			
			collects = new BoardCollect();
			String[] property = Info[i].split("-"); //다음으로 -단위로 한번더 나누어 준다.
			
			if(property[0].equals("id")) {
				collects.id = Integer.parseInt(property[1]);
			}
			else if(property.equals("title")) {
				collects.title = property[1];
			}
			else if(property.equals("body")) {
				collects.body = property[1];
			}
			else if(property.equals("members_id")) {
				collects.members_id = Integer.parseInt(property[1]);
			}
			else if(property.equals("regDate")) {
				collects.regDate = property[1];
			}
			else if(property.equals("hit")) {
				collects.hit = Integer.parseInt(property[1]);
			}
		}
		
		return collects;
		
		
	}
	
}
