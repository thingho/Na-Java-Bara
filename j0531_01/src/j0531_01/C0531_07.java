package j0531_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class C0531_07 {

	public static void main(String[] args) {
		// student.txt 파일에 쓰기
		List<Student> list = new ArrayList<>();
		list.add(new Student(1,"  홍길동  ",100,100,99)); //trim()을 사용해서 빈공백 제거
		list.add(new Student(2,"유관순",99,99,98));
		list.add(new Student(3,"이순신",88,88,87));
		
//		System.out.printf("%d,%s,%d,%d,%d",list.get(0).getstuNo(),list.get(0).getName(),
//				list.get(0).getKor(),list.get(0).getEng(),list.get(0).getMath());
		
		//파일 저장
		String data = "";		
		for(int i=0;i<list.size();i++) {
			data = String.format("%d,%s,%d,%d,%d\r\n",list.get(0).getstuNo(),list.get(0).getName().trim(),
					list.get(0).getKor(),list.get(0).getEng(),list.get(0).getMath());			
		}
		
		//String data = "1,홍길동,100,100,99\r\n2,유관순,99,99,98\r\n3,이순신,88,88,87\r\n";
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:/savedata/student.txt");
			fw.write(data);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println("파일 작성이 완료되었습니다.");
		
		// student.txt 파일 읽어오기
//		BufferedReader br = null;
//		br = new BufferedReader(new FileReader("c:/savedata/student.txt"));
//		String data ="";
//		while(true) {
//			data = br.readLine();
//			if(data==null) break;
//			System.out.println(data);
//		}
//		br.close();
//		
//		System.out.println("파일 읽어오기 완료!!");
	

	}

}
