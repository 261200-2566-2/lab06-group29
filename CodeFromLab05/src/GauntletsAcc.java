public class GauntletsAcc implements Gauntlets{
    public void equip() {
        System.out.println("Gauntlets accessory equipped!");
    }

    @Override
    public void unequip() {
        System.out.println("Gauntlets accessory unequipped!");
    }

    @Override
    public void information(int n) {
        System.out.println("Information : ");
        switch (n) {
            case 1:
            System.out.println("Name : Adamantite Gauntlets ");
            System.out.println("Rarity : 5/5");
            System.out.println("Sell Price : 8,500 ฿ ");
            break;
            case 2:
             System.out.println("Name : Fists of Broken Hope");
            System.out.println("Rarity : 3/5");
            System.out.println("Sell Price : 3,250 ฿ ");
            break;
        }
    }

    @Override
    public void drop() {
        System.out.println("Gauntlets accessory dropped!");
    }

    @Override
    public void attackSpeed() {
        System.out.println("Buff: Increases Attack Speed by 20%");
    }
}
