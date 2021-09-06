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
		response.setCharacterEncoding("utf-8"); //���ڼ� ���ڵ� �κ�
		response.setContentType("text/html; charset=utf-8"); // ������ ���� �κ� ����
		
		//��ȭ������ ����� �ϰ� ���� ��½�Ʈ���� �����
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>���� �ð�</TITLE>");
		out.println("<BODY>");
		out.println("<H1>���� �ð���</H1>");
		out.println(new Date());
		out.println("<H1>�Դϴ�. </H1>");
		out.println("</BODY>");
		out.println("</HEAD>");
		out.println("</HTML>");		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}	
}
