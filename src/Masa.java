
public class Masa extends Mobilya implements Dortgen {

    private double genislik;
    private double derinlik;

    public Masa() {
    }

    @Override
    public int kapaliMi() {
        return 0;
    }

    public Masa(String aciklama, double genislik, double derinlik, double yukseklik, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        this.genislik = genislik;
        this.derinlik = derinlik;
    }

    @Override
    public void setGenislik(double genislik) {

    }

    @Override
    public double getGenislik() {

        return 0;
    }

    @Override
    public void setDerinlik(double derinlik) {

    }


    @Override
    public double getDerinlik() {

        return 0;
    }

    @Override
    public double alanHesapla() {
        if (!isKapaliMi()) {
            return genislik * derinlik;
        } else {
            return 6 * genislik * derinlik;
        }

    }

    @Override
    public double hacimHesapla() {
        return genislik * derinlik * getYukseklik();
    }


}







  




