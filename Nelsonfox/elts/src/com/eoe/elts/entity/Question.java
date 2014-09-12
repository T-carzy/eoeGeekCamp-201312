package com.eoe.elts.entity;

import java.io.Serializable;
import java.util.ArrayList;

public class Question implements Serializable {
	private ArrayList<String> answers;//��׼��
	private ArrayList<String> userAnswers;//����ѡ��Ĵ�
	private int score;//��ֵ
	private int level;//�����Ѷ�
	private String title;//������Ŀ
	private String options;//��ѡ��
	public Question() {
		userAnswers=new ArrayList<String>();
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public ArrayList<String> getAnswers() {
		return answers;
	}
	public void setAnswers(ArrayList<String> answers) {
		this.answers = answers;
	}
	public ArrayList<String> getUserAnswers() {
		return userAnswers;
	}
	public void setUserAnswers(ArrayList<String> userAnswers) {
		this.userAnswers = userAnswers;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}
	@Override
	public String toString() {
		
		return this.title+"\n"+this.options;
	}
}
