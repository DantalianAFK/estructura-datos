public class PrecioTotal extends Enseres{
    //Atributo
    private double sumaEnseres; 
    private double sumaPupitres; 
    private double sumaAsientos;
    private Enseres lsenseres[];

    //Constructor
    public PrecioTotal(Enseres penseres[]) {
        this.sumaAsientos=0.0;
        this.sumaEnseres=0.0;
        this.sumaPupitres=0.0;
        this.lsenseres = penseres;
    }
    //Metodos
    public void mostrarTotales() {
        for (int i=0; i<lsenseres.length;i++){
           if (lsenseres[i] instanceof Enseres){
               sumaEnseres+=lsenseres[i].precioFinal();
           }
           if (lsenseres[i] instanceof Pupitres){
                sumaPupitres=lsenseres[i].precioFinal();
            }
            if (lsenseres[i] instanceof Asiento){
                sumaAsientos+=lsenseres[i].precioFinal();
            } 
        }
    System.out.println("La suma del precio de los Enseres es de "+ sumaEnseres);
    System.out.println("La suma del precio de los Asientos es de "+ sumaAsientos);
    System.out.println("La suma del precio de los Pupitres es de "+ sumaPupitres);
    }
}
