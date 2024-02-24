package ex01.encapsulation;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		ExamList list = new ExamList();
		ExamList.init(list);
		
		
		int menu;
		int size = 2;
		boolean running = true;
		
		while (running) {
			
			menu = inputMenu();
			
			switch(menu) {
			case 1:
				ExamList.inputList(list);
				break;
			case 2:
				ExamList.printList(list);
				break;
			case 3:
				ExamList.printList(list, size);
				break;
			case 4:			
				running = false;
				break;
			default:
				System.out.println("메뉴입력 범위는 1~3입니다.");
			}
		}
		
	}

	public static int inputMenu() {
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

	 

}
