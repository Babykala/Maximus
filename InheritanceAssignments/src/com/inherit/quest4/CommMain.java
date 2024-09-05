package com.inherit.quest4;

public class CommMain {
public static void main(String[] args) {
	Communication communication;
	String MessagingType="Mail";
	switch(MessagingType) {
	case "SMS":
		communication=new SMSCommunication();
		communication.sendMessage();
		SMSCommunication smsCommun=(SMSCommunication)communication;
		smsCommun.messageLength();
		break;
	case "Phone":
		communication=new PhoneCommunication();
		communication.sendMessage();
		PhoneCommunication phoneCommun=(PhoneCommunication)communication;
		phoneCommun.callService();
		break;
	case "Whatsapp":
		communication=new WhatsappCommunication();
		communication.sendMessage();
		WhatsappCommunication whatsappCommun=(WhatsappCommunication)communication;
		whatsappCommun.otherFeatures();
		break;
	case "Mail":
		communication=new MailCommunication();
		communication.sendMessage();
		MailCommunication mailCommun=(MailCommunication)communication;
		String[] mailTypes=mailCommun.showTypes();
		for (String mail : mailTypes) {
			System.out.println("mail: "+mail);
		}
		break;
	default: break;		
	}
	
}
}
