package exam02;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueueTest {
	public static void main(String[] args) {

//		https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html
//		All Known Implementing Classes:
//			AbstractQueue, ArrayBlockingQueue, ArrayDeque, ConcurrentLinkedDeque, 
//			ConcurrentLinkedQueue, DelayQueue, LinkedBlockingDeque, LinkedBlockingQueue, 
//			LinkedList, LinkedTransferQueue, PriorityBlockingQueue, PriorityQueue, SynchronousQueue
		Queue<Message> messageQ = new LinkedList<>(); // LinkedList가 익숙해서 사용함.

		messageQ.offer(new Message("sendMail", "홍길동"));
		messageQ.offer(new Message("sendSMS", "김자바"));
		messageQ.offer(new Message("sendKakaotalk", "박자바"));

		while (!messageQ.isEmpty()) { // not empty
			Message message = messageQ.poll();
			switch (message.getCommand()) {
			case "sendMail":
				System.out.println(message.getTo() + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.getTo() + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.getTo() + "님에게 Kakaotalk을 보냅니다.");
				break;
			}
		}
	}
}
