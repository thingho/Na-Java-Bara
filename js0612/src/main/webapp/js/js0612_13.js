//open 함수
function pop(){
	alert("함수 pop()이 연결되었습니다."); //경고창 띄우기
	window.open("popup.html","pop1",
				"width=400, height=600,left=0,top=0"); //새창 띄우기
}

function dataDelete(){
	//alert("삭제함수가 호출되었습니다."); //경고창 띄우기
	if(confirm("게시글을 삭제하시겠습니까?")){
		alert("게시글이 삭제되었습니다.");
		//삭제코드를 추가하면 됨
	}else{
		alert("삭제가 취소되었습니다.");
		//기존 페이지로 이동하면 됨 
	}
}