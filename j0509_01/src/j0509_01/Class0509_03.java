package j0509_01;

import java.util.Scanner;

public class Class0509_03 {

	public static void main(String[] args) {
		double kor = 99;
		double eng = 98;
		double math = 100;
		String name = "홍길동";
		
		// 데이터 입력 Scanner - 화면에서 입력을 받음.
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		// 단어만 가능한 경우 next()
		name = scan.next();
		// name = scan.nextline(); -> 한 라인을 모두 가능
		System.out.println("국어 점수를 입력하세요");
		kor = scan.nextDouble();
		System.out.println("영어 점수를 입력하세요");
		eng = scan.nextDouble();
		System.out.println("수학 점수를 입력하세요");
		math = scan.nextDouble();
		
		double total = kor+eng+math;
		double avg = total/3.0;
		
		System.out.println("-----------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%s\t%.2f점\t%.2f점\t%.2f점\t%.2f점\t%.2f점 \n", name, kor, eng, math, total, avg);
		System.out.println("-----------------------------------------------------");
	}

}

// 자동 완성 기능 사용하기 -> ctrl + 스페이스바