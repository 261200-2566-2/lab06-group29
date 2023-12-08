public class MageCH implements Mage{
    private String name;
    public MageCH(String name){
        this.name =name;
    }
    public void atk() {
        System.out.println(name+":Attack!!");
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
    public void castSpell() {
        System.out.println(name +": Ice Age !!!");
    }
}
