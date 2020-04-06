package mpjava.ch06;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

class MyPoint {
	private int a, b;

	public MyPoint(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Point(" + a + "," + b + ")";
	}

	@Override
	public boolean equals(Object obj) {
		MyPoint p = (MyPoint) obj;
		if (a == p.a && b == p.b)
			return true;
		return false;
	}

}

class Circle {
	private int x, y, radius;

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle(" + x + "," + y + ")반지름" + radius;
	}

	@Override
	public boolean equals(Object obj) {
		Circle c = (Circle) obj;
		if (x == c.x && y == c.y)
			return true;
		return false;
	}

}

class TenSecGame {
	static Scanner scan = new Scanner(System.in);
	int beforeSec, afterSec, result;
	String user;

	public TenSecGame(String user) {
		this.user = user;
	}

	public void game() {
		System.out.print(user + " 시작 <Enter>키>>");
		scan.nextLine();
		Calendar before = Calendar.getInstance();
		this.beforeSec = before.get(Calendar.SECOND);

		System.out.println("현재 초 시간 = " + beforeSec);
		System.out.print("10초 예상 후 <Enter>키>>");
		scan.nextLine();
		Calendar after = Calendar.getInstance();
		this.afterSec = after.get(Calendar.SECOND);
		System.out.println("현재 초 시간 = " + afterSec);
		this.result = Math.abs(beforeSec - afterSec);
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

}

public class Ch06Ex {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String s;
		while(true){
		System.out.print(">>");
		s=scan.nextLine();
		if(s.equals("그만")) break;
		StringTokenizer st = new StringTokenizer(s," ");
		System.out.println("어절 개수는 "+st.countTokens());
		}
		System.out.println("종료합니다...");
	}

	public static void Ex06(String[] args) {
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");

		TenSecGame tsg = new TenSecGame("황기태");
		tsg.game();
		TenSecGame tsg2 = new TenSecGame("이재문");
		tsg2.game();

		String winner;
		winner = (tsg.result == tsg2.result) ? "없음(무승부)"
				: (tsg.result < tsg2.result) ? tsg.user : tsg2.user;
		System.out.println(tsg.user + "의 결과 " + tsg.result + ", " + tsg2.user
				+ "의 결과 " + tsg2.result + ", 승자는 " + winner);

	}

	public static void Ex05(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println("현재 시간은 " + now.get(Calendar.HOUR_OF_DAY) + "시 "
				+ now.get(Calendar.MINUTE) + "분입니다.");
		int hour = now.get(Calendar.HOUR_OF_DAY);
		if (4 <= hour && hour < 12) {
			System.out.println("Good Morning");
		} else if (hour < 18) {
			System.out.println("Good Afternoon");
		} else if (hour < 22) {
			System.out.println("Good Evening");
		} else {
			System.out.println("Good Night");
		}

	}

	public static void Ex02(String[] args) {
		Circle a = new Circle(2, 3, 5); // 중심 (2, 3)에 반지름 5인 원
		Circle b = new Circle(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if (a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");
	}

	public static void Ex01(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		if (p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");
	}

}
