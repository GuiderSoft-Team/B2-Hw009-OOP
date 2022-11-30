public class Sehpa extends Mobilya implements Dortgen{
    private double genislik;
    private double derinlik;

    public Sehpa(String aciklama,  double genislik, double derinlik,double yukseklik, boolean kapaliMi) throws LengthException {
        super(aciklama, yukseklik, kapaliMi);
        setGenislik(genislik);
        setDerinlik(derinlik);
    }

    public Sehpa() {
    }

    @Override
    public void setGenislik(double genislik) throws LengthException {
        if (genislik<=0) throw new LengthException("Genislik pozitif olmali!");
        this.genislik=genislik;
    }

    @Override
    public double getGenislik() {
        return genislik;
    }

    @Override
    public void setDerinlik(double derinlik) throws LengthException {
        if (derinlik<=0) throw new LengthException("Derinlik pozitif olmali!");
        this.derinlik=derinlik;
    }

    @Override
    public double getDerinlik() {
        return derinlik;
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
        return genislik*derinlik*getYukseklik();
    }

    @Override
    public String toString() {
        return super.toString()+"["+ genislik + " x " + derinlik+ " x " + getYukseklik() + "]";
    }
}
