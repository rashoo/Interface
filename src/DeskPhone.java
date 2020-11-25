public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber){
        this.myNumber = myNumber;
    }
    @Override
    public void powerOn() {
        System.out.println("Desk phone is already on");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now dialing " + phoneNumber + " on desk phone");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the deskphone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Desk phone: Ring ring");
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
