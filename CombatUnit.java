public class CombatUnit {
    private Long id;
    private String name;
    private double damage;
    private double hp;
    public static Long idCounter = 1L;

    public CombatUnit(String name, double hp, double damage)
    {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        id = idCounter++;
    }

    void Attack(CombatUnit combatUnit)
    {
        combatUnit.hp = combatUnit.hp - damage;
    }

    @Override
    public String toString()
    {
        return name + " {id: " + id + " hp: " + hp + " damage: " + damage + "}.";
    }
}
