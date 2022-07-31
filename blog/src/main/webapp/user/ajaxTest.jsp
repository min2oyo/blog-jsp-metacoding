<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<button onclick="idCheck()">아이디 있니?</button>
	<div id="box"></div>
	<script>
		function idCheck() {

			const xhttp = new XMLHttpRequest();

			// 통신이 끝나면 콜백
			xhttp.onload = function() {
				// document.getElementById("demo").innerHTML = this.responseText;
				if (this.responseText === "ok") {
					document.querySelector("#box");
					box.innerHTML = "다른 아이디를 사용해야겠군";
				} else {
					alert("해당 아이디를 사용할 수 있습니다.");
				}
			};

			xhttp.open("GET", "http://localhost:8080/blog/ajax", true);
			xhttp.send();

		}
	</script>
</body>
</html>