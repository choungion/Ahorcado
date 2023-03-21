/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ahorcado;

import java.util.*;

public class Ahorcado {

    public static void main(String[] args) {
        bancoPalabras bancoPalabras = new bancoPalabras();
        Scanner leer = new Scanner(System.in);
        String palabra = bancoPalabras.obtenerPalabra();

        Queue<Character> letrasDePalabraAdivinar = new LinkedList<>();
        letrasDePalabraAdivinar.add(palabra.charAt(0));

        Stack<Integer> partesDeMuneco = new Stack<>();
        partesDeMuneco.push(1);
        partesDeMuneco.push(2);
        partesDeMuneco.push(3);
        partesDeMuneco.push(4);
        partesDeMuneco.push(5);
        
        String[] resultado = new String[palabra.length()];
        resultado[0] = String.valueOf(palabra.charAt(0));
        
        while (true){
            
            System.out.println("Palabra: "+letrasDePalabraAdivinar);

            if(letrasDePalabraAdivinar.size() == palabra.length()){
                System.out.println("Has ganado el juego");
                for (int i = 0; i < palabra.length(); i++) {
                    System.out.print(resultado[i]);
                }
                break;
            }

            if (partesDeMuneco.isEmpty()){
                System.out.println("Has perdido el juego");
                break;
            }

            System.out.print("Escriba una letra: ");
            //Se captura en string, luego se transforma en char
            String letra = leer.nextLine();
            
            for (int i = 0; i < palabra.length(); i++) {
                if(String.valueOf(palabra.charAt(i)).equals(letra)){
                    System.out.println("La palabra existe en la posicion "+i);
                    letrasDePalabraAdivinar.add(letra.charAt(0));
                    resultado[i] = letra;
                    break;
                } else if(i == palabra.length()-1){
                    System.out.println("Se ha cortado una parte del muñeco, sobran "+partesDeMuneco.size()+" partes");
                }
            }
        }
    }

}
