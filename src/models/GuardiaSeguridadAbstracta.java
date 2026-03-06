package models;

public abstract class GuardiaSeguridadAbstracta {

    protected String nombre;

    public GuardiaSeguridadAbstracta(String nombre) {
        this.nombre = nombre;
    }

    public abstract String protegerInstalacion();

}