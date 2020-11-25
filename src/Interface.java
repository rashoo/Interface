/*
Interface example using two different classes;
 */
public class Interface {
    public static void main(String[] args) {

        ITelephone timsPhone;
        timsPhone = new DeskPhone(3831238);

        timsPhone.powerOn();
        timsPhone.callPhone(3831238);
        timsPhone.answer();

        timsPhone = new MobilePhone(883038);
        //timsPhone.powerOn();
        timsPhone.callPhone(883038);
        timsPhone.answer();
    }
}
