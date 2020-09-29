/**
 * Norman Ta
 * 9-14-2020
 *
 * testCubeSolver.java
 */
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class testCubeSolver {

    @Test
    public void testCubeSolver1(){
        Cube solvedCubeTest = new Cube();
        CubeSolverBeg algCubeTest = new CubeSolverBeg(solvedCubeTest);
        algCubeTest.repositionGreenAsOne();

        solvedCubeTest.scrambleString("R2 D2 L2 F2 L2 U F2 L2 D2 F2 D B2 R' U F L2 U' B' L2 F D' ");
        solvedCubeTest.printState();


        algCubeTest.solveCubeBeginnersMethod();
        solvedCubeTest.printState();
        assertTrue(algCubeTest.checkSolved());
    }
}
