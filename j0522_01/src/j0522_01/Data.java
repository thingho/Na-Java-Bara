package j0522_01;

public class Data {
	//클래스 이름과 void 없는걸로 생성자를 알 수 있다
	
	//1. 생성자를 만들지 않으면 자동으로 만들어진다 -> Data(){}
	Data(){
		//같은 클래스 내 다른생성자를 호출 -> this()
		this(1,1);
		
//		num1 = 1;
//		num2 = 1;
//		data1 = num1 + num2;
//		data2 = num1 - num2;
//		data3 = num1 * num2;
//		data4 = num1 / num2;
	}
	
	//2. 생성자는 똑같은 이름을 쓸 수 없어 -> 메소드도 마찬가지 (대신 매개변수가 다르면 상관없음)
	Data(int n1, int n2){
		//클래스 내 인스턴스 변수를 가르킴
		this.num1 = num1;
		this.num2 = num2;
		data1 = num1 + num2;
		data2 = num1 - num2;
		data3 = num1 * num2;
		data4 = num1 / num2;
	}
	
	int num1; //입력을 받을 첫 번째 숫자
	int num2; //입력을 받을 두 번째 숫자
	int data1; //두 수 더하기
	int data2; //두 수 빼기
	int data3; //두 수 곱하기
	int data4; //두 수 나누기

	

}
