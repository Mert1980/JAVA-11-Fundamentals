package be.intecbrussel.exercise_car_inheritance;

public class SUV extends Car{
    private boolean bullbar;
    private boolean isAWDOn;

    public SUV(){
        this.bullbar = false;
        this.setHp(190);
    }

    public SUV(String color, int hp){
        super.setColor(color);
        super.setHp(hp);
        this.bullbar = false;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;
    }

    public boolean getBullbar() {
        return bullbar;
    }

    public void AWDrive(boolean mode){
       this.isAWDOn = mode;
    }

    @Override
    public void accelerate(int amount) {
        int totalSpeed = this.getSpeed()+ amount + (this.getHp()/100);
        if(isAWDOn == true &&  totalSpeed > 30){
            this.setSpeed(30);
        } else {
            this.setSpeed(this.getSpeed()+ amount + (this.getHp()/100));
        }
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public String toString() {
        return "SUV{" +
                "bullbar= " + bullbar +
                ", " + "speed= " + this.getSpeed() +
                ", " + "hp= " + this.getHp() +
                ", " + "color= " + this.getColor() +
                '}';
    }
}
