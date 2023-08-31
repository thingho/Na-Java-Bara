//for문
/*var sum =0;
for(var i=1; i<=100; i++){
	sum+=i;
}*/

var input = Number(prompt("처음 숫자를 입력하시오","0"));
var input2 = Number(prompt("마지막 숫자를 입력하시오"));
//Math.min(), Math.max()

var num = Math.min(input,input2);
var num2 = Math.max(input,input2);

//삼항식
/*num = (input<input2)? input:input2;
num2 = (input>input2)? input:input2;*/

var sum=0;
for(var i=num; i<=num2; i++){
	sum += i;
}
document.write("input~input2까지의 숫자 합 :",sum,"<br>");


//1. 입력한 숫자까지의 합을 구하시오.
/*var sum =0;
var input = Number(prompt("숫자를 입력하시오"));
for(var i=1; i<=input; i++){
	sum += i;
}
document.write(input+"까지의 숫자 합 :",sum,"<br>");*/


//2. 입력한 숫자까지의 홀수 합만 구하시오
/*var sum =0;
var input = Number(prompt("숫자를 입력하시오"));
for(var i=1; i<=input; i++){
	if(i%2==1){
		sum += i;
	}
}
document.write(input+"까지의 홀수의 합 : ",sum,"<br>");*/