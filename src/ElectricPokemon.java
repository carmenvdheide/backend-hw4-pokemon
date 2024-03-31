public class ElectricPokemon extends Pokemon{
    final private String type;
    private int voltage;

    public ElectricPokemon(String name, int level, int hp, int xp, int height, int weight, int attack, int defense, int speed, int voltage) {
        super(name, level, hp, xp, height, weight, attack, defense, speed);
        this.type = "electric";
        this.voltage = voltage;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public String getType() {
        return type;
    }

    public void thunderShock(Pokemon enemy){
        this.setAttack(getAttack() + 20);
        System.out.println(this.getName() + " is attacking " + enemy.getName() + " with thunder-shock ");
        enemy.setHp(enemy.getHp() - this.getAttack());
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void thunderPunch(Pokemon enemy){
        this.setAttack(getAttack() + 10);
        System.out.println(this.getName() + " is attacking " + enemy.getName() + " with thunder-punch ");
        enemy.setHp(enemy.getHp() - this.getAttack());
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    @Override
    public void speaks() {
        System.out.println("bzzzzzzzzzz");
    }
}
