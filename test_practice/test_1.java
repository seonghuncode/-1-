package test_practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class test_1 {

	public static void main(String[] args) {
	
		
			// 현재 날짜 구하기 
			LocalDate now = LocalDate.now(); 
			// 포맷 정의 
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd"); 
			// 포맷 적용 
			String formatedNow = now.format(formatter); 
			// 결과 출력 
			System.out.println(formatedNow); 
			// 2021/12/02

	}

}
