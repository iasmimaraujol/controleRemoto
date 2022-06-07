class controleRemoto implements Controlado{
    private int vol;
    private boolean on;
    private boolean tocando;
    public controleRemoto(){
        this.vol = 0;
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
        if(this.tocando == false && this.on == false){
            this.setLigado(true);
            this.setTocando(true);
            this.vol = 50;
        }
    }    
    public void desligar(){
        if(this.tocando == true && this.on == true){
            this.setLigado(false);
            this.setTocando(false);
            this.vol = 0;
        }
    }
    public void abrirMenu(){
        this.onShow();
    }
    public void fecharMenu(){
        System.out.println("Desligando...");
    }
    public void maisVolume(){
        if(this.tocando == true && this.on == true){
            this.setVolume(10);
        }
    }
    public void menosVolume(){
        if(this.tocando == true && this.on == true && this.vol >= 10){
            this.setVolume(-10);
        }
    }
    public void ligarMudo(){
        if(this.tocando == true && this.on == true){
            this.vol = 0;
        }
    }
    public void desligarMudo(){
        if(this.tocando == true && this.on == true && this.vol == 0){
            this.setVolume(50);
        }
    }
    public void play(){
        if(this.tocando == false && this.on == true) {
            this.setTocando(true);
        }
    }
    public void pause(){
        if(this.tocando == true && this.on == true){
            this.setTocando(false);
        }
    }
}