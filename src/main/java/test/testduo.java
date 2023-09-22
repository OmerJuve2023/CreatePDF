package test;
import pdf.desarrollo;
import pdf.union;

public class testduo {
    public static void main(String[] args) {

       desarrollo des= new desarrollo();
       des.estilo();
        int n=10;
        double[][] a =new double[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0]=i+2;
            a[i][1]=a[i][0]+1;
        }
       union unio=new union();
        unio.init(a[0],a[1]);
        System.exit(0);
    }

}
