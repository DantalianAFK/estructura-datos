    public class RenProyec {
        //Atributos
        
        private int Tiempo; double Capital; double Interes; double diferencia;

        // inicializando 
        public RenProyec()
        {
            this.Tiempo=0;
            this.Capital=0.0;
            this.Interes=0.0;
        }
        public RenProyec(Integer cTiempo, Double cCapital, Double cInteres)
        {
            //llamando variables privadas 
            this.Tiempo=cTiempo;
            this.Capital=cCapital;
            this.Interes=cInteres;
        }
            //calculo interes simple - redondear
        public double calcularInteresSimple()
        {
            double interesSimple = this.Capital * (this.Interes/100) * this.Tiempo;
            
            return Math.round(interesSimple);
            // calculo interes compuesto - redondear
        }
        public double calcularInteresCompuesto()
        {
            double interesCompuesto = this.Capital * (Math.pow((1 + (this.Interes/100)), this.Tiempo) - 1 );
            
            return Math.round(interesCompuesto);

        }
            //calculo inversión - requerimiento final e impresión 
        public String analisisInversion(Integer cTiempo, Double cCapital, Double cInteres)
        {
            this.Tiempo=cTiempo;
            this.Capital=cCapital;
            this.Interes=cInteres;
            double diferencia = calcularInteresCompuesto() -calcularInteresSimple();
        if ( diferencia>0)
        {
        return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + diferencia;
        }
        else
        {
        return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
        }
        }
        public String analisisInversion()
        {
        double diferencia = calcularInteresCompuesto() -calcularInteresSimple();
        {
        if ( diferencia>0)
        {
        return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + diferencia;
        }
        else
        {
        return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
        }
        }
}}



