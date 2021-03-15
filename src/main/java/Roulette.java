
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alejandro
 */
public class Roulette {

    private int id;
    private int number;
    private int color;
    private boolean condition;
    ArrayList<Roulette> roulettes = new ArrayList();
    ArrayList<Bet> bets = new ArrayList();

    public Roulette() {
    }

    public Roulette(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public int CreateRoulette() {
        id = id + 1;
        Roulette rou = new Roulette(id = id);
        roulettes.add(rou);

        return id;
    }

    public String OpenRoulette(int id) {
        for (int i = 0; i < roulettes.size(); i++) {
            if (roulettes.get(i).id == id && roulettes.get(i).condition == false) {
                roulettes.get(i).condition = true;
                System.out.println("Operacion Exitosa, ruleta abierta");
                break;
            }
        }
        return null;
    }

    public void ListRoulettes() {
        for (int i = 0; i < roulettes.size(); i++) {
            System.out.println(roulettes.get(i).id);
            System.out.println(roulettes.get(i).condition);
        }
    }

    public int ValidateRoulette(int id) {
        int val = 0;
        for (int i = 0; i < roulettes.size(); i++) {
            if (roulettes.get(i).id == id && roulettes.get(i).condition == true) {
                val = 1;
            }
        }
        return val;
    }

    public int ValidateBet(int number) {
        int val = 0;
        if (number >= 0 && number <= 36) {
            val = 1;
        }
        return val;
    }

    public void Bets(int id, Bet b) {
        for (int i = 0; i < roulettes.size(); i++) {
            if (roulettes.get(i).id == id && roulettes.get(i).condition == true) {
                roulettes.get(i).bets.add(b);
            }
        }
    }
}
