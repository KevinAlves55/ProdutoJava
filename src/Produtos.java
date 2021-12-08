public class Produtos {
    
    private String nome;
    private float preco;
    private String categoria;
    private boolean destaque;


    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return float return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return String return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return boolean return the destaque
     */
    public boolean isDestaque() {
        return destaque;
    }

    /**
     * @param destaque the destaque to set
     */
    public void setDestaque(boolean destaque) {
        this.destaque = destaque;
    }

    public void MostrarProduto() {

        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preço do produto: " + this.preco);
        System.out.println("Categoria do produto: " + this.categoria);

    }

}
