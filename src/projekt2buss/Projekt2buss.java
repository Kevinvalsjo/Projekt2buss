package projekt2buss;
import java.util.Scanner;
/**
 *
 * @author kevin.valsjo
 */

 
public class Projekt2buss {
    static int[] plats = new int[20];
    static int[] persnr = new int[20];
    static int[] fp = {1,5,9,13,17,4,8,12,16};
           

    public static void main(String[] args) {
         System.out.println("Hej");
         Scanner tangentbord = new Scanner(System.in);
         int var =0;

          //ser till så att alla fältplatser har värdet 0
          for (int r = 0; r < 20; r++) {
            persnr[r]=0;
            
             }
       
        while( var==0)
        { 
        System.out.println("Vad vill du göra? \n 1.Skriva ut hur många platser är lediga,\n 2.Boka en plats\n 3.Beräkna vinsten av antalet sålda biljetter \n 4.Avsluta programmet\n 5.Avboka en plats\n 6.Ange personnummer för att hitta bokning \n 7.Lista alla över 18");
        String val = tangentbord.nextLine();
        while(!"1".equalsIgnoreCase(val)&&!"2".equalsIgnoreCase(val) &&! "3".equalsIgnoreCase(val)&&! "4".equalsIgnoreCase(val)&&! "5".equalsIgnoreCase(val)&&! "6".equalsIgnoreCase(val)&&! "7".equalsIgnoreCase(val))
        {
            System.out.println(" 1-6"); 
            val = tangentbord.nextLine();//whileloop som gör så att man inte kan skriva in fel
        }
            int vals = Integer.parseInt(val);
             switch(vals){
            
                           case 1 ->  
                           {
                               System.out.println("Här kan du se vilka platser som är lediga:");
           
            
             for (int i = 0; i < 20; i++) {
             if(persnr[i] == 0)//programmet kollar om en plats är ledig
                                {
                 
                 System.out.println("Plats " + i +" är ledig");
                                }
       
       
             }
            
                            }
                         case 2 ->  
                              {
              fråga();      //Exempel på en metod
            int  bokning = tangentbord.nextInt();
             for (int  i = 0;  i < fp.length;  i++) {
              if(bokning==fp[i])//kollar om bokningen är en fönsterplats
                System.out.println("Det här är en fönsterplats");
            }
            while(bokning>21 || bokning<0)
            {
                System.out.println("Du måste skriva ett tal mellan 0-21");
                 bokning = tangentbord.nextInt();
                        
               
            }
            
            if(plats[bokning]==0 )//om platsen är ledig
            {
               System.out.println("Vad har du för personnummer?");
               int nummer = tangentbord.nextInt();
             plats[bokning]= 1;//platsen sätts till upptagen
             persnr[bokning] = nummer ;
              System.out.println("Du har bokat plats "+bokning +" med personnumret " +nummer);
            }
            else
            {
                System.out.println("Den här platsen är upptagen");
                System.out.println("Välj en annan");
               
            }
            
          
            
             
                                }
                        case 3 ->  
                        {
                           
                            int pen = 0, vuxen=0, barn=0;
                            //den går igenom fältet och kollar ålder
                            for (int k = 0; k < persnr.length; k++) {
                                if(persnr[k] != 0){//kollar vilka platser är upptagna
                                      
                                   
                                int a = persnr[k] / 10000;
                                int ar = 2023 - a;
                                
                                if(ar >= 69){
                                    pen++;
                                }else if(ar > 18){
                                    vuxen++;
                                }else barn++;} 
                            }
                            
                            
                            double tot=0.0;
                            
                            tot = (barn *149.90) + (pen *200) + (vuxen *299.90);//priset räknas ut
                           
                            System.out.println("Totalen blir "+tot+" kr");
                            
                            
                                
                         }
                         
                         case 4 ->
                         {
                             System.out.println("Avslutar programmet.");
                             var++;
                         }
                         
                         
                         case 5 ->
                         {
                             System.out.println("Vilket personnummer vill du avboka?");
                             int avbok = tangentbord.nextInt();
                             
                        //programmet går igenom fältet och kollar om avboknings numret stämmer överens med någon plats i fältet
                                 for (int p = 0; p < 20; p++) {
                                 if(persnr[p]==avbok){
                                     persnr[p]=0;
                                 
                                     
                                     System.out.println("Du har avbokat platsen "+p);
                                     plats[p]=0;
                                 }
                             }
                             
                         }
                         case 6  ->{
                             System.out.println("Skriv in personnummer");
                             int hitta = tangentbord.nextInt();
                             //programmet jämför "hitta" med värdet på fältens plats 
                              for (int r = 0; r < 20; r++) {
                                
                                 if(persnr[r]==hitta)
                                 {
                                     System.out.println("Personnumret finns på platsen " +r);
                                 }
                             
                         }
                                 
        }
                         case 7   ->
                             
                         {      // for loppen kollar vilka platser har en person som är över 18 år
                             for (int k = 0; k < persnr.length; k++)
                             {
                                  if(persnr[k] != 0){
                              int a = persnr[k] / 10000;
                                int ar = 2023 - a;
                                if(ar>18)
                                {
                                    System.out.println(k+ " är över 18");
                                }
                                    
                                  } 
                         
                             }  
                             
                         }
                               
                                     
                                     
                                 
             
          
        } 
        Scanner scan = new Scanner(System.in);
           scan.nextLine();
        }
             
           
            
           
        
        } static void fråga() {
             Scanner tangentbord = new Scanner(System.in);
                 System.out.println("Vilken plats vill du boka? 1,4,5,8,9,12,13,16,17 är fönsterplatser");
    }
    }   
           

           


            
    
   
                


