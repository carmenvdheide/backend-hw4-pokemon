public class GrassPokemon extends Pokemon{
    final private String type;
    private int leafSize;

    public GrassPokemon(String name, int level, int hp, int xp, int height, int weight, int attack, int defense, int speed, int leafSize) {
        super(name, level, hp, xp, height, weight, attack, defense, speed);
        this.type = "grass";
        this.leafSize = leafSize;
    }

    public int getLeafSize() {
        return leafSize;
    }

    public void setLeafSize(int leafSize) {
        this.leafSize = leafSize;
    }

    public String getType() {
        return type;
    }

    public void leafBlade(Pokemon enemy){
        this.setAttack(getAttack() + 5);
        System.out.println(this.getName() + " is attacking " + enemy.getName() + " with thunder-shock ");
        enemy.setHp(enemy.getHp() - this.getAttack());
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void solarBeam(Pokemon enemy){
        this.setAttack(getAttack() + 20);
        System.out.println(this.getName() + " is attacking " + enemy.getName() + " with solar-beam ");
        enemy.setHp(enemy.getHp() - this.getAttack());
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    @Override
    public void speaks() {
        System.out.println("fffffffffff");
    }
}
