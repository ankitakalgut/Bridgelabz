package DesignPatterns;

/***************************************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 14-Jun-2018
 * 
 *Purpose:Shopping  cart where  we can add different type of items (Elements). When we click on checkout  button,   it   calculates   the   total   amount   to   be   paid.  
		  Now we can have the calculation logic in item classes or we can move out this logic to  another class
		  using visitor pattern.
 ***************************************************************************************************************/
public class ShoppingCartClient 
{
	public static void main(String[] args) 
	{
		ItemElement[] items = new ItemElement[]{new Watch(20, "1234"),new Watch(100, "5679"),
				new Fruit(10, 2, "Pomogranate"), new Fruit(5, 5, "Mango")};
		
		int total = calculatePrice(items);
		System.out.println("Total Cost = "+total);
	}

	private static int calculatePrice(ItemElement[] items) 
	{
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum=0;
		for(ItemElement item : items)
		{
			sum = sum + item.accept(visitor);
		}
		return sum;
	}
}
