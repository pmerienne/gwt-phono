package com.google.gwt.phono.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Phone {

	private JavaScriptObject obj;
	
	public Phone(JavaScriptObject obj) {
		this.obj = obj;
	}

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
	 * Used to make an outgoing call.
	 * 
	 * @param destination
	 * @param volume
	 * @param pushToTalk
	 * @return
	 */
    public Call dial(String destination, DialConfiguration configuration) {
    	return new Call(_dial(destination, configuration));
    }

    private native JavaScriptObject _dial(String _destination, DialConfiguration configuration) /*-{
    	return this.@com.google.gwt.phono.client.Phone::obj.dial(_destination, {
			gain: configuration.@com.google.gwt.phono.client.DialConfiguration::gain,
			volume: configuration.@com.google.gwt.phono.client.DialConfiguration::volume,
			mute: configuration.@com.google.gwt.phono.client.DialConfiguration::mute,
			pushToTalk: configuration.@com.google.gwt.phono.client.DialConfiguration::pushToTalk,
			// Events
			onRing: function() {
				configuration.@com.google.gwt.phono.client.DialConfiguration::onRing()();
			},
			onAnswer: function() {
				configuration.@com.google.gwt.phono.client.DialConfiguration::onAnswer()();
			},
			onHangup: function() {
				configuration.@com.google.gwt.phono.client.DialConfiguration::onHangup()();
			},
			onError: function(event) {
				configuration.@com.google.gwt.phono.client.DialConfiguration::onError(Ljava/lang/String;)(event.reason);
			}
		});
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
    
    //TODO RINGTONE AND RINGBACKTONE
}
