package homework;

public class HW7TestOrder {

	public static void main(String[] args) {
		
		Order order1 = new Order("One PC");
        Order order2 = new Order("Two Cars");
        Order order3 = new Order("Three Baskets");
        
        order2.setShippingAddress("91  Oliverio Drive");
        order2.setBillingAddress("255 Counts Lane");
        order3.setShippingAddress("123 Ave Street");
        order3.setBillingAddress("67 North Lane");
        order3.setPhoneNumber("(999)-999-9999");
        order2.setPhoneNumber("(620)-562-5212");
        order2.ship();
        order1.cancel();
        
        System.out.println("Order 2's Name: " + order2.getOrderName());
        System.out.println("Order 3's Date: " + order3.getDate());
        System.out.println("Order 2's Status: " + order2.getStatus());
        System.out.println("Order 3's Shipping Address: " + order3.getShippingAddress());
        System.out.println("Order 2's Billing Address: " + order2.getBillingAddress());
        System.out.println("Order 3's Number: " + order3.getPhoneNumber());
        System.out.println("The number of orders is: " + Order.getTotalOrder());
        
        System.out.println("Order Name: " +order1.getOrderName()+ "| Date: " + order1.getDate()+"| Status: " +order1.getStatus()+ 
        "| Shipping Address: " + order1.getShippingAddress()+ "| Billing Address: " + order1.getBillingAddress() +"| Phone Number: "
        +order1.getPhoneNumber());
        
        System.out.println("Order Name: " +order2.getOrderName()+ "| Date: " + order2.getDate()+"| Status: " +order2.getStatus()+ 
        "| Shipping Address: " + order2.getShippingAddress()+ "| Billing Address: " + order2.getBillingAddress() +"| Phone Number: "
        +order2.getPhoneNumber());
        
        System.out.println("Order Name: " +order3.getOrderName()+ "| Date: " + order3.getDate()+"| Status: " +order3.getStatus()+ 
        "| Shipping Address: " + order3.getShippingAddress()+ "| Billing Address: " + order3.getBillingAddress() +"| Phone Number: "
        +order3.getPhoneNumber());
	}

}
