package utnfc.isi.back.procesocsv.empleado;

import utnfc.isi.back.procesocsv.categoria.Categoria;

public abstract class Empleado {
    protected Integer legajo;
    protected String nombre;;
    protected double montoBase;
    protected Categoria categoria;

    public Empleado(String nombre, double montoBase, Categoria categoria) {
        this.nombre = nombre;
        this.montoBase = montoBase;
        this.categoria = categoria;
    }

    public Empleado(Integer legajo2, String nombre2, double montoBase2, Categoria categoria2) {
        //TODO Auto-generated constructor stub
    }

    public abstract double calcularSueldo();
}
