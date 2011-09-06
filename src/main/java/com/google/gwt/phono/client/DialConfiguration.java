package com.google.gwt.phono.client;


public class DialConfiguration {

	Integer gain = 100;

	Integer volume = 100;

	boolean mute = false;

	boolean pushToTalk = false;

	/**
	 * when an outbound call is ringing. 
	 */
	public void onRing() {
		log("Ring");
	}

	/**
	 * when an outbound call is answered. 
	 */
	public void onAnswer() {
		log("Answer");
	}

	/**
	 * when a call is terminated by the remote party. 
	 */
	public void onHangup() {
		log("Hangup");
	}
	
	/**
	 * when an error is reported relating to this call. 
	 */
	public void onError(String reason) {
		log("Error : " + reason);
	}

	private native void log(String message) /*-{
		console.log(message);
	}-*/;
	
	public Integer getGain() {
		return gain;
	}

	public void setGain(Integer gain) {
		this.gain = gain;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public boolean isMute() {
		return mute;
	}

	public void setMute(boolean mute) {
		this.mute = mute;
	}

	public boolean isPushToTalk() {
		return pushToTalk;
	}

	public void setPushToTalk(boolean pushToTalk) {
		this.pushToTalk = pushToTalk;
	}
}
