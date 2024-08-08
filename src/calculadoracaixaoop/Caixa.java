package calculadoracaixaoop;

import javax.swing.JOptionPane;

public class Caixa {

    private double caixaDigital;
    private int nota100;
    private int nota50;
    private int nota20;
    private int nota10;
    private int nota5;
    private int nota2;
    private int moeda1;
    private double moeda50;
    private double moeda25;
    private double moeda10;
    private double moeda5;

    public void setCaixaDigital(double caixaDigital) {
        this.caixaDigital = caixaDigital;
    }

    public void setNota100(int nota100) {
        this.nota100 = nota100 * 100;
    }

    public void setNota50(int nota50) {
        this.nota50 = nota50 * 50;
    }

    public void setNota20(int nota20) {
        this.nota20 = nota20 * 20;
    }

    public void setNota10(int nota10) {
        this.nota10 = nota10 * 10;
    }

    public void setNota5(int nota5) {
        this.nota5 = nota5 * 5;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2 * 2;
    }

    public void setMoeda1(int moeda1) {
        this.moeda1 = moeda1;
    }

    public void setMoeda50(double moeda50) {
        this.moeda50 = moeda50 * 0.5;
    }

    public void setMoeda25(double moeda25) {
        this.moeda25 = moeda25 * 0.25;
    }

    public void setMoeda10(double moeda10) {
        this.moeda10 = moeda10 * 0.10;
    }

    public void setMoeda5(double moeda5) {
        this.moeda5 = moeda5 * 0.05;
    }

    public double getCaixaDigital() {
        return caixaDigital;
    }

    public int getNota100() {
        return nota100;
    }

    public int getNota50() {
        return nota50;
    }

    public int getNota20() {
        return nota20;
    }

    public int getNota10() {
        return nota10;
    }

    public int getNota5() {
        return nota5;
    }

    public int getNota2() {
        return nota2;
    }

    public int getMoeda1() {
        return moeda1;
    }

    public double getMoeda50() {
        return moeda50;
    }

    public double getMoeda25() {
        return moeda25;
    }

    public double getMoeda10() {
        return moeda10;
    }

    public double getMoeda5() {
        return moeda5;
    }

    public Double calcularTotal() {
        return nota100 + nota50 + nota20 + nota10 + nota5 + nota2 + moeda1 + moeda50 + moeda25 + moeda10 + moeda5;
    }

    public String calcularDiferenca() {
        Double diferenca = caixaDigital - calcularTotal();
        String diferencaStr = null;
        if (diferenca < 0) {
            diferenca = diferenca*-1;
            diferencaStr = "adcionar: " + diferenca + " ao caixa digital.";
        } else if (diferenca > 0) {
            diferencaStr = "remover: " + diferenca + " do caixa digital.";
        } else if (diferenca == 0) {
            diferencaStr = "caixa iguais";
        }
        return diferencaStr;
    }
}
