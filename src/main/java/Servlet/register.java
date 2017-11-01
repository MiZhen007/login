package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;

public class register extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		//
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		//获取用户注册信息
		String username=req.getParameter("username");
		String age=req.getParameter("age");
		String gender=req.getParameter("gender");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		//
		System.out.println("================"+username);
		//
		if (username!=null) {
			User user=new User();
			user.setName(username);
			user.setAge(age);
			user.setEmailAddress(email);
			user.setPassword(password);
			//
			UserDao userDao=new dao.impl.UserDao();
			userDao.addUser(user);
			//完成DAO操作,注册成功
			req.setAttribute("msg", "注册成功");
			
		}
		else {
			req.setAttribute("msg", "用户名不嗯能够为空");
		}
		//转发
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}












