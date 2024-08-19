public class Siswatester {
    public static void main(String[] args) {
        // object
        // Class object = new Constructor
        Siswa tegar = new Siswa();
        Siswa melvin = new Siswa();
        Siswa rafly = new Siswa();
        Siswa naufal = new Siswa();
        Siswa moreno= new Siswa();
        Siswa burhan = new Siswa(23, "burhan", 0.27);

       
        tegar.id = 16;
        tegar.Nama = "tegar";
        tegar.ipk = 3.5;

        System.out.println("absenn : " + tegar.id);
        System.out.println("namaa : " + tegar.Nama);
        System.out.println("ipk nyaa : " + tegar.ipk);
        System.out.println("   ");
        melvin.id = 21;
        melvin.Nama = "melvin";
        melvin.ipk = 2.1;

        System.out.println("absenn : " + melvin.id);
        System.out.println("namaa : " + melvin.Nama);
        System.out.println("ipk nyaa : " + melvin.ipk);
        System.out.println("   ");

        rafly.id = 27;
        rafly.Nama = "rafly";
        rafly.ipk = 2.7;

        System.out.println("absenn : " + rafly.id);
        System.out.println("namaa : " + rafly.Nama);
        System.out.println("ipk nyaa : " + rafly.ipk);
        System.out.println("   ");
        
        naufal.id = 28;
        naufal.Nama = "naufal";
        naufal.ipk = 2.2;

        System.out.println("absenn : " + naufal.id);
        System.out.println("namaa : " + naufal.Nama);
        System.out.println("ipk nyaa : " + naufal.ipk);
        System.out.println("   ");

        moreno.id = 24;
        moreno.Nama = "moreno";
        moreno.ipk = 1.1;

        System.out.println("absenn : " + moreno.id);
        System.out.println("namaa : " + moreno.Nama);
        System.out.println("ipk nyaa : " + moreno.ipk);
        System.out.println("   ");

        
        tegar.print();
        System.out.println("   ");
        melvin.print();
        System.out.println("   ");
        rafly.print();
        System.out.println("   ");
        naufal.print();
        System.out.println("   ");
        moreno.print();
        System.out.println("   ");
        burhan.print();
        System.out.println("   ");
        


    }
}
