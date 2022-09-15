public class Main {
    public static void main(String[] args) {

        Character character = new Character();

        System.out.println(character.characterTakeDmg("Cendai",69000,4200));
        System.out.println(character.characterHeal("Gendai",69000,4000));

        character.mountUp("Cendai", 100, true, 310);


    }
}