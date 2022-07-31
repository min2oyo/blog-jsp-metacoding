package com.cos.blog.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.blog.domain.user.dto.JoinReqDto;
import com.cos.blog.domain.user.dto.LoginReqDto;
import com.cos.blog.service.UserService;
import com.cos.blog.util.Script;

@WebServlet("/user")
public class UserController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public UserController() {

		super();

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doProcess(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doProcess(request, response);

	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String cmd = request.getParameter("cmd");
		UserService userService = new UserService();

		// 로그인 페이지
		if (cmd.equals("loginForm")) {

			response.sendRedirect("user/loginForm.jsp");

			// 로그인
		} else if (cmd.equals("login")) {

			LoginReqDto dto = new LoginReqDto();
			String username = request.getParameter("username");
			String password = request.getParameter("password");

			dto.setUsername(username);
			dto.setPassword(password);

			userService.로그인(dto);

			// 회원가입 페이지
		} else if (cmd.equals("joinForm")) {

			response.sendRedirect("user/joinForm.jsp");

			// 회원가입
		} else if (cmd.equals("join")) {

			JoinReqDto dto = new JoinReqDto();
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			String address = request.getParameter("address");

			dto.setUsername(username);
			dto.setPassword(password);
			dto.setEmail(email);
			dto.setAddress(address);

			int result = userService.회원가입(dto);

			if (result == 1) {

				response.sendRedirect("index.jsp");

			} else {

				Script.back(response, "회원가입 실패");

			}

		}

	}

}
