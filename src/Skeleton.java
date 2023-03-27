public class Skeleton extends Boss{
    private int amountOfArrow;

    public int getAmountOfArrow() {
        return amountOfArrow;
    }

    public void setAmountOfArrow(int amountOfArrow) {
        this.amountOfArrow = amountOfArrow;
    }

    public Skeleton(int health, int damage, int amountOfArrow){
        super(health,damage);
        this.amountOfArrow = amountOfArrow;
    }


    public String info(){
        return super.info() + "\n Amount of arrows: " + amountOfArrow;
    }
}
