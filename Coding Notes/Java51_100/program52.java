

/**
 * A
 */
interface A {
    int age=44;
    int area=34;
    void show();
    void display();
    
}
class B implements A{
    public void show(){
        System.out.println(" Youa are in show");
    }
    public void display(){
        System.out.println(" You are in display");
    }
}
public class program52 {
    public static void main(String[] args) {
       B obj= new B();
       obj.show();
       obj.display();
       System.out.println(A.area);
    }
   
}
