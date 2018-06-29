package com.example.tests1;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


			//**********@author Siddhartha.B**************//
			//*****************28-June-2018***************//


@Document(collection = "Accounts")
public class Account {

	@Id
	private String Acc_Id;
	private String Acc_Name;
	private String Acc_Type;
	private Date ActOpendate;

	
	enum Actype{Agency,Corporate,Hotel,MemberHotel,Other}
	
	
	public Account() {
	}

	public Account(String accid, String acname, String actype, Date actdate) {
		this.Acc_Id = accid;
		this.Acc_Name = acname;
		this.Acc_Type = actype;
		this.ActOpendate = actdate;
	}

	public String getAcc_Id() {
		return Acc_Id;
	}

	public void setAcc_Id(String acc_Id) {
		Acc_Id = acc_Id;
	}

	public String getAcc_Name() {
		return Acc_Name;
	}

	public void setAcc_Name(String acc_Name) {
		Acc_Name = acc_Name;
	}

	public String getAcc_Type() {
		return Acc_Type;
	}

	public void setAcc_Type(String acc_Type) {
		Acc_Type = acc_Type;
	}

	public Date getActOpendate() {
		return ActOpendate;
	}

	public void setActOpendate(Date actOpendate) {
		ActOpendate = actOpendate;
	}

}
