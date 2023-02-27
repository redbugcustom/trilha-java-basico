public class Ternario {
    public static void main (String[] args){
       
        int a, b;

        a = 6;
        b = 6;

        // Sintaxe convencional

        //String resultado = "";
        //if(a==b)
          //  resultado = "verdadeiro";
        //else
            //  resultado = "Falso";

        // System.out.println(resultado);

        // Sintaxe Ternario

        String resultado = a==b ?"Verdadeiro":"Falso";
        System.out.println(resultado);


    }
}
