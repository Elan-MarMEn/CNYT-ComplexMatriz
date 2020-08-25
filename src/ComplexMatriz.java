public class ComplexMatriz {
    private int f;
    private int c;

    private ComplexNumber[][] matriz;
    private ComplexNumber[] vector;
    private int lengthVector;


    public ComplexMatriz(int f, int c) {
        this.f=f;
        this.c=c;
        this.matriz= new ComplexNumber[f][c];
    }

    public ComplexMatriz(int lengthVector) {
        this.lengthVector=lengthVector;
        this.vector = new ComplexNumber[lengthVector];
    }


    public void putInVector(ComplexNumber c, int posVector) {
        this.vector[posVector]=c;
    }

    public void putInMatriz(ComplexNumber c, int posF, int posC) {
        this.matriz[posF][posC]=c;
    }

    public ComplexNumber[][] getmatriz() {
        return matriz;
    }

    public ComplexNumber[] getvector() {
        return vector;
    }

    public void setvector(ComplexNumber[] lengthVector) {
        this.vector=lengthVector;
    }

    public void setmatriz(ComplexNumber[][] f) {
        this.matriz=f;
    }

    public int getf() {
        return f;
    }

    public int getc() {
        return c;
    }

    public int getlengthVector() {
        return lengthVector;
    }

    public void setlengthVector(int lengthVector) {
        this.lengthVector=lengthVector;
    }

}
