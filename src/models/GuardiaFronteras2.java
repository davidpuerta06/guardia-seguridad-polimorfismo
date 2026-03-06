package models;

public class GuardiaFronteras2 extends GuardiaSeguridadAbstracta {

    public GuardiaFronteras2(String nombre) {
        super(nombre);
    }

    @Override
    public String protegerInstalacion() {
        return nombre + " está vigilando la frontera del país.";
    }

}