/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author marua
 */
public class Suma {
      private int num1;
    private int num2;
    private int resultado;

    public Suma(String n1, String n2) {
        try {
            this.num1 = Integer.parseInt(n1);
            this.num2 = Integer.parseInt(n2);
        } catch (NumberFormatException e) {
            this.num1 = 0;
            this.num2 = 0;
        }
    }

    public void hacerSuma() {
        this.resultado = this.num1 + this.num2;
    }

    public int getResultado() {
        return this.resultado;
    }
}
