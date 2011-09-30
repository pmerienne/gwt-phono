package com.google.gwt.phono.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.phono.client.Phono;
import com.google.gwt.phono.client.handler.PhonoHandler;

public class PhonoReadyEvent extends GwtEvent<PhonoHandler> {

	private Phono phono;

	public PhonoReadyEvent(Phono phono) {
		this.phono = phono;
	}

	@Override
	protected void dispatch(PhonoHandler handler) {
		handler.onPhonoReady(this);
	}

	@Override
	public GwtEvent.Type<PhonoHandler> getAssociatedType() {
		return PhonoHandler.TYPE;
	}

	public Phono getPhono() {
		return phono;
	}

}