package sec04_exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("doget 메소드 호출됨");
		
		//클라이언트가 요청한 파라메터 값들을 인코딩을 설정해주는 코드.
		request.setCharacterEncoding("utf-8"); //request 요청 처리 객체
		//request parameter로 id를 얻어온다(id는 문자이므로 String)
		String id = request.getParameter("id"); 
		String name = request.getParameter("name");
		String pw = request.getParameter("pw");
		
		response.setContentType("text/html; charset=utf-8"); // HTML를 불러 오는 response 객체 
		PrintWriter out = response.getWriter();
		out.println("<h1>아이디 : " + id + "</h1><br/>");
		out.println("<h1>이름 : " + name + "</h1><br/>");
		out.println("<h1>비밀번호 : " + pw + "</h1><br/>");
		
		out.close(); // 리소스를 썻으면 항상 닫아줘라!!!	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 메소드 호출됨");
		
		//클라이언트가 요청한 파라메터 값들을 인코딩을 설정해주는 코드.
		request.setCharacterEncoding("utf-8"); //request 요청 처리 객체
		//request parameter로 id를 얻어온다(id는 문자이므로 String)
		String id = request.getParameter("id"); 
		String name = request.getParameter("name");
		String pw = request.getParameter("pw");
		
		response.setContentType("text/html; charset=utf-8"); // HTML를 불러 오는 response 객체 
		PrintWriter out = response.getWriter();
		out.println("<h1>아이디 : " + id + "</h1><br/>");
		out.println("<h1>이름 : " + name + "</h1><br/>");
		out.println("<h1>비밀번호 : " + pw + "</h1><br/>");
		
		out.close(); // 리소스를 썻으면 항상 닫아줘라!!!	
	}

}
