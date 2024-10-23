package Phone;


public class SamsungFactory implements DeviceFactory {

 public Phone createPhone() {
     return new SamsungPhone();
 }


 public Tablet createTablet() {
     return new SamsungTablet();
 }
}
