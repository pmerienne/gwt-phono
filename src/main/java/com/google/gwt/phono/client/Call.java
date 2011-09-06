package com.google.gwt.phono.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Call {

	private JavaScriptObject obj;

	public Call(JavaScriptObject obj) {
		this.obj = obj;
	}
	
	/**
	 * When a call arrives via an incomingCall event, it can be answered by calling this function. 
	 */
	public native void answer() /*-{
		this.@com.google.gwt.phono.client.Call::obj.answer();
	}-*/;
	
	/**
	 * Hangs up an active call. 
	 */
	public native void hangup() /*-{
		this.@com.google.gwt.phono.client.Call::obj.hangup();
	}-*/;
	
	/**
	 * Sets the volume of the call 
	 * @param value
	 */
	public native void setVolume(Integer value) /*-{
		this.@com.google.gwt.phono.client.Call::obj.volume(value);
	}-*/;
	
	/**
	 * Sets the microphone gain for the call 
	 * @param value
	 */
	public native void gain(Integer value) /*-{
		this.@com.google.gwt.phono.client.Call::obj.gain(value);
	}-*/;

	/**
	 * Returns the unique identifier for this Call. 
	 */
	public native String getId() /*-{
		return this.@com.google.gwt.phono.client.Call::obj.id;
	}-*/;
	
	/**
	 * Returns the current state of the Call. Possible values are: connected,
	 * ringing, disconnected, progress, initial.
	 */
	public native int getState() /*-{
		return this.@com.google.gwt.phono.client.Call::obj.state;
	}-*/;
	
	//TODO
	/*
	 * digit(string) Sends a touch-tone signal to the remote party. This is
	 * equivalent to pressing a key on a touch tone phone.
	 * 
	 * pushToTalk(boolean) When set to true, Phono will act as a walkie-talkie
	 * and the microphone will be muted. When in push to talk mode, toggling the
	 * "talking" property is equivalent to pressing and releasing the talk
	 * button on a two-way radio. This is useful when using Phono to interact
	 * with speech-driven telephone systems or when carrying a conversation
	 * without a headset. Most computer microphone's lack the ability to do
	 * proper acoustic echo canceling resulting in poor audio quality. Using a
	 * computer headset alleviates this problem. Please note that future
	 * releases of Phono will include built-in acoustic echo cancelation.
	 * 
	 * talking(boolean) This setting only applies when pushToTalk is true. When
	 * in pushToTalk mode, setting the talking property to true will enable the
	 * microphone and slightly mute the incoming audio. When set to false, the
	 * microphone will be muted and incoming audio returned to normal.
	 * 
	 * mute(boolean) Stops sending audio to the remote party
	 * 
	 * hold(boolean) Mutes the microphone and stops sending audio to the remote
	 * party. Useful if implementing "call waiting" in your Phone.
	 */
	
}