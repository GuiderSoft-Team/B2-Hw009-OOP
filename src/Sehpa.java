public class Sehpa extends Mobilya implements Dortgen {
    private double derinlik;
    private double genislik;
    public Sehpa() {
    }
    public Sehpa(String aciklama, double genislik, double derinlik, double yukseklik, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        setDerinlik(derinlik);
        setGenislik(genislik);
    }
    @Override
    public void setGenislik(double genislik) {
        if (genislik > 0) this.genislik = genislik;

    }
    @Override
    public double getGenislik() {
        return genislik;
    }
    @Override
    public void setDerinlik(double derinlik) {
        if (derinlik > 0) this.derinlik = derinlik;
    }
    @Override
    public double getDerinlik() {
        return derinlik;
    }
    @Override
    public double alanHesapla() {
        if (getKapaliMi()) {
            return 6 * genislik * derinlik;
        } else {
            return genislik * derinlik;
        }}
    @Override
    public double hacimHesapla() {
        return genislik * derinlik * getYukseklik();
    }

    @Override
    public String toString() {
        return super.toString() + "[ genislik : " + getGenislik() + "derinlik :" + getDerinlik() + "yukseklik :" + getYukseklik() + "]";
    }
}