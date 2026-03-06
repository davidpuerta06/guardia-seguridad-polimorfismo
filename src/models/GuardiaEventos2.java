package models;

public class GuardiaEventos2 extends GuardiaSeguridadAbstracta {

    public GuardiaEventos2(String nombre) {
        super(nombre);
    }

    @Override
    public String protegerInstalacion() {
        return nombre + " está controlando la seguridad del evento.";
    }

}