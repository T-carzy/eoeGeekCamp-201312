package com.eoe.elts.biz;

import java.util.ArrayList;

import com.eoe.elts.entity.ExamInfo;
import com.eoe.elts.entity.Question;
import com.eoe.elts.entity.User;

/**
 * ������ֲ���ҵ���߼���֮�䷽�����õ�Լ����
 * @author yw
 *
 */
public interface IExamBiz {
	/**
	 * ��½��֤
	 * @param uid���û����
	 * @param pwd������
	 */
	public void login(int uid,String pwd) throws Exception;
	
	/**
	 * ���ص�½�ɹ���-��ǰ����
	 * @return
	 */
	public User getUser();
	/**
	 * ���ؿ���
	 */
	public void loadQuestions();
	/**
	 * 1.�����ݷ��ʲ��ȡ���صĿ��Ⲣ���ҡ�
	 * 2.���ؿ���ͷ����
	 * @return
	 */
	public ExamInfo beginExam();
	
	/**
	 * ���ݿ��������ṩһ������
	 * @param qid
	 * @return
	 */
	public Question getQuestion(int qid);
	/**
	 * ���濼��ѡ��Ĵ�
	 * @param qid:��������
	 * @param userAnswers������ѡ��Ĵ�
	 */
	public void saveUserAnswers(int qid,ArrayList<String> userAnswers);
	
	/**
	 * ������
	 * @return
	 */
	public int over();
}
