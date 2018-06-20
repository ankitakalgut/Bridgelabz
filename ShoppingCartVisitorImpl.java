package DesignPatterns;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor
{
	@Override
	public int visit(Watch watch) 
	{
		int cost=0;
		//apply 5$ discount if book price is greater than 50
		if(watch.getPrice() > 50)
		{
			cost = watch.getPrice()-5;
		}
		else 
			cost = watch.getPrice();
			System.out.println("Watch ISBN::"+watch.getIsbnNumber() + " cost ="+cost);
			return cost;
	}

	@Override
	public int visit(Fruit fruit) 
	{
		int cost = fruit.getPricePerKg()*fruit.getWeight();
		System.out.println(fruit.getName() + " cost = "+cost);
		return cost;
	}
}
