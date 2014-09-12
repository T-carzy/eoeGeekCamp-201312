package com.eoe.elts.biz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import com.eoe.elts.dao.ExamDao;
import com.eoe.elts.dao.IExamDao;
import com.eoe.elts.entity.ExamInfo;
import com.eoe.elts.entity.Question;
import com.eoe.elts.entity.User;

public class ExamBiz implements IExamBiz,Serializable {
	ArrayList<Question> questions;//���п���
	User loginUser;//��ǰ��¼�Ŀ���
	IExamDao examDao;//���ݷ��ʲ�Ķ���
	ExamInfo examInfo;
	//ҵ���߼��Ĺ�����
	public ExamBiz() {
		//�������ݷ��ʲ�Ķ���
		examDao=new ExamDao();
	}
	@Override
	public void login(int uid, String pwd) throws Exception {
		User user=examDao.findUser(uid);
		if(user==null){
			throw new Exception("����ע��");
		}
		if(!user.getPassword().equals(pwd)){
			throw new Exception("�������");
		}
		loginUser=user;
	}

	@Override
	public void loadQuestions() {
		//�������ݷ��ʲ��ͬ���������ؿ���
		examDao.loadQuestions();
	}

	@Override
	public ExamInfo beginExam() {
		examDao.loadExamInfo();//���ؿ�����Ϣ
		//�����ݷ��ʲ�ȡ�����صĿ��⼯��
		questions=examDao.getQuestions();
		Collections.shuffle(questions, new Random());
		for(int i=0;i<questions.size();i++){
			Question q=questions.get(i);
			String title=q.getTitle();
			int index=title.indexOf(".");
			title=(i+1)+title.substring(index);
			q.setTitle(title);
		}
		examInfo=examDao.getExamInfo();
		//����examInfo.user��ֵΪ��½�ɹ��߶���
		examInfo.setUser(loginUser);
		return examInfo;
	}

	@Override
	public Question getQuestion(int qid) {
		// TODO Auto-generated method stub
		return questions.get(qid);
	}

	@Override
	
	public void saveUserAnswers(int qid, ArrayList<String> userAnswers) {
		questions.get(qid).setUserAnswers(userAnswers);

	}

	@Override
	public int over() {
		int score=0;//�����ܷ�
		for(int i=0;i<questions.size();i++){
			//ȡ��һ������
			Question question=questions.get(i);
			ArrayList<String> answers=question.getAnswers();
			Collections.sort(answers);
			ArrayList<String> userAnswers=question.getUserAnswers();
			Collections.sort(userAnswers);
			if(answers.equals(userAnswers)){
				score+=question.getScore();
			}
		}
		return score;
	}

	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return loginUser;
	}

}
