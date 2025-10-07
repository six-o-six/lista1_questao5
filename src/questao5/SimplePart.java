package questao5;

/**
 * Folha (Leaf - Padrão Composite). Representa peças que não podem ter subcomponentes.
 */
public class SimplePart extends CarPart {

    public SimplePart(String nome, double pesoBase) {
        super(nome, pesoBase);
    }

    /**
     * O peso total de uma peça simples é apenas o seu peso base.
     */
    @Override
    public double calculateTotalWeight() {
        return getPesoBase();
    }
}