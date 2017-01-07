package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
//ParameterizableViewController is also an implementation class to AbstractController.
//Hence, this parent class has the 2 ancestor class methods.(handleRequest(), handleRequestInternal())
//Along with 2 new @Required is used for this setter setViewName(), getViewName() methods.(private String viewName;)
//Using this parent class, we can make changes to the view page names dynamically. Rather than changing programatically in the controller
public class HelloController extends ParameterizableViewController {
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse arg1) throws Exception {
		String name=req.getParameter("name");
		Map m=new HashMap();
		m.put("msg","Heloo using Parameterizable View Controller"+name);
		ModelAndView mav=new ModelAndView(getViewName(),m);
		return mav;

	}

}


