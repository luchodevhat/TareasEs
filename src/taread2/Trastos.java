
package taread2;


public class Trastos {
    private int platosC;
    private int vasosC;
    private int cubiertos;

    public Trastos(int platosC, int vasosC, int cubiertos) {
        this.platosC = platosC;
        this.vasosC = vasosC;
        this.cubiertos = cubiertos;
    }

    public int getPlatosC() {
        return platosC;
    }

    public void setPlatosC(int platosC) {
        this.platosC = platosC;
    }

    public int getVasosC() {
        return vasosC;
    }

    public void setVasosC(int vasosC) {
        this.vasosC = vasosC;
    }

    public int getCubiertos() {
        return cubiertos;
    }

    public void setCubiertos(int cubiertos) {
        this.cubiertos = cubiertos;
    }

    @Override
    public String toString() {
        return "Trastos{" + "platosC=" + platosC + ", vasosC=" + vasosC + ", cubiertos=" + cubiertos + '}';
    }
}
