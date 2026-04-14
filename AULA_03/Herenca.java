package AULA_03;

public class Herenca {

    static class Animal {
        String nome;

        void emitirSom() {
            System.out.println("Som do Animal");
        }
    }

    static class Cachorro extends Animal {
        @Override
        void emitirSom() {
            System.out.println("Au Au");
        }
    }

    public static void main(Srting[] args) {
        Animal a = new Cachorro();
        a.emitirSom();
    }

}
