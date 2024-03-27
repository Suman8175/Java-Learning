import java.util.ArrayList;

class Books{
    String name,author;

    public Books(String name, String author) {
        this.name = name;
        this.author = author;
    }
}
class BookIssue {
    Books book; // Reference to the issued book


    public BookIssue(Books book) {
        this.book = book;

    }
    public void bookIssued(Books issued,String date){

        Library.listOfBooks.remove(issued);
        System.out.println("Book: "+issued.name +" Issued on: "+date);
    }

    public void bookReturn(Books issued,String date){

        Library.listOfBooks.add(issued);
        System.out.println("Book: "+issued.name +" Issued on: "+date);
    }
    // Getters and other methods as needed
}

class Library{
    public static ArrayList<Books> listOfBooks;

    public Library(ArrayList<Books> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public void addBooks(Books added){
        listOfBooks.add(added);
        System.out.println("Book "+added.name+" has been added successfully");
    }


    public void showBooks(){
        for (Books i:listOfBooks){
            System.out.println("---------");
            System.out.println("Book Name: "+i.name);
            System.out.println("Book Author: "+i.author);
            System.out.println("-----------");
        }


    }
}


public class MyLibrary {
    public static void main(String[] args) {
        ArrayList<Books> booksList=new ArrayList<>();
        Books b1=new Books("JAVA","Harry Smith");
        Books b2=new Books("Life","William Shakespeare");
        Library l1=new Library(booksList);
        l1.addBooks(b1);
        l1.addBooks(b2);
        BookIssue bi1=new BookIssue(b1);
        bi1.bookIssued(b2,"21");
        l1.showBooks();
    }
}
