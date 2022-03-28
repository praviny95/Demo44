package selfEvaluationLab1;
import java.util.Scanner;


public class bookstore
{
	static String collegename;
	Scanner s= new Scanner(System.in);
	String bookname;
	int qty,price,discount;
	
	
	int checkprice()
	{
		if(price>5000) 
			 discount=price-200;
		else
			 discount=price-100;
			return discount;
	 }
	
	static void college()
	{
		collegename="CDAC NOIDA";
		System.out.println(collegename);
	}
	
  void input()
    {
		System.out.println("Enter Bookname: ");
		bookname=s.nextLine();
		System.out.println("Enter Quantity Required: ");
		qty=s.nextInt();
		System.out.println("Enter Price: ");
		price=s.nextInt();
	}
	void display() 
	{
		System.out.println("Bookname: "+bookname);
		System.out.println("Quantity= "+qty);
		System.out.println("Price= "+price);
    }
	public static void main(String[] args)
	{
		bookstore b=new bookstore();
		b.input();
		b.display();
		System.out.println("Discounted Amount is: "+b.checkprice());
		college();
	}

}
