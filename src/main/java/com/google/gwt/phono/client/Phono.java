package com.google.gwt.phono.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.phono.client.handler.PhonoHandler;

public class Phono {

	private JavaScriptObject obj;
	
	private Phone phone;
	
	private Messaging messaging;
	
	private PhonoHandlerRegistry phonoHandlerRegistry;

	public Phono(String apiKey, PhonoHandler handler) {
		this.phonoHandlerRegistry = new PhonoHandlerRegistry(this, handler);
		this.obj = init(apiKey, phonoHandlerRegistry);
	}

	private native static JavaScriptObject init(String _apiKey, PhonoHandlerRegistry phonoHandlerRegistry) /*-{
		console.log("Init gwt-phono");
		var phonoObject = $wnd.$.phono({
			apiKey: _apiKey,
			onReady: function() {
				phonoHandlerRegistry.@com.google.gwt.phono.client.PhonoHandlerRegistry::onReady()();
			},

	 		onUnready: function() {
				phonoHandlerRegistry.@com.google.gwt.phono.client.PhonoHandlerRegistry::onUnready()();
			},
			
			// Phone API Configuration
			phone: {
				// Default values
				headset: true,
				tones: false,
				// Event Handlers
				onIncomingCall: function(event) {
					phonoHandlerRegistry.@com.google.gwt.phono.client.PhonoHandlerRegistry::onIncomingCall(Lcom/google/gwt/core/client/JavaScriptObject;)(event.call);
				},

				onError: function(event) {
					phonoHandlerRegistry.@com.google.gwt.phono.client.PhonoHandlerRegistry::onError(Ljava/lang/String;)(event.reason);
				}
			},
			
			// Messaging API configuration
			messaging: {
    			onMessage: function(event) {
    				phonoHandlerRegistry.@com.google.gwt.phono.client.PhonoHandlerRegistry::onMessage(Lcom/google/gwt/core/client/JavaScriptObject;)(event.message);
    			}
  			}
		});
		return phonoObject;
	}-*/;
	
	protected void endInitialization() {
		this.phone = new Phone(this._getPhone());
		this.phone.setPhonoHandlerRegistry(phonoHandlerRegistry);
		this.messaging= new Messaging(this._getMessaging());
	}

	public Call dial(String destination) {
		return this.dial(destination, new DialConfiguration());
	}

	public Call dial(String destination, DialConfiguration configuration) {
		return this.getPhone().dial(destination, configuration);
	}

	public void send(String destination, String body) {
		this.getMessaging().send(destination, body);
	}

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
