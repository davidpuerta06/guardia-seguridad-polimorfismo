package models;

public class GuardiaEventos implements GuardiaSeguridad {

    @Override
    public String protegerInstalacion() {
        return "Guardia de Eventos controlando el acceso al evento.";
    }

}