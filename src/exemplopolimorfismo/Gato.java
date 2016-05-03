
package exemplopolimorfismo;

public class Gato extends Animal{
    String cor ;

    public Gato(String cor, String nome) {
        super(nome);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }    
    @Override
    public void falar() {
        System.out.println("miau miau");
    }

    @Override
    public String toString() {
        return "Gato{" + "nome = "+getNome()+", cor= " + cor + '}';
    }
    
}
