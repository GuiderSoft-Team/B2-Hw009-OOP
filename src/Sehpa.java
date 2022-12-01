public  class Sehpa extends Mobilya implements Dortgen{

    public Sehpa() {
    }

    public Sehpa(String metalDolap, double yukseklik, boolean kapaliMi) {
        super(metalDolap, yukseklik, kapaliMi);
    }


    @Override
    public double getYukseklik() {
        return super.getYukseklik();
    }

    @Override
    public void setYukseklik(double yukseklik) {
        super.setYukseklik(yukseklik);
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
        return 0;
    }

    @Override
    public boolean kapaliMi() {
        return false;
    }

    @Override
    public double hacimHesapla() {
        return 0;



    }
}
