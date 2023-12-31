import java.util.ArrayList;
import java.util.Stack;
public class ArrayListTopic {
    // static class Stack{
    //    static ArrayList<Integer> list = new ArrayList<Integer>();

    //     public static boolean isEmpty(){
    //         return list.size()==0;
    //     }


    //     //push function

    //     public static void push(int data){
    //         list.add(data);
    //     }
    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top = list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return top;
    //     }

    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return list.get(list.size()-1);
    //     }
    // }
    public static void solve(Stack<Integer>s,int val){
        //Base Case 
        if(s.size()==0){
            s.add(val);
            return ;
        }



        //Recursion Case
        int t=s.pop();
        solve(s, val);
        s.add(t);
        return;


    }
    public static void solveReverse(Stack<Integer>s){
         if(s.size()==0){
          return ;
        }



        //Recursion Case
        int t=s.pop();
        solveReverse(s);
        solve(s, t);
        return;
    }
    public static void main(String[] args) {
        // Stack s= new Stack();
        Stack<Integer> s= new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        int val=10;
        // solve(s,val);
        solveReverse(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
