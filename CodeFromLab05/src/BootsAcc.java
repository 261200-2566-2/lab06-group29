public class BootsAcc implements Boots{
    public void equip() {
        System.out.println("Boots accessory equipped!");
    }

    @Override
    public void unequip() {
        System.out.println("Boots accessory unequipped!");
    }

    @Override
    public void information(int n) {
        System.out.println("Information : ");
        switch (n){
            case 1:
                System.out.println("Name : Lich Ebon Warboots ");
                System.out.println("Rarity : 1/5");
                System.out.println("Sell Price : 1,000 ฿ ");
                break;
            case 2:
                 System.out.println("Name : Walkers of Imminent Damnation");
                System.out.println("Rarity : 5/5");
                System.out.println("Sell Price : 8,500 ฿ ");
                break;

        }


    }

    @Override
    public void drop() {
        System.out.println("Boots accessory dropped!");
    }

    @Override
    public void runSpeed() {
        System.out.println("Buff: Increases runSpeed by 35%");
    }
}
