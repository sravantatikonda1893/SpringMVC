package controller;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class EmpCrudController extends MultiActionController{
	Class.forName("oracle.jdbc.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	//Employee Save method should be same as action url's	
//For using custom methods, configuration is done in xml file
//public ModelAndView sravanempsavetatikonda(HttpServletRequest req, HttpServletResponse res) throws Exception 

	public ModelAndView empsave(HttpServletRequest req, HttpServletResponse res) throws Exception 
	{
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String address=req.getParameter("address");
		ResultSet rs=con.createStatement.executeQuery("select max(id) from emp");
		int maxId=0;
		if(rs.next())
		{
			maxId=rs.getInt(1);
			maxId++;
		}
		PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?,?)");
		ps.setInt(1,maxId);
		ps.setString(2,name);
		ps.setString(3,email);
		ps.setString(4,address);
		int t=ps.executeUpdate();
		con.close();
		ModelAndView mav=null;
		if(t!=0)
		mav=new ModelAndView("success");
		else
       mav=	new ModelAndView("fail"); 
		return mav;

	}
//public ModelAndView sravanempupdatetatikonda(HttpServletRequest req, HttpServletResponse res) throws Exception 

	public ModelAndView empupdate(HttpServletRequest req, HttpServletResponse res) throws Exception 
	{
		int id=Integer.parseInt(req.getParameter("name"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String address=req.getParameter("address");
 		PreparedStatement ps=con.prepareStatement("update emp set name=?,email=?,address=? where id=?");
		ps.setString(1,name);
		ps.setString(2,email);
		ps.setString(3,address);
		ps.setInt(4,id);

		int t=ps.executeUpdate();
		con.close();
		ModelAndView mav=null;
		if(t!=0)
		mav=new ModelAndView("success");
		else
       mav=	new ModelAndView("fail"); 
		return mav;
	}


}
