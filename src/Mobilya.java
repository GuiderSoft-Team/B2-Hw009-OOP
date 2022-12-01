public class Mobilya {
    public String aciklama;
    private double yukseklik;
    public double genislik;
    public double derinlik;
    public double yaricap;
    public boolean kapaliMi;


    public Mobilya() {
    }

    public Mobilya(String aciklama, double yukseklik, double genislik, double derinlik, boolean kapaliMi) {
        this.aciklama = aciklama;
        setYukseklik(yukseklik);
        this.genislik = genislik;
        this.derinlik = derinlik;
        this.kapaliMi = kapaliMi;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        if (yukseklik <= 0) return;
        this.yukseklik = yukseklik;
    }

    @Override
    public String toString() {
        return "Açıklama : '" + aciklama + '\'';
    }
}
