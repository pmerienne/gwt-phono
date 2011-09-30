package com.google.gwt.phono.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.phono.client.handler.PhonoHandler;

public class HangupEvent extends GwtEvent<PhonoHandler> {

	public HangupEvent() {
	}

	@Override
	protected void dispatch(PhonoHandler handler) {
		handler.onHangup(this);
	}

	@Override
	public GwtEvent.Type<PhonoHandler> getAssociatedType() {
		return PhonoHandler.TYPE;
	}

}