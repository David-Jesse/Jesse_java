package project_java;
// Invoice class with constructors to validate and
// initialize instance variable
public class Invoice {
	private String partNumber, partDescription;
	private double pricePerItem;
	private int quantityItem;
	private double invoiceAmount;
	
	// instance variables that declare the constructors
	public Invoice (String number, String description, int item, double perGoods, double amount)
	{	
		partNumber = number;
		partDescription = description;
		quantityItem = item;
		pricePerItem = item;	
		invoiceAmount = amount;
	}
	 
	public void setInvoiceAmount(double amount)
	{
		invoiceAmount = amount;	
		amount = quantityItem * pricePerItem;
	} // end method setInvoice Amount
	
	public double getInvoiceAmount()
	{
		return invoiceAmount;
	}
	// method to set number of items to be purchased
	public void setPartNumber(String number)
	{
		partNumber = number;
	} // end method setPartNumber
	
	public String getPartNumber()
	{
		return partNumber;
	}// end method getPartNumber
	
	// method to set description of item purchased
	public void setPartDescription(String description)
	{
		partDescription = description;
	} // end method setpartDescription
	
	// method to getpartDescription
	public String getPartDescription()
	{
		return partDescription;
	} // end method getpartDescription
	
	// method to set the quantity of items purchased
	public void setquantityItem(int item)
	{
		if (quantityItem < 0)
			quantityItem = 0;
		quantityItem = item;
	} // end of method set quantityItem
	
	//  method to get the quantity of items purchased
	public int getQuantityItem()
	{
		return quantityItem;
	} // end of method get quantity of items
	
	public void setPricePerGoods(double item)
	{
		if (pricePerItem < 0)
			pricePerItem = 0;
		pricePerItem = item;
	} // end method set price of goods
	
	public double getPricePerGoods()
	{
		return pricePerItem;
	} // end method get price per goods
} // end of class Invoice 
