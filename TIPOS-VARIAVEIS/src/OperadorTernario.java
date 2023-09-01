public class OperadorTernario {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, Raul Ramos!");

        int nota1 = 10, nota2 = 8;
        double media = (nota1 + nota2) / 2; 

        String resultado = media > 7 ? "Aprovado" : "Reprovado";
        
        System.out.println(resultado);
    }
}
