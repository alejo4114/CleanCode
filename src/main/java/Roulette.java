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
    private boolean estado;

    public Roulette() {
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

  
    public int CreateRoulette() {
        id = id+1;
        this.numbers=numbers;

        return id;
    }

    public String OpenRoulette(int id) {
        String bet = null;

        return bet;
    }
}
