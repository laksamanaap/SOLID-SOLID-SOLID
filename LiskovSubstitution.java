/* 
LSP (Liskov Substitution Principle) => berfokus untuk menggantikan objek dari kelas dasar (parents) dengan objek
dari kelas turunan tanpa mengubah perilaku yang diharapkan dari program
*/

// Contoh yang salah
// class Chikhen extends Animal {
//     @Override
//     public void eat() {
//         System.out.println("Dedeg");
//     }

//     @Override
//     public void breed() {
//         // Mengubah perilaku yang diharapkan dengan menambahkan exception
//         throw new UnsupportedOperationException("Chikhen cannot breed in this way");
//     }
// }

// Contoh yang benar
public class LiskovSubstitution {
    public static void main(String[] args) {

        Animal animalBreed = new Animal();
        Rabbit rabbitBreed = new Rabbit();
        Chikhen chikhenBreed = new Chikhen();

        animalBreed.breed();
        rabbitBreed.breed();
        chikhenBreed.breed();
    }
}

class Animal {
    public void eat() {
        System.out.println("Eat");
    }

    public void breed() {
        System.out.println("Splitting");
    }
}

class Rabbit extends Animal {

    @Override // Menggantikan fungsi dari kelas parents tanpa mengubah perilaku dari program
    public void eat() {
        System.out.println("Wortel");
    }

    @Override
    public void breed() {
        System.out.println("Born");
    }
}

class Chikhen extends Animal {

    @Override
    public void eat() {
        System.out.println("Dedeg");
    }

    @Override
    public void breed() {
        System.out.println("Lay eggs");
    }

}
