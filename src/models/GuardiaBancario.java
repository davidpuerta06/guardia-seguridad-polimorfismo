package models;

public class GuardiaBancario implements GuardiaSeguridad {

    @Override
    public String protegerInstalacion() {
        return "Guardia Bancario protegiendo las bóvedas del banco.";
    }

}