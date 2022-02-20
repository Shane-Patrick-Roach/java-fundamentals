package practice.Monsters;

public class Monster {

    String name;
    String type;
    boolean hasTeeth;
    int combatLevel;
    String color;


    public Monster(String name, String type, boolean hasTeeth, int combatLevel, String color){
        this.name = name;
        this.type = type;
        this.hasTeeth = hasTeeth;
        this.combatLevel = combatLevel;
        this.color = color;
    }


    public String speak(){
        return "I shall smite you down.";
    }

    public String getWeapon(){
        return "Basic Monsters dont have weapons.";
    }

    @Override
    public String toString(){
        return "Monster: " + name + "\n" + type + "\n" + combatLevel + "\n" + hasTeeth+ "\n" + color;
    }

}
