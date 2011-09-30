package com.google.gwt.phono.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.phono.client.Message;
import com.google.gwt.phono.client.handler.PhonoHandler;

public class MessageEvent extends GwtEvent<PhonoHandler> {

	private Message message;

	public MessageEvent(Message message) {
		this.message = message;
	}

	@Override
	protected void dispatch(PhonoHandler handler) {
		handler.onMessage(this);
	}

	@Override
	public GwtEvent.Type<PhonoHandler> getAssociatedType() {
		return PhonoHandler.TYPE;
	}

	public Message getMessage() {
		return message;
	}

}