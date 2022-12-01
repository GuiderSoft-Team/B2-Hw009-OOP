public class Masa extends Mobilya implements Dortgen {

    private double genislik;
    private double derinlik;
    public Masa() {
    }

    public Masa(String metalDolap, double yukseklik, boolean kapaliMi) {
        super(metalDolap, yukseklik, kapaliMi);
    }

    public Masa(String ahsap_masa, int i, int i1, int i2, boolean b) {
    }


    @Override
    public void setGenislik(double genislik) {
    }


    @Override
    public double getGenislik() {
        return genislik;
    }


    @Override
    public void setDerinlik(double derinlik) {


    }

    @Override
    public double getDerinlik() {
        return 0;
    }

    @Override
    public double alanHesapla(){
        if (kapaliMi()){
            return genislik*derinlik;
        }else {
            return 6*genislik*derinlik;
        }
    }




    @Override
    public boolean kapaliMi() {
        return false;
    }

    @Override
    public double hacimHesapla() {
        return genislik*derinlik;
    }



    }

