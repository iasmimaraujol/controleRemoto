public class main {
    public static void main(String[] args) {
        controleRemoto cr = new controleRemoto();
        cr.onShow();
        cr.setVolume(10);
        cr.onShow();
        cr.setTocando(true);
        cr.onShow();
        cr.setLigado(true);
        cr.onShow();
    }    
}
