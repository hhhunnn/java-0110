package c_Chapter02;

import java.util.Scanner;

// 조건문 (Condition)
// : 프로그램의 흐름을 제어하는 데 사용되는 기본적인 구조 중 하나

// : 자바의 조건문 종류
// : if, else, else if, switch 등

public class A_If {

	public static void main(String[] args) {

//		1. if 문
//		: 조건에 따라 실행시키고자 하는 로직(프로세스)이 다를 때 사용하는 구문
//		: 조건이 true 일 때 실행할 코드를 지정하는 구문

//		if 문 기본 구조
//		if (조건-'새 라면') {
//			: 조건이 true 일 때 실행할 코드
//			: '날 수 있다'
//		}

//		: 조건은 true / false 의 결과를 반환하는 boolean 형태의 표현식

		int age = 20;
		if (age > 19) {
//			중괄호 안의 코드 블럭은 들여쓰기가 기본
//			조건이 true 일 경우에만 {} 안에 작성한 코드 블럭이 실행
			System.out.println("성인입니다.");
		}

//		if 문의 경우 코드 블럭에 오는 코드가 하나의 구문이면 {} 생략 가능
		if (age > 19)
			System.out.println("성인입니다.");

		System.out.println("조건 검사 완료");
		System.out.println("===========================");

//		2. if-else 문
//		: 조건이 true 일 경우와 false 일 때 실행되는 코드를 각각 지정한 구문
//		: if 문의 조건이 거짓일 경우에만 실행할 코드 블럭을 결정

		if (age > 19) {
			System.out.println("성인입니다.");
		} else { // if 문의 조건식이 false 일 때가 else 문의 조건
			System.out.println("미성년자입니다.");
		}

//		조건에 따른 실행 코드가 한 줄일 경우에만 사용 가능한 구조
		if (age > 19)
			System.out.println("성인입니다.");
		else
			System.out.println("미성년자입니다.");
		
		System.out.println("===========================");

//		3. 중첩 if 문
//		: if 문 혹은 else 문의 코드 블럭 안에 if 문을 작성
		
//		입력기 sc 를 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		
//		생성한 입력기를 실행
		age = sc.nextInt();
		
		if (age <= 19) {
			System.out.println("미성년자입니다.");
//			age 변수에는 19 이하의 수만 작성 가능
			if (age <= 13) {
//				첫 번째 조건이 참이고 두 번째 조건도 참인 코드 블럭
				System.out.println("어린이입니다.");
			} else {
//				첫 번째 조건이 참이고 두 번째 조건은 거짓인 코드 블럭
//				13 초과 19 미만의 값
				System.out.println("청소년입니다.");
			}
		}else {
			System.out.println("성인입니다.");
		}
		
		
		System.out.println("===========================");
		
//		4. else if 문
//		: 여러 조건을 순차적으로 테스트할 때 사용
//		: if 문 뒤에 나오며, 여러 개를 연속해서 사용 가능
		
		if (age > 19) {
			System.out.println("성인입니다.");
//		별도의 조건을 가지는 문장으로
//		첫 번째 조건은 거짓이면서 두 번째 조건은 참인 문장을 실행
		} else if (age <= 13) {
			System.out.println("어린이입니다.");
//		모든 조건식이 거짓일 때 실행
		} else {
			System.out.println("청소년입니다.");
		}
		
//		if 문 예제 실습 - 학점 계산기
//		점수 : 0 ~ 100점
//		90 ~ 100 : A
//		80 ~ 89 : B
//		70 ~ 79 : C
//		60 ~ 69 : D
//		59미만 : F
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		
//		여러 문자열을 담는 참조형 데이터 타입 String
		String result;
		
		if(score < 0 || score > 100) {
			System.out.println("점수는 0 ~ 100점 사이여야 합니다.");
			result = "계산 불가";
		}else if(score > 89) {
			System.out.println("90점대 입니다.");
			result = "A";
		}else if(score > 79) {
			System.out.println("80점대 입니다.");
			result = "B";
		}else if(score > 69) {
			System.out.println("70점대 입니다.");
			result = "C";
		}else if(score > 59) {
			System.out.println("60점대 입니다.");
			result = "D";
		}else {
			System.out.println("0 ~ 59점대 입니다.");
			result = "E";
		}
		
//		출력문 안에서 문자열("")과 변수를 같이 작성할 경우에는
//		+ 기호를 사용하여 이음을 표시
		System.out.println("결과 : " + result);
		
		System.out.println("===========================");
		
//		if 문 예제 실습 - 함수 위치 구하기
		Scanner functionData = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
//		참조 자료형
//		: 변수에 직접적인 데이터X, 해당 데이터가 저장된 메모리 주소
//		: 초기화하지 않고 사용할 경우 컴파일 오류 발생 가능
//		: 기본 초기화 값
//			- null
//			- 메모리 상의 어떠한데이터 객체도 담고 있지 않음.
		String funcResult = null;
		
		System.out.println("x값을 입력하세요.");
		x = functionData.nextInt();
		System.out.println("y값을 입력하세요.");
		y = functionData.nextInt();
		
//		if 조건문 작성
//		x, y 양수 : 제1사분면
//		x는 음수, y는 양수 : 제2사분면
//		x, y 음수 : 제3사분면
//		x는 양수, y는 음수 : 제4사분면
		if(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				funcResult = "제 1사분면";
			}else if(x < 0 && y > 0) {
				funcResult = "제 2사분면";
			}else if(x < 0 && y < 0) {
				funcResult = "제 3사분면";
			}else {
				funcResult = "제 4사분면";
			}
			System.out.println("결과 : " + funcResult);
		}else {
			System.out.println("그래프 위");
		}
		/*
		if(x > 0 && y > 0) {
			funcResult = "제1사분면";
		}else if(x < 0 && y > 0) {
			funcResult = "제2사분면";
		}else if(x < 0 && y < 0) {
			funcResult = "제3사분면";
		}else {
			funcResult = "제4사분면";
		}
		System.out.println("결과 : " + funcResult);
		*/
		
		
		sc.close();
		scan.close();
		functionData.close();

	}

}
