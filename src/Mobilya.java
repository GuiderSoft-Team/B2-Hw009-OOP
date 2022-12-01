public class Mobilya {

    private String aciklama;
    private double yukseklik;
    private boolean kapaliMi;

    public Mobilya() {
    }

    public Mobilya(String aciklama, double yukseklik, boolean kapaliMi) {
        setAciklama(aciklama);
        setYukseklik(yukseklik);
        setKapaliMi(kapaliMi);
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

    public double setYukseklik(double yukseklik) {
        if(yukseklik<0){
            this.yukseklik = 0;
        }else {
            this.yukseklik=yukseklik;
        }
        return this.yukseklik;
    }

    public boolean isKapaliMi() {
        return kapaliMi;
    }

    public void setKapaliMi(boolean kapaliMi) {
        this.kapaliMi = kapaliMi;
    }

    @Override
    public String toString() {
        return aciklama;
    }
}
