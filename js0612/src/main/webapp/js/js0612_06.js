//랜덤함수

//변수선언 방식 : let, var, const
var random = Math.floor(Math.random()*10)+1; //1-100


var input = Number(prompt("1~10까지 숫자를 입력하세요."));

if(input==random){ //=== : 타입까지 같아야 True
	document.write("정답입니다. 정답 : ",random,"<br>");
}else{
	alert("오답입니다. 정답 : ",random,"<br>");
	//document.write("오답입니다. 정답 : ",random,"<br>");
	location.reload();
}