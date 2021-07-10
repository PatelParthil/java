
package book_store;
import java.util.*;
public class book_storer1 {
    Scanner sc = new Scanner(System.in);
    String author;
    String bookname;
    int bookprice,bookstock;
    public int find(String p,String q)
    {
        if(bookname.equals(p) && author.equals(q))
        {
            System.out.println("Matched Books");
            System.out.println("Bookname="+bookname);
            System.out.println("Author="+author);
            System.out.println("Book price="+bookprice);
            System.out.println("Book stock="+bookstock);
            System.out.println("How many copies you want");
            int c=sc.nextInt();
            if(c>bookstock)
            {
                System.out.println("Out of book stock");
            }
            else
            {
                System.out.println("total cost="+c*bookprice);
            }
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=5,i=0,temp=0;
         String author;
    String bookname;
    int bookprice,bookstock;
        book_store1[] o = new book_store1[n];
        System.out.println("Details fo book");
        System.out.println("Author name= ");
        author=sc.nextLine();
        System.out.println("Book name= ");
        bookname=sc.nextLine();
        System.out.println("Book price= ");
        bookprice=sc.nextInt();
        System.out.println("Book stock= ");
        bookstock=sc.nextInt();
        System.out.println("Find your favourite books");
        System.out.println("Enter the book name=");
        String bname=sc.nextLine();
        System.out.println("Enter the author name=");
        String aname=sc.nextLine();
        for(i=0;i<5;i++)
        {
            if(o[i].find(bname,aname)==1)
            {
                temp=1;
            }
        }
        if(temp==0)
        {
            System.out.println("No match found !!!!");
        }
    }
}
