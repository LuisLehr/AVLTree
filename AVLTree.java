// Imports do programa
import java.util.ArrayList;
import java.util.List;

// Criação da classe AVLTree, nela criaremos os métodos de inserção, remoção e balanceamento
public class AVLTree {
    
    // Criação de uma varivel que irá representar a raiz
    private Nodo root;

    // Método que retorna a altura do Nodo
    private int height(Nodo N) {
        if (N == null) {                                                                            
            return 0;
        }
        else {                                                                                      
            return N.height;
        }
    }

    // Calcula o balanceamento de um Nodo
    private int getBalance(Nodo N) {
        if (N == null) {                                                                            
            return 0;     
        }
        else {                                                                                      
            return height(N.left) - height(N.right);                                                
        }                                                                                           
    }

    // Método de inserção
    public void insert(int value) {
        root = insert(root, value);
    }

    // Método de inserção
    private Nodo insert(Nodo nodo, int value){
        if (nodo == null) {
            return  new Nodo(value);
        }

        if (value < nodo.value){
            nodo.left = insert(nodo.left, value);
        }

        else if (value > nodo.value){
            nodo.right = insert(nodo.right, value);
        }

        else {
            return nodo;
        }

        nodo.height = Math.max(height(nodo.left), height(nodo.right)) + 1;
        return balance(nodo, value);
    }

    // Método que faz o balanceamento de um Nodo
    private Nodo balance(Nodo nodo, int value){
        int balance = getBalance(nodo);

        if (balance > 1 && value < nodo.left.value) {
            return rightRotate(nodo);
        }
        if (balance < -1 && value > nodo.right.value) {
            return leftRotate(nodo);
        }
        if (balance > 1 && value > nodo.left.value) {
            nodo.left = leftRotate(nodo.left);
            return rightRotate(nodo);
        }
        if (balance < -1 && value < nodo.right.value) {
            nodo.right = rightRotate(nodo.right);
            return leftRotate(nodo);
        }

        return nodo;
    }

    // Método que faz a rotação de um Nodo para a direita
    private Nodo rightRotate(Nodo x) {
        Nodo y = x.left;
        x.left = y.right;
        y.right = x;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y;
    }

    // Método que faz a rotação de um Nodo para a esquerda
    private Nodo leftRotate(Nodo y) {
        Nodo x = y.right;
        y.right = x.left;
        x. left = y;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }

    // Método de remoção de Nodo
    public void remove(int value){
        root = remove(root, value);
    }

    private Nodo remove(Nodo nodo, int value){
        if (nodo == null) {
            return nodo;
        }
        if (value < nodo.value){
            nodo.left = remove(nodo.left, value);
        }
        else if (value > nodo.value){
            nodo.right = remove(nodo.right, value);
        }
        else {
            if (nodo.left == null || nodo.right == null) {
                Nodo temp = (nodo.left != null) ? nodo.left : nodo.right;
                nodo = (temp != null) ? temp : null;
            }
            else {
                Nodo temp = minValueNodo(nodo.right);
                nodo.value = temp.value;
                nodo.right = remove(nodo.right, temp.value);
            }
        }
        
        if (nodo == null) {
            return  nodo;
        }
        nodo.height = Math.max(height(nodo.left), height(nodo.right)) + 1;
        return balance(nodo, value);
    }

    private Nodo minValueNodo(Nodo nodo) {
        Nodo current = nodo;
        while (current.left != null) { 
            current = current.left;
        }
        return current;
    }


    // Métodos de caminhamento
    // Caminhamento Em Ordem
    public List<Integer> inOrder() {
        List<Integer> result = new ArrayList<>();
        inOrder(root, result);
        return result;
    }

    private void inOrder(Nodo nodo, List<Integer> list) {
        if (nodo != null) {
            inOrder(nodo.left, list);
            list.add(nodo.value);
            inOrder(nodo.right, list);
        }
    }

    // Caminhamento Pós Ordem
    public List<Integer> postOrder() {
        List<Integer> result = new ArrayList<>();
        postOrder(root, result);
        return result;
    }

    private void postOrder(Nodo nodo, List<Integer> list) {
        if (nodo != null) {
            postOrder(nodo.left, list);
            postOrder(nodo.right, list);
            list.add(nodo.value);
        }
    }

    // Caminhamento em pré Ordem
    public List<Integer> preOrder() {
        List<Integer> result = new ArrayList<>();
        preOrder(root, result);
        return result;
    }

    public void preOrder(Nodo nodo, List<Integer> list) {
        if (nodo != null) {
            list.add(nodo.value);
            preOrder(nodo.left, list);
            preOrder(nodo.right, list);
        }
    }

    // Método de busca
    public boolean search(int value) {
        return search(root, value);
    }

    private boolean search(Nodo nodo, int value) {
        if (nodo == null) {
            return false;
        }
        if (value == nodo.value) {
            return true;
        }
        if (value < nodo.value) {
            return search(nodo.left, value);
        }
        else {
            return search(nodo.right, value);
        }
    }
}
