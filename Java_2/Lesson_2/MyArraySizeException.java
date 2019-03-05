package ru.geekbrains.Lesson_2;

class MyArraySizeException extends Exception {
    public int i;

    public MyArraySizeException(String msg, int i) {
        super(msg);
        this.i=i;
    }
}
class MyArrayDataException extends Exception{

    public MyArrayDataException (String msg){
        super(msg);
    }
}

class String_Array {
    public static void stringArray(String[][] arr) throws MyArraySizeException{
        int i =4; //arrays dimensions
        if (arr.length>i||arr[0].length>i) throw new MyArraySizeException("Количество строк или столбцов не может быть больше 4!", arr.length);
    }
    public static void correctData (String[][] arr) throws MyArrayDataException{
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                Object obj=Integer.parseInt(arr[i][j]);
                if (obj.getClass() != Integer.class) throw new MyArrayDataException("abc"+i+j);
            }
            }
    }
}

class Main {

    public static void main(String[] args) {
        String [][] arr = {{"1", "a", "1", "1", "5"}, {"1", "1", "1", "1"}};
        try {
            String_Array.stringArray(arr);
            String_Array.correctData(arr);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        } catch (MyArrayDataException e1) {
            System.out.println(e1.getMessage());

        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum +=Integer.parseInt(arr[i][j]);
            }
        }
        System.out.println(sum);
    }
}

