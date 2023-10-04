class Shopping
{

public static void main(String[] args)
{
int amount = 1000;
Shopping myself = new Shopping();
myself.purchase(amount);
System.out.println("from main method"+amount);
}

void purchase(int cash)
{
System.out.println("Chash for purchase "+ cash);
cash = 500;
System.out.println("Cash with purchase"+cash);
}

}
