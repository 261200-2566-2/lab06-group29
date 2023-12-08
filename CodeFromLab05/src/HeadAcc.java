public class HeadAcc implements Head{

    @Override
    public void equip() {
        System.out.println("Head accessory equipped!");
    }

    @Override
    public void unequip() {
        System.out.println("Head accessory unequipped!");
    }

    @Override
    public void information(int n) {
        System.out.println("Information : ");
        switch (n){
            case 1:
                System.out.println("Name : Griffin's Head Braid ");
                System.out.println("Rarity : 4/5");
                System.out.println("Sell Price : 4,750 ฿ ");
                break;
            case 2:
                System.out.println("Name : Ariadne's Diadem");
                System.out.println("Rarity : 2/5");
                System.out.println("Sell Price : 2,350 ฿ ");
                break;
        }
    }

    @Override
    public void drop() {
        System.out.println("Head accessory dropped!");
    }

    @Override
    public void increaseCriticalRate() {
        System.out.println("Buff: Increases critical rate by 30%");
    }
}
