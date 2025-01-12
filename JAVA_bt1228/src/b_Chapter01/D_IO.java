package b_Chapter01;

//자바 패키지 임포트 import
//: 자바 내의 패키지에 있는 Scanner 를 사용하기 위한 경로 지정
import java.util.Scanner;

//자바의 입출력
public class D_IO {

	public static void main(String[] args) {
		
//		입출력
//		입력 : 콘솔 (console) 창을 통해서 개발자로부터 입력을 받는 것
//		출력 : 콘솔 (console) 창으로 데이터를 출력하는 것
		
//		1. 출력
//		System.out.println(출력하고자 하는 변수 또는 상수 또는 데이터값);
		int number = 123;
		float float_number = 1.23456789f;
		System.out.println(number);
		System.out.println(float_number);
		
//		2. 입력
//		Scanner 객체를 사용
//		: 다양한 입력 소스로부터 데이터를 읽어올 수 있는 형태
//		: (System.in) - 해당 콘솔 창에서 표준 입력 스트림을 사용
		Scanner sc = new Scanner(System.in);
//		sc.nextLine(); // 엔터까지의 전체 라인을 문자열로 반환
//		sc.nextInt(); // 정수 데이터 입력
//		sc.nextDouble(); // 실수 데이터 입력
//		sc.next(); // 입력 내용을 문자열로 반환
		
		System.out.println("Enter an integer");
		int sc_number = sc.nextInt(); 		
		System.out.println("Entered integer : " + sc_number);
		
		System.out.println("Enter a double");
		double sc_double = sc.nextDouble();
		System.out.println("Entered Double : " + sc_double);
		
//		Scanner 사용 후에는 스캐너 종료!
		sc.close();
		
//		sc.next(); - Error

	}

}
