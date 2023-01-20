public class Main {
    public static void main(String[] args) {

        OzelYapimUret ozelYapimUret = new OzelYapimUret();
        SeriUret seriUret = new SeriUret();
        SiparisUzerineUret siparisUzerineUret = new SiparisUzerineUret();

        Uretici uretici1 = new Uretici(ozelYapimUret);
        Uretici uretici2 = new Uretici(seriUret);
        Uretici uretici3 = new Uretici(siparisUzerineUret);
    }
}