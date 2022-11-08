package project_java;
// creating and manipulating an Invoice object
public class InvoiceTest {
	// main method begins execution of Java application
	public static void main(String[] args)
	{
		
		//Create an Invoice object and assign it to invoice1
		Invoice invoice1 = new Invoice("Four bags", "Four leather black bags", 6, 100.00, 0.00);
		
		System.out.printf("You've added: %s\n", 
				invoice1.getPartNumber());
		
		System.out.printf("Description: %s\n", 
				invoice1.getPartDescription());
		
		System.out.printf("Amount: %d\n", 
				invoice1.getQuantityItem());
		
		System.out.printf("Price per item: %.2f\n:", 
				invoice1.getPricePerGoods());
		
		System.out.printf("Total amount: %.2f\n", 
				 invoice1.getInvoiceAmount());
	}

}
