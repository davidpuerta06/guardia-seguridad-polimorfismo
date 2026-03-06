package models;

public class GuardiaFronteras implements GuardiaSeguridad {

    @Override
    public String protegerInstalacion() {
        return "Guardia de Fronteras vigilando el paso fronterizo.";
    }

}