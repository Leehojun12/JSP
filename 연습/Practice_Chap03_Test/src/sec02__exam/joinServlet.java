package sec02__exam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/join")
public class joinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    
    public joinServlet() {
        super();
    
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost() 메서드 호출");
		
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String pwconfirm = request.getParameter("pwconfirm");
		
		String[] hobby = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		String college = request.getParameter("college");
				
		response.setContentType("text/html; charset= UTF-8"); 
		PrintWriter out = response.getWriter();
		
		if(!pw.equals(pwconfirm)) {
			out.println("<h3> 비밀번호가 일치하지 않습니다. 확인해주세요!</h3>");
			return;
		}
		
		out.println("<html><head></head><body>");
		out.println("아이디 : " + id + "<br/>");
		out.println("비밀번호 : " + pw + "<br/>");
		out.println("비밀번호확인 : " + pwconfirm + "<br/>");
		out.println("취미 : " + Arrays.toString(hobby) + "<br/>");
		out.println("전공 : " + major + "<br/>");
		out.println("학부 : " + college + "<br/>");
		out.println("</body></html>");
		
		out.close();
	}

}
