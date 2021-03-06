package site.itwill09.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Front Controller : 클라이언트의 모든 요청을 받아 요청 URL 주소를 분석하여
//요청에 대한 처리를 구현한 클래스(Model)의 메소드 호출하여 반환된 결과를
//JSP 문서(View)로 응답하는 기능을 제공하는 단일 진입점 역활의 클래스(서블릿)
// => web.xml 파일에 클래스를 서블릿으로 등록하고 URL 매핑 처리
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//클라이언트 요청에 대한 응답 결과를 제공하기 위한 메소드
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.클라이언트의 요청 URL 주소 분석 - 클라이언트의 요구사항 파악
		String requestURI=request.getRequestURI();
		String contextPath=request.getContextPath();
		String command=requestURI.substring(contextPath.length());
		
		//2.요청에 대한 처리 클래스(Model)의 인스턴스를 반환받아 메소드 호출
		// => 처리 클래스 : Model >> Command Controller
		/*
		Controller controller=null;
		if(command.equals("/list.itwill")) {
			controller=new ListController();
		} else if(command.equals("/view.itwill")) {
			controller=new ViewController();
		}
		*/

		HandlerMapping handlerMapping=new HandlerMapping();
		//요청정보를 전달하여 처리 인스턴스를 반환받아 저장
		Controller controller=handlerMapping.getController(command);
		
		//요청 처리 클래스의 메소드를 호출하여 응답페이지 정보를 반환받아 저장
		String view=controller.handleRequest(request, response);
		
		//3.응답페이지로 포워드 이동하여 클라이언트에게 응답결과 제공
		ViewResolver viewResolver=new ViewResolver();
		String viewPage=viewResolver.getViewPage(view);
		
		request.getRequestDispatcher(viewPage).forward(request, response);
	}
	
}






