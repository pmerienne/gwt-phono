package com.google.gwt.phono.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.phono.client.handler.PhonoHandler;

public class PhonoUnreadyEvent extends GwtEvent<PhonoHandler> {

	public PhonoUnreadyEvent() {
	}

	@Override
	protected void dispatch(PhonoHandler handler) {
		handler.onPhonoUnready(this);
	}

	@Override
	public GwtEvent.Type<PhonoHandler> getAssociatedType() {
		return PhonoHandler.TYPE;
	}

}