public class TesteConexao {
    public static void main(String[] args) {

       try (Conexao conexao = new Conexao()){
           conexao.leDados();
       }catch (IllegalStateException e){
            System.out.println("Erro encontrado na conexão!");
       }




//        Conexao conexao = null;
//        try {
//            conexao = new Conexao();
//            conexao.leDados();
//        }catch (IllegalStateException e){
//            System.out.println("Erro encontrado na conexão!");
//        }finally {
//            conexao.close();
//        }
    }
}
