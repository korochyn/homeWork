package family_tree.comporators;

import family_tree.TreeElement;
import human.Human;

import java.util.Comparator;

public class TreeComparatorByName<E extends TreeElement> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getName().compareTo(o2.getName());
    }
}