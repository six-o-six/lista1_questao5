package questao5;

import java.util.ArrayList;
import java.util.List;

/**
 * Composto (Composite - Padrão Composite). Representa peças que contêm outras peças.
 */
public class CompositePart extends CarPart {

    private final List<CarPart> children = new ArrayList<>();

    // O peso base é 0.0, pois o peso do composto será a soma de seus filhos.
    public CompositePart(String nome) {
        super(nome, 0.0); 
    }

    /**
     * Adiciona um subcomponente ao composto.
     * @param component O componente a ser adicionado (pode ser outra Folha ou outro Composto).
     */
    public void add(CarPart component) {
        children.add(component);
    }

    /**
     * Calcula o peso total deste composto somando o peso de todos os seus subcomponentes.
     * A recursão é o cerne do padrão Composite.
     */
    @Override
    public double calculateTotalWeight() {
        double total = getPesoBase(); 
        
        for (CarPart part : children) {
            // Chamada recursiva: o método calculateTotalWeight() será chamado em cada filho.
            total += part.calculateTotalWeight(); 
        }
        return total;
    }
}