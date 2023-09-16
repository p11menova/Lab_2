import java.lang.Math;


public class lab1 {
    public static void main(String[] args) {
        //task1
        // creating one-dimensional array of odd numbers from 1 to 21
        short[] c = new short[11];
        short k = 1;
        for (int i = 0; i < 11; i++) {
            c[i] = k;
            k += 2;
        }

        //task2
        // creating one-dimensional array of 19 random numbers from -15.0 to 7.0
        float[] x = new float[19];
        for (int i = 0; i < 19; i++) {
            double min, max;
            min = -15.0;
            max = 7.0;
            x[i] = (float) ((Math.random() * (max - min)) + min);

        }

        //task3
        // creating two-dimensional array 11*19
        // filling it according to math formulas with c[i], x[j]
        Double[][] C = new Double[11][19];
        int[] c1 = new int[]{3, 5, 17, 21, 15};

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 19; j++) {
                if (c[i] == 1) {
                    C[i][j] = Math.atan(Math.sin(Math.atan(Math.pow((x[j]-4)/22,2))));

                }
                else if (c[i] == 3 | c[i] == 5 | c[i] == 15 | c[i] == 17 | c[i] == 21)
                {
                    C[i][j] = Math.cos(Math.log1p(Math.pow(2 * Math.abs(x[j]), x[j])));

                }
                else {
                    C[i][j] = Math.sin(Math.log1p(Math.abs(x[j]))) / (1 - Math.log1p(Math.pow(Math.tan(x[j]), 2)));

                }
                }
            }

        // output, formatting strings 4 decimal places
        for (int i=0; i<11; i++){
            for (int j=0;j<19;j++){
                System.out.print(String.format("%.4f ", C[i][j]));
            }
            System.out.println();
        }
    }}
