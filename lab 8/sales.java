
// Imagine a company that markets both hardware and software. Create an
// interface
// that will be implemented by two classes hardware and software, where hardware
// item holds the category of item and its original manufacturer and software
// holds
// type of software and operating system under which it works. Calculate the
// total
// sales for hardware as well as software item recorded for last 3months
import java.util.*;

interface items {
    void recordSale(int q, String mon);

    double calculateTotalSales(String last);
}

class hardware implements items {
    private String name;
    private double price;
    private String manufacturer;
    private String category;
    private List<SaleRecord> salesRecord;

    public hardware(String name, double price, String manufacturer, String category) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.category = category;
        this.salesRecord = new ArrayList<>();
    }

    public void recordSale(int q, String mon) {
        this.salesRecord.add(new SaleRecord(q, mon));
    }

    public double calculateTotalSales(String last) {
        double totalSales = 0;
        for (SaleRecord sale : salesRecord) {
            if (sale.getMonth().compareTo(last) >= 0) {
                totalSales += sale.getQuantity() * price;
            }
        }
        return totalSales;
    }
}

class software implements items {
    private String name;
    private double price;
    private String manufacturer;
    private String softwareType;
    private String operatingSystem;
    private List<SaleRecord> salesRecord;

    public software(String name, double price, String manufacturer, String softwareType, String operatingSystem) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.softwareType = softwareType;
        this.operatingSystem = operatingSystem;
        this.salesRecord = new ArrayList<>();
    }

    public void recordSale(int q, String mon) {
        this.salesRecord.add(new SaleRecord(q, mon));
    }

    public double calculateTotalSales(String lastMonths) {
        double totalSales = 0;
        for (SaleRecord sale : salesRecord) {
            if (sale.getMonth().compareTo(lastMonths) >= 0) {
                totalSales += sale.getQuantity() * price;
            }

        }
        return totalSales;
    }

}

class SaleRecord {
    private int q;
    private String mon;

    public SaleRecord(int q, String mon) {
        this.q = q;
        this.mon = mon;
    }

    public int getQuantity() {
        return q;
    }

    public String getMonth() {
        return mon;
    }
}

public class sales {
    public static void main(String[] args) {
        hardware hardwareItem = new hardware("Desktop PC", 1000.0, "Manufacturer A", "Desktop");
        software softwareItem = new software("Office Suite", 200.0, "Manufacturer B", "Productivity", "Windows");

        // Record sales for hardware and software items
        hardwareItem.recordSale(10, "2023-07");
        softwareItem.recordSale(20, "2023-07");
        hardwareItem.recordSale(5, "2023-08");
        softwareItem.recordSale(15, "2023-08");
        hardwareItem.recordSale(8, "2023-09");
        softwareItem.recordSale(18, "2023-09");

        // Calculate total sales for the last 3 months
        String last3Months = "2023-07";
        double totalHardwareSales = hardwareItem.calculateTotalSales(last3Months);
        double totalSoftwareSales = softwareItem.calculateTotalSales(last3Months);

        System.out.println("Total Hardware Sales (Last 3 Months): $" + totalHardwareSales);
        System.out.println("Total Software Sales (Last 3 Months): $" + totalSoftwareSales);
    }
}
