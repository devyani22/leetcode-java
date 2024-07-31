package Misc;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestingSets {

    public static void main(String[] args) {

        // removed duplicate while storing
        Set<Integer> myset = new HashSet();
        myset.add(1);
        myset.add(3);
        myset.add(1);

        System.out.println("HashSet Elements: " + myset);

        // sorted and removed
        Set<Integer> treeset = new TreeSet<>();
        treeset.add(2);
        treeset.add(1);
        treeset.add(7);
        treeset.add(3);
        treeset.add(3);

        System.out.println("TreeSet Elements: " + treeset);

        // removed dup and kept the insertion order
        Set<Integer> linkset = new LinkedHashSet<>();
        linkset.add(2);
        linkset.add(1);
        linkset.add(7);
        linkset.add(3);
        linkset.add(3);

        System.out.println("LinkedHashSet Elements: " + linkset);
    }
}
