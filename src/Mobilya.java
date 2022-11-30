public class Mobilya {
    private String aciklama;
    private double yukseklik;
    private boolean kapaliMi;

    public Mobilya(String aciklama, double yukseklik, boolean kapaliMi) throws LengthException {
        this.aciklama = aciklama;
        setYukseklik(yukseklik);
        this.kapaliMi = kapaliMi;
    }

    public Mobilya() {
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) throws LengthException {
        if (yukseklik<=0 ) throw new LengthException("Yükseklik pozitif olmali!");
        this.yukseklik = yukseklik;
    }

    public boolean isKapaliMi() {
        return kapaliMi;
    }

    public void setKapaliMi(boolean kapaliMi) {
        this.kapaliMi = kapaliMi;
    }

    @Override
    public String toString() {
        return "{" + aciklama+ '}';
    }
}
