//학생처리 프로그램
var htmlData ="";
var today = new Date();


/*htmlData += "<h2>학생성적 처리 프로그램</h2>";
htmlData += "<table>";
htmlData += "<table><colgroup><col width='8%'><col width='14%'><col width='8%'><col width='8%'><col width='8%'><col width='10%'><col width='10%'><col width='7%'><col width='15%'><col width='12%'></colgroup>";
htmlData += "<tr><th>학번</th><th>이름</th><th>국어</th><th>영어</th><th>수학</th><th>합계</th><th>평균</th><th>등수</th><th>작성일</th><th>작성자</th></tr>";*/


for(var i=0; i<10; i++){
	//81~100 랜덤함수를 이용하여 출력하시오.
	var kor = Math.floor(Math.random()*20)+81;
	var eng = Math.floor(Math.random()*20)+81;
	var math = Math.floor(Math.random()*20)+81;
	var total = kor+ eng + math; 
	var avg = (total/3.0).toFixed(2); 
	
	htmlData += "<tr>";
	htmlData += "<td>"+(i+1)+"</td>";
	htmlData += "<td>홍길동</td>";
	htmlData += "<td>"+kor+"</td>";
	htmlData += "<td>"+eng+"</td>";
	htmlData += "<td>"+math+"</td>";
	htmlData += "<td>"+total+"</td>";
	htmlData += "<td>"+avg+"</td>";
	htmlData += "<td>1</td>";
	htmlData += "<td>"+today+"</td>";
	htmlData += "<td>홍길동</td>";
	htmlData += "</tr>";
	}
document.getElementById('tbody').innerHTML=htmlData;
	
	
/*htmlData += "</table>";

document.write(htmlData);*/

