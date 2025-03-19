// Criação da classe Nodo
public class Nodo {

    // Criação das variaveis
    int height;                                 // Valor que representa a altura do Nodo
    int value;                                  // Valor que representa o valor do Nodo
    Nodo left;                                  // Um ponteiro para o filho da esquerda
    Nodo right;                                 // Um ponteiro para o filho da direita

    // Método de criação de um Nodo
    public Nodo(int value){
        this.value = value;
        height = 1;
    }
}