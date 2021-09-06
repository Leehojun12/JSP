package sec02_exam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Now")
public class NowTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public NowTime() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8"); //문자셋 인코딩 부분
		response.setContentType("text/html; charset=utf-8"); // 응답할 내용 부분 설정
		
		//웹화면으로 출력을 하게 해줄 출력스트림을 얻었음
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>현재 시간</TITLE>");
		out.println("<BODY>");
		out.println("<H1>지금 시간은</H1>");
		out.println(new Date());
		out.println("<H1>입니다. </H1>");
		out.println("</BODY>");
		out.println("</HEAD>");
		out.println("</HTML>");		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}	
}
