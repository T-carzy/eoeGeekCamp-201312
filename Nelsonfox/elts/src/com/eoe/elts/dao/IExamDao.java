package com.eoe.elts.dao;

import java.util.ArrayList;

import com.eoe.elts.entity.ExamInfo;
import com.eoe.elts.entity.Question;
import com.eoe.elts.entity.User;

/**
 * �������ݷ��ʲ���ҵ���߼���ķ�������Լ��
 * @author yw
 */
public interface IExamDao {
	//����˵���ַ
	public static String url="http://10.0.2.2/";
	public static String USER_FILE="users.xml";
	public static String QUESTION_FILE="questions.xml";
	public static String EXAMINFO_FILE="exam_info.xml";
	/**
	 * �������п���
	 * @return
	 */
	public ArrayList<Question> getQuestions();
	
	/**
	 * ���ؿ���ͷ����
	 * @return
	 */
	public ExamInfo getExamInfo();
	
	/**
	 * ����uid����ע���û�
	 * @param uid��ָ�����û�id
	 * @return ��û��uidָ�����û����򷵻�null
	 */
	public User findUser(int uid);
	
	/**
	 * ���ؿ���
	 */
	public void loadQuestions();
	
	/**
	 * ���ؿ���ͷ��Ϣ
	 */
	public void loadExamInfo();
}
