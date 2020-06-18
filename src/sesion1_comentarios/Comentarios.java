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
        String nameLuis = "Luis";
        String nameOmar = "Omar";
        String nameCarlos = "Carlos";
        String nameFernando= "Fernando";
        //int edad = 28;
        double pesoJairo = 115.9;
        double pesoLuis = 150;
        double pesoOmar = 98;
        double pesoCarlos = 60;
        double pesoFernando = 49;
        
        double pesoDeseadoJairo = restePeso(pesoJairo, 20);
        double pesoDeseadoLuis = restePeso(pesoLuis, 30);
        double pesoDeseadoOmar = restePeso(pesoOmar, 10);
        double pesoDeseadoCarlos = restePeso(pesoCarlos, 5);
        double pesoDeseadoFernando = restePeso(pesoFernando, 5.5); //Ganar
        System.out.println(nameJairo);
        System.out.println(nameLuis);
        System.out.println(nameOmar);
        System.out.println(nameCarlos);
        System.out.println(nameFernando);
        //System.out.println(edad);
        System.out.println(pesoDeseadoJairo);
        System.out.println(pesoDeseadoLuis);
        System.out.println(pesoDeseadoOmar);
        System.out.println(pesoDeseadoCarlos);
        System.out.println(pesoDeseadoFernando);
    }
    
    /**
     * Este metodo se creo a raiz de que Jairo es vanidoso y se queria quitar 20 kilos de encima
     * @param peso el peso real del vanidoso de Jairo
     * @param pesoAPerder es el peso que se le restara
     * @return el peso real menos el peso a perder
     */
    public static Double restePeso(double peso, double pesoAPerder){
        double nuevoPeso = 0.0;
        nuevoPeso = peso - pesoAPerder;
        return nuevoPeso;
    }
    
    
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
    */
}
