package ec.devsu.code.jam;

import java.util.List;
import java.util.Stack;

/**
 * MixName
 */
public class HanoiTower {

    public void mover(int dimension, Stack<Integer> A, Stack<Integer> B, Stack<Integer> C) {
        if (dimension == 1) {
            moverDisco(A, C);
            return;
        }
        mover(dimension - 1, A, C, B);
        moverDisco(A, C);
        mover(dimension - 1, B, A, C);
    }

    public void moverDisco(Stack<Integer> origen, Stack<Integer> destino) {

        Integer fichaTemp = origen.pop();
        destino.push(fichaTemp);

    }

}