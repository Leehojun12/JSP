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
       
    //생성자
    public LifeCycleServlet() {
        super();
        System.out.println("생성자 호출");
    }
    
    // init()는 Ctrl+space바를 눌러 직접 입력
    // 최초 한번만 실행
	@Override
	public void init() throws ServletException {
		System.out.println("init() 호출");
	}
	// 계속 재사용 가능
	// 주소 창에 새로고침을 할 시, doGet() 호출
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 호출");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost() 호출");	
	}	
	
	// doGet(), doPost()가 없다면 service() 호출
	// 세가지 메서드가 다 존재하여도 service() 호출
	// service()는 get,post방식으로 어떤 매서드 방식으로 호출이 되었는지 알길이 없다하여 doGet(), doPost() 사용
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("sevice() 호출");		
	}
	// 서버를 중지시켜 보면 destroy()가 호출 
	//서블릿 코드의 수정이 일어나면 재컴파일을 해야하므로 서버에서 restart를 해도 호출
	public void destroy() {
		System.out.println("destroy() 호출");
	}
	
	// 오버라이딩의 개념이 아니다. 직접 메서드를 만들어주는 것 (중요)
	// 선처리 부분에 해당한다
	// init()메서드가 호출되기 전에 먼저 실행
	// @PostConstruct어노테이션이 컴파일러한테 따로 지시
	@PostConstruct
	private void initPostConstruct() {
		System.out.println("initPostConstruct() 선처리");
	}
	
	// 오버라이딩의 개념이 아니다. 직접 메서드를 만들어주는 것이다.(중요)
	// 후처리 부분에 해당한다.
	// destroy()메서드가 호출된 후에 실행한다.
	// @PreDestroy어노테이션이 컴파일러한테 따로 지시한다.
	@PreDestroy
	private void PreDestroy() {
		System.out.println("PreDestroy() 후처리");
	}
	
	
}
