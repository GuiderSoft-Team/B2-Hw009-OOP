public class Masa extends Mobilya implements Dortgen {
    private double genislik;
    private double derinlik;

    public Masa() {
    }

    public Masa(String aciklama, double yukseklik, double derinlik, double genislik, boolean kapaliMİ) {
        super(aciklama, yukseklik, kapaliMİ);
        this.derinlik = derinlik;
        this.genislik = genislik;
    }

    public Masa(int derinlik) {
        this.derinlik = derinlik;
    }


    @Override
    public double getGenislik() {
        return genislik;
    }

    @Override
    public void setGenislik(double genislik) {

    }

    @Override
    public void setDerinlik(double derinlik) {

    }

    @Override
    public double getDerinlik() {
        return derinlik;
    }

    @Override
    public double alanHesapla() {
        return derinlik * genislik;
    }

    @Override
    public double hacimHesapla() {
        return getGenislik() * getYukseklik() * derinlik;
    }

    @Override
    public String toString() {
        // return String.format(super.toString() + genislik derinlik * getYukseklik());

        return String.format("%s %5.2f   %5.2f  %5.2f %b "
                , getAciklama(), getYukseklik(), getDerinlik(), getGenislik(), false);
    }
}

