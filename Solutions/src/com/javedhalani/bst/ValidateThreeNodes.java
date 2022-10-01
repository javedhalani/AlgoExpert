package com.javedhalani.bst;

public class ValidateThreeNodes {

    public static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }

        public boolean isDescendant(BST node) {
            return node.contains(this.value);
        }

        public boolean contains(int value) {
            if (this.value == value) {
                return true;
            } else if (this.left == null && this.right == null) {
                return false;
            } else if (this.left == null ) {
                return this.right.contains(value);
            } else if (this.right == null ) {
                return this.left.contains(value);
            } else if (this.value > value) {
                return this.left.contains(value);
            } else {
                return this.right.contains(value);
            }
        }

        public boolean isAncestorOf(BST node) {
            return node.isDescendant(this);
        }

    }

    public boolean validateThreeNodes(BST nodeOne, BST nodeTwo, BST nodeThree) {
        return (nodeTwo.isDescendant(nodeOne) && nodeTwo.isAncestorOf(nodeThree))
                || (nodeTwo.isAncestorOf(nodeOne) && nodeTwo.isDescendant(nodeThree));
    }




}
