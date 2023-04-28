package AimsPro;

public class Cart {
   private int qtyOrdered = 0;
   public static final int MAX_NUMBERS_ORDERED = 20;
   private DVD itemsOrdered[]= new DVD[MAX_NUMBERS_ORDERED];
   public void addDVD(DVD disc) {
	
	if (qtyOrdered < MAX_NUMBERS_ORDERED) {
	      itemsOrdered[qtyOrdered] = disc;
	      qtyOrdered++;
	      System.out.println("The disc " + disc.getTitle() + " has been added.");
	   }
	   else {
	      System.out.println("The cart is full.");
	   }
	}
   public void removeDVD(DVD disc) {
	   int index = -1;
	   for (int i = 0; i < qtyOrdered; i++) {
	      if (itemsOrdered[i].equals(disc)) {
	         index = i;
	         break;
	      }
	   }
	   if (index == -1) {
	      System.out.println("The disc " + disc.getTitle() + " is not in the cart.");
	   }
	   else {
	      for (int i = index; i < qtyOrdered - 1; i++) {
	         itemsOrdered[i] = itemsOrdered[i+1];
	      }
	      qtyOrdered--;
	      itemsOrdered[qtyOrdered] = null;
	      System.out.println("The disc " + disc.getTitle() + " has been removed.");
	   }
	}
   public float totalCost() {
	   float total = 0;
	   for (int i = 0; i < qtyOrdered; i++) {
		   total = total + itemsOrdered[i].getCost();
	   }
	   return total;
   }
}
