/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.method.factory;

import factory.method.model.Mago;
import factory.method.model.Personagem;

/**
 *
 * @author aluno
 */
public class MagoFactory extends PersonagemFactory {
    
    @Override
     public Personagem ciarPersonagem(){
         return new Mago();
      };
}
