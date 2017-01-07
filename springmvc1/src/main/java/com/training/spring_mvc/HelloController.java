package com.training.spring_mvc;
//import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//  this is a spring managed bean, This instantiation is going to taken care by the Spring framework
@Controller
public class HelloController 
{
	//	If I gotta have a service its going to be
	//	@Autowired
	//private HelloService service;

	//	If there is  request that comes with this url(/hello), the method sayHello() is going to be executed. This mapping is done by an annotation 
	//	which is conceptualized as Handler Mapping 
	@RequestMapping("/hello")
//	public String sayHello(HttpServletRequest rquest, HttpServletResponse response)	
//For using the request and response, spring provides us with both the req and res objects for us
//	{
//		String name=request.getParameter("name"); 
//	Or we can do it using spring annotation RequestParam(the following line means--Hey, spring please take the request parameter named "name" and pass me the same as an argument to this method
public String sayHello(@RequestParam("name") String name, @RequestParam("city") String city)
{
	System.out.println("Say hello of hello controller to"+name+"He is from"+city);
		System.out.println("Call service and get the data");
		return "HelloWorld";
		// This is just a logical view name for the actual view file which is mapped in ViewResolver file(Replacing the traditional Request Dispatcher steps)
		// DispatcherServlet recieves a logical view name from the controller. Then DS will call the component called View Resolver to resolve a view(Physical path of the jsp) for this logical name
	}
	
	@RequestMapping(value="/input", method=RequestMethod.POST)
	public String takeInput(@RequestParam("username") String uname, @RequestParam("password") String pwd, )
	{
		System.out.println("uname is:"+uname+"password is "+pwd);
		return "success";
		
	}

}