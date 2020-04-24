package classes;
import classes.Queue;
import classes.DLinkedList;
import classes.LinkedList;
import classes.priorityQueue;
public class Mail implements IMail{
	public String check;//to check if recievers are in system or not.
	private String sender;
	private String subject;
	public Queue receiver;
	private String component;
	private String importance;//hn5leha kda b7as ndwar fel index w al nla2y feh kelma mo3yna ndelo trteb mo3yn fel priority queue.
	public LinkedList attachements;//to set attachements in each node (attachement=file)
	private String path;
	//constructors
	public Mail() {}
	public Mail(String sender,String receivers,String subject,String component,String importance){
		this.importance=importance;
		this.sender=sender;
		this.check=receivers;
		String []arr=receivers.split("\\s+");
		receiver=new Queue();
		for(int i=0;i<arr.length;i++) {
			System.out.println("i am here");
			receiver.enqueue(arr[i]);
		}
	//listing receivers in queue.
	  for(int i=0;i<arr.length;i++) {
		  receiver.enqueue(arr[i]);
	  }
		this.component=component;
		this.attachements=new LinkedList();
		this.subject=subject;
	}
	public String getSender() {
		return this.sender;
	}
	public String getImportance() {
		return this.importance;
	}
	
	
	public String getComponent() {
		return this.component;
	}
	public String getSubject() {
		return this.subject;
	}
	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path=path;
	}
	
}
