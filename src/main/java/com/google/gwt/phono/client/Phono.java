package com.google.gwt.phono.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Phono {

	private JavaScriptObject obj;

	public Phono(String apiKey, PhonoConfiguration configuration) {
		this.obj = init(apiKey, configuration);
	}
	
	private native static JavaScriptObject init(String _apiKey, PhonoConfiguration configuration) /*-{
		var phonoObject = $wnd.$.phono({
			apiKey: _apiKey,
			onReady: function() {
				configuration.@com.google.gwt.phono.client.PhonoConfiguration::_onReady()();
			},
	 		onUnready: function() {
				configuration.@com.google.gwt.phono.client.PhonoConfiguration::_onUnready()();
			},
			
			// Phone API Configuration
			phone: {
				// Default values
				gain: 100,
				volume: 100,
				mute: false,
				pushToTalk: false,
				// Event Handlers
				onIncomingCall: function(event) {
					configuration.@com.google.gwt.phono.client.PhonoConfiguration::_onIncomingCall(Lcom/google/gwt/core/client/JavaScriptObject;)(event.call);
				},
				
				onError: function(event) {
					configuration.@com.google.gwt.phono.client.PhonoConfiguration::_onError(Ljava/lang/String;)(event.reason);
				}
			},
			
			// Messaging API configuration
			messaging: {
    			onMessage: function(event) {
    				configuration.@com.google.gwt.phono.client.PhonoConfiguration::_onMessage(Lcom/google/gwt/core/client/JavaScriptObject;)(event.message);
    			}
  			}
		});
		return phonoObject;
	}-*/;
	
	public native String getApiKey() /*-{
		return this.@com.google.gwt.phono.client.Phono::obj.apiKey;
	}-*/;
	
	public native String getSessionId() /*-{
		return this.@com.google.gwt.phono.client.Phono::obj.sessionId;
	}-*/;
	
	public native void connect() /*-{
		this.@com.google.gwt.phono.client.Phono::obj.connect();
	}-*/;

	public native void disconnect() /*-{
		this.@com.google.gwt.phono.client.Phono::obj.disconnect();
	}-*/;
	
	public native boolean isConnected() /*-{
		return this.@com.google.gwt.phono.client.Phono::obj.connected();
	}-*/;
	
	public Phone getPhone() {
		return new Phone(this._getPhone());
	}
	
	private native JavaScriptObject _getPhone() /*-{
		return this.@com.google.gwt.phono.client.Phono::obj.phone;
	}-*/;

	public Messaging getMessaging() {
		return new Messaging(this._getMessaging());
	}
	
	private native JavaScriptObject _getMessaging() /*-{
		return this.@com.google.gwt.phono.client.Phono::obj.messaging;
	}-*/;
}
