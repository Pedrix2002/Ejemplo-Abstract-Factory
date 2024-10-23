package Phone;


public class AppleFactory implements DeviceFactory {

 public Phone createPhone() {
     return new ApplePhone();
 }


 public Tablet createTablet() {
     return new AppleTablet();
 }
}
