public class BodyAcc implements Body{
    public void equip() {
        System.out.println("Body accessory equipped!");
    }

    @Override
    public void unequip() {
        System.out.println("Body accessory unequipped!");
    }

    @Override
    public void information(int n) {
        System.out.println("Information : ");
        switch (n) {
            case 1:
                System.out.println("Name : Impenetrable Fortress ");
                System.out.println("Rarity : 3/5");
                System.out.println("Sell Price : 2,500 ฿ ");
            break;
            case 2:
                System.out.println("Name : Kelemvor's Wicked Cuirass");
                System.out.println("Rarity : 5/5");
                System.out.println("Sell Price : 8,000 ฿ ");
            break;
        }
    }

    @Override
    public void drop() {
        System.out.println("Body accessory dropped!");
    }

    @Override
    public void increasesArmorAndHP() {
        System.out.println("Buff: Increases Armor+30 and HP+30");
    }
}
