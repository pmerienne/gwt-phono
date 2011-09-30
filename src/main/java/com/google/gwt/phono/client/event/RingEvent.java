package com.google.gwt.phono.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.phono.client.handler.PhonoHandler;

public class RingEvent extends GwtEvent<PhonoHandler> {

	public RingEvent() {
	}

	@Override
	protected void dispatch(PhonoHandler handler) {
		handler.onRing(this);
	}

	@Override
	public GwtEvent.Type<PhonoHandler> getAssociatedType() {
		return PhonoHandler.TYPE;
	}

}