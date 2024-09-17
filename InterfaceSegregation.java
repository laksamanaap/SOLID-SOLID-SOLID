// ISP (Interface Segregration Principle) => Membagi interface ke beberapa interface yang lebih kecil dan menggunakan sesuai kebutuhan

public class InterfaceSegregation {
    public static void main(String[] args) {
        System.out.println("ISP");
    }
}

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

// Contoh yang benar
interface cewe {
    void eat();

    void ribet();
}

interface Ribetable {
    void ribet();
}

interface Eatable {
    void eat();
}

class Laksa implements Eatable {

    @Override
    public void eat() {
        System.out.println("Makcik");
    }

}
