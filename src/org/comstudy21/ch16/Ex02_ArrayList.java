package org.comstudy21.ch16;

import java.util.ArrayList;

class Person{
	private String name;
	private String phone;
	public Person(){}
	public Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person){
			Person p = (Person) obj;
			if(name.equals(p.getName())){
				return true;
			}
		}
		return false;
	}
	
	
}
public class Ex02_ArrayList {

	public static void main(String[] args) {
		ArrayList<Person> plist= new ArrayList<>();
		plist.add(new Person("유인나","010-1234-5678"));
		plist.add(new Person("홍길동","010-1111-1111"));
		plist.add(new Person("김길동","010-2222-2222"));
		plist.add(new Person("강감찬","010-3333-3333"));
		plist.add(new Person("일지매","010-4444-4444"));
		
		//System.out.println(plist);
		Person tmp = new Person("김길동","010-2222-2222");
		System.out.println(tmp.equals(plist.get(2)));
		//개체 ArrayList에서 indexOf를 사용하려면 equals()를 재정의 해야한다.
		System.out.println(plist.indexOf(tmp));
	}
	public static void test(String[] args) {
		// ArrayList는 배열과 유사하다. 값의 중복 허용
		// 요소 접근은 index로 한다.
		ArrayList<String> list = new ArrayList<>();
		list.add("오징어");
		list.add("꼴뚜기");
		list.add("대구");
		list.add("명태");
		list.add("거북이");
		
		System.out.println(list.size());
		System.out.println(list);
		
		//add()는 append() 기능과 insert()기능이 모두 있다.
		list.add(2,"상어");
		System.out.println(list);
		
		System.out.println((list.get(4)));
		System.out.println(list.indexOf("명태"));
		
		//수정 - set()
		list.set(4, "고래");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
	}

}
