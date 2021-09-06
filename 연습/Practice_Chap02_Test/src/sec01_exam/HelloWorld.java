package sec01_exam;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// servlet코드를 이용하면 속도가 더 빠르다
// web 상에서 servlet을 입력해주면 경로를 바꿀때 좀더 복잡

//@WebServlet("/HW")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HelloWorld() {
        super(); 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget hello world");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dopost hello world");
	}

}
