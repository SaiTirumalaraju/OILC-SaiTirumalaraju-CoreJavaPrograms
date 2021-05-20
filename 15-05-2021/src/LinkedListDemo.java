import java.util.*;
class Node{
	int data;
	Node link;
	Node(){
		this.link=null;
	}
}
public class LinkedListDemo {
	
	static Node head = null;
	
	public static void create(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.link = null;
		if(head == null) {
			head = temp;
		}
		else {
			Node p = head;
			while (p.link!=null) {
				p=p.link;
			}
			p.link=temp;
		}
	}
	
	public static void print() {
		Node temp = head;
		
		if(temp==null) {
			System.out.println("No elements are present in the linked list");
			
		}
		else {
			while(temp.link!=null) {
				System.out.println(temp.data);
				temp=temp.link;
			}
			System.out.println(temp.data);
		}
	}
 
	public static int length() {
		int count =0;
		Node temp = head;
		if(temp==null) {
			System.out.println("no elements are Present in the linked list");
		}
		else {
			while(temp.link!=null) {
				count++;
				temp=temp.link;
			}
			count++;
		}
		return count;
	}
	public static void addAtBegin(int data) {
		Node temp = new Node();
		temp.data=data;
		temp.link=null;
		if(head==null) {
			head=temp;
		}
		else {
			temp.link=head;
			head=temp;
		}
	}
	
	static void menu() {
		
		String m = "Menu driven Application\n";
		m+="1.Add Element\n";
		m+="2.Display Element\n";
		m+="3.No.Of Element\n";
		m+="4.Add at begin\n";
		m+="5.Delete Element\n";
		m+="6.Add Element at Specific location\n";
		m+="7.Exit\n";
		m+="Select any Option\n";
		System.out.println(m);	
	}
	
	public static void delete(int loc)
	{
		Node temp=head;
		if(loc>length()) {
			System.out.println("invalid Location");
		}
		else if(loc==1)
		{
			temp=head;
			head=temp.link;
			temp.link=null;
			System.out.println("deleted element is="+temp.data);
		}
		else {
			Node p,q;
			p=head;
			int i=1;
			while(i<loc--) {
				p=p.link;
				i++;
				
			}
			q=p.link;
			p.link=q.link;
			q.link=null;
			System.out.println("deleted element is ="+q.data);
		}
	}
	static public void accept() {
		System.out.println("enter any value?");
	}
	
	static void addAfter(int loc,int data) {
		Node p;
		Node temp = new Node();
		temp.data=data;
		temp.link=null;
		
		if(loc > length()) {
			System.out.println("Invalid Location");
		}
		else {
			int i=1;
			p=head;
			while(i<loc) {
				p=p.link;
				i++;
			}
			temp.link=p.link;
			p=temp;
		}
	}
	
	public static void main(String[] args) 
	{
		LinkedListDemo obj = new LinkedListDemo();
		Scanner sc = new Scanner(System.in);
		while(true) {
			menu();
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				accept();
				create(sc.nextInt());
				break;
			case 2:
				print();
				break;
			case 3:
				System.out.println(length());
				break;
			case 4:
				accept();
				addAtBegin(sc.nextInt());
				break;
			case 5:
				System.out.println("Enter Location:");
				delete(sc.nextInt());
				break;
			case 6:
				System.out.println("enter loc,data");
				addAfter(sc.nextInt(),sc.nextInt());
				break;
			case 7:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Option");
				
			}
		}
	}

}
