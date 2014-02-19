package com.eoe.sel02.download;

import java.io.Serializable;

/*
 * 记录每一块下载的起始、结束以及下载文件名的信息
 */
public class Record implements Serializable{

	private static final long serialVersionUID = 1L;
	private long startPos;
	private long endPos;
	private String fileName;
	public long getStartPos() {
		return startPos;
	}
	public void setStartPos(long startPos) {
		this.startPos = startPos;
	}
	public long getEndPos() {
		return endPos;
	}
	public void setEndPos(long endPos) {
		this.endPos = endPos;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}
