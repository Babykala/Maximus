package com.inherit.quest4;

public class MailCommunication extends Communication {
//	void sendMail() {
//		System.out.println("Mail Communication");
//	}

	void sendMessage() {
		System.out.println("communication using mail service");
	}

	String[] showTypes() {
		return new String[] { "email", "telegram", "letter" };
	}

}
