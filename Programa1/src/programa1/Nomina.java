package programa1;

public class Nomina {
    private int numNomina;
    private int nivel;
    private int puesto;
    private int diasTrabajados;
    private String nombreEmpleado;
    private float sueldo;
    ///2017030777
    public Nomina()
    {
        this.diasTrabajados = 0;
        this.nivel = 1;
        this.sueldo = 0.0f;
        this.nombreEmpleado = "";
        this.puesto = 1;
        this.numNomina = 1;
    }

    public Nomina(int numNomina, String nombreEmpleado, int nivel, float sueldo, int diasTrabajados,
                  int puesto)
    {
        this.diasTrabajados = diasTrabajados;
        this.nivel = nivel;
        this.sueldo = sueldo;
        this.nombreEmpleado = nombreEmpleado;
        this.puesto = puesto;
        this.numNomina = numNomina;
    }


    public Nomina(Nomina nomina)
    {
        this.diasTrabajados = nomina.diasTrabajados;
        this.nivel = nomina.nivel;
        this.sueldo = nomina.sueldo;
        this.nombreEmpleado = nomina.nombreEmpleado;
        this.puesto = nomina.puesto;
        this.numNomina = nomina.numNomina;
    }



    public int getNumNomina() {
        return numNomina;
    }

    public void setNumNomina(int numNomina) {
        this.numNomina = numNomina;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float calcularSueldo()
    {
        float sueldoB = 0.0f, sueldo = 0.0f;

        switch (this.puesto)
        {
            case 1:
                sueldoB = this.sueldo + (this.sueldo * 0.10f);
                break;
            case 2:
                sueldoB = this.sueldo + ((this.sueldo *0.10f));
                sueldoB = sueldoB + (sueldoB *0.20f);
                break;
            case 3:
                sueldoB = this.sueldo + ((this.sueldo *0.10f));
                sueldoB = sueldoB + (sueldoB *0.20f);
                sueldoB = sueldoB + (sueldoB * 0.50f);
                break;

        }
        sueldo = this.diasTrabajados * sueldoB;
        return sueldo;



    }

    public float calcularBono(int numHijos)
    {
        return this.sueldo * numHijos;
    }

    public float calcularImpuesto()
    {
        float impuesto = 0.0f;

        if(this.nivel == 1)
        {
            impuesto = this.calcularSueldo() * 0.05f;
        }
        else if(this.nivel == 2)
        {
            impuesto = this.calcularSueldo() * 0.03f;
        }
        return impuesto;
    }






}
