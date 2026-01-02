package com.simple.loop;

public class LoopWhile {

	public static void main(String[] args) {
		// while : 
		int i;
		for (i=0; i <10; i++) {
			
			System.out.println(" i :" + (i+1));
		}
		
		System.out.println("");
		i=0;
		while (i<10) {
			i++;
			System.out.println("1 : "+ i);
		}
		// 1부터 n까지의 숫자를 더해가면서 그 합이 100이상이 넘을
		// 때까지 반복하시오. 
		
			System.out.println("");
		i=0;	
		int sum=0;
		int count=0;
		int finalCount=0;
		
		while(sum < 100) { //합이 100미만인 동안 반복
			sum = sum + i;
			System.out.println("합계 :"+sum);
			System.out.println("i :"+i);
			i++;
			finalCount = count++; // 이렇게도 가능, ++는 count 뒤에 써야! 
			// count++; // 다른 방법 : count = count + 1; count += 1;
		}
		
		System.out.println("");
		
		//반복횟수 출력
		System.out.println("반복횟수: "+count);
		System.out.println("최종반복횟수: "+finalCount);
		
	}
		
}


