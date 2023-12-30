import java.util.*;
class Book{
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id,String name , String author ,String publisher ,int quantity){
        this.id=id;
        this.name=name;
        this.publisher=publisher;
        this.quantity=quantity;
    }
}
public class program88 {
    public static void main(String[] args) {
        List<Book>list = new ArrayList<Book>();
        Book b1= new Book(101,"Let us c1","Yashwant Kanetkar1","BPB1",8);
        Book b2= new Book(102,"Let us c2","Yashwant Kanetkar2","BPB2",8);
        Book b3= new Book(103,"Let us c3","Yashwant Kanetkar3","BPB3",8);
        Book b4= new Book(104,"Let us c4","Yashwant Kanetkar4","BPB4",8);

        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);


        System.out.println("Original content of list is:  ");
        for(Book b:list){
            System.out.println(b.id+"  "+b.name+"  "+b.publisher+" "+b.quantity);
        }

        ListIterator<Book> itr= list.listIterator();
        System.out.println("Modified content of list in backward is :   ");
        while (itr.hasNext()) {
            Book st=(Book) itr.next();
            System.out.println(st.quantity+" "+st.publisher+" "+st.author+" "+st.name+"  "+st.id);
        }


    }
}
