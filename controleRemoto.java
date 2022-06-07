class controleRemoto{
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
}