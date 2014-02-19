package com.eoe.sel02.day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class Test07 {
	static final String SRC_PATH="e:/java_test/se2_day12/";
	static final String FILENAME="users2.xml";
	public static void main(String[] args) {
		SAXParserFactory factory=SAXParserFactory.newInstance();
		InputStream in;
		try {
			SAXParser saxParser=factory.newSAXParser();
			in=new FileInputStream(SRC_PATH+FILENAME);
			MyHandler handler=new MyHandler();
			saxParser.parse(in, handler);
			ArrayList<User> users=handler.users;
			for (User user : users) {
				System.out.println(user);
			}
		} catch (ParserConfigurationException | SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static class MyHandler extends DefaultHandler{
		ArrayList<User> users;
		User user;
		@Override
		public void startDocument() throws SAXException {
			super.startDocument();
			users=new ArrayList<User>();
		}
		@Override
		public void startElement(String uri, String localName, String qName,
				Attributes attributes) throws SAXException {
			super.startElement(uri, localName, qName, attributes);
			if("user".equals(qName)){
				user=new User();
				user.setId(Integer.parseInt(attributes.getValue(0)));
				user.setName(attributes.getValue(1));
				user.setPassword(attributes.getValue(2));
				user.setPhone(attributes.getValue(3));
				user.setEmail(attributes.getValue(4));
			}
		}
		
		@Override
		public void endElement(String uri, String localName, String qName)
				throws SAXException {
			super.endElement(uri, localName, qName);
			if("user".equals(qName)){
				users.add(user);
			}
		}
	}
}
