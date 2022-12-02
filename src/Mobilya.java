public class Mobilya {
    private String aciklama;
    private double h;
    private boolean kapaliMi;

    public Mobilya() {
    }

    public Mobilya(String aciklama, double h, boolean kapaliMi) {
        this.aciklama = aciklama;
        setH(h);
        this.kapaliMi = kapaliMi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        if(h<=0){
            System.err.println("Yükseklik sıfırdan büyük olmalıdır!");
        }else {
            this.h = h;
        }
    }

    public boolean isKapaliMi() {
        return kapaliMi;
    }

    public void setKapaliMi(boolean kapaliMi) {
        this.kapaliMi = kapaliMi;
    }

    @Override
    public String toString() {
        return "(" + aciklama + ")";
    }
}