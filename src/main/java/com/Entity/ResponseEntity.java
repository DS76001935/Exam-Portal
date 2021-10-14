package com.Entity;

public class ResponseEntity<T> {
	
	int status;
	String message;
	T Data;
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return Data;
	}
	public void setData(T data) {
		Data = data;
	}
	@Override
	public String toString() {
		return "ResponseEntity [status=" + status + ", message=" + message + ", Data=" + Data + "]";
	}

}
