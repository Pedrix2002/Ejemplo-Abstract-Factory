package Phone;


public class Client {
 public static void main(String[] args) {

     DeviceFactory appleFactory = new AppleFactory();
     Phone applePhone = appleFactory.createPhone();
     Tablet appleTablet = appleFactory.createTablet();
     
     applePhone.getSpecifications();
     appleTablet.getSpecifications();


     DeviceFactory samsungFactory = new SamsungFactory();
     Phone samsungPhone = samsungFactory.createPhone();
     Tablet samsungTablet = samsungFactory.createTablet();
     
     samsungPhone.getSpecifications();
     samsungTablet.getSpecifications();
 }
}
