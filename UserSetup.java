import java.util.Scanner;

public class UserSetup{

   Scanner hehe = new Scanner(System.in);
   public void userName(String userName){
    
        System.out.println("\n---------------------------------------------------------------------------------------\n");
        System.out.println(" Before going on a mission we need to know what is your class and your name Dear Stranger.");
        System.out.println("\n---------------------------------------------------------------------------------------\n");
        System.out.print(" Please Enter your name: " );
        userName = hehe.nextLine();
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println(" Pardon me Lord " +userName+ " i didnt notice you .");
        System.out.println(" Please Spare my life .. ");
        
   }
    public void userAssasin(){
        System.out.println(" Class: Assasin ");
        System.out.println(" Health: ");
        System.out.println(" Attack: ");
        System.out.println(" Weapon: Black Fire Dagger ");
        System.out.println(" Support Weapon: Supreme Dragon Flag ");
    }
    
    public void userWizard(){
        System.out.println(" Class: Wizard ");
        System.out.println(" Health: ");
        System.out.println(" Attack: ");
        System.out.println(" Weapon: Golden Azure Blade ");
        System.out.println(" Support Weapon: Golden Fortitude ");
    }

    public void userTamer(){
        System.out.println(" Class: Tamer ");
        System.out.println(" Health: ");
        System.out.println(" Attack: ");
        System.out.println(" Weapon: Dark Phoenix Xbow ");
        System.out.println(" Support Weapon: Jade Vessel ");
    }

    public void userMonk(){
        System.out.println(" Class: Monk ");
        System.out.println(" Health: ");
        System.out.println(" Attack: ");
        System.out.println(" Weapon: Sultan Extinct Shovel ");
        System.out.println(" Support Weapon: Divine Sultra ");
    }

    public void userPriest(){
        System.out.println(" Class: Priest ");
        System.out.println(" Health: ");
        System.out.println(" Attack: ");
        System.out.println(" Weapon: Jade Storm Pearl ");
        System.out.println(" Support Weapon: Holy Shaded Amulet ");
    }


}