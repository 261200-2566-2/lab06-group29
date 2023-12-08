import java.util.Scanner;
public class Lab05 {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String playerName = scanner.nextLine();

        RPGCharacter selectedCH = null;
        RPGAccessory selectedAC = null;

        String NClass = null;
            do {
            System.out.println("Choose a character a class:");
            System.out.println("1. Warrior");
            System.out.println("2. Mage");
            System.out.println("3. Assassin");
            System.out.println("4. Archer");

            System.out.print("Enter your number class : ");
            int classChoice = scanner.nextInt();

            switch (classChoice) {
                case 1:
                    selectedCH = new WarriorCH(playerName);
                    NClass = "Warrior";
                    break;
                case 2:
                    selectedCH = new MageCH(playerName);
                    NClass = "Mage";
                    break;
                case 3:
                    selectedCH = new AssassinCH(playerName);
                    NClass = "Assassin";
                    break;
                case 4:
                    selectedCH = new ArcherCH(playerName);
                    NClass = "Archer";
                    break;
                default:
                    System.out.println("Invalid choice or Enter numbers provided.");
            }
            }while(selectedCH==null);


            String NAcc = null;
        do {
            System.out.println("Choose a Accessory :");
            System.out.println("1. Head");
            System.out.println("2. Body");
            System.out.println("3. Gauntlets");
            System.out.println("4. Boots");
            System.out.println("5. Rings");

            System.out.print("Enter your number Accessory : ");
            int accChoice = scanner.nextInt();

            switch (accChoice) {
                case 1:
                    selectedAC = new HeadAcc();
                    NAcc = "Head";
                    break;
                case 2:
                    selectedAC = new BodyAcc();
                    NAcc = "Body";
                    break;
                case 3:
                    selectedAC = new GauntletsAcc();
                    NAcc = "Gauntlets";
                    break;
                case 4:
                    selectedAC = new BootsAcc();
                    NAcc = "Boots";
                    break;
                case 5:
                    selectedAC = new RingAcc();
                    NAcc = "Rings";
                default:
                    System.out.println("Invalid choice or Enter numbers provided.");
            }
        }while(selectedAC==null);



            System.out.println("Welcome ,"+playerName+" !");
            System.out.println("You have chosen the class: "+NClass);


            selectedCH.atk();  // โจมตี
            selectedCH.def();  // ป้องกัน
            selectedCH.useItem();  // ใช้ไอเทม
            selectedCH.useSpecialAbility(); //ใช้ skill ทั่วไป

            // ใช้ skill เฉพาะ class ที่เลือก
            //https://chat.openai.com/ -----------
            if(selectedCH instanceof Warrior){
                ((Warrior) selectedCH).performSpecialAbility();
            }else if(selectedCH instanceof Mage){
                ((Mage) selectedCH).castSpell();
            }else if (selectedCH instanceof Assassin){
                ((Assassin)selectedCH).invisibility();
            }else {
                ((Archer)selectedCH).heavyShot();
            }
            // --------------------------------------
        System.out.println("--------------------------------------------");

        System.out.println("You have equip Accessory: "+NAcc);
        System.out.println("Which one do you choose? ");
        System.out.println("1.?????? ");    //  <-- ทุก Accessory จะมีให้สุ่มเลือก
        System.out.println("2.?????? ");    //  <--
        System.out.print("Enter your choice ? :");
        int InChoice = scanner.nextInt();


        selectedAC.equip();
        selectedAC.unequip();
        System.out.println("---------------------------------");
        selectedAC.information(InChoice);
        System.out.println("---------------------------------");
        selectedAC.drop();


        // ได้บัฟ เฉพาะ Accessory ที่เลือกใส่
        if(selectedAC instanceof Head){
            ((Head)selectedAC).increaseCriticalRate();
        }else if(selectedAC instanceof Body){
            ((Body) selectedAC).increasesArmorAndHP();
        } else if (selectedAC instanceof Gauntlets) {
            ((Gauntlets)selectedAC).attackSpeed();
        } else if (selectedAC instanceof Boots) {
            ((Boots)selectedAC).runSpeed();
        }else {
            ((Rings)selectedAC).vampire();
        }


        scanner.close();

    }
}
