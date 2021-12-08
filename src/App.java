public class App {
    public static void main(String[] args) throws Exception {
        
       Produtos prod = new Produtos();

       prod.setNome("Teste");
       prod.setPreco(100);
       prod.setCategoria("Tecnologia");
       prod.setDestaque(true);

        prod.MostrarProduto();
        
    }
}
