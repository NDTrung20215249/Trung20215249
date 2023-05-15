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
   
   public void addDVD(DVD[] dvdList) {
	   for (DVD disc : dvdList) {
	      addDVD(disc);
	   }
	}
   
   public void addDVD(DVD disc1, DVD disc2) {
		if (qtyOrdered + 2 <= MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered++] = disc1;
			itemsOrdered[qtyOrdered++] = disc2;
			System.out.println("Two discs have been added");
		}
		else {
			System.out.println("Your cart is full!");
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
   
   public void print() {
		System.out.println("\n***********************CART***********************");
		System.out.println("Ordered items:");
		for (int i=1; i<=qtyOrdered; i++) {
			System.out.println(i + ". " + itemsOrdered[i-1].toString());
		}
		System.out.println("Total cost: " + this.totalCost() + "$");
		System.out.println("***************************************************");
	}
}
