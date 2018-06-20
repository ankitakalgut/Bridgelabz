package DesignPatterns;

public interface ShoppingCartVisitor 
{
	int visit(Watch watch);
	int visit(Fruit fruit);
}

