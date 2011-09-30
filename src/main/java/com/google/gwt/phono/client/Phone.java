package com.google.gwt.phono.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Phone {

	private JavaScriptObject obj;

	private PhonoHandlerRegistry phonoHandlerRegistry;
	
	public Phone(JavaScriptObject obj) {
		this.obj = obj;
	}
	
	/**
	 * Used to make an outgoing call.
	 * 
	 * @param destination
	 * @param volume
	 * @param pushToTalk
	 * @return
	 */
    protected Call dial(String destination, DialConfiguration configuration) {
    	return new Call(_dial(destination, configuration));
    }

    private native JavaScriptObject _dial(String _destination, DialConfiguration configuration) /*-{
		var phonoHandlerRegistry = this.@com.google.gwt.phono.client.Phone::phonoHandlerRegistry;
    	return this.@com.google.gwt.phono.client.Phone::obj.dial(_destination, {    	
			gain: configuration.@com.google.gwt.phono.client.DialConfiguration::gain,
			volume: configuration.@com.google.gwt.phono.client.DialConfiguration::volume,
			mute: configuration.@com.google.gwt.phono.client.DialConfiguration::mute,
			pushToTalk: configuration.@com.google.gwt.phono.client.DialConfiguration::pushToTalk,

			// Events
			onRing: function() {
				phonoHandlerRegistry.@com.google.gwt.phono.client.PhonoHandlerRegistry::onRing()();
			},
			onAnswer: function() {
				phonoHandlerRegistry.@com.google.gwt.phono.client.PhonoHandlerRegistry::onAnswer()();
			},
			onHangup: function() {
				phonoHandlerRegistry.@com.google.gwt.phono.client.PhonoHandlerRegistry::onHangup()();
			},
			onError: function(event) {
				phonoHandlerRegistry.@com.google.gwt.phono.client.PhonoHandlerRegistry::onError(Ljava/lang/String;)(event.reason);
			}
		});
    }-*/;

	/**
	 * When headset is false, Phono will optimize the user experience for your
	 * computers' speakers and supress echo.
	 * 
	 * @return
	 */
    public native boolean getHeadset() /*-{
    	return this.@com.google.gwt.phono.client.Phone::obj.headset;
    }-*/;

	/**
	 * When headset is false, Phono will optimize the user experience for your
	 * computers' speakers and supress echo.
	 * 
	 * @param value
	 */
    public native void setHeadset(boolean value) /*-{
    	this.@com.google.gwt.phono.client.Phone::obj.headset(value);
    }-*/;

    /**
     * Sets whether digit tones should be played on the client. 
     * @param _tones
     */
    public native void setTones(boolean _tones) /*-{
    	this.@com.google.gwt.phono.client.Phone::obj.tones(_tones);
     }-*/;

    /**
     * Gets whether digit tones should be played on the client. 
     * @param _tones
     */
    public native boolean getTones() /*-{
    	return this.@com.google.gwt.phono.client.Phone::obj.tones();
     }-*/;

    public native void setRingtone(String _ringtone) /*-{
		return this.@com.google.gwt.phono.client.Phone::obj.ringtone(_ringtone);
	}-*/;
    
    public native String getRingtone() /*-{
		return this.@com.google.gwt.phono.client.Phone::obj.ringtone();
	}-*/;

    public native void setRingbacktone(String _ringbacktone) /*-{
		return this.@com.google.gwt.phono.client.Phone::obj.ringbacktone(_ringbacktone);
	}-*/;

    public native String getRingbacktone() /*-{
		return this.@com.google.gwt.phono.client.Phone::obj.ringbacktone();
	}-*/;

	public PhonoHandlerRegistry getPhonoHandlerRegistry() {
		return phonoHandlerRegistry;
	}

	public void setPhonoHandlerRegistry(PhonoHandlerRegistry phonoHandlerRegistry) {
		this.phonoHandlerRegistry = phonoHandlerRegistry;
	}

}
