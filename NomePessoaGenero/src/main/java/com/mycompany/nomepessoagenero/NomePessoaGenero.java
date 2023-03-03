/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.nomepessoagenero;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class NomePessoaGenero {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
   
        
        System.out.println("Informe seu nome: "); 
        String nome = ler.next();
        
        
        System.out.println("Informe seu sexo: " );
        char sexo  = ler.next().charAt(0);
        
        
        System.out.println("Seu nome é: "+nome + " Seu genero é: " +sexo );
        
        
        if(sexo=='m'){
            System.out.println("Masculino");
        }else if(sexo=='f'){
            System.out.println("Feminino");
            
        }else{
            System.out.println("Programador");
        }
        
    }
}
