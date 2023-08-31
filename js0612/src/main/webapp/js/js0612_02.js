/*여러줄 주석 사용 = ctrl + shift + / */
// 한줄 주석 = //

var num=100;
var str="200";
document.write(num+str,"<br>");

var num2=parseInt(str); //parseInt -> 정수형 타입으로 형변환
var num3=Number(str); //Number -> 정수,실수형 모든 타입으로 형변환
var num4=parseFloat(str); //parseFloat -> 실수형 타입으로 형변환
document.write(num+num2,"<br>");
document.write(num+num3,"<br>");