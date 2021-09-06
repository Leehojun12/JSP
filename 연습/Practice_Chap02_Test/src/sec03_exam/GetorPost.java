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
		System.out.println("doGet�޼��� ȣ���");
		response.setContentType("text/html; charset=utf-8");
		//��� ��ũ���� ��´�.
		PrintWriter out = response.getWriter();
		out.print("�ȳ��ϼ���<br/>");
		out.print("<HTML><head></head><body>");
		out.print("<h1>doGet����Դϴ�.�ݰ����ϴ�.</h1>");
		out.print("</body></HTML>");
		//���ҽ� ����
		out.close();
		//h1�±� ���� �±��� ���� ū ���� (h1~h6)--6�� ���� �۴�
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost�޼��� ȣ���");		
		response.setContentType("text/html; charset=utf-8");
		//��� ��ũ���� ��´�.
		PrintWriter out = response.getWriter();
		out.print("�ȳ��ϼ���<br/>");
		out.print("<HTML><head></head><body>");
		out.print("<h1>doPOST����Դϴ�.�ݰ����ϴ�.</h1>");
		out.print("</body></HTML>");
		//���ҽ� ����
		out.close();
		//h1�±� ���� �±��� ���� ū ���� (h1~h6)--6�� ���� �۴�
	}

}
