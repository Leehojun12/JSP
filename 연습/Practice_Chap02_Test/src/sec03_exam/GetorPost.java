package sec03_exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GetorPost")
public class GetorPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public GetorPost() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet메서드 호출됨");
		response.setContentType("text/html; charset=utf-8");
		//출력 스크림을 얻는다.
		PrintWriter out = response.getWriter();
		out.print("안녕하세요<br/>");
		out.print("<HTML><head></head><body>");
		out.print("<h1>doGet방식입니다.반갑습니다.</h1>");
		out.print("</body></HTML>");
		//리소스 해제
		out.close();
		//h1태그 제목 태그중 제일 큰 글자 (h1~h6)--6이 제일 작다
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost메서드 호출됨");		
		response.setContentType("text/html; charset=utf-8");
		//출력 스크림을 얻는다.
		PrintWriter out = response.getWriter();
		out.print("안녕하세요<br/>");
		out.print("<HTML><head></head><body>");
		out.print("<h1>doPOST방식입니다.반갑습니다.</h1>");
		out.print("</body></HTML>");
		//리소스 해제
		out.close();
		//h1태그 제목 태그중 제일 큰 글자 (h1~h6)--6이 제일 작다
	}

}
