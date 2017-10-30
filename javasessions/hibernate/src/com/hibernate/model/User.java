package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User
{
	@Id
    @Column(name="user_id")
	private String userId;
    
    @Column(name="email_address")
    private String emailAddress;
    
    @Column(name="name")
    private String name;
    
    public void setUserId(String userId)
    {
    	this.userId = userId;
    }
    
    public String getUserId()
    {
    	return this.userId;
    }
    
    public void setEmailAddress(String emailAddress)
    {
    	this.emailAddress = emailAddress;
    }
    
    public String getEmailAddress()
    {
    	return this.emailAddress;
    }
    
    public void setName(String name)
    {
    	this.name = name;
    }
    
    public String getName()
    {
    	return this.name;
    }
}
