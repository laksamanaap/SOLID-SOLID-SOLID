// ISP (Interface Segregration Principle) => Membagi interface ke beberapa interface yang lebih kecil dan menggunakannya sesuai kebutuhan

// Contoh yang salah
// interface cewe {
// void eat();
// void ribet();
// }

// class Laksa implements cewe {

// @Override
// public void eat() {
// System.out.println("Makan sate");
// }

// @Override
// public void ribet() {
// System.out.println("Njirlah gua ribet");
// }
// }

public class InterfaceSegregation {
    public static void main(String[] args) {
        System.out.println("ISP");
    }
}

// Contoh yang benar
interface cewe {
    void eat();

    void ribet();
}

interface Ribetable {
    void ribet();
}

interface CanEat {
    void eat();
}

class Laksa implements CanEat {
    @Override
    public void eat() {
        System.out.println("Makcik");
    }

}
