public class Film {
    private String cim;
    private int ar;

    private final int[] velemenyek;

    public Film(String cim, int ar) {
        this.cim = cim;
        this.ar = ar;
        this.velemenyek = new int[20];
    }


    public String getCim() {
        return cim;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public void Velemenyezes(int velemeny) {
        for (int i=0;i<velemenyek.length;i++){
            if (velemenyek[i]==0){
                velemenyek[i]=velemeny;
                break;
            }
        }
    }
    public int Atlag(int atlag){
        if (velemenyek.length==0){
            System.out.println("Nincs vélemény.");
        }
        for(int i=0;i<velemenyek.length;i++){
            atlag=atlag+velemenyek[i];
            atlag=atlag/velemenyek.length;
        }
        return atlag;
    }

    @Override
    public String toString() {
        return "Film cim: " + cim + ',' + " Film ar: " + ar;
    }
}

