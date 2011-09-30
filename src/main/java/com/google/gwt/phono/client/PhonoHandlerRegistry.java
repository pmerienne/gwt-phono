package com.google.gwt.phono.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.phono.client.event.AnswerEvent;
import com.google.gwt.phono.client.event.ErrorEvent;
import com.google.gwt.phono.client.event.HangupEvent;
import com.google.gwt.phono.client.event.IncomingCallEvent;
import com.google.gwt.phono.client.event.MessageEvent;
import com.google.gwt.phono.client.event.PhonoReadyEvent;
import com.google.gwt.phono.client.event.PhonoUnreadyEvent;
import com.google.gwt.phono.client.event.RingEvent;
import com.google.gwt.phono.client.handler.PhonoHandler;

public class PhonoHandlerRegistry {

	private Phono phono;

	public PhonoHandlerRegistry(Phono phono, PhonoHandler handler) {
		this.phono = phono;
		this.addHandler(handler);
	}

	private native void log(String message) /*-{
		console.log(message);
	}-*/;

	/*
	 * Event management
	 */
	private HandlerManager handlerManager;

	protected HandlerManager createHandlerManager() {
		return new HandlerManager(this);
	}

	protected HandlerManager ensureHandlers() {
		return handlerManager == null ? handlerManager = createHandlerManager() : handlerManager;
	}

	public HandlerRegistration addHandler(PhonoHandler handler) {
		return ensureHandlers().addHandler(PhonoHandler.TYPE, handler);
	}

	public void removeHandler(PhonoHandler handler) {
		ensureHandlers().removeHandler(PhonoHandler.TYPE, handler);
	}

	public void onReady() {
		log("gwt-phono ready");
		this.phono.endInitialization();
		this.handlerManager.fireEvent(new PhonoReadyEvent(this.phono));
	}

	public void onUnready() {
		log("Disconnected");
		this.handlerManager.fireEvent(new PhonoUnreadyEvent());

	}

	public void onIncomingCall(JavaScriptObject obj) {
		Call call = new Call(obj);
		log("Incomming call : " + call.getId());
		this.handlerManager.fireEvent(new IncomingCallEvent(call));
	}

	public void onMessage(JavaScriptObject obj) {
		Message message = new Message(obj);
		log("Message received (from " + message.getFrom() + ") : " + message.getBody());
		this.handlerManager.fireEvent(new MessageEvent(message));
	}

	public void onError(String reason) {
		log("Error : " + reason);
		this.handlerManager.fireEvent(new ErrorEvent(reason));
	}

	/**
	 * when an outbound call is ringing.
	 */
	public void onRing() {
		log("Ring");
		this.handlerManager.fireEvent(new RingEvent());
	}

	/**
	 * when an outbound call is answered.
	 */
	public void onAnswer() {
		log("Answer");
		this.handlerManager.fireEvent(new AnswerEvent());
	}

	/**
	 * when a call is terminated by the remote party.
	 */
	public void onHangup() {
		log("Hangup");
		this.handlerManager.fireEvent(new HangupEvent());
	}

}
