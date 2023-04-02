package builder;

public class Burger {

    public String tipChifla;
    public String carne;
    public String sos;
    public String legume;
    public String condimente;

//    public Burger(String tipChifla, String carne, String sos, String legume, String condimente) {
//        this.tipChifla = tipChifla;
//        this.carne = carne;
//        this.sos = sos;
//        this.legume = legume;
//        this.condimente = condimente;
//    }

    public String getTipChifla() {
        return tipChifla;
    }

    public void setTipChifla(String tipChifla) {
        this.tipChifla = tipChifla;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getSos() {
        return sos;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    public String getLegume() {
        return legume;
    }

    public void setLegume(String legume) {
        this.legume = legume;
    }

    public String getCondimente() {
        return condimente;
    }

    public void setCondimente(String condimente) {
        this.condimente = condimente;
    }

    @Override
    public String toString() {
        return "\n  BURGER \n" +
                "chifla: " + tipChifla +
                "\ncarne: " + carne  +
                "\nsos: " + sos  +
                "\nlegume: " + legume  +
                "\ncondimente: " + condimente;
    }
}
