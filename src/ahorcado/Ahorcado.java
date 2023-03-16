/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ahorcado;

import java.util.*;

public class Ahorcado {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra = "automovil";

        Queue<Character> letrasDePalabraAdivinar = new LinkedList<>();
        letrasDePalabraAdivinar.add(palabra.charAt(0));

        Stack<Integer> partesDeMuneco = new Stack<>();
        partesDeMuneco.push(1);
        partesDeMuneco.push(2);
        partesDeMuneco.push(3);
        partesDeMuneco.push(4);
        partesDeMuneco.push(5);

        while (true){
            System.out.println("Palabra: "+letrasDePalabraAdivinar);

            if(letrasDePalabraAdivinar.size() == palabra.length()){
                System.out.println("Has ganado el juego");
                break;
            }

            if (partesDeMuneco.isEmpty()){
                System.out.println("Has perdido el juego");
                break;
            }

            System.out.print("Escriba una letra: ");
            //Se captura en string, luego se transforma en char
            String letra = leer.nextLine();
            if (letra.length() == 1){
                char letraEnChar = letra.charAt(0);
                if (letraEnChar == palabra.charAt(letrasDePalabraAdivinar.size())){
                    letrasDePalabraAdivinar.add(letraEnChar);
                } else{
                    partesDeMuneco.pop();
                    System.out.println("Se ha cortado una parte del muñeco, sobran "+partesDeMuneco.size()+" partes");
                }
            }
        }

    }

}
