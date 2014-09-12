package com.eoe.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eoe.entity.InitUsers;
import com.eoe.entity.User;

/**
 * Servlet implementation class ServletLoginDemo
 */
public class ServletLoginDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String ENCODING="UTF-8";  
	private HashMap<String, User> users;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLoginDemo() {
        super();
        // TODO Auto-generated constructor stub
        InputStream in=this.getClass().getClassLoader().getResourceAsStream("user.txt");
        users=InitUsers.initUsers(in);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do get()");
		//讲客户端发送的数据先按照iso8859-1编码再用UTF-8解码 使不出现乱码
		String name = new String(request.getParameter("name").getBytes("ISO8859-1"),ENCODING);
		String password=request.getParameter("password");
		ObjectOutputStream oos=null;
		if(users.containsKey(name)){
			User user=users.get(name);
			if(password.equals(user.getPassword())){
				System.out.println("登陆成功！");
				OutputStream out=response.getOutputStream();
				oos=new ObjectOutputStream(out);
				oos.writeObject(users.get(name));
				return;
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置解码方式
		response.setCharacterEncoding(ENCODING);
		System.out.println("doPost");
		//获取用户名
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		ObjectOutputStream oos=null;
		if(users.containsKey(name)){
			User user=users.get(name);
			if(password.equals(user.getPassword())){
				System.out.println("登陆成功！");
				OutputStream out=response.getOutputStream();
				oos=new ObjectOutputStream(out);
				oos.writeObject(users.get(name));
				return;
			}
		}
	}

}
