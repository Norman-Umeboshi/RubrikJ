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
        ArrayList<CubePieces> solvedCube = new ArrayList<>(20);
        CubePieces wrEdge = new CubePieces('w', 'r', '\0', 2, 0);
        CubePieces wbEdge = new CubePieces('w', 'b', '\0', 2, 1);
        CubePieces woEdge = new CubePieces('w', 'o', '\0', 2, 2);
        CubePieces wgEdge = new CubePieces('w', 'g', '\0', 2, 3);

        CubePieces wrbCor = new CubePieces('w', 'r', 'b', 3, 4);
        CubePieces wboCor = new CubePieces('w', 'b', 'o', 3, 5);
        CubePieces wogCor = new CubePieces('w', 'o', 'g', 3, 6);
        CubePieces wgrCor = new CubePieces('w', 'g', 'r', 3, 7);

        CubePieces rbEdge = new CubePieces('r', 'b', 'm', 2, 8);
        CubePieces boEdge = new CubePieces('b', 'o', 'm', 2, 9);
        CubePieces ogEdge = new CubePieces('o', 'g', 'm', 2, 10);
        CubePieces grEdge = new CubePieces('g', 'r', 'm', 2, 11);

        CubePieces yrEdge = new CubePieces('y', 'r', '\0', 2, 12);
        CubePieces ybEdge = new CubePieces('y', 'b', '\0', 2, 13);
        CubePieces yoEdge = new CubePieces('y', 'o', '\0', 2, 14);
        CubePieces ygEdge = new CubePieces('y', 'g', '\0', 2, 15);

        CubePieces yrbCor = new CubePieces('y', 'r', 'b', 3, 16);
        CubePieces yboCor = new CubePieces('y', 'b', 'o', 3, 17);
        CubePieces yogCor = new CubePieces('y', 'o', 'g', 3, 18);
        CubePieces ygrCor = new CubePieces('y', 'g', 'r', 3, 19);

        solvedCube.add(wrEdge);
        solvedCube.add(wrbCor);
        solvedCube.add(wbEdge);
        solvedCube.add(wboCor);
        solvedCube.add(woEdge);
        solvedCube.add(wogCor);
        solvedCube.add(wgEdge);
        solvedCube.add(wgrCor);
        solvedCube.add(rbEdge);
        solvedCube.add(boEdge);
        solvedCube.add(ogEdge);
        solvedCube.add(grEdge);
        solvedCube.add(yrEdge);
        solvedCube.add(yrbCor);
        solvedCube.add(ybEdge);
        solvedCube.add(yboCor);
        solvedCube.add(yoEdge);
        solvedCube.add(yogCor);
        solvedCube.add(ygEdge);
        solvedCube.add(ygrCor);

        char[][] redSide = {{'r','r','r'}, {'r','r','r'},{'r','r','r'}};
        char[][] blueSide = {{'b','b','b'}, {'b','b','b'},{'b','b','b'}};
        char[][] orangeSide = {{'o','o','o'}, {'o','o','o'},{'o','o','o'}};
        char[][] greenSide = {{'g','g','g'}, {'g','g','g'},{'g','g','g'}};
        char[][] whiteSide = {{'w','w','w'}, {'w','w','w'},{'w','w','w'}};
        char[][] yellowSide = {{'y','y','y'}, {'y','y','y'}, {'y','y','y'}};

        Cube solvedCubeTest = new Cube(solvedCube, redSide, blueSide, orangeSide, greenSide, whiteSide, yellowSide);
        CubeSolverBeg algCubeTest = new CubeSolverBeg(solvedCubeTest);

        algCubeTest.performAntSune();
        algCubeTest.cubeToSolve.turnU();
        algCubeTest.performSune();
        algCubeTest.performDotEOLL();
        algCubeTest.cubeToSolve.turnU2();
        solvedCubeTest.printState();
        System.out.println(algCubeTest.checkSolved());


        algCubeTest.solveCubeBeginnersMethod();
        solvedCubeTest.printState();
        assertTrue(algCubeTest.checkSolved());
    }
}
