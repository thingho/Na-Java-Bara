/**
 * setInterval
 */
var count=0;
var interval;

//setInterval 추가
function setIn(){
	var htmlData = "";
	htmlData += "<tr>";
	htmlData += "<td>";
	htmlData += "1";
	htmlData += "</td>";
	htmlData += "</tr>";
	
	$("#t01").append(htmlData);	
	
	
	interval = 	setInterval(function(){
		count += 1;
		console.log("숫자 : ",count);
	},1000); //1000 = 1초
}

//setInterval 삭제
function setOut(){
	console.log("멈춤");
	clearInterval(interval);
}

 
 
 