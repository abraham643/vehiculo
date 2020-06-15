package vehiculo;
import java.util.Scanner;
public class Vehiculo {
  public static void main(String[] args) {
  Scanner teclado = new Scanner (System.in);
  int a;
  System.out.println ("usted tiene un vehículo?"); 
  System.out.println ("digite '1' para si y '2' para no");
  a = teclado.nextInt();
  if (a==1)
    {System.out.println ("podemos continuar:");
    System.out.println ("si su vehicullo es terrestre  digite '1'");
    System.out.println ("si su vehiculo es aereo digite '2' ");
    System.out.println ("si su vehiculo es acuático digite '3'"); 
    a = teclado.nextInt();
      if ( a== 1)
         {System.out.println ("¿cuantas llantas tiene ?");
         int b; 
         b = teclado.nextInt();
          if ( b== 1)
          { System.out.println ("es un monociclo");}
           else if (b==2)
           { System.out.println ("¿tiene motor?");
       int c;
        c = teclado.nextInt();
       if (c==1)  
       { System.out.println ("tu vehiculo es una moto");}  
        else if (c==2 )
        {
          System.out.println ("es una bicicleta");
        } 
          }
             else if (b==3)
          { System.out.println ("es un triciclo");} 
          
          else if (b== 4)  
          {
            System.out.println ("es un carro");
          }
           else if (b>= 5 && b <= 20 )
           {
             System.out.println ("es un camion o algo similar");
           }
           }
         else if (a==2 )
         {System.out.println ("¿tiene helices ?");
           int d;
           d = teclado.nextInt();
            if (d == 1)
             {System.out.println ("es un helicóptero");}
            
            else if (d== 2)
      {
        System.out.println (" es un avion");
      }
           }   
           else if (a==3)  
           {System.out.println ("¿solo es para una persona?");
           int f; 
           f = teclado.nextInt();
       if (f==1)   
       { System.out.println ("es una moto acuatica");} 
       else if  ( f== 2)
       {System.out.println ("es un yate o algo asi");}
           } 
    }
  else if (a == 2) 
   {System.out.println (" lo siento , lo nuestro no puede ser");}
   return ; 
  }
}