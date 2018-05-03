package mx.com.bq.java.examples.e1.lambda;

public class Scopes {
    
    private static double atributo1;
    private double atributo2;
    
    public double probarLocalVariable() {
        final double n3 = 3;
        // JAVA 1.7
        Operacion op = new Operacion(){
            @Override
            public double calcular (double n1, double n2){
//                n3 = n1 + n2; // Es necesario que n3 sea Final
                return n1 + n2 + n3;
            };
        };

        // JAVA 1.8    
        Operacion opl = (x, y) -> {
            return x + y + n3;
        };
        
        return opl.calcular(1,2);
    }
    
    public double probarAtributosStaticVariables() {
        // JAVA 1.8    
        Operacion opl = (x, y) -> {
            atributo1 =  x + y; 
            atributo2 = atributo1;
            return atributo2;
        };
        
        // JAVA 1.7
        Operacion op = new Operacion(){
            @Override
            public double calcular (double n1, double n2){
                atributo1 =  n1 + n2; 
                atributo2 = atributo1;
                return atributo2;
            };
        };

        
        return opl.calcular(2,3);
    }
    
    public static void main(String[] args) {
        Scopes sc = new Scopes();
//        System.out.println( sc.probarLocalVariable() );
        System.out.println( sc.probarAtributosStaticVariables() );
        
    }
    
}
