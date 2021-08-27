import java.util.Random;
import java.util.Scanner;

public class Text_Game {
  static int playerHP = 40;
  static int creepyWoodman = 10;
  static int EvilMermaid = 15;
  static int SexyEvilPrincess = 50;
  static int map;
  static String choice;
  static int todo;
  static int essence_Rings = 3;
  static String name = " ";
  static Scanner get = new Scanner(System.in);
  static UserSetup input = new UserSetup();
  static CLassChoice pick = new CLassChoice();
    public static void main (String[]args){
      input.userName(name);
      pick.classList();
      System.out.print(" Choose your Class: ");
      choice = get.next();

      if (choice.equals("Assasin")){
          input.userAssasin(); 
          Nowhere();
      }

      else if (choice.equals("Wizard")){
        input.userWizard();
        Nowhere();
    }

      else if (choice.equals("Tamer")){
          input.userTamer();
          Nowhere();
      }

      else if (choice.equals("Monk")){
        input.userMonk();
        Nowhere();
    }

      else if (choice.equals("Priest")){
        input.userPriest();
        Nowhere();
    }
      get.close();
    }

    static void Nowhere(){
      System.out.println("\n------------------------------------------------------------------\n");
      System.out.println(" You are in the Middle of nowhere My Dear " +choice +".");
      System.out.println(" 1. Woods ");
      System.out.println(" 2. River ");
      System.out.println(" 3. Abandonned Village ");
      System.out.println(" 4. Check Player HP ");
      System.out.println(" 5. Total of Essence Ring that are hidden ");
      System.out.println(" 6. Last Boss (Sexy Evil Princess) ");
      System.out.println("\n------------------------------------------------------------------\n");
      map = get.nextInt();
      if (map == 1){
          Woods();
      }
      else if (map == 2){
        River();
      }

      else if (map == 3){
        Abandonned_Village();
      }

      else if (map == 4){
        checkHP();
      }

      else if (map == 5){
        System.out.println(" Total of Essence Rings that are still hidden: " + essence_Rings);
        Nowhere();
      }

      else if (map == 6){
        finalBoss();
      }
      else{
        Nowhere();
      }

      }

      // creepyWoodman_Clash fight 
      // woods
      public static void creepyWoodman_Clash(){
       
        int playerDamage = 0;
        int monsterDamage = 0;

        playerDamage = new Random().nextInt(10);
        monsterDamage = new Random().nextInt(4);

        System.out.println(" PlayerHP: " + playerHP);
        System.out.println(" Monster HP: " + creepyWoodman);
        System.out.println(" You Attack the Monster with: " + playerDamage + " damage ... ");
        creepyWoodman = creepyWoodman - playerDamage;
        System.out.println(" The Monster Attack you with: " + monsterDamage + " damage ... ");
        playerHP = playerHP - monsterDamage;

        if (playerHP <= 0){
            gameOver();
        }

        else if (creepyWoodman > 0 ){
          creepyWoodman_Clash();
        }

        else {
          System.out.println(" You Slay the Monster ... ! ");
          Nowhere();
        }
        
    }

    // evilMermaid_Clash
    // River
    public static void evilMermaid_Clash(){
       
      int playerDamage = 0;
      int monsterDamage = 0;

      playerDamage = new Random().nextInt(10);
      monsterDamage = new Random().nextInt(5);

      System.out.println(" PlayerHP: " + playerHP);
      System.out.println(" Monster HP: " + EvilMermaid);
      System.out.println(" You Attack the Monster with: " + playerDamage + " damage ... ");
      EvilMermaid = EvilMermaid - playerDamage;
      System.out.println(" The Monster Attack you with: " + monsterDamage + " damage ... ");
      playerHP = playerHP - monsterDamage;

      if (playerHP <= 0){
          gameOver();
      }
      else if (EvilMermaid > 0 ){
        evilMermaid_Clash();
      }
      else {
        System.out.println(" You Slay the Monster ... ! ");
        Nowhere();
      }
      
  }


      // wooods 
      static void Woods(){

        System.out.println("\n------------------------------------------------------------------\n");
        if(creepyWoodman <= 0){
          System.out.println(" There are no Monsters here ... ");
          System.out.println(" You already kill them all ... ");
          Nowhere();
        }
        System.out.println(" Creepy Woodman is blocking your way .... ");
        System.out.println(" Creepy Woodman: Hello There Puny " + choice + " give me your brains.. ! urghh ! ! ... ");
        System.out.println(" 1. Fight ");
        System.out.println(" 2. Run ");
        todo = get.nextInt();
        System.out.println("\n------------------------------------------------------------------\n");

        if (todo == 1){
          System.out.println("\n------------------------------------------------------------------\n");
          creepyWoodman_Clash();
          System.out.println("\n------------------------------------------------------------------\n");    
        }

        else if (todo == 2){
            run();
        }
  
        else{
            Woods();
        }
      }

      // river
      static void River(){
        System.out.println("\n------------------------------------------------------------------\n");
        if(EvilMermaid <= 0){
          System.out.println(" There are no Monsters here ... ");
          System.out.println(" You already kill them all ... ");
          Nowhere();
        }
        System.out.println(" Oh no! there are Evil Mermaids around ... ");
        System.out.println(" Evil Mermaids: Come here " + choice + " let me suck your soul ... ! ! Mweeeeh ! ... ");
        System.out.println(" 1. Fight ");
        System.out.println(" 2. Run ");
        todo = get.nextInt();

        if (todo == 1){
          evilMermaid_Clash();
        }

        else if (todo == 2){
            run();
        }
        
        else{
            River();
        }

      }
      // Abandonned_Village
      static void Abandonned_Village(){
        if (essence_Rings > 0){
          int addHP = 0;
          addHP = new Random().nextInt(8);
          System.out.println("\n------------------------------------------------------------------\n");
          
          System.out.println(" You found essence rings.. ");
          System.out.println(" Essence rings will give you addional Health.. ! ");
          essence_Rings = essence_Rings - 1;
          playerHP = playerHP + addHP;
          Nowhere();
          System.out.println("\n------------------------------------------------------------------\n");
        }

        else if (essence_Rings == 0){
          System.out.println(" There are no Essence Rings left.. ");
          Nowhere();
        }

        else{
          System.out.println(" There are no Essence Rings left.. ");
          Nowhere();
        }

      }
      // check user HP
      static void checkHP(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println(" Player Hp is: " + playerHP);
        Nowhere();
        System.out.println("\n------------------------------------------------------------------\n");
      }
      
      // essence_Rings collected
      static void essence_Rings(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println(" There are " + essence_Rings + " left to collect ... ");
        System.out.println(" You must collect it all before entering the Void and face the Boss .... ");
        System.out.println("\n------------------------------------------------------------------\n");
      }

      // finalBoss
      static void finalBoss(){
        System.out.println(" Sexy Evil Princess: tsk tsk... So you are the " + choice + " who like to slay Monsters .. ");
        System.out.println(" Sexy Evil Princess: I Will kill you and feed you to the Bandits.. !!! ");
        System.out.println(" You: God help me ! I dont know if i can take down these Gigantic Monster... ");
        System.out.println(" I Guess these will be the last and final Battle .. I must fight for the sake of the Village .. ! ");
        System.out.println(" ------------ FINAL BATTLE ------------ ");
        lastStand();
        
      

      } 

      static void lastStand(){
        int BossDamage = 0;
        int playerDamage = 0;
        BossDamage = new Random().nextInt(8);
        playerDamage = new Random ().nextInt(10);

        
          System.out.println(" You Attack SexyEvilPrincess with: " + playerDamage + " damage ... ");
          SexyEvilPrincess = SexyEvilPrincess - playerDamage;
          System.out.println(" -----> SexyEvilPrincess HP is: " + SexyEvilPrincess);
          System.out.println(" SexyEvilPrincess charges you and give: " + BossDamage + " damage ... ");
          playerHP = playerHP - BossDamage;
          System.out.println(" -----> PlayerHP is: " + playerHP);
          finalClash();
      }

      static void finalClash(){
          if (playerHP <= 0){
              gameOver();
          }

          else if (SexyEvilPrincess <= 0){
              victory();
          } 

          else{
              lastStand();
          }
      }
      
      static void run(){
        Nowhere();
      }


      static void gameOver(){

          System.out.println("\n------------------------------------------------------------------\n");
          System.out.println(" Every " + choice + " here in the World are Heroes! ");
          System.out.println(" Your Bravery will always remain in our Hearts! ");
          System.out.println(" Farewell My Lord, Your Story will be History.. ");
          System.out.println("\n------------------------------------------------------------------\n");

      }

      static void victory(){

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println(" I The Greatest " + choice + " Alive, Now shall declare, that Humans are now Free ");
        System.out.println(" I fought againts Sexy Evil Princess and Defeated Her! ... ");
        System.out.println(" And now We are Free! Rejoice ! Rejoice ! ");
        System.out.println(" And Now we can live peacefully ! ... ");
        System.out.println("\n------------------------------------------------------------------\n");

      } 
    } 

   
