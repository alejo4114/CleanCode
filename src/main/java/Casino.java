
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
        boolean close = false;
        do {
            System.out.println("1. crear ruleta, 2. abrir ruleta, 3. listar ruletas, 4. apostar, 5. Salir");
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
                    int m = 0;
                    System.out.println("ingrese el id de la persona a apostar");
                    int p = sc.nextInt();
                    System.out.println("ingrese el id de la ruleta en que va a apostar");
                    int a = sc.nextInt();
                    int v = rou.ValidateRoulette(a);
                    if (v == 1) {
                        System.out.println("Ingrese el numero al que va a apostar");
                        int b = sc.nextInt();
                        int q = rou.ValidateBet(b);
                        if (q == 1) {
                            System.out.println("desea apostar al color 1. Negro, 2. Rojo");
                            int c = sc.nextInt();
                            System.out.println("ingrese el monto a apostar");
                            m = sc.nextInt();
                            Bet bet = new Bet(p, b, c, m);
                            rou.Bets(a, bet);
                        }
                    } else {
                        System.out.println("Operacion denegada, ruleta cerrada");
                    }
                    break;

                case 5:
                    close = true;
                    break;
            }
        } while (close != true);
        // TODO code application logic here
    }

}
