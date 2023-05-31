package j0531_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class C0531_06 {

	public static void main(String[] args) {
		// 파일 읽어오기 student.txt;
		int stuNo=0;
		String name="";
		int kor=0,eng=0,math=0;
		List<Student> list = new ArrayList<>();
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("c:/savedata/student.txt"));
			String data ="";
			while(true) {
				data = br.readLine();
				if(data==null) break; //data="1,홍길동,100,100,99";
				String[] dataArr = data.split(","); //1,홍길동,100,100,99 
				System.out.println(data);
				
				stuNo = Integer.parseInt(dataArr[0]);
				name = dataArr[1];
				kor = Integer.parseInt(dataArr[2]);
				eng = Integer.parseInt(dataArr[3]);
				math = Integer.parseInt(dataArr[4]);
				list.add(new Student(stuNo,name,kor,eng,math));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		//파일 읽어오기
		System.out.println();

	}//main

}//class
