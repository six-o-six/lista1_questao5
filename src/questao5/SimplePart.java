package questao5;

/**
 * Folha (Leaf - Padrão Composite). Representa peças que não podem ter subcomponentes.
 */
public class SimplePart extends CarPart {

    public SimplePart(String nome, double pesoBase) {
        super(nome, pesoBase);
    }

    /**
     * Calcula o peso total e imprime o log.
     * * @param currentTotal O peso acumulado dos componentes anteriores.
     * @return O peso desta peça.
     */
    @Override
    public double calculateTotalWeight(double currentTotal) {
        double peso = getPesoBase();
        double novoTotal = currentTotal + peso;
        
        System.out.printf("Somando agora o peso de %s: %.2f. Total parcial: %.2f\n", 
            getNome(), 
            peso, 
            novoTotal // Imprime a soma parcial
        );
        
        return peso;
    }
}