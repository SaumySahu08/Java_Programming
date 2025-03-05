import java.util.Scanner;

class Book 
{
	private String bookTitle;
	private String authorName;

	public Book(String bookTitle, String authorName) 
	{
		super();
		this.bookTitle = bookTitle;
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Book [bookTitle=" + bookTitle + ", authorName=" + authorName + "]";
	}
	
	public static Book getBookObject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Book Title :");
		String title = sc.nextLine();
		System.out.print("Enter Author Name :");
		String author = sc.nextLine();
		
		return new Book(title, author);
	}	

}
public class BookDemo {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Objects :");
		int noOfObj = sc.nextInt();
		
		for(int i=1; i<=noOfObj; i++)
		{
			Book object = Book.getBookObject();
			System.out.println(object);
		}
		
		sc.close();	
	}

	
}