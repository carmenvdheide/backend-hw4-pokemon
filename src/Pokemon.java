public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;
    private int xp;
    private int height;
    private int weight;
    private int attack;
    private int defense;
    private int speed;

    public Pokemon(String name, int level, int hp, int xp, int height, int weight, int attack, int defense, int speed) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.xp = xp;
        this.height = height;
        this.weight = weight;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public abstract void speaks();

    public void eats(){
        hp += 2;
        System.out.println(hp);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void attack(Pokemon enemy) {
        System.out.println(this.getName() + " is attacking " + enemy.getName());
        enemy.setHp(enemy.getHp() - this.getAttack());
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
}
