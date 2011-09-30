package com.google.gwt.phono.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.phono.client.Call;
import com.google.gwt.phono.client.handler.PhonoHandler;

public class IncomingCallEvent extends GwtEvent<PhonoHandler> {

	private Call call;

	public IncomingCallEvent(Call call) {
		this.call = call;
	}

	@Override
	protected void dispatch(PhonoHandler handler) {
		handler.onIncomingCall(this);
	}

	@Override
	public GwtEvent.Type<PhonoHandler> getAssociatedType() {
		return PhonoHandler.TYPE;
	}

	public Call getCall() {
		return call;
	}

}