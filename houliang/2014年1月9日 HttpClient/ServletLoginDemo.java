package com.eoe.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eoe.entity.vo.InitUsers;
import com.eoe.entity.vo.User;
import com.sun.corba.se.spi.orbutil.fsm.Input;

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
        InputStream in=this.getClass().getClassLoader().getResourceAsStream("user.txt");
        users=InitUsers.initUsers(in);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// ���ý��뷽ʽ
    	request.setCharacterEncoding(ENCODING);
    	System.out.println("doPost");
//    	InputStream in=request.getInputStream();
//    	BufferedReader reader=new BufferedReader(new InputStreamReader(in,ENCODING));
//    	String line=reader.readLine();
//    	System.out.println(line);
    	//��ȡ�û���
    	String name=request.getParameter("name");
    	String password=request.getParameter("password");
    	ObjectOutputStream oos=null;
    	if(users.containsKey(name)){
    		User user=users.get(name);
    		if(password.equals(user.getPassword())){
    			System.out.println("��½�ɹ���");
    			OutputStream out=response.getOutputStream();
    			oos=new ObjectOutputStream(out);
    			oos.writeObject(users.get(name));
    			oos.flush();
    			return;
    		}
    	}
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do get()");
		//���ͻ��˷��͵������Ȱ���iso8859-1��������UTF-8���� ʹ����������
		String name = new String(request.getParameter("name").getBytes("ISO8859-1"),ENCODING);
		String password=request.getParameter("password");
		ObjectOutputStream oos=null;
		if(users.containsKey(name)){
			User user=users.get(name);
			if(password.equals(user.getPassword())){
				System.out.println("��½�ɹ���");
				System.out.println(user.toString());
				OutputStream out=response.getOutputStream();
				oos=new ObjectOutputStream(out);
				oos.writeObject(users.get(name));
				oos.flush();
				return;
			}
		}
	}

	/**
	 *
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

}
