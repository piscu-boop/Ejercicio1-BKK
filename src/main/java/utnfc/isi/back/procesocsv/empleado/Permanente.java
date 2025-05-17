package utnfc.isi.back.procesocsv.empleado;


import java.time.LocalDate;

import utnfc.isi.back.procesocsv.categoria.Categoria;

public class Permanente extends Empleado{

    public Permanente(Integer legajo, String nombre, double montoBase, Categoria categoria) {
        super(legajo, nombre, montoBase, categoria);
        //TODO Auto-generated constructor stub
    }
    protected LocalDate fechaIngreso;

    public int calcularAntiguedad() {
        return LocalDate.now().getYear() - fechaIngreso.getYear();
    }

    @Override
    public double calcularSueldo() {
        return montoBase * categoria.getCoeficiente() * (1 + 0.02 * calcularAntiguedad());
    }
}
