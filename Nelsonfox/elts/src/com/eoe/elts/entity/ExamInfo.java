package com.eoe.elts.entity;

import java.io.Serializable;

public class ExamInfo implements Serializable{
	private String subjectTitle;//���Կ�Ŀ
	private User user;//��ǰ����
	private int limitTime;//����ʱ��
	private int questionCount;//��������
	public String getSubjectTitle() {
		return subjectTitle;
	}
	public void setSubjectTitle(String subjectTitle) {
		this.subjectTitle = subjectTitle;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getLimitTime() {
		return limitTime;
	}
	public void setLimitTime(int limitTime) {
		this.limitTime = limitTime;
	}
	public int getQuestionCount() {
		return questionCount;
	}
	public void setQuestionCount(int questionCount) {
		this.questionCount = questionCount;
	}
	@Override
	public String toString() {
		
		return "���Կ�Ŀ:"+this.subjectTitle+
			   "�������:"+this.getUser().getId()+"\n"+
			   "��������:"+this.getQuestionCount()+
			   "����ʱ��:"+this.getLimitTime()+"����";
	}
}
