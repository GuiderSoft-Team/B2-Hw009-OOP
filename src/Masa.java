public class Masa extends Mobilya implements Dortgen {

    private double genislik;
    private double derinlik;
    public Masa() {
    }

    public Masa(String aciklama, double h, boolean kapaliMi, double genislik, double derinlik) {
        super(aciklama, h, kapaliMi);
        this.genislik = genislik;
        this.derinlik = derinlik;
    }

    @Override
    public void setGenislik(double genislik) {
        if (genislik<=0){
            System.out.println("Genislik sıfırdan büyük olmalıdır.");
        }else{
            this.genislik=genislik;
        }

    }

    @Override
    public double getGenislik() {
        return genislik;
    }

    @Override
    public void setDerinlik(double derinlik) {
        if (derinlik<=0){
            System.out.println("Derinlik sıfırdan büyük olmalıdır.");
        }else{
            this.derinlik=derinlik;
        }
    }

    @Override
    public double getDerinlik() {
        return derinlik;
    }

    @Override
    public double alanHesapla() {
        if (!isKapaliMi()){
            return genislik * derinlik;
        }else{
            return 6 * genislik * derinlik;
        }
    }

    @Override
    public double hacimHesapla() {
        return  genislik * derinlik * getH();
    }


    @Override
    public String toString() {
        return super.toString() + "[" + genislik + "x" + derinlik + "x" + getH() + "]";
    }
}
