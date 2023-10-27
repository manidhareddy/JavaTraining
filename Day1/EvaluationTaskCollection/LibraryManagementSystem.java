
import java.util.*;

class Book{
	private int id;
	private String title;
	private String author;
	private String ISBN;
	private boolean available;
	public Book(){}
	public Book(int id,String title,String author,String ISBN,boolean available){
		this.id = id;
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.available = available;
	}
	public void setID(int id){
		this.id = id;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public void setISBN(String ISBN){
		this.ISBN = ISBN;
	}
	public void setAvailability(boolean available){
		this.available = available;
	}
	public int getID(){
		return this.id;
	}
	public String getTitle(){
		return this.title;
	}
	public String getAuthor(){
		return this.author;
	}
	public boolean getAvailability(){
		return this.available;
	}
	public String toString(){
		return this.id+" "+this.author+" "+this.title+" "+this.available+" "+this.ISBN;
	}
}
class Library{
	private Map<Integer,Book> books;
	public Library(){
		this.books = new HashMap<>();
	}
	public void addBook(Book book){
		if(!books.containsKey(book.getID())){
			books.put(book.getID(),book);
		}
		else{
			System.out.println("This book is already present in the Library");
		}
	}
	public void removeBook(int id){
		if(books.containsKey(id)){
			books.remove(id);
		}
		else{
			System.out.println("Already removed");
		}
	}
	public boolean checkAvaliability(int id){
		return this.books.get(id).getAvailability();
	}
	public void updateAvailability(int id , boolean available){
		Book book = this.books.get(id);
		book.setAvailability(available);
	}
	public void searchBookByTitle(String title){
		List<Book> foundBooks = new ArrayList<>();
		for(Book book : books.values()){
			if(book.getTitle().equalsIgnoreCase(title)){
				foundBooks.add(book);
			}
		}
		if(foundBooks.size()==0){
			System.out.println("No books found");
		}
		else{
			for(Book book : foundBooks){
				System.out.println(book);
			}
		}
	}
	
	public void displayAvailableBooks() {
        for(Book book : this.books.values()){
			if(book.getAvailability()){
				System.out.println(book);
			}
		}
    }
}
public class LibraryManagementSystem{
	public static void main(String[] args){
		Library library = new Library();
		library.addBook(new Book(1,"Classic DataStructures","Samanta","978-81-203-3731-2",true));
		library.addBook(new Book(2,"Let Us Python","Kanetkar","978-93-8989-852-1",true));
		library.addBook(new Book(3,"Classic DataStructures","Samanta","978-81-203-3731-2",true));
		library.addBook(new Book(4,"Clean Code","Robert C","9780132350884",false));
		library.displayAvailableBooks();
		library.searchBookByTitle("Classic DataStructures");
	}
}