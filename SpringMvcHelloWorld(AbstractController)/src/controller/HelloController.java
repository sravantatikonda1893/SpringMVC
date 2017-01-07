package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
//Internally AbstractController also has an implemented method handleRequest from Controller(I). This just delegate the 
//		request directly to this handleRequestInternal() once its being called by Front controller. 
		
		String name=req.getParameter("name");
		Map m=new HashMap();
		m.put("msg","Heloo"+name+"using Abstratc controller");
		ModelAndView mav=new ModelAndView("success",m);
		return mav;
		return null;
	}

	

}


