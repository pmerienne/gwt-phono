package com.google.gwt.phono.client;

public class DialConfiguration {

	private Integer gain = 100;

	private Integer volume = 100;

	private boolean mute = false;

	private boolean pushToTalk = false;

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
