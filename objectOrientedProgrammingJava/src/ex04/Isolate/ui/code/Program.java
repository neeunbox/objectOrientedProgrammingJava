package ex04.Isolate.ui.code;

public class Program {

	public static void main(String[] args) {
		
		ExamConsole list = new ExamConsole();
		
		int menu;
		int size = 2;
		boolean running = true;
		
		while (running) {
			
			menu = list.inputMenu();
			
			switch(menu) {
			case 1:
				list.inputList();
				break;
			case 2:
				list.printList();
				break;
			case 3:
				list.printList(size);
				break;
			case 4:			
				running = false;
				break;
			default:
				System.out.println("메뉴입력 범위는 1~3입니다.");
			}
		}
		
	}
}
