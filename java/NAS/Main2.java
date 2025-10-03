package NAS;


public class Main2 {

 public static void main(String[] args) {
   Arta SSSR = new Arta("Ob 261", 450,0);
   Arta USA = new Arta("T92", 550,0);
   TT US7 = new TT("US-7", 2700,490);
   TT Maus = new TT("Maus", 3000,490);
   Arta Ob261 = new Arta("Ob.261", 450, 25);





   
      while (US7.getHP() >= 0 || Maus.getHP() >= 0) {  
           
        US7.setHP(US7.getHP() - Maus.getDamageRandom());
        Maus.setHP(Maus.getHP() - US7.getDamageRandom()); 

     
    
    
  } 

  Ob261.info();

  System.out.println(US7.getHP());
  System.out.println(Maus.getHP());


             
      
  // int status = 0;
  // int test = 0;
  // while (test != 515) {
  //     test = US7.fire();
  //     System.out.println(test);
  //     status++;
       

       
   }
  // System.out.println("Рез: " + status);

}
