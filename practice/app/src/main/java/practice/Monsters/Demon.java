package practice.Monsters;

public class Demon extends Monster{

    String specialAttack = "Sunder green flames";
    String weapon = "Claws of fire.";

    public Demon(String name, String type, boolean hasTeeth, int combatLevel, String color) {
        super(name, type, hasTeeth, combatLevel, color);
    }


    public String speak(){
        return "I shall burn this world to the ground!!!!";
    }


    public String getWeapon(){
        return weapon;
    }

}
