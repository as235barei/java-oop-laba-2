import java.util.ArrayList;
import java.util.Scanner;

public class MeasuringDevice {
    private String deviceName;
    private ArrayList<PurchasableItem> items;

    public MeasuringDevice(String deviceName, ArrayList<PurchasableItem> items) {
        this.deviceName = deviceName;
        this.items = items;
    }

    public MeasuringDevice() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter device name: ");
        this.deviceName = scanner.nextLine();

        this.items = new ArrayList<>();
        System.out.println("How many purchased products do you need?");
        scanner.nextLine(); // Очищення буфера

        System.out.print("Enter the number of products: ");
        int itemCount = scanner.nextInt();
        scanner.nextLine(); // Очищення буфера

        for (int i = 0; i < itemCount; i++) {
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();

            System.out.print("Enter product quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Очищення буфера

            System.out.print("Enter product supplier: ");
            String supplier = scanner.nextLine();

            items.add(new PurchasableItem(name, quantity, supplier));

        }
    }

    public void setDeviceName(String name) {
        this.deviceName = name;
    }
    public String getDeviceName() {
        return deviceName;
    }

    public void setItems(ArrayList<PurchasableItem> items) {
        this.items = items;
    }
    public ArrayList<PurchasableItem> getItems() {
        return items;
    }

    public void addNewItem(PurchasableItem item) {
        System.out.println("Success adding new item" + item);
        items.add(item);
    }

    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found in the device.");
        }
    }

//    public void removeItem(PurchasableItem item) {
//        if (items.contains(item)) {
//            items.remove(item);
//            System.out.println("Item removed successfully.");
//        } else {
//            System.out.println("Item not found in the device.");
//        }
//    }

    public void displayDeviceInfo() {
        System.out.println("Item device: " + deviceName);
        System.out.println("Items list: ");
        for (PurchasableItem item : items) {
        System.out.println(item);
        }
    }

}
