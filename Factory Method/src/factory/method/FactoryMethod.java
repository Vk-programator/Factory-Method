/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory.method;

import factory.method.factory.GuerreiroFactory;
import factory.method.factory.MagoFactory;
import factory.method.factory.PersonagemFactory;
import factory.method.model.Personagem;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class FactoryMethod {

   
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       PersonagemFactory factory;
        System.out.println("Escolha a classe:\n1 - Mago\n2 - Guerreiro");
        int classe = scanner.nextInt();
        switch(classe){
            case 1:
                factory = new MagoFactory();
                break;
            case 2:
                factory = new GuerreiroFactory();
                break;
            default:
                factory = new MagoFactory();
                break;
        }
        
        Personagem personagem = factory.ciarPersonagem();
        personagem.ataque();
        
        
    }
    
}
