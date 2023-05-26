package j0526_01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class C0526_02 {

	public static void main(String[] args) throws Exception {
		//File file = new File("C:/data/test.txt"); //파일 생성
		//file.createNewFile(); //파일을 생성해주세요
		FileWriter writer = null;
		writer = new FileWriter("C:/data/test.txt");  //파일을 생성해서 글자를 저장
		String str = "[스포츠조선 노주환 기자]발렌시아 유스 출신 이강인(22·마요르카)이 친정팀 상대로 다시 비수를 꽂았다. \r\n"
				+ "\r\n"
				+"정확한 '택배' 크로스가 마요르카 공격수 무리키의 헤더 결승골로 이어졌다. 무리키가 먹기 좋게 떠먹여준 것이나 마찬가지였다. \r\n"
				+ "\r\n"
				+ "무리키도 골을 넣고 포옹한 이강인을 손가락으로 가리켰다.";
		writer.write(str);
		writer.close();
		System.out.println("글자가 저장되었습니다.");
	}

}
