
package exemplopolimorfismo;

public class Can extends Animal{
   String raza;

    public Can(String nome,String raza) {
        super(nome);
        this.raza= raza;
    }
    public String getRaza() {
        return raza;
    }  

    @Override
    public String toString() {
        return "Can{" + "nome = "+ this.getNome()+", raza= " + raza + '}';
    }    

    @Override
    public void falar() {
        System.out.println(" guau guau");
    }
    public void andar(){
        System.out.println(" anda o can");
    } 
}
