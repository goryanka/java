package project_utils;

public class OddIndices {

        /*
        Написать алгоритм OddIndices, который принимает массив целых чисел,
        и возвращает массив значений нечетных индексов
        Test Data:
        Input = {-45, 590, 234, 985, 12, 68}
        Expected Result =  {590, 985, 68}
        */

    public int[] OddIndices(int[] arrayOfNumbers) {
        if (arrayOfNumbers != null && arrayOfNumbers.length > 0) {
            int[] arrayOfOddNum = new int[arrayOfNumbers.length / 2]; //we need array twice less than the original size
            int j = 0;

            for (int i = 1; i <= arrayOfNumbers.length; i += 2) {
                arrayOfOddNum[j] = arrayOfNumbers[i];
                j++;
            }
            return arrayOfOddNum;
        }
        return new int[0];
    }

}

