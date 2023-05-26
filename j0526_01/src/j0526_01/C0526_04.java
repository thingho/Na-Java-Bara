package j0526_01;

import java.io.FileWriter;

public class C0526_04 {

	public static void main(String[] args) throws Exception {
		FileWriter fw = null; //문자를 저장할 수 있는 객체선언
		fw = new FileWriter("c:/data/stu.txt");
		String[] name = {"홍길동","유관순","이순신","강감찬","김구"};
		String str = null;
		for(int i=0;i<5;i++) {
			str = str + (1001+i)+","+name[i]+",100,100,99 \r\n";
		}
		fw.write(str);
		fw.flush();
		fw.close();
		
		System.out.println("파일이 저장되었습니다.");
	}//main

}//class
