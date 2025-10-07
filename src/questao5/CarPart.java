package questao5;

/**
 * Componente Base (Padrão Composite). Define a interface comum e 
 * as características básicas (nome e peso) para todas as partes do carro.
 */
public abstract class CarPart {
    private final String nome;
    private final double pesoBase; 

    public CarPart(String nome, double pesoBase) {
        this.nome = nome;
        this.pesoBase = pesoBase;
    }

    public String getNome() {
        return nome;
    }

    public double getPesoBase() {
        return pesoBase;
    }

    /**
     * Operação principal: calcula recursivamente o peso total (incluindo subcomponentes).
     * @return O peso total da parte.
     */
    public abstract double calculateTotalWeight();
}