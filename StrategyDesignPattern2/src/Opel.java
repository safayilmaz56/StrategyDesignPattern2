public class Opel {

    public String marka;
    public String model;
    public int km;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Opel(String uretimTipi){
        System.out.println("Opel " + uretimTipi + " uretilmistir");
    }
}
