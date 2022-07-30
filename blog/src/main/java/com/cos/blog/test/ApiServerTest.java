package com.cos.blog.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// localhost:8080/blog/test (GET, POST)
@WebServlet("/test")
public class ApiServerTest extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public ApiServerTest() {

		super();

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		request.setCharacterEncoding("utf-8");
//
//		String mime = request.getContentType();
//		System.out.println(mime);
//
//		if (mime.equals("application/json")) {
//
//			String input;
//			BufferedReader br = request.getReader();
//			StringBuffer buffer = new StringBuffer();
//
//			while ((input = br.readLine()) != null) {
//				buffer.append(input);
//			}
//
//			System.out.println(buffer.toString());
//
//		} else {
//
//			String food = request.getParameter("food");
//			String method = request.getParameter("method");
//
//			System.out.println(food);
//			System.out.println(method);
//
//		}

		// DB에 insert하고 끝
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<html>");
		out.println("<h1>안녕</h1>");
		out.println("</body>");
		out.println("</html>");
		out.flush();

	}

}
