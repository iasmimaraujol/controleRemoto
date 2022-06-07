class controleRemoto implements Controlado{
    private int vol;
    private boolean on;
    private boolean tocando;
    public controleRemoto(){
        this.vol = 50;
        this.on = false;
        this.tocando = false;
    }
    public void setVolume(int vol){
        this.vol += vol;
    }
    public int getVolume(){
        return this.vol;
    }
    public void setLigado(boolean on){
        this.on = on;
    }
    public boolean getLigando(){
        return this.on;
    }
    public void setTocando(boolean tocando){
        this.tocando = tocando;
    }
    public boolean getTocando(){
        return this.tocando;
    }

    public void onShow(){
        System.out.println("volume do controle " + getVolume() + " e ele se encontra em estado: " + getLigando() + " e esta tocando: " + getTocando());
        System.out.println("--------------------------");
    }

    
    public void ligar(){
        this.setLigado(true);
    }    
    public void desligar(){
        this.setLigado(false);
    }
    public void abrirMenu(){
        this.onShow();
    }
    public void fecharMenu(){
        System.out.println("Desligando...");
    }
    public void maisVolume(){
        this.setVolume(10);
    }
    public void menosVolume(){
        this.setVolume(-10);
    }
    public void ligarMudo(){
        this.vol = 0;
    }
    public void desligarMudo(){
        this.setVolume(50);
    }
    public void play(){
        this.setTocando(true);
    }
    public void pause(){
        this.setTocando(false);
    }
}