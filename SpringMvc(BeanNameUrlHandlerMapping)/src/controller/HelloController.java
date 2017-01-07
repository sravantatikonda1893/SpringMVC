package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

//Here it internally uses BeanNameUrlHandlerMapping for mapping the request recieved to the corresponding controller class
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {

		String name=req.getParameter("name");
		Map m=new HashMap();
		m.put("msg","Heloo"+name);
		ModelAndView mav=new ModelAndView("success",m);
		return mav;
	}

}


