package com.eoe.sel02.download;

import java.io.Serializable;

/*请求类型分两种:
 * 1.filename表示从服务端获取文件长度的请求。
 * 2.download表示下载本数据块的请求。
 */
public class RecordInfo implements Serializable{
	private String requestType;
	private long fileSize;
	private Record record;
	public RecordInfo() {
		record=new Record();
	}
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	public Record getRecord() {
		return record;
	}
	public void setRecord(Record record) {
		this.record = record;
	}
	
}
