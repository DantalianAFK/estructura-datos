public class Pupitres extends Enseres {
    //Constantes
    //Atributos
    private final static int COMPARTIMIENTO_BASE=2;
    private int compartimiento;
    private boolean mesaTipoUniversitaria;

    public Pupitres(){
        this.compartimiento=COMPARTIMIENTO_BASE;
        this.precioBase=PRECIO_BASE;
        this.tamano=TAMANO_BASE;
        this.color=COLOR_BASE;
    }
    public Pupitres(Double precioBase, Integer tamano)
    {
        this.precioBase=precioBase;
        this.tamano=tamano;
    }    
    public Pupitres(Double precioBase, int tamano, String color, int compartimiento, boolean mesaTipoUniversitaria)
    {
        super(precioBase, tamano, color);
        this.compartimiento=compartimiento;
        this.mesaTipoUniversitaria=mesaTipoUniversitaria;
    } 
    public double precioFinal()
    {   double w=super.precioFinal();
        if (mesaTipoUniversitaria == true){
            w+=100;
        }
        if (compartimiento>3){
            w+=50;
        }
    return w;
    }
}