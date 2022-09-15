public class Character {
    //properties
    private String characterName;
    private int hp;
    private int dmgTaken;
    private int heal;
    private boolean mounted;
    private int movementSpeed;
    private int mountSpeed;

    //constructor
    public Character () {

    }
    public Character (String characterName, int hp, int dmgTaken, int heal, boolean mounted, int movementSpeed, int mountSpeed) {
        this.characterName = characterName;
        this.hp = hp;
        this.dmgTaken = dmgTaken;
        this.heal = heal;
        this.mounted = mounted ;
        this.movementSpeed = movementSpeed;
        this.mountSpeed = mountSpeed;
    }

    //methods
    public String characterTakeDmg (String characterName, int hp, int dmgTaken) {
        return characterName + " took " + dmgTaken + " and now only has " + (hp - dmgTaken) + " health.";
    }

    public String characterHeal  (String characterName, int hp, int heal) {
        return characterName + " is healed for " + (hp+heal);
    }

    public void mountUp (String characterName , int movementSpeed, boolean mounted, int mountSpeed) {
        if (mounted)
            System.out.println(characterName + " is mounted and has a movement speed of: " + (movementSpeed+mountSpeed));
        else
        System.out.println(characterName + " is not mounted and has a movement speed of: " + movementSpeed);


    }

    //setters & getters

}
