import util.MethodsPDF;
import dao.GeneratePDF;

public class CreatePDF {
    public static void main(String[] args) {

        MethodsPDF des = new MethodsPDF();
        //des.estilo();
        int n = 10;
        double[][] a = new double[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = i + 2;
            a[i][1] = a[i][0] + 1;
        }
        GeneratePDF unio = new GeneratePDF();
        unio.init(a[0], a[1]);
        System.exit(0);
    }

}
