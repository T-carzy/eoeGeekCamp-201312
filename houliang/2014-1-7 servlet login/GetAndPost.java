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
		//��ȡ�ͻ��˷��͵ļ�������name��ֵ
		String name=request.getParameter("name");
		//��name�ȱ���Ϊiso8859-1�ٽ���Ϊutf-8
		name=new String(name.getBytes("iso8859-1"),"utf-8");
		//��ȡ�ͻ��˷����͵���������
		String age=request.getParameter("age");
		//�ڷ���˴�ӡ����
		System.out.println("name="+name+"  age="+age+"��ʽΪdoget()");
		//��ͻ��˷����ַ���
		OutputStream out=response.getOutputStream();
		out.write("������Ϣ ".getBytes("utf-8"));
		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��utf-8����ͻ�������
		OutputStream out=response.getOutputStream();
		out.write("��������getPost()".getBytes("utf-8"));
		out.flush();
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		System.out.println("name="+name+"  age="+age+"��ʽΪdopost()");
	}

}
