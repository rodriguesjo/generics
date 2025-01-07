package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program {

    public static void main(String[] args) {

        // Define o padrão de localização para US, para formatação de números decimais e moeda.
        Locale.setDefault(Locale.US);

        // Cria uma lista para armazenar os produtos.
        List<Product> list = new ArrayList<>();

        // Caminho do arquivo de entrada que contém os dados dos produtos.
        String path = "C:\\temp\\in.txt";

        // Utiliza um bloco try-with-resources para abrir e ler o arquivo.
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // Lê a primeira linha do arquivo.
            String line = br.readLine();
            
            // Continua lendo linhas até o final do arquivo.
            while (line != null) {
                // Divide a linha em campos separados por vírgula e cria um objeto Product.
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                // Lê a próxima linha.
                line = br.readLine();
            }

            // Encontra o produto mais caro usando o serviço de cálculo.
            Product x = CalculationService.max(list);
            // Exibe o produto mais caro encontrado.
            System.out.println("Most expensive: ");
            System.out.println(x);

        } catch (IOException e) {
            // Captura e exibe qualquer exceção de entrada/saída que possa ocorrer.
            System.out.println("Error: " + e.getMessage());
        }
    }
}
