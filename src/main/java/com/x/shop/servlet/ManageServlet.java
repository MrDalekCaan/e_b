package com.x.shop.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "manage", value = "/manage")
class ManageServlet extends BaseServlet {
	public String index(HttpServletRequest request, HttpServletResponse response) {
		return "index.jsp";
	}
}


