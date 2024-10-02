import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<PurchasableItem> itemsList = new ArrayList<>();
        itemsList.add(new PurchasableItem("Resistor", 5, "Restor Supplier"));
        itemsList.add(new PurchasableItem("Transistor",3, "Supplier Tristor"));

        MeasuringDevice measurInstrument1 = new MeasuringDevice("Multimeter", itemsList);
        MeasuringDevice measurInstrument2 = new MeasuringDevice();

        System.out.println();
        measurInstrument1.displayDeviceInfo();

        measurInstrument1.addNewItem(new PurchasableItem("NewTest Item name", 1, "Test supplier"));
        System.out.println();
        measurInstrument1.displayDeviceInfo();
        System.out.println();

        measurInstrument1.removeItem(1);
        System.out.println();
        measurInstrument1.displayDeviceInfo();
        System.out.println();

        System.out.println("Now:");
        measurInstrument2.displayDeviceInfo();
        System.out.println();

        System.out.println("change name ==> NewNameInstr2");
        measurInstrument2.setDeviceName("NewNameInstr2");
        measurInstrument2.displayDeviceInfo();
    }
}