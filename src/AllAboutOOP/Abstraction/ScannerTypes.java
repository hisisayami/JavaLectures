package AllAboutOOP.Abstraction;

public class ScannerTypes implements Wifi, Color, Fax, Scan {
    @Override
    public void connectWifi() {
        System.out.println("Wifi connection");

    }

    @Override
    public void printColor() {
        System.out.println("Print Document");

    }

    @Override
    public void sendFax() {
        System.out.println("Sending Fax");

    }

    @Override
    public void scanDocument() {
        System.out.println("Scan document");

    }

    public static void main(String[] args) {
        ScannerTypes scanOne = new ScannerTypes();
        System.out.println("Scanner one");
        scanOne.connectWifi();
        scanOne.printColor();

        ScannerTypes scanTwo = new ScannerTypes();
        System.out.println("Scanner Two");
        scanTwo.connectWifi();
        scanTwo.printColor();
        scanTwo.sendFax();

        ScannerTypes scanThree = new ScannerTypes();
        System.out.println("Scanner Three");
        scanThree.connectWifi();
        scanThree.printColor();
        scanThree.sendFax();
        scanThree.scanDocument();
    }
}



interface Wifi{
    abstract  void connectWifi();
}

interface Color{
    abstract void printColor();

        }
interface Fax{
    abstract  void sendFax();
}

interface Scan {
    abstract  void scanDocument();
}