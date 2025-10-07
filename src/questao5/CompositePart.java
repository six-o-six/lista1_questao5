package questao5;

import java.util.ArrayList;
import java.util.List;

/**
 * Composto (Composite - Padrão Composite). Representa peças que contêm outras peças.
 */
public class CompositePart extends CarPart {

    private final List<CarPart> children = new ArrayList<>();

    public CompositePart(String nome) {
        super(nome, 0.0); 
    }

    public void add(CarPart component) {
        children.add(component);
    }

    /**
     * Calcula o peso total e imprime o log de forma recursiva.
     * * @param currentTotal O peso acumulado dos componentes anteriores.
     * @return O peso total deste composto.
     */
    @Override
    public double calculateTotalWeight(double currentTotal) {
        double subTotalPeso = 0.0;
        
        // Itera sobre todos os filhos
        for (CarPart part : children) {
            // A chamada recursiva passa o total acumulado ATUALIZADO (peso dos componentes que o precedem).
            double pesoDoFilho = part.calculateTotalWeight(currentTotal + subTotalPeso); 
            
            // O subTotalPeso acumula o peso de todos os filhos processados até agora.
            subTotalPeso += pesoDoFilho; 
        }
        
        return subTotalPeso;
    }
}