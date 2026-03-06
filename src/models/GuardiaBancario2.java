package models;

public class GuardiaBancario2 extends GuardiaSeguridadAbstracta {

    public GuardiaBancario2(String nombre) {
        super(nombre);
    }

    @Override
    public String protegerInstalacion() {
        return nombre + " está protegiendo las bóvedas del banco.";
    }

}