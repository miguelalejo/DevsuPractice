package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Stack;

import org.junit.jupiter.api.Test;

/**
 * MixName
 */
public class HanoiTowerTest {
    HanoiTower hanoiTower;

    @Test
    public void shouldMoveOneDisc() {
        Stack<Integer> A = new Stack<>();
        A.add(1);
        Stack<Integer> B = new Stack<>();
        Stack<Integer> C = new Stack<>();
        int size = A.size();
        hanoiTower = new HanoiTower();
        hanoiTower.mover(A.size(), A, B, C);
        assertEquals(0, A.size());
        assertEquals(0, B.size());
        assertEquals(size, C.size());
    }

    @Test
    public void shouldMoveTwoDisc() {
        Stack<Integer> A = new Stack<>();
        A.push(2);
        A.push(1);
        Stack<Integer> B = new Stack<>();
        Stack<Integer> C = new Stack<>();
        int size = A.size();
        hanoiTower = new HanoiTower();
        hanoiTower.mover(A.size(), A, B, C);
        assertEquals(0, A.size());
        assertEquals(0, B.size());
        assertEquals(size, C.size());
    }

    @Test
    public void shouldMoveThreeDisc() {
        Stack<Integer> A = new Stack<>();
        A.push(3);
        A.push(2);
        A.push(1);
        Stack<Integer> B = new Stack<>();
        Stack<Integer> C = new Stack<>();
        int size = A.size();
        hanoiTower = new HanoiTower();
        hanoiTower.mover(A.size(), A, B, C);
        assertEquals(0, A.size());
        assertEquals(0, B.size());
        assertEquals(size, C.size());
        assertEquals(1, C.pop().intValue());
        assertEquals(2, C.pop().intValue());
        assertEquals(3, C.pop().intValue());
    }

    @Test
    public void shouldMoveTenDisc() {
        Stack<Integer> A = new Stack<>();
        A.push(10);
        A.push(9);
        A.push(8);
        A.push(7);
        A.push(6);
        A.push(5);
        A.push(4);
        A.push(3);
        A.push(2);
        A.push(1);
        Stack<Integer> B = new Stack<>();
        Stack<Integer> C = new Stack<>();
        int size = A.size();
        hanoiTower = new HanoiTower();
        hanoiTower.mover(A.size(), A, B, C);
        assertEquals(0, A.size());
        assertEquals(0, B.size());
        assertEquals(size, C.size());
        assertEquals(1, C.pop().intValue());
        assertEquals(2, C.pop().intValue());
        assertEquals(3, C.pop().intValue());
        assertEquals(4, C.pop().intValue());
        assertEquals(5, C.pop().intValue());
        assertEquals(6, C.pop().intValue());
        assertEquals(7, C.pop().intValue());
        assertEquals(8, C.pop().intValue());
        assertEquals(9, C.pop().intValue());
        assertEquals(10, C.pop().intValue());
    }

}