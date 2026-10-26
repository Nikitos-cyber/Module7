package org.module.Task3;

public class Main {
    public static void main(String[] args) {
        double[] arrA = new double[10];
        double[] arrB = new double[10];
        for(int i = 0; i < arrA.length; i++){
            int randA = (int) (Math.random() * 101);
            int randB = (int) (Math.random() * 101);
            arrA[i] = randA;
            arrB[i] = randB;
        }

        arrB[9] = 0;

        for (int i = 0; i < arrA.length; i++) {
            try {
                if(arrB[i] == 0)
                    throw new ArithmeticException();
                if(arrA[i] / arrB[i] < 1)
                    throw new DivisionExc(arrA[i],arrB[i]);
                System.out.println("arrA[" + i + "] " + "/" + " arrB[" + i + "] = " + arrA[i] / arrB[i]);
            } catch (ArithmeticException e) {
                System.out.println("Неопределено. Деление на ноль!!!");
            }catch (DivisionExc exc){
                System.out.println(exc);
            }
        }

    }
}



class DivisionExc extends Exception{
    private double firstNum;
    private double secondNum;
    public DivisionExc(double firstNum, double secondNum){
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @Override
    public String toString(){
        return "Результат деления " + firstNum + " и " + secondNum + " меньше 1";
    }
}