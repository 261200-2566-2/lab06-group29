public class RingAcc implements Rings{
    public void equip() {
        System.out.println("Rings accessory equipped!");
    }

    @Override
    public void unequip() {
        System.out.println("Rings accessory unequipped!");
    }

    @Override
    public void information(int n) {
        System.out.println("Information : ");
        switch (n) {
            case 1:
            System.out.println("Name : Berserker Ring ");
            System.out.println("Rarity : 2/5");
            System.out.println("Sell Price : 1,000 ฿ ");
            break;
            case 2:
             System.out.println("Name : Ring of Timely Strikes");
            System.out.println("Rarity : 4/5");
            System.out.println("Sell Price : 6,500 ฿ ");
            break;
        }
    }

    @Override
    public void drop() {
        System.out.println("Rings accessory dropped!");
    }

    @Override
    public void  vampire() {
        System.out.println("Buff: Has a 100% hit rate, and will drain 25% of a target's HP");
    }
}
