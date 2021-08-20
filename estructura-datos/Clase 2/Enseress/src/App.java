public class App {
    /**public static void main(String[] args) {
        Enseres enser[] = new Enseres[9];
        enser[0] = new Enseres(0.0,0,"azul");
        enser[1] = new Asiento(150.0,1,"cafe",65);
        enser[2] = new Pupitres(700.0,3,"negro",4,true);
        enser[3] = new Enseres(0.0,0,"blanco");
        enser[4] = new Asiento(300.0,1);
        enser[5] = new Pupitres(700.0,3);
        enser[6] = new Enseres();
        enser[7] = new Asiento();
        enser[8] = new Pupitres();
        PrecioTotal analisis1 = new PrecioTotal(enser);
        analisis1.mostrarTotales();
    }*/
    public static void main(String[] args) {
        Enseres enser[] = new Enseres[9];
        enser[0] = new Enseres(0.0,0,"azul");
        enser[1] = new Asiento(150.0,1,"cafe",65);
        enser[2] = new Pupitres(700.0,3,"negro",4,true);
        enser[3] = new Enseres(0.0,0,"blanco");
        enser[4] = new Asiento(300.0,1);
        enser[5] = new Pupitres(700.0,3);
        enser[6] = new Enseres();
        enser[7] = new Asiento();
        enser[8] = new Pupitres();
        PrecioTotal analisis1 = new PrecioTotal(enser);
        analisis1.mostrarTotales();
    }
}
