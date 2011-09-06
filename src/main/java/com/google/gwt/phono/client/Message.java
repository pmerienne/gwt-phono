package com.google.gwt.phono.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Message {
	
	private JavaScriptObject obj;

	public Message(JavaScriptObject obj) {
		this.obj = obj;
	}
	
	public native void reply(String body)  /*-{
		this.@com.google.gwt.phono.client.Message::obj.reply(body);
	}-*/;
	
	public native String getFrom()  /*-{
		return this.@com.google.gwt.phono.client.Message::obj.from;
	}-*/;
	
	public native String getBody()  /*-{
		return this.@com.google.gwt.phono.client.Message::obj.body;
	}-*/;
}
