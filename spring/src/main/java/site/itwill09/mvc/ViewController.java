package site.itwill09.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewController implements Controller {
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Member member=new Member("aaa", "1111", "ȫ�浿", "aaa@itwill.site");
		request.setAttribute("member", member);
		return "member_view";
	}
}
