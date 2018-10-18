/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author SAMANTHA
 */
public abstract class Puesto
{
    private int numeroDePuesto;
    private String descripcionPuesto;
    private String funcionesRealizar;
    private int nivelAcademico;
    private int tipoPuesto;
    
    public Puesto()
    {
        this.numeroDePuesto=82198;
        this.descripcionPuesto="Este es el puesto automático";
        this.funcionesRealizar="Su función es terminar el examen";
        this.nivelAcademico=2;
        this.tipoPuesto=2;
    }
    
    public Puesto(int n, String d, String f, int l, int t)
    {
        this.numeroDePuesto=n;
        this.descripcionPuesto=d;
        this.funcionesRealizar=f;
        this.nivelAcademico=l;
        this.tipoPuesto=t;
    }

    /**
     * @return the numeroDePuesto
     */
    public int getNumeroDePuesto() {
        return numeroDePuesto;
    }

    /**
     * @param numeroDePuesto the numeroDePuesto to set
     */
    public void setNumeroDePuesto(int numeroDePuesto) {
        this.numeroDePuesto = numeroDePuesto;
    }

    /**
     * @return the descripcionPuesto
     */
    public String getDescripcionPuesto() {
        return descripcionPuesto;
    }

    /**
     * @param descripcionPuesto the descripcionPuesto to set
     */
    public void setDescripcionPuesto(String descripcionPuesto) {
        this.descripcionPuesto = descripcionPuesto;
    }

    /**
     * @return the funcionesRealizar
     */
    public String getFuncionesRealizar() {
        return funcionesRealizar;
    }

    /**
     * @param funcionesRealizar the funcionesRealizar to set
     */
    public void setFuncionesRealizar(String funcionesRealizar) {
        this.funcionesRealizar = funcionesRealizar;
    }

    /**
     * @return the nivelAcademico
     */
    public int getNivelAcademico() {
        return nivelAcademico;
    }

    /**
     * @param nivelAcademico the nivelAcademico to set
     */
    public void setNivelAcademico(int nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    /**
     * @return the tipoPuesto
     */
    public int getTipoPuesto() {
        return tipoPuesto;
    }

    /**
     * @param tipoPuesto the tipoPuesto to set
     */
    public void setTipoPuesto(int tipoPuesto) {
        this.tipoPuesto = tipoPuesto;
    }
   
}
