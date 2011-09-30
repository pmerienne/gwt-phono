package com.google.gwt.phono.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.phono.client.handler.PhonoHandler;

public class AnswerEvent extends GwtEvent<PhonoHandler> {

	public AnswerEvent() {
	}

	@Override
	protected void dispatch(PhonoHandler handler) {
		handler.onAnswer(this);
	}

	@Override
	public GwtEvent.Type<PhonoHandler> getAssociatedType() {
		return PhonoHandler.TYPE;
	}

}