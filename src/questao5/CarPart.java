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
     * Operação principal: calcula o peso total e imprime o log do total parcial.
     *
     * @param currentTotal O peso acumulado do carro até o momento da chamada, 
     * usado para o logging do "Total parcial".
     * @return O peso total do componente, incluindo subcomponentes.
     */
    public abstract double calculateTotalWeight(double currentTotal);
}