package com.google.gwt.phono.client;

import com.google.gwt.core.client.JavaScriptObject;

public class PhonoConfiguration {

	void _onReady() {
		log("Connected");
		onReady();
	}

	void _onUnready() {
		log("Disconnected");
		onUnready();
	}

	void _onIncomingCall(JavaScriptObject obj) {
		Call call = new Call(obj);
		log("Incomming call : " + call.getId());
		onIncomingCall(call);
	}

	void _onError(String reason) {
		log("Error : " + reason);
		onError(reason);
	}

	public void onReady() {
	}

	public void onUnready() {
	}

	public void onIncomingCall(Call call) {
	}

	public void onError(String reason) {
	}
	
	private native void log(String message) /*-{
		console.log(message);
	}-*/;
	
}
