package list.Ordenacao;

import java.util.Comparator;

//Classe com Método comparaçãoAltura
class ComparatorPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare (Pessoa p1, Pessoa p2){
        return  Double.compare(p1.getAltura(),p2.getAltura());
    }
}
