
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
            System.out.println("1. Crear Ruleta, 2. Abrir Ruleta, 3. Listar Ruletas, 4. Apostar, 5. Cerrar Ruleta, 6. Salir");
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
                            System.out.println("desea apostar al color 0. Negro, 1. Rojo");
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
                    System.out.println("ingrese la ruleta que se cerrara");
                    int cr = sc.nextInt();
                    int win = rou.SpinRoulette(cr);
                    rou.ValidateWin(cr, win);
                    rou.CloseRoulette(cr);
                    break;
                case 6:
                    close = true;
                    break;
            }
        } while (close != true);
        // TODO code application logic here
    }

}
