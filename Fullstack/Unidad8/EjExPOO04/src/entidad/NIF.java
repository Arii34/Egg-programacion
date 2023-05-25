package entidad;

public class NIF {

    private long dni;
    private char let;

    public NIF() {
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLet() {
        return let;
    }

    public void setLet(char let) {
        this.let = let;
    }

    @Override
    public String toString() {
        return "NIF{" + "dni=" + dni + ", let=" + let + '}';
    }

}
