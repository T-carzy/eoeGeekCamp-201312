package com.eoe.sel02.day12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.ityw.entity.User;

public class Test06 {
	static final String SRC_PATH="e:/java_test/se2_day12/";
	static final String FILENAME="users1.xml";
	public static void main(String[] args) {
		SAXParserFactory factory=SAXParserFactory.newInstance();
		InputStream in=null;
		try {
			SAXParser saxParser=factory.newSAXParser();
			in=new FileInputStream(SRC_PATH+FILENAME);
			MyHander handler=new MyHander();
			saxParser.parse(in, handler);
			ArrayList<User> users=handler.users;
			for (User user : users) {
				System.out.println(user);
			}
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static class MyHander extends DefaultHandler{
		ArrayList<User> users;
		User user;
		boolean isUserTag;
		String tagName;
		@Override
		public void startDocument() throws SAXException {
			super.startDocument();
			users=new ArrayList<User>();
			isUserTag=true;
		}
		@Override
		public void startElement(String uri, String localName, String qName,
				Attributes attributes) throws SAXException {
			// TODO Auto-generated method stub
			super.startElement(uri, localName, qName, attributes);
			tagName=qName;
			if("user".equals(qName)){
				user=new User();
				user.setId(Integer.parseInt(attributes.getValue(0)));
			}
		}
		@Override
		public void characters(char[] ch, int start, int length)
				throws SAXException {
			super.characters(ch, start, length);
			String data=new String(ch,start,length);
			if("name".equals(tagName)){
				user.setName(data);
			}else if("password".equals(tagName)){
				user.setPassword(data);
			}else if("phone".equals(tagName)){
				user.setPhone(data);
			}else if("email".equals(tagName)){
				user.setEmail(data);
			}
		}
		@Override
		public void endElement(String uri, String localName, String qName)
				throws SAXException {
			super.endElement(uri, localName, qName);
			if("user".equals(qName)){
				users.add(user);
				isUserTag=false;
			}
			tagName=null;
		}
	}
}
