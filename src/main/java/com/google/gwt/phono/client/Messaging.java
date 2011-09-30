package com.google.gwt.phono.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Messaging {

	private JavaScriptObject obj;

	public Messaging(JavaScriptObject obj) {
		this.obj = obj;
	}

	protected native void send(String to, String body) /*-{
		this.@com.google.gwt.phono.client.Messaging::obj.send(to, body);
	}-*/;
}
