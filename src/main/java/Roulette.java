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
    private String[] colors = {"Rojo", "Negro"};

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

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public int CreateRoulette() {
        id = id+1;

        return id;
    }

    public String OpenRoulette(int id) {
        String bet = null;

        return bet;
    }
}
