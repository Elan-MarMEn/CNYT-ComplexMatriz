public class OperationsMatriz {
    
    public ComplexMatriz sumaVectores(ComplexMatriz v1, ComplexMatriz v2) {
        ComplexMatriz newVector = new ComplexMatriz(v1.getc(),v1.getf());

        for (int i=0; i<v1.getc();i++) {

            ComplexNumber temp = v1.getvector()[i];
            temp.add(v2.getvector()[i]);
            newVector.getvector()[i]=temp;
        }
        return newVector;

    }


    public ComplexMatriz restaVectores(ComplexMatriz v1, ComplexMatriz v2) {
        ComplexMatriz newVector = new ComplexMatriz(v1.getc(),v1.getf());

        for (int i=0; i<v1.getc();i++) {

            ComplexNumber temp = v1.getvector()[i];
            temp.rest(v2.getvector()[i]);
            newVector.getvector()[i]=temp;
        }
        return newVector;

    }


    public ComplexMatriz productoEscalarVector(ComplexMatriz v1, ComplexNumber a) {
        ComplexMatriz newVector = new ComplexMatriz(v1.getc(),v1.getf());

        for (int i=0; i<v1.getc();i++) {

            ComplexNumber temp = v1.getvector()[i];
            temp.multiply(a);
            newVector.getvector()[i]=temp;
        }

        return newVector;
    }


    public ComplexMatriz MatrizIdentidad(ComplexMatriz A) {
        ComplexMatriz newMatriz= new ComplexMatriz(A.getc(),A.getf());

        for(int i=0;i<A.getc();i++) {
            for(int j=0;j<A.getf();j++) {
                if(i==j) {
                    newMatriz.getmatriz()[i][j]=new ComplexNumber(1,0);
                }
                else {
                    newMatriz.getmatriz()[i][j]=new ComplexNumber(1,0);
                }
            }
        }
        return newMatriz;
    }


    public ComplexMatriz sumaComplexMatrizs(ComplexMatriz A, ComplexMatriz B) {
        if((A.getf()==B.getf()) && (A.getc()==B.getc())) {
            ComplexMatriz newMatriz= new ComplexMatriz(A.getf(),A.getc());

            for(int i=0;i<A.getf();i++) {

                for(int j=0;j<B.getc();j++) {

                    ComplexNumber temp = A.getmatriz()[i][j];
                    temp.add(B.getmatriz()[i][j]);
                    newMatriz.getmatriz()[i][j]=temp;
                }
            }
            return newMatriz;

        }
        else {
            return null;
        }

    }


    public ComplexMatriz restaComplexMatrizs(ComplexMatriz A, ComplexMatriz B) {
        if((A.getf()==B.getf()) && (A.getc()==B.getc())) {
            ComplexMatriz newMatriz = new ComplexMatriz(A.getf(),A.getc());

            for(int i=0;i<A.getf();i++) {

                for(int j=0;j<B.getc();j++) {

                    ComplexNumber temp = A.getmatriz()[i][j];
                    temp.rest(B.getmatriz()[i][j]);
                    newMatriz.getmatriz()[i][j]=temp;
                }
            }
            return newMatriz;
        }
        else {
            return null;
        }
    }


    public ComplexMatriz productoEscalarMatriz( ComplexNumber c, ComplexMatriz A) {
        ComplexMatriz newMatriz = new ComplexMatriz(A.getc(),A.getf());

        for(int i=0; i<A.getc();i++) {

            for (int j=0;j<A.getf();j++) {

                ComplexNumber temp = A.getmatriz()[i][j];
                temp.multiply(c);
                newMatriz.getmatriz()[i][j]=temp;
            }
        }
        return newMatriz;
    }

    public ComplexMatriz transpuesta(ComplexMatriz A) {
        ComplexMatriz newMatriz = new ComplexMatriz(A.getf(),A.getc());

        for(int i=0; i<newMatriz.getc();i++) {
            for(int j=0; j<newMatriz.getf();j++) {
                newMatriz.getmatriz()[i][j]=A.getmatriz()[j][i];
            }
        }
        return newMatriz;
    }

    public ComplexMatriz conjugada(ComplexMatriz A) {
        ComplexMatriz newMatriz = new ComplexMatriz(A.getc(),A.getf());

        for(int i=0; i<newMatriz.getc();i++) {

            for(int j=0; j<newMatriz.getf();j++) {

                ComplexNumber temp = A.getmatriz()[i][j];
                temp.conjugate();
                newMatriz.getmatriz()[i][j] = temp;
            }
        }
        return newMatriz;
    }

    public ComplexMatriz conjugadaVector(ComplexMatriz A) {
        ComplexMatriz newVector = new ComplexMatriz(A.getlengthVector());

        for(int i=0; i<newVector.getlengthVector();i++) {
            ComplexNumber temp = A.getvector()[i];
            temp.conjugate();
            newVector.getvector()[i] = temp;
        }
        return newVector;
    }

    public ComplexMatriz adjunta(ComplexMatriz A) {
        return conjugada(transpuesta(A));
    }

    public ComplexMatriz multiplicacionMatrices(ComplexMatriz A, ComplexMatriz B) {
        ComplexMatriz newMatriz = new ComplexMatriz(A.getc(),B.getf());
        if(A.getf()==B.getc()) {
            for(int i=0; i<A.getc();i++) {
                for(int j=0; j<B.getf();j++) {
                    ComplexNumber temp = new ComplexNumber(0,0);
                    for(int k=0; k<B.getf();k++) {

                        ComplexNumber temp2 = A.getmatriz()[i][k];
                        temp2.multiply(B.getmatriz()[k][j]);
                        temp.add(temp2);
                    }

                    newMatriz.getmatriz()[i][j]=temp;
                }
            }
        }
        return newMatriz;

    }

    public ComplexNumber distanciaVectores(ComplexMatriz v1, ComplexMatriz v2){
        ComplexNumber c = new ComplexNumber(-1,0);
        ComplexMatriz temp1 = productoEscalarVector(v1,c);
        temp1 = sumaVectores(v1,v2);
        ComplexNumber dis = productoInterno(temp1,temp1);
        return dis;
    }

    public double normaMatriz(ComplexMatriz v1) {
        double a=0.0;
        for(int i=0;i<v1.getlengthVector();i++) {
            a+=Math.pow(v1.getvector()[i].modull(), 2);
        }
        double norma = Math.sqrt(a);
        return norma;

    }

    public Boolean Unitaria(ComplexMatriz A) {
        ComplexMatriz unitaria = new ComplexMatriz(A.getc(),A.getf());

        for(int i=0;i<unitaria.getc();i++) {

            for(int j=0;j<unitaria.getf();j++) {

                if(i==j) {
                    unitaria.getmatriz()[i][j]= new ComplexNumber(1,0);
                }
                else {
                    unitaria.getmatriz()[i][j]= new ComplexNumber(0,0);
                }
            }
        }
        ComplexMatriz resp = multiplicacionMatrices(adjunta(A),A);
        ComplexMatriz resp1 = multiplicacionMatrices(A,adjunta(A));

        if(resp.equals(unitaria)&& resp1.equals(unitaria)) {
            return true;
        }
        else {
            return false;
        }
    }

    public  Boolean Hermitiana(ComplexMatriz A) {

        if(adjunta(A).equals(A)) {
            return true;
        }
        else {

            return false;
        }

    }

    public ComplexNumber productoInterno(ComplexMatriz v1, ComplexMatriz v2) {
        ComplexNumber temp = new ComplexNumber(0,0);

        if(v1.getlengthVector()==v2.getlengthVector()){
            for(int i=0; i<v1.getlengthVector();i++) {

                ComplexNumber temp2 = v1.getvector()[i];
                temp2.multiply(v2.getvector()[i]);
                temp.add(temp2);
            }
            return temp;
        }
        else {
            return null;
        }
    }


    public ComplexMatriz productoTensor(ComplexMatriz A, ComplexMatriz B) {
        ComplexMatriz prodTensor= new ComplexMatriz(A.getc()*B.getc(),A.getf()*B.getf());
        for(int i=0; i<A.getc();i++) {
            for(int j=0; j<A.getf();j++) {
                for(int k=0;k<B.getc();k++) {
                    for(int l=0; l<B.getf();l++) {
                        ComplexNumber temp = A.getmatriz()[j][i];
                        temp.multiply(B.getmatriz()[l][k]);
                        prodTensor.getmatriz()[i*B.getc()+k][j*B.getf()+l]=temp;
                    }
                }
            }
        }
        return prodTensor;
    }
}
