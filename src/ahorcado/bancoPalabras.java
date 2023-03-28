package ahorcado;

public class bancoPalabras {
    String[] palabras = { "gato","pera","ajedrez","cesped","fertil","ganzua","lapiz","jardin","helado","maximo","quemar","sandwich","torax"};
    
    public String obtenerPalabra(){
        int numeroAleatorio = (int) Math.round(Math.random()*palabras.length);
        return palabras[numeroAleatorio];
    }
}
