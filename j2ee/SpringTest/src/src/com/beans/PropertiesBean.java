package com.beans;

public class PropertiesBean {

	boolean isToSendEmail;
	String emailSubject;
	String cc;
	String replyTo;
	String from;
	
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getReplyTo() {
		return replyTo;
	}

	public void setReplyTo(String replyTo) {
		this.replyTo = replyTo;
	}

	public void setToSendEmail(boolean isToSendEmail) {
		this.isToSendEmail = isToSendEmail;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public boolean getIsToSendEmail() {
		return isToSendEmail;
	}

	public void setIsToSendEmail(boolean isToSendEmail) {
		this.isToSendEmail = isToSendEmail;
	}

}
