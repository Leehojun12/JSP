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
	System.out.println("doget �޼ҵ� ȣ���");
		
		//Ŭ���̾�Ʈ�� ��û�� �Ķ���� ������ ���ڵ��� �������ִ� �ڵ�.
		request.setCharacterEncoding("utf-8"); //request ��û ó�� ��ü
		//request parameter�� id�� ���´�(id�� �����̹Ƿ� String)
		String id = request.getParameter("id"); 
		String name = request.getParameter("name");
		String pw = request.getParameter("pw");
		
		response.setContentType("text/html; charset=utf-8"); // HTML�� �ҷ� ���� response ��ü 
		PrintWriter out = response.getWriter();
		out.println("<h1>���̵� : " + id + "</h1><br/>");
		out.println("<h1>�̸� : " + name + "</h1><br/>");
		out.println("<h1>��й�ȣ : " + pw + "</h1><br/>");
		
		out.close(); // ���ҽ��� ������ �׻� �ݾ����!!!	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost �޼ҵ� ȣ���");
		
		//Ŭ���̾�Ʈ�� ��û�� �Ķ���� ������ ���ڵ��� �������ִ� �ڵ�.
		request.setCharacterEncoding("utf-8"); //request ��û ó�� ��ü
		//request parameter�� id�� ���´�(id�� �����̹Ƿ� String)
		String id = request.getParameter("id"); 
		String name = request.getParameter("name");
		String pw = request.getParameter("pw");
		
		response.setContentType("text/html; charset=utf-8"); // HTML�� �ҷ� ���� response ��ü 
		PrintWriter out = response.getWriter();
		out.println("<h1>���̵� : " + id + "</h1><br/>");
		out.println("<h1>�̸� : " + name + "</h1><br/>");
		out.println("<h1>��й�ȣ : " + pw + "</h1><br/>");
		
		out.close(); // ���ҽ��� ������ �׻� �ݾ����!!!	
	}

}
