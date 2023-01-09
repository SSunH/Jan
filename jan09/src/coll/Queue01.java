package coll;

import java.util.LinkedList;
import java.util.Queue;

// p 770 .
// 카톡
class Message{
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to =to;
	
	}
}
public class Queue01 {
	public static void main(String[] args) {
		Queue<Message> messagesQueue = new LinkedList<Message>();
		
		messagesQueue.offer(new Message("sendMail", "홍길동"));
		messagesQueue.offer(new Message("sendSMS", "훙길동"));
		messagesQueue.offer(new Message("sendKaKaoTalk", "항길동"));
		
		while(!messagesQueue.isEmpty()) {
			Message message = messagesQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다. ");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 문자를 보냅니다. ");
				break;
			case "sendKaKaoTalk":
				System.out.println(message.to + "님에게 카톡을 보냅니다. ");
				break;
	
			default:
				break;
			}
		}
		
	}

}
