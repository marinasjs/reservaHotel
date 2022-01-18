/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapaps2;

/**
 *
 * @author marina
 */
public class Quartos {
   
    private String suite;
    private int capacidade;
    private Double valor;

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
    
    

   
   @Override
            public String toString(){
              //  return super.toString(); // change the body of generated methods
            return this.getSuite() + " - " + this.getCapacidade() + " - " + this.getValor();
            }
    
}
