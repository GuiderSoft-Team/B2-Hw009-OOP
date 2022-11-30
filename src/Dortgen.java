public interface Dortgen {
    void setGenislik(double genislik) throws LengthException;
    double getGenislik();
    void setDerinlik(double derinlik) throws LengthException;
    double getDerinlik();
    double alanHesapla();
    double hacimHesapla();
}
