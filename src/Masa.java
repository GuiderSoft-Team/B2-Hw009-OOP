public class Masa extends Mobilya implements Dortgen {

    private double genislik;
    private  double derinlik;

    public Masa(String aciklama, double yukseklik,  double derinlik, double genislik,boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        this.genislik = genislik;
        this.derinlik = derinlik;
    }

    public Masa() {
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
        if (isKapaliMi()){
            return 6*genislik*derinlik;
        }else{
            return genislik*derinlik;
        }

    }

    @Override
    public double hacimHesapla() {
        return genislik*derinlik*getYukseklik();
    }

    @Override
    public String toString() {
        return String.format("%s [%5.2fx%5.2fx%5.2f]",super.toString(),genislik,derinlik,getYukseklik());
    }
}
