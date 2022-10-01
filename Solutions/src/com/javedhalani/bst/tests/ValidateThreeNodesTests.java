package com.javedhalani.bst.tests;

import com.javedhalani.bst.ValidateThreeNodes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidateThreeNodesTests {

    @Test
    void test1() {

        var root = new ValidateThreeNodes.BST(5);
        root.left = new ValidateThreeNodes.BST(2);
        root.right = new ValidateThreeNodes.BST(7);
        root.left.left = new ValidateThreeNodes.BST(1);
        root.left.right = new ValidateThreeNodes.BST(4);
        root.right.left = new ValidateThreeNodes.BST(6);
        root.right.right = new ValidateThreeNodes.BST(8);
        root.left.left.left = new ValidateThreeNodes.BST(0);
        root.left.right.left = new ValidateThreeNodes.BST(3);

        var nodeOne = root;
        var nodeTwo = root.left;
        var nodeThree = root.left.right.left;
        Assertions.assertTrue( new ValidateThreeNodes().validateThreeNodes(nodeOne, nodeTwo, nodeThree));

    }

    @Test
    void test2() {

        var root = new ValidateThreeNodes.BST(5);
        root.left = new ValidateThreeNodes.BST(3);
        root.right = new ValidateThreeNodes.BST(7);
        root.left.left = new ValidateThreeNodes.BST(2);
        root.left.right = new ValidateThreeNodes.BST(4);
        root.right.left = new ValidateThreeNodes.BST(6);
        root.right.right = new ValidateThreeNodes.BST(8);
        root.left.left.left = new ValidateThreeNodes.BST(0);
        root.left.right.left = new ValidateThreeNodes.BST(3);

        var nodeOne = root;
        var nodeTwo = root.left;
        var nodeThree = root.left.right.left;
        Assertions.assertTrue( new ValidateThreeNodes().validateThreeNodes(nodeOne, nodeTwo, nodeThree));

    }

    @Test
    void test3() {

        var root = new ValidateThreeNodes.BST(5);
        root.left = new ValidateThreeNodes.BST(2);
        root.right = new ValidateThreeNodes.BST(7);
        root.left.left = new ValidateThreeNodes.BST(1);
        root.left.right = new ValidateThreeNodes.BST(4);
        root.right.left = new ValidateThreeNodes.BST(6);
        root.right.right = new ValidateThreeNodes.BST(8);
        root.left.left.left = new ValidateThreeNodes.BST(0);
        root.left.right.left = new ValidateThreeNodes.BST(3);

        var nodeOne = root;
        var nodeTwo = root.left;
        var nodeThree = root.left.right.left;
        Assertions.assertTrue( new ValidateThreeNodes().validateThreeNodes(nodeOne, nodeTwo, nodeThree));

    }

    @Test
    void test4() {

        var root = new ValidateThreeNodes.BST(5);
        root.left = new ValidateThreeNodes.BST(2);
        root.right = new ValidateThreeNodes.BST(7);
        root.left.left = new ValidateThreeNodes.BST(1);
        root.left.right = new ValidateThreeNodes.BST(4);
        root.right.left = new ValidateThreeNodes.BST(6);
        root.right.right = new ValidateThreeNodes.BST(8);
        root.left.left.left = new ValidateThreeNodes.BST(0);
        root.left.right.left = new ValidateThreeNodes.BST(3);

        var nodeOne = root;
        var nodeTwo = root.left;
        var nodeThree = root.left.right.left;
        Assertions.assertTrue( new ValidateThreeNodes().validateThreeNodes(nodeOne, nodeTwo, nodeThree));

    }

    @Test
    void test5() {

        var root = new ValidateThreeNodes.BST(5);
        root.left = new ValidateThreeNodes.BST(2);
        root.right = new ValidateThreeNodes.BST(7);
        root.left.left = new ValidateThreeNodes.BST(1);
        root.left.right = new ValidateThreeNodes.BST(4);
        root.right.left = new ValidateThreeNodes.BST(6);
        root.right.right = new ValidateThreeNodes.BST(8);
        root.left.left.left = new ValidateThreeNodes.BST(0);
        root.left.right.left = new ValidateThreeNodes.BST(3);

        var nodeOne = root;
        var nodeTwo = root.left;
        var nodeThree = root.left.right.left;
        Assertions.assertTrue( new ValidateThreeNodes().validateThreeNodes(nodeOne, nodeTwo, nodeThree));

    }

    @Test
    void test6() {

        var root = new ValidateThreeNodes.BST(5);
        root.left = new ValidateThreeNodes.BST(2);
        root.right = new ValidateThreeNodes.BST(7);
        root.left.left = new ValidateThreeNodes.BST(1);
        root.left.right = new ValidateThreeNodes.BST(4);
        root.right.left = new ValidateThreeNodes.BST(6);
        root.right.right = new ValidateThreeNodes.BST(8);
        root.left.left.left = new ValidateThreeNodes.BST(0);
        root.left.right.left = new ValidateThreeNodes.BST(3);

        var nodeOne = root;
        var nodeTwo = root.left;
        var nodeThree = root.left.right.left;
        Assertions.assertTrue( new ValidateThreeNodes().validateThreeNodes(nodeOne, nodeTwo, nodeThree));

    }

    @Test
    void test7() {

        var root = new ValidateThreeNodes.BST(5);
        root.left = new ValidateThreeNodes.BST(2);
        root.right = new ValidateThreeNodes.BST(7);
        root.left.left = new ValidateThreeNodes.BST(1);
        root.left.right = new ValidateThreeNodes.BST(4);
        root.right.left = new ValidateThreeNodes.BST(6);
        root.right.right = new ValidateThreeNodes.BST(8);
        root.left.left.left = new ValidateThreeNodes.BST(0);
        root.left.right.left = new ValidateThreeNodes.BST(3);

        var nodeOne = root;
        var nodeTwo = root.left;
        var nodeThree = root.left.right.left;
        Assertions.assertTrue( new ValidateThreeNodes().validateThreeNodes(nodeOne, nodeTwo, nodeThree));

    }

    @Test
    void test8() {

        var root = new ValidateThreeNodes.BST(5);
        root.left = new ValidateThreeNodes.BST(2);
        root.right = new ValidateThreeNodes.BST(7);
        root.left.left = new ValidateThreeNodes.BST(1);
        root.left.right = new ValidateThreeNodes.BST(4);
        root.right.left = new ValidateThreeNodes.BST(6);
        root.right.right = new ValidateThreeNodes.BST(8);
        root.left.left.left = new ValidateThreeNodes.BST(0);
        root.left.right.left = new ValidateThreeNodes.BST(3);

        var nodeOne = root;
        var nodeTwo = root.left;
        var nodeThree = root.left.right.left;
        Assertions.assertTrue( new ValidateThreeNodes().validateThreeNodes(nodeOne, nodeTwo, nodeThree));

    }

    @Test
    void test9() {

        var root = new ValidateThreeNodes.BST(5);
        root.left = new ValidateThreeNodes.BST(2);
        root.right = new ValidateThreeNodes.BST(7);
        root.left.left = new ValidateThreeNodes.BST(1);
        root.left.right = new ValidateThreeNodes.BST(4);
        root.right.left = new ValidateThreeNodes.BST(6);
        root.right.right = new ValidateThreeNodes.BST(8);
        root.left.left.left = new ValidateThreeNodes.BST(0);
        root.left.right.left = new ValidateThreeNodes.BST(3);

        var nodeOne = root;
        var nodeTwo = root.left;
        var nodeThree = root.left.right.left;
        Assertions.assertTrue( new ValidateThreeNodes().validateThreeNodes(nodeOne, nodeTwo, nodeThree));

    }

    @Test
    void test10() {

        var root = new ValidateThreeNodes.BST(5);
        root.left = new ValidateThreeNodes.BST(2);
        root.right = new ValidateThreeNodes.BST(7);
        root.left.left = new ValidateThreeNodes.BST(1);
        root.left.right = new ValidateThreeNodes.BST(4);
        root.right.left = new ValidateThreeNodes.BST(6);
        root.right.right = new ValidateThreeNodes.BST(8);
        root.left.left.left = new ValidateThreeNodes.BST(0);
        root.left.right.left = new ValidateThreeNodes.BST(3);

        var nodeOne = root;
        var nodeTwo = root.left;
        var nodeThree = root.left.right.left;
        Assertions.assertTrue( new ValidateThreeNodes().validateThreeNodes(nodeOne, nodeTwo, nodeThree));

    }

    @Test
    void test11() {

        var root = new ValidateThreeNodes.BST(5);
        root.left = new ValidateThreeNodes.BST(2);
        root.right = new ValidateThreeNodes.BST(7);
        root.left.left = new ValidateThreeNodes.BST(1);
        root.left.right = new ValidateThreeNodes.BST(4);
        root.right.left = new ValidateThreeNodes.BST(6);
        root.right.right = new ValidateThreeNodes.BST(8);
        root.left.left.left = new ValidateThreeNodes.BST(0);
        root.left.right.left = new ValidateThreeNodes.BST(3);

        var nodeOne = root;
        var nodeTwo = root.left;
        var nodeThree = root.left.right.left;
        Assertions.assertTrue( new ValidateThreeNodes().validateThreeNodes(nodeOne, nodeTwo, nodeThree));

    }

    @Test
    void test12() {

        var root = new ValidateThreeNodes.BST(5);
        root.left = new ValidateThreeNodes.BST(2);
        root.right = new ValidateThreeNodes.BST(7);
        root.left.left = new ValidateThreeNodes.BST(1);
        root.left.right = new ValidateThreeNodes.BST(4);
        root.right.left = new ValidateThreeNodes.BST(6);
        root.right.right = new ValidateThreeNodes.BST(8);
        root.left.left.left = new ValidateThreeNodes.BST(0);
        root.left.right.left = new ValidateThreeNodes.BST(3);

        var nodeOne = root;
        var nodeTwo = root.left;
        var nodeThree = root.left.right.left;
        Assertions.assertTrue( new ValidateThreeNodes().validateThreeNodes(nodeOne, nodeTwo, nodeThree));

    }

    @Test
    void test13() {

        var root = new ValidateThreeNodes.BST(5);
        root.left = new ValidateThreeNodes.BST(2);
        root.right = new ValidateThreeNodes.BST(7);
        root.left.left = new ValidateThreeNodes.BST(1);
        root.left.right = new ValidateThreeNodes.BST(4);
        root.right.left = new ValidateThreeNodes.BST(6);
        root.right.right = new ValidateThreeNodes.BST(8);
        root.left.left.left = new ValidateThreeNodes.BST(0);
        root.left.right.left = new ValidateThreeNodes.BST(3);

        var nodeOne = root;
        var nodeTwo = root.left;
        var nodeThree = root.left.right.left;
        Assertions.assertTrue( new ValidateThreeNodes().validateThreeNodes(nodeOne, nodeTwo, nodeThree));

    }

    @Test
    void test14() {

        var root = new ValidateThreeNodes.BST(5);
        root.left = new ValidateThreeNodes.BST(2);
        root.right = new ValidateThreeNodes.BST(7);
        root.left.left = new ValidateThreeNodes.BST(1);
        root.left.right = new ValidateThreeNodes.BST(4);
        root.right.left = new ValidateThreeNodes.BST(6);
        root.right.right = new ValidateThreeNodes.BST(8);
        root.left.left.left = new ValidateThreeNodes.BST(0);
        root.left.right.left = new ValidateThreeNodes.BST(3);

        var nodeOne = root;
        var nodeTwo = root.left;
        var nodeThree = root.left.right.left;
        Assertions.assertTrue( new ValidateThreeNodes().validateThreeNodes(nodeOne, nodeTwo, nodeThree));

    }

    @Test
    void test15() {

        var root = new ValidateThreeNodes.BST(5);
        root.left = new ValidateThreeNodes.BST(2);
        root.right = new ValidateThreeNodes.BST(7);
        root.left.left = new ValidateThreeNodes.BST(1);
        root.left.right = new ValidateThreeNodes.BST(4);
        root.right.left = new ValidateThreeNodes.BST(6);
        root.right.right = new ValidateThreeNodes.BST(8);
        root.left.left.left = new ValidateThreeNodes.BST(0);
        root.left.right.left = new ValidateThreeNodes.BST(3);

        var nodeOne = root;
        var nodeTwo = root.left;
        var nodeThree = root.left.right.left;
        Assertions.assertTrue( new ValidateThreeNodes().validateThreeNodes(nodeOne, nodeTwo, nodeThree));

    }




}
