package HerancaInstanceof;

public class Teste2 {
    public static void main(String[] args) {

        //exemplo 1 : OK
        //retorno do método pode referenciar String
        Object obj1 = obterString();
        String s1 = (String) obj1;

        //exemplo2
        //o2 referencia String explicitamente
        Object obj2 = "Minha String";
        String s2 = (String) obj2;

        //exemplo 3 : FALHA em tempo de execução
        //o3 nao referencia String
        Object obj3 = new Object();
//        String s3 = (String) obj3;

        //Exemplo 4: FALHA em tempo de compilação
        //o4 nunca referencia String já que o retorno do método é int
        Object obj4 = obterinteiro();
        //String s4 = (String) obj4;
    }
        public static String obterString(){
            return "minha String";
        }

        public static int obterinteiro(){
            return 1;
    }
}
