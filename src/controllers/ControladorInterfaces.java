package controllers;

import models.*;

import java.util.ArrayList;
import java.util.List;

public class ControladorInterfaces {

    public static void main(String[] args) {

        List<GuardiaSeguridad> guardias = new ArrayList<>();

        guardias.add(new GuardiaBancario());
        guardias.add(new GuardiaEventos());
        guardias.add(new GuardiaFronteras());

        for (GuardiaSeguridad guardia : guardias) {
            System.out.println(guardia.protegerInstalacion());
        }

    }

}