package utnfc.isi.back.procesocsv.empleado;

import java.time.LocalDate;

import utnfc.isi.back.procesocsv.categoria.Categoria;

public class Contratado extends Empleado {
    
    public Contratado(Integer legajo, String nombre, double montoBase, Categoria categoria) {
        super(legajo, nombre, montoBase, categoria);
    }

    protected LocalDate fechaContratacion;

    public double calcularIncremento() {
        switch (categoria.getNombre()) {
            case "A": return 0.10;
            case "B": return 0.05;
            case "C": return 0.02;
            default: return 0.0;
        }
    }

    @Override
    public double calcularSueldo() {
        return montoBase * categoria.getCoeficiente() * (1 + calcularIncremento());
    }
}
