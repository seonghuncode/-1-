package 자바1;

import java.util.ArrayList;
import java.util.Scanner;

public class 자바1 {
	
	

	public static void main(String[] args) {
		
		
		//내림차순, 오름차순-------------------------------------------------------------------------------------------------
		
		
		
//		// a b 두 수가 주어지면 a와 b사이의 수를 오름차순 출력해주세요.
//		// 오름차순은 작은 수 부터 큰수로 정렬되는 것을 말합니다. 
//		// ex )
//		// 오름차순 :  1, 2, 3, 4, 5
//		// 내림차순 :  5, 4, 3, 2, 1
//		
//
//	    int a = 1;
//	    int b = 10;
//	    
//	  
//	  if(a > b) {
//		  System.out.print("오름차순 : ");
//		  for(int i = b + 1; i < a; i++) {
//			  System.out.print(i + " ");
//		  }
//		  
//		  System.out.println();
//		  
//		  System.out.print("내림차순 : ");
//		  for(int i = a -1; i > b; i--) {
//			 System.out.print(i + " ");
//		  }
//	  }
//	  else if(a < b) {
//		  System.out.print("오름차순");
//		  for(int i = a + 1; i < b; i++) {
//			  System.out.print(i + " ");
//		  }
//		  
//		  System.out.println();
//		  
//		  System.out.print("내림차순");
//		  for(int i = b - 1; i > a; i--) {
//			  System.out.print(i + " ");
//		  }
//	  }
		
		
		//---------------------------------------------------------------------------------------------------------------
		
		//Scanner sc = new Scanner(System.in);
		//System.out.print("단을 이력해 주새요 : ");
		//int dan = Integer.parseInt(sc.nextLine());
		
		//---------------------------------------------------------------------------------------------------------------
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		// 메뉴 만들기 - 사칙 연산 기능 추가 구현
//
//	    // 원하는 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기): 2
//	    // 첫번째 숫자를 입력해주세요 : 12
//	    // 두번째 숫자를 입력해주세요 : 30
//	    // 12 - 30 = -18
//		
//		
//		
//		
//		while(true) {
//			
//			System.out.println("1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기 5. 종료):");
//			System.out.print("원하는 기능을 선택해 주세요 : ");
//			int sel = Integer.parseInt(sc.nextLine());
//			
//			System.out.print("첫 번째 숫자를 입력해 주세요 : ");
//			int num1 = Integer.parseInt(sc.nextLine());
//			
//			System.out.print("두번째 숫자를 입력해 주세요 : ");
//			int num2 = Integer.parseInt(sc.nextLine());
//			
//			
//			if(sel == 5) {
//				System.out.println("프로그램을 종료합니다.");
//				
//				break;
//			}
//			else if(sel == 1) {
//				System.out.println(num1 + "+" + num2 + "="+ (num1 + num2));
//			}
//			else if(sel == 2) {
//				System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
//			}
//			else if(sel == 3) {
//				System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
//			}
//			else if(sel == 4) {
//				System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
//			}
//			else {
//				System.out.println("알수 없는 명령어 입니다.");
//			}
//			
//		}
//		
//		 // 프로그램 반복하고 종료하기
//
//	    // 원하는 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료): 1
//	    // 첫번째 숫자를 입력해주세요 : 12
//	    // 두번째 숫자를 입력해주세요 : 30
//	    // 12 + 30 = 42
//
//	    // 원하는 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료): 2
//	    // 첫번째 숫자를 입력해주세요 : 12
//	    // 두번째 숫자를 입력해주세요 : 30
//	    // 12 - 30 = -18
//
//	    // 원하는 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료): 3
//	    // 첫번째 숫자를 입력해주세요 : 12
//	    // 두번째 숫자를 입력해주세요 : 30
//	    // 12 * 30 = 360
//
//	    // 원하는 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료): 5
//	    // 계산기 프로그램을 종료합니다.
		
		//----------------------------------------------------------------------------------------------------------------
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이를 정해주세요 : ");
//		int high = Integer.parseInt(sc.nextLine());
//		
//		for(int i = 1; i <= high; i++) {
//			for(int line = 1; line <= i; line++) {
//				
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
//		//
//		
//		System.out.print("삼각형2의 높이를 입력해 주세요 : ");
//		int high2 = Integer.parseInt(sc.nextLine());
//		
//		for(int i = 1; i <= high2; i++) {
//			for(int blank  = 1; blank <= high - i; blank++) {
//				System.out.print(" ");
//			}
//			for(int star = 1; star <= i; star++) {
//				
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
//	  
//	System.out.print("삼각형3의 높이를 입력해 주세요 : ");
//	int high3 = Integer.parseInt(sc.nextLine());
//	
//	for(int i = 0; i < high3; i++) {
//		for(int blank = 0; blank < high -i - 1; blank++) {
//			System.out.print(" ");
//		}
//		for(int star = 0; star < i*2+1; star++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	
//		// 출력
//	    /*
//	      *
//	     ***
//	    *****
//	    *	    
//	    */

		
		
		
		//
		//---------------------------------------------------------------------------------------------------------------
		
		
//		 // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
//	   
//		int arr[] = {10,20,30,40,50,60,70,80,90,100};
//		
//		for(int i = 0; i < arr.length; i++) {
//			
//			System.out.println(arr[i]);
//		}
		
		// 배열을 이용해 5개의 숫자를 입력받고 출력해주세요.
		
		/*
		  
		Scanner sc = new Scanner(System.in);
		//배열 선언 하여 저장 공간 만드는 방법
		int[] arr = {1,2,3,4,5};
		//int[] arr2 = new int[10];
		
		System.out.println("저장할 숫자 5개를 입력해 주세요");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
		}

		 */

		
		//
		
		//형변환-------------------------------------------------------------------------------------------------------
		/*
		  
		double b = 10.3;
		int a = (int) b; // 형변환 직접 해달라고 명시. 수동형변환, 명시적형변환,

		int c = 10;
		double d = c; // int값이 double변수에 저장된게 절대 X
		
		 */

		
		//랜덤한 숫자 구하는 방법-----------------------------------------------------------------------------------------
		// -----------------------------------------------------------------------------------------------------------

		// 자바 API => 자바 언어 측에서 만들어놓고 제공하는 여러 도구들. ex) Scanner, Math

		// 랜덤한 숫자 얻기 -> Math.random(); => 0.0 ~ 1.0 사이의 랜덤한 숫자 제공

		// 문제. 1 부터 45까지 랜덤한 숫자를 6개 출력해주세요. (정수로 출력해주세요)
		
		//0.0 ~ 1.0
//		double num = Math.random();
//		System.out.println(num);
//		//1 ~ 10 - 10까지 원하면 +1을 해준다
//		System.out.println((int)(num * 10));
		
		
		
		
		//---------------------------------------------------------------------------------------------------------------
		//로또 프로그럄 만들기-----------------------------------------------------------------------------------------------
		//--------------------------------------------------------------------------------------------------------------
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int[] lottoNums = new int[7]; // 1등 당첨 번호
//		int length = lottoNums.length;
//		int[] MyChooseNums = new int[6];
//		
//	
//	
//		
//		// 아래와 같이 결과가 출력되도록 로또 당첨 번호 7개(보너스 번호 포함)를 선택해주세요.
//		// 1. 여기에 당첨 번호 추출 코드 작성해주세요.
//		// ======================================================================================
//		
//		// 2. 입력을 통해 수동으로 번호 선택하는 코드 작성해주세요.
//		
//		for(int i = 0; i < MyChooseNums.length; i++) {
//			
//			System.out.print((i + 1) + "번째 로또 번호를 입력해 주세요 : ");
//			MyChooseNums[i] = Integer.parseInt(sc.nextLine());
//			
//			for(int j = 0; j < i; j++){
//				if(MyChooseNums[i] == MyChooseNums[j]) {
//					System.out.println("동일 번호를 입력했습니다. 다시 입력해 주세요!!");
//					i--;
//					break;
//				}
//				if(MyChooseNums[i] < 1 || MyChooseNums[i] > 45) {
//					System.out.println("1에서 45사이의 숫자만 골라 주세요!!");
//					i--;
//					break;
//				}
//			}
//		}
//		
//		
//		
//		 // 1. 여기에 당첨 번호 추출 코드 작성해주세요.
//		
//		for(int i = 0; i < length; i++) {
//			double num = Math.random();
//			int nums = (int)(num * 45 + 1);
//		   //int nums = (int)(Math.random() * 45) + 1;
//			lottoNums[i] = nums;
//			
//			for(int j = 0; j < i; j++) {
//				if(lottoNums[i] == lottoNums[j]) {
//					i--;
//					break;
//				}
//				
//					
//			}
//			
//		}  // -> for문의 경우 횟수로 빠져 나온다.
//		
//	
//			
//			
////		int a = 0;
////		while(true) {
////			if(a == 7) {
////				break;
////			}
////			double num = Math.random();
////			int nums = (int)(num * 45 + 1);
////			
////			lottoNums[a] = nums;
////			a++;
////			
////		}  // -> while문 조건으롣 빠져 나올때
//		
//		
//		 // 3. 내가 선택한 번호와 당첨 번호를 대조하여 당첨확인하는 코드를 작성해주세요.
//		
//		int matchcnt = 0;
//		boolean existBonusNum = false;
//		for(int p = 0; p < length - 1; p++){
//			for(int i = 0; i < MyChooseNums.length; i++) {
//				if(lottoNums[p] == MyChooseNums[i]) {
//					matchcnt++;
//					break;
//				}
//				else if(MyChooseNums[i] == lottoNums[6] && ! existBonusNum) {
//					existBonusNum = true;
//					break;
//				}
//			}
//			
//		}
//		
//		
//	
//		
//			
//		
//		
//		
//		
//		
//		// ======================================================================================
//
//		// 1 출력 코드
//		// ======================================================================================
//		System.out.print("당신이 선택한 번호는 : ");
//		for(int i = 0; i < MyChooseNums.length; i++) {
//			System.out.print(MyChooseNums[i] + " ");
//		}
//		
//		System.out.println();
//			
//		System.out.print("당첨 번호 : ");
//		for(int i = 0; i < length - 1; i++) {
//			System.out.print(lottoNums[i] + ",");
//		}
//		System.out.println("보너스 번호 : " + lottoNums[6]);
//		
//		
//		
//		System.out.print("일치하는 로또 번호의 갯수 : " + matchcnt);
//		
//		System.out.println();
//		System.out.println("=====================");
//		
//		
//		//4. 당첨 결과를 출력해주세요.
//		
//		if(matchcnt == 6) {
//			System.out.println("1등 당첨 입니다.");
//		}
//		else if(matchcnt == 5 && existBonusNum) {
//			System.out.println("2등 당첨 입니다");
//		}
//		else if(matchcnt == 5) {
//			System.out.println("3등 당첨 입니다");
//		}
//		else if(matchcnt == 4) {
//			System.out.println("4등 당첨 입니다");
//		}
//		else if(matchcnt == 3) {
//			System.out.println("5등 당첨 입니다.");
//		}
//		else{
//			System.out.println("꽝 입니다.");
//		}
//		
//		
//		
//		// ======================================================================================
//
//		// 출력결과
//		// 당첨 번호 : 43, 32, 25, 19, 15, 7, 보너스 번호 : 36
		
		
		
		
		
		//=========================================================================================================
		
		
		
//		// 데이터 저장/관리 프로그램
//		// 데이터를 저장, 가져오고, 수정, 삭제
//		
//		Scanner sc = new Scanner(System.in);		
//		//String[] save = new String[100];
//		ArrayList<String> save = new ArrayList<>();
//		int num = 0;
//		
//		
//		while(true) {
//			
////			System.out.println("======================");
////			System.out.println(" 1. 데이터 저장\r\n"
////					+ " 2. 데이터 조회\r\n"
////					+ " 3. 데이터 수정\r\n"
////					+ " 4. 데이터 삭제\r\n"
////					+ " 5. 종료");
////			System.out.println("======================");
//			System.out.print("명령어를 입력헤 주세요 : ");
//			
//			int sel = Integer.parseInt(sc.nextLine());
//			
//			
//			
//			if(sel == 1) {
//				System.out.println("[데이터 저장]");
//				System.out.print("저장할 값을 입력해 주세요 :");
//				//save[num] = sc.nextLine();
//				String something = sc.nextLine();
//				save.add(something);
//				System.out.println(save.get(num) + "가 저장 되었습니다.");
//				num++;
//			}
//			else if(sel == 2) {
//				System.out.println("[데이터 조회]");
//				System.out.println("현재 저장 되어 있는 값");
//				saves(num, save);
//			}
//			else if (sel == 3) {
//				System.out.println("[데이터 수정]");
//				saves(num, save);
//
//			
//				while(true) {
//					
//					System.out.print("몇 번 데이터를 수정 하시겠습니까?");
//					int change = Integer.parseInt(sc.nextLine());
//					if(change >= 1 && change <= num) {
//						System.out.print("어떤 값으로 수정 하시겠 습니까?");
//						//save[change - 1] = sc.nextLine();
//						String something = sc.nextLine();
//						save.set(change - 1, something);
//						System.out.println(save.get(change - 1) + "로 수정되었습니다.");
//						break;
//					}
//					else {
//						System.out.println("없는 값 입니다 다시 입력해 주세요");
//						
//					}
//					
//				}
//
//			}
//			else if(sel == 4) {
//				
//				while(true) {
//					System.out.println("[데이터 삭제]");
//					saves(num, save);
//					System.out.print("몇 번 데이터를 삭제하시 겠습니까?");
//					int delete = Integer.parseInt(sc.nextLine());
//
//					if(delete >= 1 && delete <= num) {
//						System.out.println(save.remove(delete - 1) + "삭제되었습니다");
//						for(int i = delete - 1 ; i < save.size() - 1; i++ ){
//							//save[i] = save[i + 1];
//							save.remove(delete - 1);
//						}
//						num--;
//						break;
//					}
//					else {
//						System.out.println("없는 값 입니다 다시 입력해 주세요");
//					}
//				}
//			}
//			else if(sel == 5) {
//				System.out.println("[종료]");
//				break;
//			}
//			else {
//				System.out.println("입력 숫자가 잘못 되었습니다. 확인후 다시 입력해 주세요.");
//			}
//			
//			
//			
//		}
		
		
		
		
		//class문제========================================================================================================
		
		
//		// 회원 모델링 : 이름, 나이, 주소
//		
//		
//		Custmer c1 = new Custmer();
//		c1.age = 22;
//		c1.name = "곽채린";
//		c1.live = "괴천";
//		
//		
//		Custmer c2 = new Custmer();
//		c2.age = 35;
//		c2.name = "김대영";
//		c2.live = "대전";
//	
//		
//		Custmer c3 = new Custmer();
//		c3.age = 25;
//		c3.name = "유성훈";
//		c3.live = "대전";
//		
//		Custmer c4 = new Custmer();
//		c4.age = 12;
//		c4.name = "김민지";
//		c4.live = "대전";
//		
//		ArrayList<Custmer> print = new ArrayList<>();
//		print.add(c1);
//		System.out.println(print.get(0));
//		print.add(c2);
//		print.add(c3);
//		print.add(c4);
//				
//		// 1. 전체 회원 나이와 이름 출력
//		System.out.println("전체회원");
//		for(int i = 0; i < print.size(); i++) {
//		print.get(i).introduce();
//		}
//		
//		// 2. 나이가 30세 미만인 사람의 이름 출력
//		System.out.println("======30세미만===================");
//			for(int i = 0; i < print.size(); i++) {
//				if(print.get(i).age < 30) {
//				System.out.println(print.get(i).name);  
//				}
//			}
//		// 3. 대전 사는 사람들의 이름과 나이 출력
//		System.out.println("======대전사는 사람=========");
//		for(int i = 0; i < print.size(); i++) {
//			if(print.get(i).live == "대전") {
//				print.get(i).introduce();
//			}
//		}
//		// 4. 김씨 성을 가진 사람 이름 출력 (힌트 : startsWith)
//		System.out.println("김씨성을 가진 사람의 이름");
//		for(int i = 0; i < print.size(); i++) {
//			if(print.get(i).name.startsWith("김")){
//				System.out.println(print.get(i).name);
//			}
//		}
		
		
		
		
		//햄버거 자판기 만들어 보기-----------------------------------------------------------------------------------------
		//String 배열도 가격이랑 이름을 같이 묶어서 저장하는 배열로 만들어 주문 취소시 한번에 취소 할 수 있도록 만들기
		
		
//		Scanner sc = new Scanner(System.in);
//		ArrayList<class_burgers> burgers = new ArrayList<>(); 
//		ArrayList<class_sidies> sidies = new ArrayList<>();
//		ArrayList<class_drink> drinks = new ArrayList<>();
//		int total_price = 0;
//		int my_price = 0;
//		
//		ArrayList<class_burgers> order_burgers = new ArrayList<>();
//		ArrayList<class_sidies> order_sidies = new ArrayList<>();
//		ArrayList<class_drink> order_drinks = new ArrayList<>();
//		
//		
//		//버거
//		class_burgers b1 = new class_burgers();
//		b1.name = "한우불고기 버거";
//		b1.price = 6000;
//		order_burgers.add(b1);
//		
//		class_burgers b2 = new class_burgers();
//		b2.name = "치즈버거";
//		b2.price = 3000;
//		order_burgers.add(b2);
//		
//		class_burgers b3 = new class_burgers();
//		b3.name = "치킨버거";
//		b3.price = 3500;
//		order_burgers.add(b3);
//		
//		class_burgers b4 = new class_burgers();
//		b4.name = "새우버거";
//		b4.price = 3200;
//		order_burgers.add(b4);
//		
//		class_burgers b5 = new class_burgers();
//		b5.name = "상하이 스파이시 버거";
//		b5.price = 5500;
//		order_burgers.add(b5);
//		
//		class_sidies s1 = new class_sidies();
//		s1.name = "감자튀김";
//		s1.price = 1800;
//		order_sidies.add(s1);
//		
//		class_sidies s2 = new class_sidies();
//		s2.name = "치즈스틱";
//		s2.price = 2000;
//		order_sidies.add(s2);
//		
//		//사이드
//		class_sidies s3 = new class_sidies();
//		s3.name = "치킨너겟";
//		s3.price = 2500;
//		order_sidies.add(s3);
//		
//		class_sidies s4 = new class_sidies();
//		s4.name = "오징어링";
//		s4.price = 2700;
//		order_sidies.add(s4);
//		
//		//에이드
//		class_drink d1 = new class_drink();
//		d1.name = "콜라";
//		d1.price = 1000;
//		order_drinks.add(d1);
//		
//		class_drink d2 = new class_drink();
//		d2.name = "에이드";
//		d2.price = 2000;
//		order_drinks.add(d2);
//		
//		class_drink d3 = new class_drink();
//		d3.name = "커피";
//		d3.price = 1500;
//		order_drinks.add(d3);
//		
//		class_drink d4 = new class_drink();
//		d4.name = "쉐이크";
//		d4.price = 2500;
//		order_drinks.add(d4);
//		
//		
//		
//		while(true) {
//			System.out.println("햄버거 자판기 입니다.");
//			System.out.println("================");
//			System.out.println("1. 햄버거 선택");
//			System.out.println("2. 사이드 선택");
//			System.out.println("3. 음료수 선택");
//			System.out.println("4. 메뉴 선택");
//			System.out.println("5. 주문 선택");
//			System.out.println("================");
//			
//			System.out.println("================");
//			order_print(burgers, sidies,drinks, order_burgers,order_sidies, order_drinks, total_price);
//			System.out.println("================");
//			System.out.print("무엇을 선택 하시겠습니까 :");
//			int sel = Integer.parseInt(sc.nextLine());
//			
//			if(sel == 1) {
//				System.out.println("==햄버거 목록==");
//				System.out.println("1. 한우불고기버거 6000");
//				System.out.println("2. 치즈버거 3000");
//				System.out.println("3. 치킨버거 3500");
//				System.out.println("4. 새우버거 3200");
//				System.out.println("5. 상하이 스파이시 버거 5500");
//				System.out.print("어떤 햄버거를 고르시 겠습니까 :");
//				int burger = Integer.parseInt(sc.nextLine());
//				//System.out.println(burgers.get(burger - 1) + "를 고르셨습니다.");
//				
//				//order_burgers.add((burgers.get(burger - 1)));
//				
//				System.out.println(order_burgers.get(burger - 1).name + "를 고르셨습니다.");
//				burgers.add(order_burgers.get(burger - 1));		
//				
//			}
//			else if(sel == 2) {
//				System.out.println("===사이드 목록===");
//				System.out.println("1. 감자튀김 1800");
//				System.out.println("2. 치즈스틱 2000");
//				System.out.println("3. 치킨너겟 2500");
//				System.out.println("4. 오징어링 2700");
//				System.out.print("어떤 사이드를 고르시겠습니까 : ");
//				int side = Integer.parseInt(sc.nextLine());
////				System.out.println(sidies.get(side - 1) + "을 선택 하셨습니다.");
////				order_sidies.add(sidies.get(side - 1));
//				
//				System.out.println(order_sidies.get(side - 1).name + "을 선택 하셨습니다.");
//				sidies.add(order_sidies.get(side - 1));
//			}
//			else if(sel == 3) {
//				System.out.println("===음료수 목록===");
//				System.out.println("1. 콜라 1000");
//				System.out.println("2. 에이드 2000");
//				System.out.println("3. 커피 1500");
//				System.out.println("4. 쉐이크 2500");
//				System.out.print("어떤 음료수를 고르시 겠습니다 : ");
//				int drink = Integer.parseInt(sc.nextLine());
//				System.out.print(order_drinks.get(drink-1).name + "을 고르셨습니다.");
//				drinks.add(order_drinks.get(drink-1));
//				
//			}
//			else if(sel == 4) {
//				System.out.println("1. 버거");
//				System.out.println("2. 사이드");
//				System.out.println("3. 음료");
//				System.out.print("어떤 메뉴를 취소 하시겠습니까 :");
//				int delete_menu = Integer.parseInt(sc.nextLine());
//				if(delete_menu == 1) {
//					for(int i = 0; i < burgers.size(); i++) {
//						System.out.println((i + 1) + "." + burgers.get(i).name );
//					}
//					System.out.print("취소할 품목을 선택해 주세요 :");
//					int delete_num = Integer.parseInt(sc.nextLine());
//					System.out.println(burgers.get(delete_num - 1).name + "취소 되었습니다.");
//					burgers.remove(delete_num - 1);
//				}
//				else if(delete_menu == 2) {
//					for(int i = 0; i < sidies.size(); i++) {
//						System.out.println((i + 1 ) + "." + sidies.get(i).name);
//					}
//					System.out.print("취소할 품목을 선택해 주세요 : ");
//					int delete_num = Integer.parseInt(sc.nextLine());
//					System.out.println(sidies.get(delete_num - 1).name + "취소 되었습니다.");
//					sidies.remove(delete_num - 1);
//				}
//				else if(delete_menu == 3) {
//					for(int i = 0; i < drinks.size(); i++) {
//						System.out.println((i + 1) + "." + drinks.get(i).name);
//					}
//					System.out.print("취소할 품목을 선택해 주세요 : ");
//					int delete_num = Integer.parseInt(sc.nextLine());
//					System.out.println(drinks.get(delete_num - 1).name + "가 취소 되었습니다.");
//					drinks.remove(delete_num);
//				}
//			}
//			else if(sel == 5) {
//				
//				while(true) {
//					System.out.print("정말 주문을 하시겠 습니까? (yes/no) : ");
//					String final_sel = sc.nextLine();
//					if(final_sel.equals("yes")) {
//						
//						System.out.print("결제할때 지불하는 총 금액을 입력해 주세요 : ");
//						my_price = Integer.parseInt(sc.nextLine());
//						
//						int all_price = 0;	
//						for(int i = 0; i < burgers.size(); i++) {
//							burgers.get(i);
//							all_price += burgers.get(i).price;		
//						}
//						for(int i = 0; i < sidies.size(); i++) {
//							burgers.get(i);
//							all_price += sidies.get(i).price;		
//						}
//						for(int i = 0; i < drinks.size(); i++) {
//							burgers.get(i);
//							all_price += drinks.get(i).price;		
//						}
//						
//						//[문제점]  입력한 값이 주문한 값보다 작아도 실행이 안되고 else if문이 바로 실향이 된다.
//						if(my_price < all_price) {
//							System.out.println("주문한 금액을 구매하기에 부족합니다. 금액을 다시 입력해 주세요");	
//						}
//						else if(my_price >= all_price) {
//							
//							System.out.print("영수증을 발행 하시겠습니다? (yes/no)");
//							String recipe = sc.nextLine();
//							if(recipe.equals("yes")) {
//								recipe_is(burgers, sidies,drinks, order_burgers,order_sidies, order_drinks, total_price,my_price);
//								
//							}
//							System.out.println("이용해 주셔서 감사합니다.");
//							break;
//							
//						}
//						
//					
//				}
//			
//				}
//				break;
//			}
//				
//				
//				
//			
//			
//			
//		}
	
		
		
		//자바 상속 문제---------------------------------------------------------------------------------------------------
		//생성자 문제----------------------------------------------------------------------------------------------------
		
		
		/* 가정
		우리는 게임개발회사에 입사했다.
		우리에게는 성격좋은 사수 한명이 있다.
		내가 개발할 게임은 오리시뮬레이션 게임이다.
		선임이 나의 개발을 도와주진 않지만 조언은 해준다.
		*/

		
		
		/* 요구사항
		- D1 요구 : 오리를 생성하고 날게하시오.
		- D1 완료 : 클래스와 메서드를 만들어서 처리
		- D2 요구 : 게임의 디테일을 살리기 위해서 `청둥오리`와 `흰오리`를 생성하고 날게하시오.
		- D2 완료 : 클래스와 메서드를 만들어서 처리
		- D3 요구 : 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.
		- D3 완료 : 상속을 사용해서 처리
		- D4 요구 : 게임의 재미를 위하여 고무오리를 추가하고 날게 하시오.
		- D4 완료 : 클래스와 메서드를 만들어서 처리
		- D5 요구 : 주말 주주회의에서 고무오리가 하늘을 날아다니는 것에 대해서 태클이 들어왔습니다. 고무오리 계열은 하늘을 날 수 없게 해주세요.
		- D5 완료 : 메서드 오버라이드를 사용해서 처리
		- D6 요구 : 고무오리가 반응이 좋습니다. 고무2오리를 추가하고 날게 해주세요.
		*/
		
		
		
		
		오리 a오리 = new 오리();
	    a오리.날다();
	    a오리.헤엄치다();
	    System.out.println("====================");
	    
	    
	    천둥오리 a청둥오리 = new 천둥오리();
	    a청둥오리.날다();
	    a청둥오리.헤엄치다();
	    System.out.println("====================");
	    
	    흰오리 a흰오리 = new 흰오리();
	    a흰오리.날다();
	    a흰오리.헤엄치다();
	    System.out.println("====================");
	    
	    고무오리 a고무오리 = new 고무오리();
	    a고무오리.날다();
	    a고무오리.헤엄치다();
	    System.out.println("====================");
	    
	    고무2오리 a고무2오리 = new 고무2오리();
	    a고무2오리.날다();
	    a고무2오리.헤엄치다();
	    System.out.println("====================");
	    
	    아수라오리 a아수라오리 = new 아수라오리();
	    a아수라오리.날다();
	    a아수라오리.헤엄치다();
	   
	
			
			
	    
		
		
		
//---------			
	}

// 데이터 관리 프로그램 연습 문제--------------------------------------------------------------------------------------
//	public static void saves(int num, ArrayList<String> save) {
//		
//		System.out.println("==================");
//		for(int i = 0; i < save.size(); i++) {
//			System.out.println((i + 1) + "." + save.get(i));
//		}
//		System.out.println("==================");
//		
//	}
	
	
	//자판기 만들기-------------------------------------------------------------------

	
	
	
//	public static void recipe_is(ArrayList<class_burgers> burgers, ArrayList<class_sidies> sidies, ArrayList<class_drink> drinks, 
//			ArrayList<class_burgers> order_burgers, ArrayList<class_sidies> order_sidies, 
//			ArrayList<class_drink> order_drinks, int total_price, int my_price) {
//		System.out.println("===영수증===");
//		//int total_price = 0;
//		System.out.print("버거 :");	
//		for(int i = 0; i < burgers.size(); i++) {
//			System.out.print("[" + burgers.get(i).name + "]" + " ");
//			
//			total_price += burgers.get(i).price;
//			
//		}
//		System.out.println();
//		
//		System.out.print("사이드 :");
//		for(int i = 0; i < sidies.size(); i++) {
//			System.out.print("[" + sidies.get(i).name +"]");
//			total_price += sidies.get(i).price;
//		}
//		System.out.println();
//		
//		System.out.print("음료수 :");
//		for(int i = 0; i < drinks.size(); i++) {
//			System.out.println("[" + drinks.get(i).name + "]");
//			total_price += drinks.get(i).price;
//		}
//		
//		System.out.print("총금액 :");
//		System.out.println(total_price);
//		System.out.println("===거스름돈===");
//		System.out.println(my_price - total_price);
//		
//		
//	}
//	
//	
//	
//	
//	public static int order_print(ArrayList<class_burgers> burgers, ArrayList<class_sidies> sidies, ArrayList<class_drink> drinks, 
//			ArrayList<class_burgers> order_burgers, ArrayList<class_sidies> order_sidies, 
//			ArrayList<class_drink> order_drinks, int total_price) {
//		
//		total_price = 0;
//		System.out.println("===주문목록===");
//		//int total_price = 0;
//		System.out.print("버거 :");	
//		for(int i = 0; i < burgers.size(); i++) {
//			System.out.print("[" + burgers.get(i).name + "]" + " ");
//			
//			total_price += burgers.get(i).price;
//			
//		}
//		System.out.println();
//		
//		System.out.print("사이드 :");
//		for(int i = 0; i < sidies.size(); i++) {
//			System.out.print("[" + sidies.get(i).name +"]");
//			total_price += sidies.get(i).price;
//			
//		}
//		System.out.println();
//		
//		System.out.print("음료수 :");
//		for(int i = 0; i < drinks.size(); i++) {
//			System.out.println("[" + drinks.get(i).name + "]");
//			total_price += drinks.get(i).price;
//			
//		}
//		
//		System.out.print("총금액 :");
//		System.out.println(total_price);
//		
//		return total_price;
//	}
	
	
	
}
//--------

//class Custmer{
//	int age;
//	String name;
//	String live;
//	void introduce() {
//		System.out.println(age + name + live);
//	}		
//}

//class class_burgers{
//	String name;
//	int price;
//}
//class class_sidies{
//	String name;
//	int price;
//}
//class class_drink{
//	String name;
//	int price;
//}

class 오리{
	void 날다() {
		System.out.println("오리가 날개로 날아 갑니다.");
	}
	void 헤엄치다() {
		System.out.println("오리가 오리발로 헤엄칩니다");
	}
}
class 천둥오리 extends 오리{
	
}
class 흰오리 extends 오리{
	
}
class 고무오리 extends 오리{
	void 날다() {
		System.out.println("고무오리는 하늘을 날 수 없습니다.");
	}
	void 헤엄치다() {
		System.out.println("오리가 둥둥 떠다닙니다");
	}
}
class 고무2오리 extends 고무오리{
	
}
class 아수라오리 extends 오리{
	void 헤엄치다() {
		System.out.println("오리가 둥둥 떠다닙니다");
	}
}

