public class AssassinCH implements Assassin{
    private String name;
    public AssassinCH(String name){
        this.name =name;
    }
    public void atk() {
        System.out.println(name+": Attack!!");
    }

    @Override
    public void def() {
        System.out.println(name+": Defends!!");
    }

    @Override
    public void useItem() {

        System.out.println(name+": Uses an item! ");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name+": Uses a SpecialAbility!!");
    }

    @Override
    public void invisibility() {
        System.out.println(name+": You can see me? Yam Kra mom !!!");
    }
}
