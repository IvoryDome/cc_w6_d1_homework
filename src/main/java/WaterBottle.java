public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int drink(){
        volume -= 10;
        return volume;
    }

    public int empty(){
        volume = 0;
        return volume;
    }

    public int fill(){
        volume = 100;
        return volume;
    }











}

