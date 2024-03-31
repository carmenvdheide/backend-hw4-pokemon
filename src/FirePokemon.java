public class FirePokemon extends Pokemon{
    private final String type;
    private int heatRadius;

    public FirePokemon(String name, int level, int hp, int xp, int height, int weight, int attack, int defense, int speed, int heathRadius) {
        super(name, level, hp, xp, height, weight, attack, defense, speed);
        this.heatRadius = heathRadius;
        this.type = "fire";
    }

    public String getType() {
        return type;
    }

    public int getHeathRadius() {
        return heatRadius;
    }

    public void setHeathRadius(int heathRadius) {
        this.heatRadius = heathRadius;
    }

    public void fireBlast(Pokemon enemy){
        this.setAttack(getAttack() + 10);
        System.out.println(this.getName() + " is attacking " + enemy.getName() + " with thunder-shock ");
        enemy.setHp(enemy.getHp() - this.getAttack());
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void flameThrower(Pokemon enemy){
        this.setAttack(getAttack() + 15);
        System.out.println(this.getName() + " is attacking " + enemy.getName() + " with flame-thrower ");
        enemy.setHp(enemy.getHp() - this.getAttack());
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    @Override
    public void speaks() {
        System.out.println("fire fire fire fire fire");
    }
}
