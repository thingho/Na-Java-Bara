package j0526_01;

public class C0526_11 {

	public static void main(String[] args) {
		String data1 = "1001,홍길동,100,100,99";
		
		//배열롤 담아 출력하시오
		String[] result = data1.split(",");
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		System.out.println(result[3]);
		System.out.println(result[4]);
		//String문자열을 int로 변환
		int stuNo = Integer.parseInt(result[0]);
		String name = result[1]; 
		int kor = Integer.parseInt(result[2]);
		int eng = Integer.parseInt(result[3]);
		int math = Integer.parseInt(result[4]);
//		Double.parseDouble(result[2]);
//		Long.parseLong(result[3]);
		System.out.println();
		
		Student s = new Student(stuNo, name, kor, eng, math);
		//total, avg 출력		
		System.out.println(s.getTotal());
		System.out.println(s.getAvg());
		
		String[] check_info = new String[1];
		check_info[0] = "HTML";
//		check_info[1] = "CSS";
//		check_info[2] = "wenDesign";
		
		String info3="";
		for(int i=0;i<check_info.length;i++) {
			if(i==0)info3 =check_info[i];
			else info3 = ","+check_info[i];
//			info3= info3+check_info[i]+",";
		}

		System.out.println(info3);
		
//		String info1 = ""+check_info[0]+","+check_info[1]+","+check_info[2];
//		String info = "HTML,CSS,webDesign";
		
	}

}
