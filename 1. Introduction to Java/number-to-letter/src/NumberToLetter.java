import java.util.Scanner;

public class NumberToLetter {
    public static void main(String[] args) {
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        if (checkRangeOfNumber(number) == 0) {
            result = "Out Of Range";
        } else if (checkRangeOfNumber(number) == 1) {
            result = writeSingleDigit(number);
        } else if (checkRangeOfNumber(number) == 2) {
            result = writeTensDigit(number);
        } else {
            result = writeHundredsDigit(number);
        }
        System.out.println(result);

    }
    public static int checkRangeOfNumber(int number) {
        if (number < 0 || number > 999) {
            return 0;
        } else if (number < 10) {
            return 1;
        } else if (number < 100) {
            return 2;
        } else {
            return 3;
        }
    }
    public static String writeSingleDigit(int number) {
        String result;
        switch (number) {
            case 0:
                result = "zero";
                break;
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            default:
                result = "nine";
                break;
        }
        return result;
    }
    public static String writeTensDigit(int number) {
        String result;
        int tensDigit;
        int singleDigit;
        if (number < 20) {
            switch (number) {
                case 10:
                    result = "ten";
                    break;
                case 11:
                    result = "eleven";
                    break;
                case 12:
                    result = "twelve";
                    break;
                case 13:
                    result = "thirteen";
                    break;
                case 14:
                    result = "fourteen";
                    break;
                case 15:
                    result = "fifteen";
                    break;
                case 16:
                    result = "sixteen";
                    break;
                case 17:
                    result = "seventeen";
                    break;
                case 18:
                    result = "eighteen";
                    break;
                default:
                    result = "nineteen";
                    break;
            }
        } else {
            tensDigit = number / 10;
            singleDigit = number % 10;
            String firstNumber;
            switch (tensDigit) {
                case 2:
                    firstNumber = "twenty";
                    break;
                case 3:
                    firstNumber = "thirty";
                    break;
                case 4:
                    firstNumber = "forty";
                    break;
                case 5:
                    firstNumber = "fifty";
                    break;
                case 6:
                    firstNumber = "sixty";
                    break;
                case 7:
                    firstNumber = "seventy";
                    break;
                case 8:
                    firstNumber = "eighty";
                    break;
                default:
                    firstNumber = "ninety";
                    break;
            }
            result = firstNumber;
            if (singleDigit > 0) {
                result = firstNumber + " " + writeSingleDigit(singleDigit);
            }
        }
        return result;
    }
    public static String writeHundredsDigit(int number) {
        String result;
        String firstNumber;
        int hundredsDigit = number / 100;
        int lastNumber = number % 100;
        switch (hundredsDigit) {
            case 1:
                firstNumber = "one hundred";
                break;
            case 2:
                firstNumber = "two hundred";
                break;
            case 3:
                firstNumber = "three hundred";
                break;
            case 4:
                firstNumber = "four hundred";
                break;
            case 5:
                firstNumber = "five hundred";
                break;
            case 6:
                firstNumber = "six hundred";
                break;
            case 7:
                firstNumber = "seven hundred";
                break;
            case 8:
                firstNumber = "eight hundred";
                break;
            default:
                firstNumber = "nine hundred";
                break;
        }
        result = firstNumber;
        if (checkRangeOfNumber(lastNumber) == 1) {
            result = firstNumber + " and " + writeSingleDigit(lastNumber);
        }
        if (checkRangeOfNumber(lastNumber) == 2) {
            result = firstNumber + " and " + writeTensDigit(lastNumber);
        }
        return result;
    }
}
