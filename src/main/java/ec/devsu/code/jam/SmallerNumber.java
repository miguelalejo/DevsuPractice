package ec.devsu.code.jam;

/**
 * SmallerNumber
 */
public class SmallerNumber {

    public int solve(int number) {
        if(number<=0){
            return -1;
        }
        java.util.List<Integer> listNumbers = new java.util.ArrayList<Integer>();
        int digits = 0;
        int numberTemp = number / 10;
        while (numberTemp != 0) {
            digits++;
            numberTemp = numberTemp / 10;
        }
        for (int i = digits; i >= 0; i--) {
            int digit = number / (int) Math.pow(10, i);
            listNumbers.add(digit);
            number = number % (int) Math.pow(10, i);
        }
        boolean hasSmallerNumber = false;
        for (int i = 0; i < listNumbers.size(); i++) {
            for (int j = i + 1; j < listNumbers.size(); j++) {
                if (listNumbers.get(i) > listNumbers.get(j)) {
                    int temp = listNumbers.get(i);
                    listNumbers.set(i, listNumbers.get(j));
                    listNumbers.set(j, temp);
                    hasSmallerNumber = true;
                }

            }

        }
        if (!hasSmallerNumber) {
            return -1;
        }

        int sum = 0;
        for (int i = 0, k = listNumbers.size() - 1; i < listNumbers.size(); i++, k--) {
            int digit = listNumbers.get(i) * (int) Math.pow(10, k);
            sum += digit;
        }
        return sum;

    }
}