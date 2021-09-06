package sec05_exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/choiceCha")
public class choiceCha extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public choiceCha() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 메소드 호출됨");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		String[] cha = request.getParameterValues("cha");
		
		out.println("<html><head></head><body>");
		out.println("<table align='center'>"); // 태이블 생성
		out.println("<tr bgcolor='green'>"); //행 만드는 tr태그
		
		for(int i=0; i<cha.length; i++) {
			out.println("<td>");
			out.println("<img src = '" + cha[i] + "'>");
			out.println("</td>");
		}
		out.println("</tr>");
		out.println("</table></body></html>");
		
		
		out.close();		
	}

}
