/**
 * 시간 가져오기
 */

var a = 0; //변수
let aaa = 0; //변수
const bbb = 0; //상수 


function start(){
	interval = setInterval(function(){
		var today = new Date(); //객체선언
		var hours = today.getHours();
		var minutes = today.getMinutes();
		var seconds = today.getSeconds();
		var seconds2;
		if(seconds<10) seconds2 ="0"+seconds;
		else seconds2 = seconds;
		var milliseconds = today.getMilliseconds();
		document.getElementById("h01").innerText= hours+":"+minutes+":"+seconds;		
	},1000);
}

function stop(){
	
}

 
 
 