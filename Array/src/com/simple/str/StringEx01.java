package com.simple.str;

public class StringEx01 {

	public static void main(java.lang.String[] args) {
		// 문자열 다루기
		
		String a = new String("Happy Java");
		String a1 = "Happy Java"; // 둘다 됨! new String은 일종의 격식치레!
		String b = new String("a b");
		String c = new String("123 456");
		
		// 전체 출력
		System.out.println(a);
		System.out.println(a1);
		System.out.println(b);
		System.out.println(c);

		// N번째 단어를 출력
		System.out.println(a.substring(0, 5));
		System.out.println(a1.substring(6));
		System.out.println(b.charAt(0));
		System.out.println(c.substring(0, 3));
	
		//문자열 비교 기능
		String name1 = new String("Hello");
		String name2 = new String("java");
		String name3 = new String("Hello");
		
		if(name1.equals(name3)) {
			System.out.println("서로 같음");
		}else {
			System.out.println("서로 같지 않음");
			
		}
		String a2 = "Happy java";
		System.out.println(a2.indexOf("Java")); // 6출력
		
		// 문자열이 있는지 없는지 확인: true/false
		if(a2.contains("Java")) {
			System.out.println("있슈");
		}else {
			System.out.println("없슈");
		}
		
		// 위의 문제를 if문을 사용하지 않고 해결하세요.
		// 조건(삼항)연산자 ? :
		System.out.println(a2.contains("Java"));
		
		String result = a2.contains("Java")? "있다" : "없다";
		System.out.println("결과 : "+result);
		
		// 찾아서 바꾸기 : replaceAll
		String a3 = "Hello Java";
		System.out.println(a3.replaceAll("Java", "World"));
		System.out.println(" a3 :"+a3);		
		
		String a4 = a3.replaceAll("Java", "World");
		System.out.println(" a4 :"+a4);
//		
//		a3= a3.replaceAll("Java", "World");
//		System.out.println("a3 : "+a3);
		
		// 문자열 구분해서 추출 
		String a5 = "a:b:c:d";
		String[] result2 = a5.split(":");  // result는 {"a", "b", "c", "d"}
		
		for (String str : result2) {
			System.out.print(str);
		}
		
		}
	
}
