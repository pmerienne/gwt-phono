package com.google.gwt.phono.client;

import com.google.gwt.core.client.JavaScriptObject;

public class IncomingCall extends JavaScriptObject {

	protected IncomingCall() {
	}
	
	public final Call getCall() {
		return new Call(this._getCall());
	}
	
	public final native JavaScriptObject _getCall() /*-{
		return this.call;
	}-*/;
}
