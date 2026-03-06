package controllers;

import models.*;

import java.util.ArrayList;
import java.util.List;

public class ControladorAbstractas {

    public static void main(String[] args) {

        List<GuardiaSeguridadAbstracta> guardias = new ArrayList<>();

        guardias.add(new GuardiaBancario2("David"));
        guardias.add(new GuardiaEventos2("Felipe"));
        guardias.add(new GuardiaFronteras2("Juan"));

        for (GuardiaSeguridadAbstracta guardia : guardias) {
            System.out.println(guardia.protegerInstalacion());
        }

    }

}