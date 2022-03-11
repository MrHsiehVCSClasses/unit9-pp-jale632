package u9pp.MonsterFighter;

class HealingMonster extends Monster{
    //instance
    private int heal;

    //constructor
    public HealingMonster(String name, int maxHealth, int attack, int experience, int healing){
        super(name, maxHealth, attack, experience, healing);
        heal = healing;
    }

    public String takeTurn(Combatant target){
        this.heal(this.getHealingPerTurn());
        return super.takeTurn(target)+ " regenerate " + getHealingPerTurn();
    }

    public int getHealingPerTurn(){
        return heal;
    }
}
