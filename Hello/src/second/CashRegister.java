package second;
public class CashRegister {
	private int itemCount;
	private double totalPrice;

	public CashRegister()
	{
		itemCount=0;
		totalPrice=0;

	}
	public void addItem(double price)
	{
		itemCount++;
		totalPrice=totalPrice+price;
	}
	public double getTotal()
	{
		return totalPrice;
	}
	public int getCount() {
		return itemCount;
	}
	public void clear()
	{
		itemCount=0;
		totalPrice=0;
	}}
