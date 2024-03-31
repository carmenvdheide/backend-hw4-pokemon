public class WaterPokemon extends Pokemon {
    final private String type;
    private int waterPressure;

    public WaterPokemon(String name, int level, int hp, int xp, int height, int weight, int attack, int defense, int speed, int waterPressure) {
        super(name, level, hp, xp, height, weight, attack, defense, speed);
        this.type = "water";
        this.waterPressure = waterPressure;
    }

    public int getWaterPressure() {
        return waterPressure;
    }

    public void setWaterPressure(int waterPressure) {
        this.waterPressure = waterPressure;
    }

    public String getType() {
        return type;
    }

    public void waterGun(Pokemon enemy){
        this.setAttack(getAttack() + 10);
        System.out.println(this.getName() + " is attacking " + enemy.getName() + " with thunder-shock ");
        enemy.setHp(enemy.getHp() - this.getAttack());
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void surf(Pokemon enemy){
        this.setAttack(getAttack() + 10);
        System.out.println(this.getName() + " is attacking " + enemy.getName() + " with surf ");
        enemy.setHp(enemy.getHp() - this.getAttack());
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    @Override
    public void speaks() {
        System.out.println("blub");
    }
}
