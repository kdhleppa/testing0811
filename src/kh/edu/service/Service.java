package kh.edu.service;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import kh.edu.model.vo.Menu;

public class Service {
	
	private Scanner sc = new Scanner(System.in);
	
	// 나라별 리스트를 따로 만들지
	// 그냥 왕창 넣을지 고민중
	// 왕창 넣자
	private List<Menu> MenuList = new LinkedList<Menu>();
	
	//더미데이터 넣기
	public Service() {
		MenuList.add(new Menu("제육", 9000, 1, "KO"));
		MenuList.add(new Menu("오볶", 9000, 2, "KO"));
		MenuList.add(new Menu("백반", 9000, 3, "KO"));
		MenuList.add(new Menu("짜장", 9000, 4, "CN"));
		MenuList.add(new Menu("짬뽕", 9000, 5, "CN"));
		MenuList.add(new Menu("짬짜", 9000, 6, "CN"));
		MenuList.add(new Menu("초밥", 9000, 7, "JP"));
		MenuList.add(new Menu("회덮밥", 9000, 8, "JP"));
		MenuList.add(new Menu("모밀", 9000, 9, "JP"));
		MenuList.add(new Menu("파스타", 9000, 10, "EU"));
		MenuList.add(new Menu("스테이크", 9000, 11, "EU"));
		MenuList.add(new Menu("리조또", 9000, 12, "EU"));
		
	}
	public void dp() {
		int input = 0;
		
		
		do {
			System.out.println("1. 한식 메뉴보기");
			System.out.println("2. 중식 메뉴보기");
			System.out.println("3. 일식 메뉴보기");
			System.out.println("4. 양식 메뉴보기");
			System.out.println("9. 점심메뉴 랜덤 선택");
			System.out.println("0. 종료");
			System.out.print("\n번호 선택 : ");
		 try {
			input = sc.nextInt();
			System.out.println();
			
			switch(input) {
			case 1 : korean(); break;
			case 2 : chinese(); break;
			case 3 : japanese(); break;
			case 4 : western(); break;
			case 5 : findAll(); break; 
			case 9 : random(); break;
			case 0 : System.out.println("종료합니다."); break;
			default : System.out.println("잘못입력했습니다.");
			}
			
		 } catch(InputMismatchException e) {
				System.out.print("\n잘못입력했습니다.");
				sc.nextLine();
				input = -1;
			}
		
	} while(input != 0);
	
	}
	
	public void korean() {
		int input = 0;
		String newFoodName = "";
		int newFoodPrice = 0;
		int newMenuNum = 0;
		String newNational = "KR";
		
	    for (int i = 0; i< MenuList.size(); i++) {

	    	if (MenuList.get(i).getNational().equals("KO")) {
	    	   	System.out.println(MenuList.get(i));
	    	   	
	    	}
	    }
	    
	    do {
	    	System.out.println();
			System.out.println("1. 메뉴 추가");
			System.out.println("2. 메뉴 삭제");
			System.out.println("0. 종료");
			System.out.print("\n번호 선택 : ");
		 try {
			input = sc.nextInt();
			System.out.println();
			
			switch(input) {
			case 1 :
				System.out.println("입력할 메뉴정보");
				System.out.print("메뉴 이름 : ");
				newFoodName = sc.next(); 
				System.out.print("메뉴 가격(숫자만) : ");
				newFoodPrice = sc.nextInt(); 
				System.out.print("메뉴 번호(중복금지) : ");
				newMenuNum = sc.nextInt();
				for (int i = 0; i < MenuList.size(); i++) {
					if ( MenuList.get(i).getMenuNum() != newMenuNum) {
						
						MenuList.add(new Menu(newFoodName, newFoodPrice, newMenuNum));
					} else if (MenuList.get(i).getMenuNum() == newMenuNum) {
						
						
					}
				}
				
				break;
			case 2 :
				System.out.print("제거할 메뉴의 메뉴번호 : ");
				input = sc.nextInt();
				
				if (MenuList.isEmpty()) {
					System.out.println("정보없음");
				} else if (input <0) {
					System.out.println("0보다 큰 수를 입력하세요");
				} else if (input >=MenuList.size()) {
					System.out.println("범위 초과");
				} else if (MenuList.get(input-1).getNational() != "KO") {
					System.out.println("한식 중에서 골라주세요");
				} else {
					for (int i = 0; i < MenuList.size(); i ++) {
						if (MenuList.get(i).getMenuNum() == input) {
							MenuList.remove(i);
							System.out.println("제거되었습니다.");
							break;
						}
					}
				}
				
				break;
			case 0 : System.out.println("종료합니다."); break;
			default : System.out.println("잘못입력했습니다.");
			}
			
		 } catch(InputMismatchException e) {
				System.out.print("\n잘못입력했습니다.");
				sc.nextLine();
				input = -1;
			}
		
	} while(input != 0);
	}
	public void japanese() {
		int input = 0;
		String newFoodName = "";
		int newFoodPrice = 0;
		int newMenuNum = 0;
		String newNational = "JP";
		
		for (int i = 0; i< MenuList.size(); i++) {
			
			if (MenuList.get(i).getNational().equals("JP")) {
				System.out.println(MenuList.get(i));
				
			}
		}
		
		do {
			System.out.println();
			System.out.println("1. 메뉴 추가");
			System.out.println("2. 메뉴 삭제");
			System.out.println("0. 종료");
			System.out.print("\n번호 선택 : ");
			try {
				input = sc.nextInt();
				System.out.println();
				
				switch(input) {
				case 1 :
					System.out.println("입력할 메뉴정보");
					System.out.print("메뉴 이름 : ");
					newFoodName = sc.next(); 
					System.out.print("메뉴 가격(숫자만) : ");
					newFoodPrice = sc.nextInt(); 
					System.out.print("메뉴 번호(중복금지) : ");
					newMenuNum = sc.nextInt(); 
					
					MenuList.add(new Menu(newFoodName, newFoodPrice, newMenuNum));
					
					break;
				case 2 :
					System.out.print("제거할 메뉴의 메뉴번호 : ");
					input = sc.nextInt();
					
					if (MenuList.isEmpty()) {
						System.out.println("정보없음");
					} else if (input <0) {
						System.out.println("0보다 큰 수를 입력하세요");
					} else if (input >=MenuList.size()) {
						System.out.println("범위 초과");
					} else if (MenuList.get(input-1).getNational() != "JP") {
						System.out.println("일식 중에서 골라주세요");
					} else {
						for (int i = 0; i < MenuList.size(); i ++) {
							if (MenuList.get(i).getMenuNum() == input) {
								MenuList.remove(i);
								System.out.println("제거되었습니다.");
								break;
							}
						}
					}
					
					break;
				case 0 : System.out.println("종료합니다."); break;
				default : System.out.println("잘못입력했습니다.");
				}
				
			} catch(InputMismatchException e) {
				System.out.print("\n잘못입력했습니다.");
				sc.nextLine();
				input = -1;
			}
			
		} while(input != 0);
	}
	public void chinese() {
		int input = 0;
		String newFoodName = "";
		int newFoodPrice = 0;
		int newMenuNum = 0;
		String newNational = "CN";
		
		for (int i = 0; i< MenuList.size(); i++) {
			
			if (MenuList.get(i).getNational().equals("CN")) {
				System.out.println(MenuList.get(i));
				
			}
		}
		
		do {
			System.out.println();
			System.out.println("1. 메뉴 추가");
			System.out.println("2. 메뉴 삭제");
			System.out.println("0. 종료");
			System.out.print("\n번호 선택 : ");
			try {
				input = sc.nextInt();
				System.out.println();
				
				switch(input) {
				case 1 :
					System.out.println("입력할 메뉴정보");
					System.out.print("메뉴 이름 : ");
					newFoodName = sc.next(); 
					System.out.print("메뉴 가격(숫자만) : ");
					newFoodPrice = sc.nextInt(); 
					System.out.print("메뉴 번호(중복금지) : ");
					newMenuNum = sc.nextInt(); 
					
					MenuList.add(new Menu(newFoodName, newFoodPrice, newMenuNum));
					
					break;
				case 2 :
					System.out.print("제거할 메뉴의 메뉴번호 : ");
					input = sc.nextInt();
					
					if (MenuList.isEmpty()) {
						System.out.println("정보없음");
					} else if (input <0) {
						System.out.println("0보다 큰 수를 입력하세요");
					} else if (input >=MenuList.size()) {
						System.out.println("범위 초과");
					} else if (MenuList.get(input-1).getNational() != "CN") {
						System.out.println("중식 중에서 골라주세요");
					} else {
						for (int i = 0; i < MenuList.size(); i ++) {
							if (MenuList.get(i).getMenuNum() == input) {
								MenuList.remove(i);
								System.out.println("제거되었습니다.");
								break;
							}
						}
					}
					
					break;
				case 0 : System.out.println("종료합니다."); break;
				default : System.out.println("잘못입력했습니다.");
				}
				
			} catch(InputMismatchException e) {
				System.out.print("\n잘못입력했습니다.");
				sc.nextLine();
				input = -1;
			}
			
		} while(input != 0);
	}
	public void western() {
		int input = 0;
		String newFoodName = "";
		int newFoodPrice = 0;
		int newMenuNum = 0;
		String newNational = "EU";
		
		for (int i = 0; i< MenuList.size(); i++) {
			
			if (MenuList.get(i).getNational().equals("EU")) {
				System.out.println(MenuList.get(i));
				
			}
		}
		
		do {
			System.out.println();
			System.out.println("1. 메뉴 추가");
			System.out.println("2. 메뉴 삭제");
			System.out.println("0. 종료");
			System.out.print("\n번호 선택 : ");
			try {
				input = sc.nextInt();
				System.out.println();
				
				switch(input) {
				case 1 :
					System.out.println("입력할 메뉴정보");
					System.out.print("메뉴 이름 : ");
					newFoodName = sc.next(); 
					System.out.print("메뉴 가격(숫자만) : ");
					newFoodPrice = sc.nextInt(); 
					System.out.print("메뉴 번호(중복금지) : ");
					newMenuNum = sc.nextInt(); 
					
					MenuList.add(new Menu(newFoodName, newFoodPrice, newMenuNum));
					
					break;
				case 2 :
					System.out.print("제거할 메뉴의 메뉴번호 : ");
					input = sc.nextInt();
					
					if (MenuList.isEmpty()) {
						System.out.println("정보없음");
					} else if (input <0) {
						System.out.println("0보다 큰 수를 입력하세요");
					} else if (input >=MenuList.size()) {
						System.out.println("범위 초과");
					} else if (MenuList.get(input-1).getNational() != "EU") {
						System.out.println("중식 중에서 골라주세요");
					} else {
						for (int i = 0; i < MenuList.size(); i ++) {
							if (MenuList.get(i).getMenuNum() == input) {
								MenuList.remove(i);
								System.out.println("제거되었습니다.");
								break;
							}
						}
					}
					
					break;
				case 0 : System.out.println("종료합니다."); break;
				default : System.out.println("잘못입력했습니다.");
				}
				
			} catch(InputMismatchException e) {
				System.out.print("\n잘못입력했습니다.");
				sc.nextLine();
				input = -1;
			}
			
		} while(input != 0);
	}
	
	public void findAll() {
		for (int i = 0; i < MenuList.size(); i++) {
			System.out.println(MenuList.get(i));
		}
	}
	
	public void random() {
		int[] randomArr = new int[MenuList.size()];
		for (int i = 0; i < MenuList.size(); i++) {
			randomArr[i]= MenuList.get(i).getMenuNum();
		}
		Random rm = new Random();
		int randomI = rm.nextInt(randomArr.length);
		int randomNum = randomArr[randomI];
		
		System.out.println("---오늘의 점심메뉴---");
		System.out.println(MenuList.get(randomNum));
		System.out.println();
	}
	
}
