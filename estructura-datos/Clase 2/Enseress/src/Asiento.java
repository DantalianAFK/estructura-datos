public class Asiento extends Enseres {
    //Constantes
    private final static int PESO_BASE=30;
    //Atributos
    private int peso;

    //Métodos públicos

    //constructor
    public Asiento()
    {
            this.peso=PESO_BASE;
            this.precioBase=PRECIO_BASE;
            this.tamano=TAMANO_BASE;
            this.color=COLOR_BASE;
    }
    public Asiento(Double precioBase, Integer tamano)
    {
        this.precioBase=precioBase;
        this.tamano=tamano;
    }

    public Asiento (Double precioBase, Integer tamano, String color, Integer peso)
    {
        super(precioBase, tamano, color);
        this.peso=peso;
    }
    public int getPeso()
    {
        return peso;
    }
    /** Precio final de la silla */
    public double precioFinal()
    {
        double e=super.precioFinal();
        if (peso>65) {
            e+=50;
        }
        return e;
    }
}

