public class Bicycle {
    static int count; /* varible de clase */
    private String ownerName; /* varible de instancia */
    private float distance; /* varible de instancia */
    private String idBicy; /* varible de instancia */
    public Bicycle (String ownerName, int distance){
        this.distance = distance;
        this.distance = distance;
        counter();
        String temId = String.valueOf(10000*count);
        this.idBicy = ownerName.substring((int) 0.2)+temId.substring(1);
    }

    private void counter() { /* Metodo de instancia */
    }
    public static int getCount() {  /* metodo de clase */
        return count;
    }
    public static void setCount(int count) { /* metodo de clase */
        Bicycle.count = count;
    }
    public String getOwnerName() {  /* Metodo de instancia */
        return ownerName;
    }
    public void setOwnerName(String ownerName) { /* Metodo de instancia */
        this.ownerName = ownerName;
    }
    public float getDistance() { /* Metodo de instancia */
        return distance;
    }
    public void setDistance(float distance) { /* Metodo de instancia */
        this.distance = distance;
    }
    public String getIdBicy() { /* Metodo de instancia */
        return idBicy;
    }
    public void setIdBicy(String idBicy) { /* Metodo de instancia */
        this.idBicy = idBicy;
    }
    @Override
    public String toString() { /* Metodo de instancia */
        return "Bicycle [ownerName=" + ownerName + ", distance=" + distance + ", idBicy=" + idBicy + "]";
    }
    public void distanceTraveled(int i) { /* Metodo de instancia */
    }
    public static Bicycle ostUsed(Bicycle a, Bicycle b) { /* metodo de clase */
        return null;
    }
    public static Bicycle mostUsed(Bicycle a, Bicycle b) { /* metodo de clase */
        return null;
    }
}
