package sec01_exam;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.glass.ui.SystemClipboard;


@WebServlet("/LC")
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    //������
    public LifeCycleServlet() {
        super();
        System.out.println("������ ȣ��");
    }
    
    // init()�� Ctrl+space�ٸ� ���� ���� �Է�
    // ���� �ѹ��� ����
	@Override
	public void init() throws ServletException {
		System.out.println("init() ȣ��");
	}
	// ��� ���� ����
	// �ּ� â�� ���ΰ�ħ�� �� ��, doGet() ȣ��
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() ȣ��");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost() ȣ��");	
	}	
	
	// doGet(), doPost()�� ���ٸ� service() ȣ��
	// ������ �޼��尡 �� �����Ͽ��� service() ȣ��
	// service()�� get,post������� � �ż��� ������� ȣ���� �Ǿ����� �˱��� �����Ͽ� doGet(), doPost() ���
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("sevice() ȣ��");		
	}
	// ������ �������� ���� destroy()�� ȣ�� 
	//���� �ڵ��� ������ �Ͼ�� ���������� �ؾ��ϹǷ� �������� restart�� �ص� ȣ��
	public void destroy() {
		System.out.println("destroy() ȣ��");
	}
	
	// �������̵��� ������ �ƴϴ�. ���� �޼��带 ������ִ� �� (�߿�)
	// ��ó�� �κп� �ش��Ѵ�
	// init()�޼��尡 ȣ��Ǳ� ���� ���� ����
	// @PostConstruct������̼��� �����Ϸ����� ���� ����
	@PostConstruct
	private void initPostConstruct() {
		System.out.println("initPostConstruct() ��ó��");
	}
	
	// �������̵��� ������ �ƴϴ�. ���� �޼��带 ������ִ� ���̴�.(�߿�)
	// ��ó�� �κп� �ش��Ѵ�.
	// destroy()�޼��尡 ȣ��� �Ŀ� �����Ѵ�.
	// @PreDestroy������̼��� �����Ϸ����� ���� �����Ѵ�.
	@PreDestroy
	private void PreDestroy() {
		System.out.println("PreDestroy() ��ó��");
	}
	
	
}
