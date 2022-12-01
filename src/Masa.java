public class Masa extends Mobilya implements Dortgen{
    private double genislik;
    private double derinlik;
    public Masa() {
    }

    public Masa(String aciklama, double yukseklik,double genislik,double derinlik, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        setGenislik(genislik);
        setDerinlik(derinlik);
    }

    @Override
    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }

    @Override
    public double getGenislik() {

        return this.genislik;
    }

    @Override
    public void setDerinlik(double derinlik) {
        this.derinlik = derinlik;
    }

    @Override
    public double getDerinlik() {

        return this.derinlik;
    }

    @Override
    public double alanHesapla() {
        if (!super.isKapaliMi()){
            return getGenislik()*getDerinlik();
        }else {
            return 6*getGenislik()*getDerinlik();
        }
    }

    @Override
    public double hacimHesapla() {
        return getGenislik()*getDerinlik()*getYukseklik();
    }

    @Override
    public String toString() {
        return super.toString()+String.format(" [%f x %f x %f]",getGenislik(),getDerinlik(),getYukseklik());
    }
}
