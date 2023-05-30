package AimsPro;

public class Store {
    private DVD[] itemsInStore;
    private int itemCount;

    public Store(int capacity) {
        itemsInStore = new DVD[capacity];
        itemCount = 0;
    }

    public void adddvd(DVD dvd) {
        if (itemCount < itemsInStore.length) {
            itemsInStore[itemCount] = dvd;
            itemCount++;
            System.out.println(dvd.getTitle() + " has been added to the store.");
        } else {
            System.out.println("The store is full. Cannot add " + dvd.getTitle() + ".");
        }
    }

    public void removedvd(DVD dvd) {
        boolean found = false;
        int index = -1;

        for (int i = 0; i < itemCount; i++) {
            if (itemsInStore[i].equals(dvd)) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            for (int i = index; i < itemCount - 1; i++) {
                itemsInStore[i] = itemsInStore[i + 1];
            }

            itemsInStore[itemCount - 1] = null;
            itemCount--;
            System.out.println(dvd.getTitle() + " has been removed from the store.");
        } else {
            System.out.println(dvd.getTitle() + " is not found in the store.");
        }
    }
}
