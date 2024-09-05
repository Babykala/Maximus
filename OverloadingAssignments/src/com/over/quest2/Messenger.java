package com.over.quest2;

public class Messenger {
void sendMail(String message) {
	System.out.println(message);
}
void sendMail(String toUsername,String message) {
	System.out.println("Send to "+toUsername+"\n"+"Message: "+message);
}
void sendMail(String toUsername,String message,String subject) {
	System.out.println("Send to "+toUsername+"\n"+"Message: "+message+"\n"+"Subject: "+subject);
}
}
