<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<form action="/blog/user?cmd=join" method="post">

		<div class="form-group">
			<input type="text" class="form-control" name="username" placeholder="Enter Username" required />
		</div>

		<div class="form-group">
			<input type="password" class="form-control" name="password" placeholder="Enter Password" required />
		</div>

		<div class="form-group">
			<input type="email" class="form-control" name="email" placeholder="Enter Email" required />
		</div>

		<div class="form-group">
			<input type="text" class="form-control" name="address" placeholder="Enter Address" required />
		</div>

		<button type="submit" class="btn btn-primary">회원가입 완료</button>

	</form>
</div>

</body>
</html>