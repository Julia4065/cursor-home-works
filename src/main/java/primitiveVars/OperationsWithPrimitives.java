package primitiveVars;

public class OperationsWithPrimitives {

    public static void main(String[] args) {

        byte byteVar = 4;
        short shortVar = 34;
        int intVar = 76;
        long longVar = 150L;
        double doubleVar = 18.5;
        float floatVar = 24.26F;
        char charVar = 'g';

        int multiplyingByteWithShort = byteVar * shortVar;
        long divideShortIntoLong = shortVar / longVar;
        double divideShortIntoLongWithCasting = (double) shortVar / longVar;
        double doubleAndShortSum = doubleVar + shortVar;
        double differenceBetweenDoubleAndFloat = doubleVar - floatVar;
        float differenceBetweenFloatAndShort = floatVar - shortVar;
        float divideByteIntoFloat = byteVar / floatVar;
        int multiplyingIntWithByteWithoutCasting = intVar * byteVar;
        byte multiplyingIntWithByteWithCastToByte = (byte)(intVar * byteVar);
        int sumOfCharAndByte = charVar + byteVar;
        long differenceBetweenLongAndCharValues = longVar - charVar;

        System.out.println("Result of operation " + byteVar + " * " + shortVar + " is " + multiplyingByteWithShort);
        System.out.println("Result of operation " + shortVar + " / " + longVar + " is " + divideShortIntoLong);
        System.out.println("Result of operation with casting to double " + shortVar + " / " + longVar + " is " + divideShortIntoLongWithCasting);
        System.out.println("Result of operation " + doubleVar + " + " + shortVar + " is " + doubleAndShortSum);
        System.out.println("Result of operation " + doubleVar + " - " + floatVar + " is " + differenceBetweenDoubleAndFloat);
        System.out.println("Result of operation " + floatVar + " - " + shortVar + " is " + differenceBetweenFloatAndShort);
        System.out.println("Result of operation " + byteVar + " / " + floatVar + " is " + divideByteIntoFloat);
        System.out.println("Result of operation " + intVar + " * " + byteVar + " is " + multiplyingIntWithByteWithoutCasting);
        System.out.println("Result of operation with casting to byte " + intVar + " * " + byteVar + " is " + multiplyingIntWithByteWithCastToByte);
        System.out.println("Result of operation " + charVar + " + " + byteVar + " is " + sumOfCharAndByte);
        System.out.println("Result of operation " + longVar + " - " + charVar + " is " + differenceBetweenLongAndCharValues);

    }
}
