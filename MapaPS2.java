/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapaps2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author marina
 * 
 * 
 */
public class MapaPS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double total;
        Double tdesconto;
        Double desconto = 0.90; 
        
        Cadastro cd = new Cadastro();
        Reserva rs = new Reserva();
        JOptionPane.showMessageDialog(null,"Bem Vindo ao Hotel, prossiga com o seu cadastro");
        
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        cd.setNome(nome);
        
        String endereco = JOptionPane.showInputDialog("Digite o seu endereço: ");
        cd.setEndereco(endereco); 
        
        
        String idade = JOptionPane.showInputDialog("Digite a sua idade: ");
        cd.setIdade(idade);
        
        JOptionPane.showMessageDialog(null,"Obrigado, vamos continuar com a sua reserva " + cd.getNome());
        
        String hospedes = JOptionPane.showInputDialog("Digite o numero de hóspedes: ");
        rs.setHospedes(hospedes);
        
        String diaria = JOptionPane.showInputDialog("Digite o numero de diárias que gostaria ficar: ");
        rs.setDiaria(diaria);
        
        String bebes = JOptionPane.showInputDialog("Informe o número de crianças abaixo de 2 anos, se não houver digite 0. ");
        rs.setBebes(bebes);
        
        int hosp = Integer.parseInt(hospedes);
        int dia = Integer.parseInt(diaria);
        int kid = Integer.parseInt(bebes);
        int p = hosp - kid;
        
        Quartos listaQuartos[] = new Quartos[3];
        
        Quartos q1 = new Quartos();        
        q1.setSuite("Luxo");
        q1.setCapacidade(7);
        q1.setValor(1220.00);
        
        Quartos q2 = new Quartos();        
        q2.setSuite("Standard");
        q2.setCapacidade(5);
        q2.setValor(1000.00);
        
        Quartos q3 = new Quartos();        
        q3.setSuite("Simples");
        q3.setCapacidade(3);
        q3.setValor(800.00);
        
        listaQuartos[0] = q1;
        listaQuartos[1] = q2;
        listaQuartos[2] = q3;
        
        if(p <= 3){
            JOptionPane.showMessageDialog(null, "A suíte adequada para você é a " + q3.getSuite());            
            Double t = q3.getValor() * dia;
            if(dia>=7){
               JOptionPane.showMessageDialog(null, "O valor total da sua suite com desconto é " + (t*desconto)); 
            }else{
               JOptionPane.showMessageDialog(null, "O valor total da sua suite é " + (t)); 
            }
        } else if(p <=5 && p>3){
            JOptionPane.showMessageDialog(null, "A suíte adequada para você é a " + q2.getSuite());
             Double t = q2.getValor() * dia;
            if(dia>=7){
               JOptionPane.showMessageDialog(null, "O valor total da sua suite com desconto é " + (t*desconto)); 
            }else{
               JOptionPane.showMessageDialog(null, "O valor total da sua suite é " + (t)); 
            }
        } else if(p <=7 && p >5){
            JOptionPane.showMessageDialog(null, "A suíte adequada para você é a " + q1.getSuite());
             Double t = q1.getValor() * dia;
            if(dia>=7){
               JOptionPane.showMessageDialog(null, "O valor total da sua suite com desconto é " + (t*desconto)); 
            }else{
               JOptionPane.showMessageDialog(null, "O valor total da sua suite é " + (t)); 
            }
        }else{
            JOptionPane.showMessageDialog(null, "Não há suítes disponíveis para esse número de hóspedes ");
        }
           
        JOptionPane.showMessageDialog(null, "Obrigado por se hospedar com a gente");
        
        

    }
    
}
