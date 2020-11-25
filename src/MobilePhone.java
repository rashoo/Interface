public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber){
        this.myNumber = myNumber;
    }
    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone is already on");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now dialing " + phoneNumber + " from the mobile phone");
        }else{
            System.out.println("Phone is off");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Ringing Mobile phone");
        }else{
            isRinging = false;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
