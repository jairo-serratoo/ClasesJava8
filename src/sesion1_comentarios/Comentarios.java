/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion1_comentarios;

/**
 *
 * @author jairo
 */
public class Comentarios {
    
    //Metodo Main
    public static void main(String[] args){
        //Atributos
        String nameJairo = "Jairo";
        double pesoJairo = 115.9;
        double pesoDeseadoJairo = clacularPeso(pesoJairo, 20, "restar");
          
        String nameLuis = "Luis";
        double pesoLuis = 150;
        double pesoDeseadoLuis = clacularPeso(pesoLuis, 30, "restar");
        
        String nameOmar = "Omar";
        double pesoOmar = 98;
         double pesoDeseadoOmar = clacularPeso(pesoOmar, 10, "restar");
        
        String nameCarlos = "Carlos";
        double pesoCarlos = 60;
        double pesoDeseadoCarlos = clacularPeso(pesoCarlos, 5, "restar");
        
        String nameFernando= "Fernando";
        double pesoFernando = 49;
        double pesoDeseadoFernando = clacularPeso(pesoFernando, 5.5, "sumar"); //Ganar
        
        System.out.println("Nombre: " + nameJairo + ", Peso: " + pesoDeseadoJairo);
        System.out.println("Nombre: " + nameLuis + ", Peso: " + pesoDeseadoLuis);
        System.out.println("Nombre: " + nameOmar + ", Peso: " + pesoDeseadoOmar);
        System.out.println("Nombre: " + nameCarlos + ", Peso: " + pesoDeseadoCarlos);
        System.out.println("Nombre: " + nameFernando + ", Peso: " + pesoDeseadoFernando);
    }
    
    /**
     * Este metodo se creo a raiz de que Jairo es vanidoso y se queria quitar 20 kilos de encima
     * @param peso el peso real del vanidoso de Jairo
     * @param pesoAPerder es el peso que se le restara
     * @param signo determinara si se suma o se resta peso
     * @return el peso real menos el peso a perder
     */
    public static Double clacularPeso(double peso, double pesoAPerder, String signo){
        double nuevoPeso = 0.0;
        if(signo.equals("sumar")){
            nuevoPeso = peso + pesoAPerder;
        }else{
            nuevoPeso = peso - pesoAPerder;
        }
        return nuevoPeso;
    }
    
    /*
        if(signo == +){
            sumar peso;
        }else{
            perder peso;
        }
    */
    
    
    //Comentario de linea
    
    /*
        public static Double restePeso(115.9){
            double 0.0;
            95.9 = 115.9 - 20;
            return 95.9;
        }
    */
    
    /*
        tarea 17 Junio
    - un metodo reste la cantidad de kilos que yo desee
            Luis pes 150 kg, pero luis es vanidoso y se quiere quitar 30 kilos
            Omar pesa 98 kg, pero se quiere quitar 10 kilos
            Carlos pesa 60 kg, pero se quiere quitar 5 kilos
            Fernando pesa 49 kilos y quiere aumentar 5.5 kilos
    
        tarea 18 Junio
    -Lograr que el metodo que vamos trabajando, pueda sumarle el peso deseado de Fernando
    -Reducir el codigo a menos lineas (Tema: concatenacion)
    
            tarea 19 Junio
    - Investigar Operadores Logicos y su funcionamiento
    - Refinar el tema de concatenacion y aplicarlo a nuestro programa
    */
}
