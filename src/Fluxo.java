public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        }catch (Exception e){
            String message = e.getMessage();
            System.out.println("Exception: " + message);
            e.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MyException {
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MyException{

        System.out.println("Inicio do metodo2");

        throw new MyException("Erro encontrado");

        //System.out.println("Fim do metodo2");
    }
}
