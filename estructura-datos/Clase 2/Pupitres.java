    public class Pupitres extends Enseres {
        //Constantes
        //Atributos
        private final static int COMPARTIMIENTO_BASE=2;
        private int Compartimiento;
        private boolean mesaTipoUniversitaria;

        public Pupitres(){
            this.Compartimiento=COMPARTIMIENTO_BASE;
            this.precioBase=PRECIO_BASE;
            this.tamano=TAMANO_BASE;
            this.color=COLOR_BASE;
        }
        public Pupitres(Double precioBase, Integer tamano)
        {
            this.precioBase=precioBase;
            this.tamano=tamano;
        }    
        public Pupitres(Double precioBase, int tamano, String color, int Compartimiento, boolean mesaTipoUniversitaria)
        {
            super(precioBase, tamano, color);
            this.Compartimiento=Compartimiento;
            this.mesaTipoUniversitaria=mesaTipoUniversitaria;
        } 
        public double precioFinal()
        {   double a=super.precioFinal();
            if (mesaTipoUniversitaria==true){
                a+=100;
            }
            if (Compartimiento>3){
                a+=50;
            }
        return a;
        }
    }
