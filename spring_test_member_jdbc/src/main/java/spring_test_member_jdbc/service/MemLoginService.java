package spring_test_member_jdbc.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import spring_test_member_jdbc.dao.MemDao;

public class MemLoginService implements MemService{
	@Override
	public int execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String mId = request.getParameter("mem_uid");
		String mPw = request.getParameter("mem_pwd");
		
		MemDao dao = new MemDao();
		int re = dao.login(mId, mPw);
		
//		컨트롤러에 re 전달(0, 1, -1 중에서)
		return re;
	}
}
