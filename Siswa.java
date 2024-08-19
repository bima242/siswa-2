// Driver Class
public class Siswa {
int id;
String Nama;
double ipk;

// Constructor
// nama harus sama dgn Class
public Siswa() {
    id = 0;
Nama = "kosong";
ipk = 0.0;

}

//Constructor Parameter
public Siswa(int id, String nama, double
ipk) {

//variabel = parameter
this.id = id;
this.Nama = nama;
this.ipk = ipk;
}

//method print 
public void print() {
    System.out.println("ID : "+ id);
    System.out.println("NAMA : "+ Nama);
    System.out.println("IPK : "+ ipk );






}
    
}