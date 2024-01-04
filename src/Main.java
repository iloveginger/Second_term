import models.Tshirt;
import models.Order;
public class Main {
    public static void main(String[] args) {
        Tshirt t1 = new Tshirt("COOLTEE","001", 1000,"Lucci", "I drink cool tea and wear COOLTEE", new String[]{"S", "M", "L"});
        Tshirt t2 = new Tshirt("TCOOL","002", 1299,"White Jeans", "Cooler than the other side of the pillow",new String[]{"M", "L"});
        Tshirt t3 = new Tshirt("T-Cool","003", 999,"December", "I drink cool tea and wear COOLTEE",new String[]{"S", "M", "L", "XL"});

        t1.product_info();
        t2.product_info();
        t3.product_info();

        Order o1 = new Order("Ram Basnet",90815678,new int[]{5}, new double[]{999,1299,1000,1299,1000});
        Order o2 = new Order("Hari Guragain", 98023221,new int[]{2}, new double[]{1299,999});
        Order o3 = new Order("Sita Parsain", 987543892,new int[]{6}, new double[]{1000,1000,999,999,1299,1299});
        o1.vat();
        o2.vat();
        o3.vat();

    }
}