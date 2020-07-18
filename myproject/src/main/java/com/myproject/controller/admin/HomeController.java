package com.myproject.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myproject.model.UserModel;

@WebServlet(urlPatterns = {"/admin-home"})
public class HomeController extends HttpServlet {

	private static final long serialVersionUID = -4139019485201102942L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserModel md = new UserModel("an","Phạm Long Ẩn");
		req.setAttribute("usermodel", md);
		
		RequestDispatcher rq = req.getRequestDispatcher("view/admin/home.jsp");
		rq.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
