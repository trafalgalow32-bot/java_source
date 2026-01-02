package test;

public class Test1 {

	public static void main(String[] args) {
		// 문제 1
		// 사각형의 너비와 높이는 각각 다음과 같다. 
		// 너비 : 50, 높이 : 20
		// 사각형의 넓이를 계산하여 출력하세요.
		// 변수는 반드시 3개 사용!!
		
		int width = 50;
		int height = 20;
		int square = 0;
		
		square = width * height; // 변수 타입 이미 한 번 선언했으므로 또 선언하지 마셈!!
		System.out.println("사각형의 넓이 : " + square + " ㎠");		
		
		// 문제 2
		// 국어 점수 : 80, 영어 점수 : 70, 수학 점수 : 85
		// 세 과목의 총합을 구하여 출력하세요.
		int kor = 80 , eng = 70, math = 85;
//		int eng = 70; 하나의 타입에 여러 변수(데이터) 매칭 가능!!!!
//		int math = 85;
		int total = 0; 
		float avg = 0;
//		int avg = 0;
		
		total = kor + eng + math; // 총점 구하기
		avg = total / 3.0f; // 평균값 .0으로 나오게 하기 위해 3.0f를 붙임. 원래는 그냥 3으로 해도 됨. 단, avg를 float로 바꾼 거 유의!
		
//		System.out.println("국어 점수 : "+kor+"점"+"\n 영어 점수 : "+eng +"점"+"\n 수학 점수 : "+math+"점");
		System.out.println("총점 : "+total+"점"+" \n 평균 : "+avg+"점");
		
		// 문제 3
		// 1부터 10까지 출력 하세요. (반복문 사용)
		// 단, 5는 숫자를 출력하지 말고 pass 라고 출력하기
		// 결과 화면 예시)
		// 1
		// 2
		// 3
		// 4
		// pass
		// 6
		// 7
		// 8
		// 9
		// 10
		
		// 내가 망친 코드
//		for (int i= 1; i <= 10; i++); {} 중괄호를 안한듯....
//		System.out.println(i);
//		if(i == 5) {
//			i = "pass";
//		}
		
		for(int i=1; i<=10; i++) {
			if ( i == 5 ) {
			System.out.println("pass");
			} else {
			System.out.println(i);
			}
		}
		
	}

}
