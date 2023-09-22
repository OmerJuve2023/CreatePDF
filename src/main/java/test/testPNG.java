package test;

import methods.createPNG;

public class testPNG {
    public static void main(String[] args) {
        int n=6;
        double[][] a =new double[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0]=i+2;
            a[i][1]=a[i][0]+1;
        }
        createPNG png=new createPNG();
        png.init(a[0],a[1]);

    }
}
