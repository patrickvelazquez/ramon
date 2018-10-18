package examen;

public class Puesto 
{
    private int numeroPuesto;
    private String descripcion,funciones,nivelAcademico,tipoPuesto;

    public Puesto()
    {
        this.descripcion="";
        this.funciones="";
        this.nivelAcademico="Lic e Ing";
        this.numeroPuesto=1;
        this.tipoPuesto="Eventual";
    }
    public Puesto(Puesto nuevo)
    {
        this.descripcion=nuevo.descripcion;
        this.funciones=nuevo.funciones;
        this.nivelAcademico=nuevo.nivelAcademico;
        this.numeroPuesto=nuevo.numeroPuesto;
        this.tipoPuesto=nuevo.tipoPuesto;
    }
    public Puesto(int numeroPuesto, String descripcion, String funciones, String nivelAcademico, String tipoPuesto) {
        this.numeroPuesto = numeroPuesto;
        this.descripcion = descripcion;
        this.funciones = funciones;
        this.nivelAcademico = nivelAcademico;
        this.tipoPuesto = tipoPuesto;
    }

    public int getNumeroPuesto() {
        return numeroPuesto;
    }

    public void setNumeroPuesto(int numeroPuesto) {
        this.numeroPuesto = numeroPuesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public String getTipoPuesto() {
        return tipoPuesto;
    }

    public void setTipoPuesto(String tipoPuesto) {
        this.tipoPuesto = tipoPuesto;
    }
}
