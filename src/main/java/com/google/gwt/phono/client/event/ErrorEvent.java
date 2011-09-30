package com.google.gwt.phono.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.phono.client.handler.PhonoHandler;

public class ErrorEvent extends GwtEvent<PhonoHandler> {

	private String reason;

	public ErrorEvent(String reason) {
		this.reason = reason;
	}

	@Override
	protected void dispatch(PhonoHandler handler) {
		handler.onError(this);
	}

	@Override
	public GwtEvent.Type<PhonoHandler> getAssociatedType() {
		return PhonoHandler.TYPE;
	}

	public String getReason() {
		return reason;
	}

}