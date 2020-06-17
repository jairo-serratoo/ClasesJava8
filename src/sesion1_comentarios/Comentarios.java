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
        String name = "Jairo";
        int edad = 28;
        double peso1 = 115.9;
        double peso2 = restePeso(peso1);
        System.out.println(name);
        System.out.println(edad);
        System.out.println(peso2);
    }
    
    /**
     * Este metodo se creo a raiz de que Jairo es vanidoso y se queria quitar 20 kilos de encima
     * @param peso el peso real del vanidoso de Jairo
     * @return el peso real menos 20 kilos
     */
    public static Double restePeso(double peso){
        double nuevoPeso = 0.0;
        nuevoPeso = peso - 20;
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
    */
}
