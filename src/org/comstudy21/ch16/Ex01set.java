package org.comstudy21.ch16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Ex01set {

	public static void main(String[] args) {
		//문제: set을 이용해서 로또번호생성기 만들어 본다.
		Set<Integer> lotto = new HashSet<>();
		Random rand = new Random();
//		while(true){
//			lotto.add(rand.nextInt(45)+1);
//			if(lotto.size()>5)
//				break;
//		}
		while(lotto.size()<6){
			lotto.add(1+rand.nextInt(45));
		}
		System.out.println(lotto);
//		Iterator<Integer> iterator = lotto.iterator();
//		while(iterator.hasNext()){
//			System.out.println(iterator.next());
//			}
		
		
	}
	public static void test(String[] args) {
		//key도 없고 index도 없는 Set구조
		//Value의 중복이 없다.
		// <> 기호는 제네릭: 사용될 타입을 고정시킨다.
		Set<String> set = new HashSet<String>();
		set.add("오징어");
		set.add("꼴뚜기");
		set.add("대구");
		set.add("명태");
		set.add("거북이");
		set.add("명태");
		
		System.out.println("set의 크기: "+set.size());
		//열거자로 반환
//		Iterator<String> iterator = set.iterator();
//		while(iterator.hasNext()){
//			System.out.println(iterator.next());
//		}
		
		//배열로 변환
		String[] arr = new String[set.size()];
		set.toArray(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}


}
