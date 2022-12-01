public class Mobilya {
    private String aciklama;
    private double yukseklik;
    private boolean kapaliMi;

    public Mobilya() {
    }
    public Mobilya(String aciklama, double yukseklik, boolean kapaliMi) {
        this.aciklama = aciklama;
        this.kapaliMi = kapaliMi;
        setYukseklik(yukseklik);
    }
    public double getYukseklik() {
        return yukseklik;
    }
    public void setYukseklik(double yukseklik) {

        this.yukseklik = yukseklik>0?yukseklik:0;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public boolean isKapaliMi() {
        return kapaliMi;
    }

    public void setKapaliMi(boolean kapaliMi) {
        this.kapaliMi = kapaliMi;
    }
    public boolean getKapaliMi(){
        return this.kapaliMi;
    }
    @Override
    public String toString() {
        return getAciklama();

    }
}
