package com.eoe.servlet;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetAndPost
 */
public class GetAndPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAndPost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取客户端发送的键名称是name的值
		String name=request.getParameter("name");
		//将name先编码为iso8859-1再解码为utf-8
		name=new String(name.getBytes("iso8859-1"),"utf-8");
		//获取客户端发的送的年龄数据
		String age=request.getParameter("age");
		//在服务端打印数据
		System.out.println("name="+name+"  age="+age+"方式为doget()");
		//向客户端发送字符串
		OutputStream out=response.getOutputStream();
		out.write("返回信息 ".getBytes("utf-8"));
		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//按utf-8解码客户端请求
		OutputStream out=response.getOutputStream();
		out.write("返回请求getPost()".getBytes("utf-8"));
		out.flush();
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		System.out.println("name="+name+"  age="+age+"方式为dopost()");
	}

}
