// public class QueueY {

//      static class Queue {

//         int arr[];
//         int size;
//         int rear = -1;

//         Queue(int n) {
//             arr = new int[n];
//             size = n;
//         }

//         public boolean isEmpty() {
//             return rear == -1;
//         }

//         // Add
//         public void add(int data) {
//             if (rear == size - 1) {
//                 System.out.println("Full queue");
//                 return;
//             }
//             rear++;
//             arr[rear] = data;
//         }

//         public int remove() {
//             if (isEmpty()) {
//                 System.out.println("Empty queue");
//                 return -1;
//             }
//             int front = arr[0];
//             for (int i = 0; i < rear; i++) {
//                 arr[i] = arr[i + 1];
//             }
//             rear--;
//             return front;
//         }

//         public int peek() {
//             if (isEmpty()) {
//                 System.out.println("Empty queue");
//                 return -1;
//             }
//             int front = arr[0];
//             return front;
//         }
//     }

//     public static void main(String args[]) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// public class QueueY {

//      static class Queue {

//        static  int arr[];
//        static int size;
//        static int rear = -1;
//        static int front = -1;

//         Queue(int n) {
//             arr = new int[n];
//             size = n;
//         }

//         public boolean isEmpty() {
//             return rear == -1 && front==-1;
//         }

//         public static boolean isFull(){
//             return ((rear + 1)%size == front );
//         }

//         // Add
//         public void add(int data) {
//             if (rear == size - 1) {
//                 System.out.println("Full queue");
//                 return;
//             }
//             if(front==-1){
//                 front  = 0;
//             }
//             rear=(rear+1)%size;
//             arr[rear] = data;
//         }

//         public int remove() {
//             if (isEmpty()) {
//                 System.out.println("Empty queue");
//                 return -1;
//             }
//             int result = arr[front];
//             if(rear == front){
//                 rear = front = -1;
//             }else{
//                 front =(front + 1)%size ;
//             }
          
//             return result;
//         }

//         public int peek() {
//             if (isEmpty()) {
//                 System.out.println("Empty queue");
//                 return -1;
//             }
//             return arr[front];
//         }
//     }

//     public static void main(String args[]) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// queue using linked list
// public class QueueY {
//   static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//         }
//     }

//      static class Queue {

//         static Node head = null;
//         static Node tail = null;

//         public static boolean isEmpty(){
//             return head == null && tail == null ;
//         }



//         // Add
//         public void add(int data) {
//             Node newNode = new Node(data);
//             if(tail == null){
//                 tail = head =newNode ;
//                 return ;
//             }
//             tail.next = newNode ;
//             tail=newNode;
//         }

//         public int remove() {
           
//             if (isEmpty()) {
//                 System.out.println("Empty queue");
//                 return -1;
//             }
//            int front = head.data;
//             if(head == tail){
//                 tail=null;
//             }
//            head=head.next;

//            return front;
//         }

//         public int peek() {
//            return head.data;
//         }
//     }

//     public static void main(String args[]) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }
// import java.util.ArrayDeque;
// import java.util.LinkedList;
// import  java.util.Queue;
// public class QueueY {
  
    

//     public static void main(String args[]) {
//     //   Queue<Integer> q= new LinkedList<Integer>();
//     Queue<Integer> q= new ArrayDeque<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }



//Implement queue using two stack

import java.util.ArrayDeque;
import  java.util.Queue;
import java.util.Stack;
public class QueueY {
 
    static class Queue{
       static  Stack<Integer>s1= new Stack<>();
       static Stack<Integer>s2= new Stack<>();

       public static boolean isEmpty(){
         return s1.isEmpty();
       }

       public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
       }

       public static int remove(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return s1.pop();

       }

        public static int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return s1.peek();

       }


    }
    

    public static void main(String args[]) {
    //   Queue<Integer> q= new LinkedList<Integer>();
    Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}