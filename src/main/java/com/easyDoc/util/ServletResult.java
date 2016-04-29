package com.easyDoc.util;

import java.io.Serializable;

/**
 * define the format for response
 * 
 * @author qiaqia
 *
 */
public class ServletResult implements Serializable {

	private static final long serialVersionUID = -535526088955527425L;
	private int state;
	private Object data;
	private String info;

	public ServletResult() {
		super();
	}

	public ServletResult(int state, Object data, String info) {
		super();
		this.state = state;
		this.data = data;
		this.info = info;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
