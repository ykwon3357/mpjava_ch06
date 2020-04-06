package org.comstudy21.ch16;

import java.util.Hashtable;
import java.util.Scanner;

interface View{
	void display();
}
class Input implements View{

	@Override
	public void display() {
		System.out.println("::: 입력 기능 :::");
	}
	
}
class Output implements View{

	@Override
	public void display() {
		System.out.println("::: 출력 기능 :::");
	}
	
}
class End implements View{

	@Override
	public void display() {
		System.out.println("::: 프로그램 종료 :::");
		System.exit(0);
	}
	
}

public class Ex03_Map {
	static Hashtable<Integer, View> mapping = new Hashtable<>();
	static{
		mapping.put(1, new Input());
		mapping.put(2, new Output());
		mapping.put(3, new End());
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("입력(1), 출력(2), 종료(3) >>> ");
			int no = scan.nextInt();
			if (no < 1 || no > mapping.size()) {
				System.out.println("잘못된 입력입니다.");
			} else {
				mapping.get(no).display();
			} 
		}
		
		
	}
	public static void test(String[] args) {
		//Map인터페이스 를 상속받아 HastTable 컬렉션 클래스 만들었음
		//Key : Value의 쌍으로 요소가 구성 된다.
		Hashtable<String, String> map = new Hashtable<>();
		map.put("홍길동", "010-1111-1111");
		map.put("김길동", "010-2222-2222");
		map.put("홍길순", "010-3333-3333");
		map.put("박길동", "010-4444-4444");
		//System.out.println(map);
		System.out.println(map.get("김길동"));
		
	}

}
