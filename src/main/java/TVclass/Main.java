package TVclass;


import java.sql.SQLOutput;

class TVset{
    private int channel = 5;
    private  boolean isOn = false;
    private Remote remote = new Remote();

    public Remote getRemote() {
        return remote;
    }

    class Remote{
        public void setChannel(int channel){
            TVset.this.channel = channel;
        }

        public void turnOn(){
            int a = 10;
            class Test{
                public void show(){
                    System.out.println(a);
                    channel = 10;
                    System.out.println(channel);

                }
            }

            Test test = new Test();
            test.show();
            isOn = true;
        }
        public void turnOff(){
            isOn = false;
        }
    }


    public String toString(){
        if(!isOn)
            return "The TVSet is OFF";
        return "Channel " + channel + " is on the TVSet now.";
    }
}




public class Main {
    public static void main(String[] args) {

        TVset.Remote remote = new TVset().new Remote();
        remote.turnOn();
        remote.setChannel(2);

        System.out.println(8d);
    }
}
