package 자바2.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class My_util {

	public static String getCurrentDate(String dateformat) {
		// 현재 날짜 구하기 
		LocalDate now = LocalDate.now(); 
		// 포맷 정의 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateformat); 
		// 포맷 적용 
		String formatedNow = now.format(formatter); 
		// 결과 출력 
		return formatedNow;
	}
	
}
