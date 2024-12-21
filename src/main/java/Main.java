package nodes;
import java.util.*;
public class Main {
	public static Scanner reader=new Scanner(System.in);
		public static Node exe(int x, int y,int n) {
			Node <Integer> first=new Node<>((int)(Math.random()*(y-x+1))+x);
			Node <Integer>current=first;
			Node<Integer>next;
			
			for(int i=0;i<n;i++) {
				next=new Node<>((int)(Math.random()*(y-x+1))+x);
				current.setNext(next);
				current=next;
			}
			return first;
				
		}
		
		public static Node exe1(int[]a) {
			Node<Integer>first=new Node<>(0);
			Node <Integer>current=first;
			Node<Integer>next;
			for(int i=0;i<a.length;i++) {
				next=new Node<>(a[i]);
				current.setNext(next);
				current=next;
			}
			return first.getNext();
			}
		
		
		public static void exe2_1(Node<Integer>list) {
			Node<Integer>curr=list;
			while(curr!=null) {
				System.out.println(curr.getValue());
				curr=curr.getNext();
			}
		}
		public static void exe2_2(Node<Integer>list) {
			Node<Integer>curr=list;
			if(curr==null) {
				return;
			}
			System.out.println(curr.getValue());
			exe2_2(curr.getNext());
		}
		
		public static void exe2_3(Node<Integer>list) {
			if(list==null) {
				System.out.println(list.getValue());
				return;
			}
			exe2_2(list.getNext());
			System.out.println(list.getValue());
		}
		
		public static Node exe3() {
			int ans;
			System.out.println("enter a number");
			ans=reader.nextInt();
			Node<Integer>first=new Node<>(-1);
			Node <Integer>curr=first;
			Node<Integer>next;
			
			while(ans>-1) {
				next=new Node<>(ans);
				curr.setNext(next);
				curr=next;
				System.out.println("enter a number");
				ans=reader.nextInt();	
			}
			return first.getNext();
		}
		
		
		public static void exe4(Node<Integer>list) {
			Node<Integer>a=list;
			
			while(a!=null) {
				if(a.getValue()%2==0) {
					System.out.println(a.getValue());
				}
				a=a.getNext();
			}
		}

		
		public static boolean exe5(int n,Node<Integer>list) {
			Node<Integer>a=list;
			while(a!=null) {
				if(a.getValue()==n) {
					return true;
				}
				a=a.getNext();
			}
			return false;
		}
		
		public static Node<Integer>exe6(Node<Integer>list, n){
			Node<Integer>x;
			x=list;
			if(x.getValue()==n) {
				return x.getNext();
			}
			while(x.hasNext()) {
				if(x.getNext().getValue()==n) {
					x.setNext(x.getNext().getNext());
					return list;
				}
			}
			return list;
		}
		public static Node<Integer>exe7(Node<Integer>list,int n){
			Node<Integer>current=list;
			int count=1;
			
			while(current!=null) {
				if(count==n-1) {
					current.setNext(current.getNext().getNext());
					return list.getNext();
						
				}
				count++;
				current=current.getNext();
			}
			return list.getNext();
		}
	public static boolean exe8(Node<Integer> a1, Node<Integer> b1,Node<Integer> c1){
           if(a1==null) {
        	   return true;
           }
           if(b1==null) {
        	   return false;
           }
          
      	   if(!b1.getValue().equals(a1.getValue())) {
      		   return exe8(a1,b1.getNext(),c1);
      	   
	   }
        }


	public static void exe9(Node<Integer> a1, Node<Integer> b1){
        	Node<Integer> b2 = b1;
        	while(a1 != null) {
        		if(b2.getValue().equals(a1.getValue())) {
        			System.out.println(a1.getValue());
        			b2=b2.getNext();
        		}
        		else {
        			b2=b2.getNext();
        		}
        		if(b2==null) {
              	   b2=b1;
              	   a1=a1.getNext();
              	   }
        	}
        	
         }


	
        

		public static void main(String[] args) {
			int[]a= {1,3,5,2};
			System.out.println(exe1(a));
			
			Node <Integer>b=new Node<>(2);
			Node <Integer> f=new Node<>(5);
			Node <Integer> s=new Node<>(3);
			b.setNext(f);
			f.setNext(s);
			exe2_1(b);
			exe2_2(b);
			exe2_3(b);
			
			System.out.println(exe3());
			exe4(b);
			System.out.println(exe5(6,b));
		}

	}
