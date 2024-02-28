package ex04.Isolate.ui.code;

import java.util.Scanner;

public class ExamConsole {
	
	private ExamList list = new ExamList();
	
	// 메인 메뉴
	public int inputMenu() {
		Scanner scan = new Scanner(System.in);
		
		// 메인 메뉴 부분
		System.out.println("┌────────────────────────────────┐");
		System.out.println("│          메인 메뉴             │");
		System.out.println("└────────────────────────────────┘");
		System.out.println("\t1.성적입력");
		System.out.println("\t2.성적출력");
		System.out.println("\t3.성적출력범위");
		System.out.println("\t4.종료");
		System.out.print("\t선택>");
		int menu = scan.nextInt();
		
		return menu;
	}
	
	// 생적 입력
	public void inputList() {
		Scanner scan = new Scanner(System.in);
		
		// 성적 입력 부분
		System.out.println("┌────────────────────────────────┐");
		System.out.println("│          성적 입력             │");
		System.out.println("└────────────────────────────────┘");
		
			
		int kor, eng, math;
		
			do{
				System.out.print("국어 :");
				kor = scan.nextInt();
			
				if (kor<0 || 100<kor) {					
					System.out.println("성적범위(0~100)을 벗어났습니다.");
				}
				
			}while(kor<0 || 100<kor);
			
			do{
				System.out.print("영어 :");
				eng = scan.nextInt();
			
				if (eng<0 || 100<eng) {					
					System.out.println("성적범위(0~100)을 벗어났습니다.");
				}
				
			}while(eng<0 || 100<eng);
			
			do{
				System.out.print("수학 :");
				math = scan.nextInt();
			
				if (math<0 || 100<math) {					
					System.out.println("성적범위(0~100)을 벗어났습니다.");
				}
				
			}while(math<0 || 100<math);
			
			/*
			Exam exam = new Exam();
			exam.setKor(kor);
			exam.setEng(eng);
			exam.setMath(math);
			*/
			
			// 생성자 초기화 사용
			Exam exam = new Exam(kor, eng, math);
			
			// 데이터 추가
			list.addExam(exam);
	}	
	
	// 성적 출력 
	public void printList() {
		this.printList(list.getSize());
	}
	
	// 성적 출력 오버로드
	public void printList(int size) {
		// 성적 출력 부분 
		System.out.println("┌────────────────────────────────┐");
		System.out.println("│          성적 출력             │");
		System.out.println("└────────────────────────────────┘");
		
		
		for(int i=0; i<size; i++) {
			
			Exam exam = list.getExam(i);
		
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();
			
			// getTotal 사용
			int total = exam.getTotal();
			
			// getAvg 사용
			float avg = exam.getAvg();
					
			System.out.printf("국어 : %3d\n", kor);
			System.out.printf("영어 : %3d\n", eng);
			System.out.printf("수학 : %3d\n", math);
	
			
			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("─────────────────────────────────");
		}
	}
	
	
}
