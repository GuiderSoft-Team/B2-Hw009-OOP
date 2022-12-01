public class Mobilya {
    private   String aciklama;
    private   double yukseklik;
    private boolean kapaliMİ;

    public Mobilya() {
    }

    public Mobilya(String aciklama, double yukseklik, boolean kapaliMİ) {
        this.aciklama = aciklama;
        setYukseklik( yukseklik);
        this.kapaliMİ = kapaliMİ;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        if(yukseklik>0){
            this.yukseklik = yukseklik;
        }

    }

    public boolean isKapaliMİ() {
        return kapaliMİ;
    }

    public void setKapaliMİ(boolean kapaliMİ) {
        this.kapaliMİ = kapaliMİ;
    }

    @Override
    public String toString() {
        return String.format("%s %5.2f %b",aciklama,yukseklik,false);
    }
}




