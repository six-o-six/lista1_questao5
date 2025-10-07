package questao5;

/**
 * Classe principal para montar o Carro (a raiz do Composite) e calcular seu peso total.
 */
public class Main {
    public static void main(String[] args) {
        // Pesos fictícios para demonstração (em kg)
        
        // 1. Montagem do Trem de Força (Leafs dentro de um Composite)
        CompositePart tremDeForca = new CompositePart("Trem de Força");
        tremDeForca.add(new SimplePart("Motor", 200.0));
        tremDeForca.add(new SimplePart("Transmissão", 80.0));
        tremDeForca.add(new SimplePart("Diferencial", 40.0));
        tremDeForca.add(new SimplePart("Rodas (4x)", 60.0)); 

        // 2. Montagem do Chassi (Composite)
        CompositePart chassi = new CompositePart("Chassi");
        chassi.add(tremDeForca); // Adiciona o Trem de Força (Composite)
        chassi.add(new SimplePart("Suspensão", 150.0)); // Adiciona a Suspensão (Leaf)
        
        // 3. Montagem da Carroceria (Composite)
        CompositePart carroceria = new CompositePart("Carroceria");
        carroceria.add(new SimplePart("Para-lamas (4x)", 15.0));
        carroceria.add(new SimplePart("Portas (4x)", 80.0));
        carroceria.add(new SimplePart("Painéis", 70.0));
        carroceria.add(new SimplePart("Porta-malas", 25.0));
        carroceria.add(new SimplePart("Capô", 20.0));
        
        // 4. Montagem do Carro (Raiz do Composite)
        CompositePart carro = new CompositePart("Carro");
        carro.add(carroceria);
        carro.add(chassi);

        // 5. Cálculo e Exibição do Resultado (Chamada na Raiz)
        double pesoTotal = carro.calculateTotalWeight();
        
        System.out.println("--- Cálculo de Peso do Veículo ---");
        System.out.println("Nome do Veículo: " + carro.getNome());
        System.out.printf("Peso Total do Carro: %.2f kg\n", pesoTotal);
        System.out.println("\nVerificação de Componentes:");
        System.out.printf("Peso da Carroceria: %.2f kg\n", carroceria.calculateTotalWeight());
        System.out.printf("Peso do Chassi: %.2f kg\n", chassi.calculateTotalWeight());
    }
}