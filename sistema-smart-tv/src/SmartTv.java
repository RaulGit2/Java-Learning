public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void Ligar(){
        ligada = true;
    }

    public void Desligar(){
        ligada = false;
    }

    public void aumentarvolume(){
        volume = volume + 1;
        volume++;
    }

    public void diminuirvolume(){
        volume = volume - 1;
        volume--;
    }
}
