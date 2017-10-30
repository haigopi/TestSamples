package com.beans;

public class SendEmailBean
{
	String	message;
	String	parentEmailId;
	String	studentLevel;
	String	firstName;
	String	emailsubject;

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getParentEmailId()
	{
		return parentEmailId;
	}

	public void setParentEmailId(String parentEmailId)
	{
		this.parentEmailId = parentEmailId;
	}


	public String getStudentLevel()
	{
		return studentLevel;
	}

	public void setStudentLevel(String studentLevel)
	{
		this.studentLevel = studentLevel;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getEmailsubject()
	{
		return emailsubject;
	}

	public void setEmailsubject(String emailsubject)
	{
		this.emailsubject = emailsubject;
	}

}
