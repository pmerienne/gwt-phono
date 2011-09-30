package com.google.gwt.phono.client.handler;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.phono.client.event.AnswerEvent;
import com.google.gwt.phono.client.event.ErrorEvent;
import com.google.gwt.phono.client.event.HangupEvent;
import com.google.gwt.phono.client.event.IncomingCallEvent;
import com.google.gwt.phono.client.event.MessageEvent;
import com.google.gwt.phono.client.event.PhonoReadyEvent;
import com.google.gwt.phono.client.event.PhonoUnreadyEvent;
import com.google.gwt.phono.client.event.RingEvent;

public interface PhonoHandler extends EventHandler {

	final static Type<PhonoHandler> TYPE = new Type<PhonoHandler>();

	/**
	 * Called when phono is ready
	 */
	void onPhonoReady(PhonoReadyEvent event);

	/**
	 * Called when phono initialization failed
	 */
	void onPhonoUnready(PhonoUnreadyEvent event);

	/**
	 * Called when an error is reported relating to a call.
	 */
	void onError(ErrorEvent event);

	/**
	 * Called when an outbound call is ringing.
	 */
	void onRing(RingEvent event);

	/**
	 * Called when an outbound call is answered.
	 */
	void onAnswer(AnswerEvent event);

	/**
	 * Called when a call is terminated by the remote party.
	 */
	void onHangup(HangupEvent event);

	/**
	 * Called when a call is coming
	 */
	void onIncomingCall(IncomingCallEvent event);

	/**
	 * Called when a message is received
	 */
	void onMessage(MessageEvent event);
}
