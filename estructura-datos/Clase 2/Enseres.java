public class Enseres {
    //Constantes
    protected final static double PRECIO_BASE=200; 
    protected final static String COLOR_BASE="negro"; 
    protected final static int TAMANO_BASE=1; 
    //Atributos
    protected double precioBase;
    protected String color; 
    protected int tamano;

        public Enseres(){
            this.precioBase=PRECIO_BASE;
            this.tamano=TAMANO_BASE;
            this.color=COLOR_BASE;
        }
        public Enseres(Double precioBase, int tamano){
                this.precioBase=precioBase;
                this.tamano=tamano;

            }
            public Enseres (Double precioBase, Integer tamano, String color){
                this.precioBase=precioBase;
                comprobarColor(color);
                comprobarTamano(tamano);
            }
        private void comprobarColor(String color)
        {   boolean c=false;
            String lisColores[]={"negro","cafe","blanco","Rojo"};
            for (int i=0; i<lisColores.length && !c;i++){
                if (lisColores[i].equals(color)){
                    c=true;
                }
            } 
            if (c){
                this.color=color;
            }          
            else {
                this.color=COLOR_BASE;
            }
        }
        private void comprobarTamano(int tamano)
        {   if (tamano>=0 && tamano<=5){
                this.tamano=tamano;
            }          
            else {
                this.tamano=TAMANO_BASE;
            }
        }
   
    //Metodos publicos
    /**Devuelve el precio base del enser */
    public double getPrecioBase()
    {   
        return precioBase;
    }
    /** Devuelve el color del enser */
    public String getColor()
    {
        return color;
    }
    /**Devuelve el tamano del enser */
    public double getTamano()
    {
        return tamano;
    }
    /**Precio final del enser */
    public double precioFinal()
    {   double finalfinal=0;

        if (color=="negro"){
            finalfinal+=100;
        }
        if (color=="cafe"){
            finalfinal+=80;
        }
        if (color=="blanco"){
            finalfinal+=70;
        }
        if (color=="rojo"){
            finalfinal+=50;
        }
        if (tamano>0 && tamano<1){
            finalfinal+=200;
        }
        if (tamano>1 && tamano<2){
            finalfinal+=300;
        }
        if (tamano>2 && tamano<3){
            finalfinal+=400;
        }
        if (tamano>3 && tamano<4){
            finalfinal+=500;
        }
        if (tamano>4 && tamano<5){
            finalfinal+=600;
        }
        if (tamano>5 && tamano<6){
            finalfinal+=700;
        }
        return precioBase+finalfinal;
    }
}
