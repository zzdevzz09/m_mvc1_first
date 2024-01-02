package hello.servlet.basic;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
	
	// servlet이 호출되면 이 service 메소드가 호출됨
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HelloServlet.service");
		System.out.println("request = " + request);
		System.out.println("response = " + response);
		
		String username = request.getParameter("username");
		System.out.println("username = " + username);
		
		response.setContentType("text/plan");
		response.setCharacterEncoding("utf-8");
		response.getWriter().write("hello " + username);
		
	}
}
