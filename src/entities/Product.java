package entities;

public class Product implements Comparable<Product> {

    // Atributos do produto: nome e preço.
    private String name;
    private Double price;
    
    // Construtor que inicializa os atributos name e price.
    public Product(String name, Double price) {        
        this.name = name;
        this.price = price;
    }

    // Método getter para obter o nome do produto.
    public String getName() {
        return name;
    }

    // Método setter para definir o nome do produto.
    public void setName(String name) {
        this.name = name;
    }

    // Método getter para obter o preço do produto.
    public Double getPrice() {
        return price;
    }

    // Método setter para definir o preço do produto.
    public void setPrice(Double price) {
        this.price = price;
    }
    
    // Método toString que retorna uma representação em string do produto.
    // Inclui o nome e o preço formatado com duas casas decimais.
    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }

    // Implementação do método compareTo da interface Comparable.
    // Compara o preço do produto atual com o preço de outro produto.
    @Override
    public int compareTo(Product other) {        
        return price.compareTo(other.getPrice());
    }
    
}
