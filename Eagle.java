public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    //methode de Fly
    @Override
    public void takeOff(){
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.println("i believe " + this.getName()+ " can fly !!!");
        }
    }

    @Override
    public void land() {
        if (this.altitude == 0){
            System.out.println("regarde le ce ....");
        }
        
    }

    @Override
    public int ascend(int meters) {
        if(this.flying) {
            this.altitude = Math.min(this.altitude + meters, 10500);
            System.out.println(this.getName()+ " vole majestueusement sale petit rapace !!  " + ", altitude: " + this.altitude);
        }
        return this.altitude;
    }

    @Override
    public int descend(int meters) {
        if(this.flying){
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.println("ho le con !!! " + this.getName() + " tombe comme une ...." +", altitude: " + this.altitude);
        }
        return this.altitude;
    }
}
