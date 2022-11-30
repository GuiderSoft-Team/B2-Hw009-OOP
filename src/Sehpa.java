public class Sehpa extends Mobilya implements Dortgen{

    private double genislik;
    private double derinlik;

    public Sehpa() {
    }

    public Sehpa(String aciklama, double yukseklik, boolean kapaliMi, double genislik, double derinlik) {
        super(aciklama, yukseklik, kapaliMi);
        this.genislik = genislik;
        this.derinlik = derinlik;
    }

    @Override
    public void setGenislik(double genislik) {
        if (genislik<0) this.genislik=0;
        else this.genislik=genislik;

    }

    @Override
    public double getGenislik() {
        return 0;
    }

    @Override
    public void setDerinlik(double derinlik) {
        if (derinlik<0)this.derinlik=0;
        else this.derinlik=derinlik;

    }

    @Override
    public double getDerinlik() {
        return 0;
    }

    @Override
    public double alanHesapla() {
        if (!isKapaliMi()){
            return genislik*derinlik;
        }else {
            return 6*genislik*derinlik;
        }
    }

    @Override
    public double hacimHesapla() {
        return genislik * derinlik * getYukseklik();
    }

    @Override
    public String toString() {
        return super.toString()+"[ genislik : "+getGenislik()+"derinlik :"+getDerinlik()+
                "yükseklik :"+getYukseklik()+"]";
    }
}
