package ahorcado;

import ahorcado.interfazGrafica.MenuPrincipal;
import java.util.*;

public class Ahorcado {
    public static String palabraAleatoria;
    static Queue<Character> letrasDePalabraAdivinar = new LinkedList<>();
    public static Stack<Integer> partesDeMuneco = new Stack<>();

    public static void main(String[] args) {
        MenuPrincipal a = new MenuPrincipal();
        a.setVisible(true);
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
        
//        while (true){
//            
//            System.out.println("Palabra: "+letrasDePalabraAdivinar);
//
//            if(letrasDePalabraAdivinar.size() == palabra.length()){
//                System.out.println("Has ganado el juego");
//                for (int i = 0; i < palabra.length(); i++) {
//                    System.out.print(resultado[i]);
//                }
//                break;
//            }
//
//            if (partesDeMuneco.isEmpty()){
//                System.out.println("Has perdido el juego");
//                break;
//            }
//
//            System.out.print("Escriba una letra: ");
//            //Se captura en string, luego se transforma en char
//            String letra = leer.nextLine();
//            
//            for (int i = 0; i < palabra.length(); i++) {
//                if(String.valueOf(palabra.charAt(i)).equals(letra)){
//                    System.out.println("La palabra existe en la posicion "+i);
//                    letrasDePalabraAdivinar.add(letra.charAt(0));
//                    resultado[i] = letra;
//                    break;
//                } else if(i == palabra.length()-1){
//                    System.out.println("Se ha cortado una parte del muñeco, sobran "+partesDeMuneco.size()+" partes");
//                }
//            }
//        }
    }
    
    public static void iniciarJuego(){
        bancoPalabras palabra = new bancoPalabras();
        palabraAleatoria = palabra.obtenerPalabra();
        
        letrasDePalabraAdivinar.add(palabraAleatoria.charAt(0));
        
        partesDeMuneco.push(1);
        partesDeMuneco.push(2);
        partesDeMuneco.push(3);
        partesDeMuneco.push(4);
        partesDeMuneco.push(5);
        
    }
    
    public static int agregarLetra(String letra){    
        for (int i = 0; i < palabraAleatoria.length(); i++) {
            if(String.valueOf(palabraAleatoria.charAt(i)).equals(letra) && !letrasDePalabraAdivinar.contains(letra.charAt(0))){
                System.out.println("La palabra existe en la posicion "+i);
                letrasDePalabraAdivinar.add(letra.charAt(0));
                //resultado[i] = letra;
                return i;
            } else if(i == palabraAleatoria.length()-1){
                partesDeMuneco.pop();
                System.out.println("Se ha cortado una parte del muñeco, sobran "+partesDeMuneco.size()+" partes");
            }
        }
        return 0;
    }
    
    public static boolean perderJuego(){
        if (partesDeMuneco.isEmpty()){
            System.out.println("Has perdido el juego");
            return false;
        }
        
        return true;
    }
    
    public static boolean ganarJuego(){
        if(letrasDePalabraAdivinar.size() == palabraAleatoria.length()){
            System.out.println("Has ganado el juego");
            return true;
        }
        
        return false;
    }

}
