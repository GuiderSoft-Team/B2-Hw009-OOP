public  class YuvarlakSehpa extends Mobilya implements Daire{
    public YuvarlakSehpa() {
    }

    public YuvarlakSehpa(String metalDolap, double yukseklik, boolean kapaliMi) {
        super(metalDolap, yukseklik, kapaliMi);
    }

    public YuvarlakSehpa(String beyaz_sehpa, int i, int i1, boolean b) {
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
