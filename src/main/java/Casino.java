
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alejandro
 */
public class Casino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Roulette rou = new Roulette();
        Scanner sc = new Scanner(System.in);    
        boolean close=false;
        do {
            System.out.println("1. crear ruleta, 2. abrir ruleta, 3. listar ruletas, 4. Salir");
            int sel = sc.nextInt();
            switch (sel) {
                case 1:
                    System.out.println(rou.CreateRoulette());
                    break;
                    
                case 2:
                    System.out.println("Que ruleta desea abrir");
                    int r = sc.nextInt();
                    rou.OpenRoulette(r);
                    break;
                    
                case 3:
                    rou.ListRoulettes();
                    break;
                    
                case 4: 
                    close=true;
                    break;
            }
        } while (close != true);
        // TODO code application logic here
    }

}
