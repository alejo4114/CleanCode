
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
    private int[] numbers = new int[36];
    private boolean condition;
    ArrayList<Roulette> roulettes = new ArrayList();

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

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
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
                roulettes.get(i).condition=true;
                System.out.println("Operacion Exitosa, mesa abierta");
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
}
