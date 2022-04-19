
import java.io.IOException;
import java.util.Scanner;

public class iff {

    public static int Value2(int a, char b) {
        if (a < 3) {
            try {
                throw new IOException();
            }
            catch (IOException e){
                System.out.println("throws Exception //т.к. строка не является математической операцией");
            }
            return (0);
        } else if (a > 5 && !Rometest(b)) {
            try {
                throw new IOException();
            }
            catch (IOException e) {
                System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - числа от 1 до 10 включительно");
            }
            return (0);
        } else if (a == 3) {
            return (1);
        } else if (a == 4) {
            return (2);
        } else if (a == 5 && !Rometest(b)) {
            return (3);
        } else if (a == 5 && Rometest(b)) {
            return (4);
        } else if (a == 6 && Rometest(b)) {
            return (5);
        } else if (a == 7 && Rometest(b)) {
            return (6);
        } else if (a == 8 && Rometest(b)) {
            return (7);
        } else if (a == 9 && Rometest(b)) {
            return (8);
        } else
            return (0);
    }
    public static boolean Rometest(char a) {
        if (a == 'I')
            return (true);
        else if (a == 'V')
            return (true);
        else if (a == 'X')
            return (true);
        else
                return(false);
        }
    public static boolean Value(char a) {
        if (a > 47 && a < 58)
            return (true);
        return (false);
    }
    public static int Transl(int a) {
        int c = a;
        if (a == 0) {
            try {
                throw new IOException();
            }
            catch (IOException e) {
                System.out.println("throws Exception //т.к. в римской системе нет такого числа");
            }
            return (0);
        } else if (a < 0) {
            try {
                throw new IOException();
            }
            catch (IOException e) {
                System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
            }
            return (0);
        }
        if (a <= 10) {
            if (a == 1) {
                System.out.println("I");
            } else if (a == 2) {
                System.out.println("II");
            } else if (a == 3) {
                System.out.println("III");
            } else if (a == 4) {
                System.out.println("IV");
            } else if (a == 5) {
                System.out.println("V");
            } else if (a == 6) {
                System.out.println("VI");
            } else if (a == 7) {
                System.out.println("VII");
            } else if (a == 8) {
                System.out.println("VIII");
            } else if (a == 9) {
                System.out.println("IX");
            } else if (a == 10) {
                System.out.println("X");
            }
        } else if (a == 100) {
            System.out.println("C");
        } else if (a == 50) {
            System.out.println("L");
        } else if (a > 10 && a < 40) {
            int b = a / 10;
            a = a % 10;
            while (b > 0) {
                System.out.print("X");
                b--;
            }
            if (a == 0)
                return (0);
            Transl(a);
        } else if (a >= 40 && a < 50) {
            System.out.print("X");
            System.out.print("L");
            a = a - 40;
            if (a == 0)
                return (0);
            Transl(a);
        } else if (a > 50 && a < 90) {
            a = a - 50;
            System.out.print("L");
            if (a == 0)
                return (0);
            Transl(a);
        } else if (a >= 90 && a < 100) {
            System.out.print("X");
            System.out.print("C");
            a = a - 90;
            if (a == 0)
                return (0);
            Transl(a);
        }

        return (0);
    }
    public static int ValueforRome2(char a, char b) {
        if (a == 'I' && b == 'I')
            return (2);
        else if (a == 'I' && b == 'V')
            return (4);
        else if (a == 'V' && b == 'I')
            return (6);
        else if (a == 'I' && b == 'X')
            return (9);
        else
            return (0);
    }
    public static int ValueforRome3(char a, char b, char c) {
        if (a == 'I' && b == 'I' && c == 'I')
            return (3);
        else if (a == 'V' && b == 'I' && c == 'I')
            return (7);
        else
            return (0);
    }
    public static int ValueforRome4(char a, char b, char c, char d) {
        if (a == 'V' && b == 'I' && c == 'I' && d == 'I')
            return (8);
        return (0);
    }
    public static int Chekarab(char [] a, int b, int c) {
        int d = 0;
        while (d != c) {
            if (!Value(a[d])) {
                try {
                    throw new IOException();
                }
                catch (IOException e) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                }
                return (0);
            }
            d++;
        }
            d = d + 1;
            while (d != b){
                if (!Value(a[d])) {
                    try {
                        throw new IOException();
                    }
                    catch (IOException e) {
                        System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    }
                    return (0);
            }
                d++;
        }
        return (0);
    }
    public static int Chekrome(char [] a, int b, int c) {
        int d = 0;
        while (d != c) {
            if (!Rometest(a[d])) {
                try {
                    throw new IOException();
                }
                catch (IOException e) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                }
                return (0);
            }
            d++;
        }
        d++;
        while (d != b){
            if (!Rometest(a[d])) {
                try {
                    throw new IOException();
                }
                catch (IOException e) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                }
                return (0);
            }
            d++;
        }
        return (0);
    }
    public static int ValueforRome(char a) {
        if (a == 'I')
            return (1);
        else if (a == 'V')
            return (5);
        else if (a == 'X')
            return (10);
        else
            return (0);
    }
    public static int Value1(int a) {
        if (a != 47 && a == 42 && a == 43 && a == 45) {
            return (0);
        } else if (a == 47)
            return (1);
        else if (a == 42)
            return (2);
        else if (a == 43)
            return (3);
        else if (a == 45)
            return (4);
        else {
            try {
                throw new IOException();
            }
            catch (IOException e) {
                System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет  заданию - два операнда и один оператор (+, -, /, *)");
            }
            return (0);
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input: ");
        String num = in.nextLine();
        String nach = num;
        char[] qwe = nach.toCharArray();
        int a = Value2(qwe.length, qwe[0]);
        if (a == 0)
            return;
        if (a == 1 && Rometest(qwe[0])) {
            Chekrome(qwe,3,1);
            if (Rometest(qwe[2])){
            int q1 = Value1(qwe[1]);
            int result = 0;
            int q = ValueforRome(qwe[0]);
            int q2 = ValueforRome(qwe[2]);
            if (q1 == 1) {
                result = q / q2;
            } else if (q1 == 2) {
                result = q * q2;
            } else if (q1 == 3) {
                result = q + q2;
            } else if (q1 == 4) {
                result = q - q2;
            }
            Transl(result);
            }
        }

        if (a == 1 && !Rometest(qwe[0])) {
            Chekarab(qwe,3,1);
            boolean q = Value(qwe[0]);
            boolean q2 = Value(qwe[2]);
            if (q && q2) {
                int q1 = Value1(qwe[1]);
                int result = 0;
                if (q1 == 1) {
                    result = Integer.parseInt(String.valueOf(qwe[0])) / Integer.parseInt(String.valueOf(qwe[2]));
                } else if (q1 == 2) {
                    result = Integer.parseInt(String.valueOf(qwe[0])) * Integer.parseInt(String.valueOf(qwe[2]));
                } else if (q1 == 3) {
                    result = Integer.parseInt(String.valueOf(qwe[0])) + Integer.parseInt(String.valueOf(qwe[2]));
                } else if (q1 == 4) {
                    result = Integer.parseInt(String.valueOf(qwe[0])) - Integer.parseInt(String.valueOf(qwe[2]));
                }
                System.out.printf("Output:%d\n", result);
            }
        }
        if (a == 2 && Rometest(qwe[0]) && (Rometest(qwe[1]) || Rometest(qwe[2])) && Rometest(qwe[3])) {
            int q = ValueforRome(qwe[0]);
            int q3 = ValueforRome(qwe[3]);
            int result = 0;
            if (Rometest(qwe[1]) && ValueforRome2(qwe[0], qwe[1]) !=0) {
                int q1 = ValueforRome(qwe[1]);
                int q2 = Value1(qwe[2]);
                if (q2 == 1) {
                    result = ValueforRome2(qwe[0], qwe[1]) / ValueforRome(qwe[3]);
                } else if (q2 == 2) {
                    result = ValueforRome2(qwe[0], qwe[1]) * ValueforRome(qwe[3]);
                } else if (q2 == 3) {
                    result = ValueforRome2(qwe[0], qwe[1]) + ValueforRome(qwe[3]);
                } else if (q2 == 4) {
                    result = ValueforRome2(qwe[0], qwe[1]) - ValueforRome(qwe[3]);
                }
                    Transl(result);
            }
            else if(Rometest(qwe[2]) && ValueforRome2(qwe[2], qwe[3]) !=0) {
                int q2 = ValueforRome(qwe[2]);
                int q1 = Value1(qwe[1]);
                if (q1 == 1) {
                    result = ValueforRome(qwe[0]) / ValueforRome2(qwe[2], qwe[3]);
                } else if (q1 == 2) {
                    result = ValueforRome(qwe[0]) * ValueforRome2(qwe[2], qwe[3]);
                } else if (q1 == 3) {
                    result = ValueforRome(qwe[0]) + ValueforRome2(qwe[2], qwe[3]);
                } else if (q1 == 4) {
                    result = ValueforRome(qwe[0]) - ValueforRome2(qwe[2], qwe[3]);
                }
                    Transl(result);
            }
        }
        if (a == 2 && !Rometest(qwe[0])) {
            boolean q = Value(qwe[0]);
            boolean q1 = Value(qwe[1]);
            boolean q2 = Value(qwe[2]);
            boolean q3 = Value(qwe[3]);
            if (!q1 && q && q2 && q3) {
                int z1 = Value1(qwe[1]);
                int result = Integer.parseInt(String.valueOf(qwe[3]));
                if (result != 0) {
                    try {
                        throw new IOException();
                    }
                    catch (IOException e){
                        System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - числа от 1 до 10 включительно");
                    }
                    return;
                }
                if (z1 == 1) {
                    result = Integer.parseInt(String.valueOf(qwe[0])) / 10;
                } else if (z1 == 2) {
                    result = Integer.parseInt(String.valueOf(qwe[0])) * 10;
                } else if (z1 == 3) {
                    result = Integer.parseInt(String.valueOf(qwe[0])) + 10;
                } else if (z1 == 4) {
                    result = Integer.parseInt(String.valueOf(qwe[0])) - 10;
                }
                if (Value1(qwe[1])==0){
                    try {
                        throw new IOException();
                    }
                    catch (IOException e){
                        System.out.println("throws Exception //т.к. строка не является математической операцией");
                    }
                }
                System.out.printf("Output:%d\n", result);
            }
             else if (q1 && q && !q2 && q3 ) {
                int z2 = Value1(qwe[2]);
                int result = Integer.parseInt(String.valueOf(qwe[1]));
                if (result != 0) {
                    try {
                        throw new IOException();
                    }
                    catch (IOException e){
                        System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - числа от 1 до 10 включительно");
                    }
                    return;
                }
                if (z2 == 1) {
                    result = 10 / Integer.parseInt(String.valueOf(qwe[3]));
                } else if (z2 == 2) {
                    result = 10 * Integer.parseInt(String.valueOf(qwe[3]));
                } else if (z2 == 3) {
                    result = 10 + Integer.parseInt(String.valueOf(qwe[3]));
                } else if (z2 == 4) {
                    result = 10 - Integer.parseInt(String.valueOf(qwe[3]));
                }
                System.out.printf("Output:%d\n", result);
            }
        }
        if (a == 3 && !Rometest(qwe[0])) {
            boolean q = Value(qwe[0]);
            boolean q1 = Value(qwe[1]);
            boolean q3 = Value(qwe[3]);
            boolean q4 = Value(qwe[4]);
            if (q && q1 && q4 && q3) {
                int q2 = Value1(qwe[2]);
                int result = Integer.parseInt(String.valueOf(qwe[1]));
                if (result != 0) {
                    try {
                        throw new IOException();
                    }
                    catch (IOException e){
                        System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - числа от 1 до 10 включительно");
                    }
                    return;
                }
                result = Integer.parseInt(String.valueOf(qwe[4]));
                if (result != 0) {
                    try {
                        throw new IOException();
                    }
                    catch (IOException e){
                        System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - числа от 1 до 10 включительно");
                    }
                    return;
                }
                if (q2 == 1) {
                    result = 1;
                } else if (q2 == 2) {
                    result = 100;
                } else if (q2 == 3) {
                    result = 20;
                } else if (q2 == 4) {
                    result = 0;
                }
                System.out.printf("Output:%d\n", result);
            }
        }
        if (a == 4 && Rometest(qwe[0]) && (Rometest(qwe[1]) || Rometest(qwe[2]) || Rometest(qwe[3])) && Rometest(qwe[4])) {
            int q = ValueforRome(qwe[0]);
            int q4 = ValueforRome(qwe[4]);
            int result = 0;
            if (Rometest(qwe[1]) && Rometest(qwe[2])) {
                int q1 = ValueforRome(qwe[1]);
                int q2 = ValueforRome(qwe[2]);
                int q3 = Value1(qwe[3]);
                if (q3 == 1) {
                    result = ValueforRome3(qwe[0], qwe[1], qwe[2]) / ValueforRome(qwe[4]);
                } else if (q3 == 2) {
                    result = ValueforRome3(qwe[0], qwe[1], qwe[2]) * ValueforRome(qwe[4]);
                } else if (q3 == 3) {
                    result = ValueforRome3(qwe[0], qwe[1], qwe[2]) + ValueforRome(qwe[4]);
                } else if (q3 == 4) {
                    result = ValueforRome3(qwe[0], qwe[1], qwe[2]) - ValueforRome(qwe[4]);
                }
                if (ValueforRome3(qwe[0], qwe[1], qwe[2]) != 0 && ValueforRome(qwe[4])!= 0) {
                    Transl(result);
                }
            }
            else if (Rometest(qwe[1]) && Rometest(qwe[3])) {
                int q1 = ValueforRome(qwe[1]);
                int q2 = Value1(qwe[2]);
                int q3 = ValueforRome(qwe[3]);
                if (q2 == 1) {
                    result = ValueforRome2(qwe[0], qwe[1]) / ValueforRome2(qwe[3], qwe[4]);
                } else if (q2 == 2) {
                    result = ValueforRome2(qwe[0], qwe[1]) * ValueforRome2(qwe[3], qwe[4]);
                } else if (q2 == 3) {
                    result = ValueforRome2(qwe[0], qwe[1]) + ValueforRome2(qwe[3], qwe[4]);
                } else if (q2 == 4) {
                    result = ValueforRome2(qwe[0], qwe[1]) - ValueforRome2(qwe[3], qwe[4]);
                }
                if (ValueforRome2(qwe[0], qwe[1]) != 0 && ValueforRome2(qwe[3], qwe[4])!= 0) {
                    Transl(result);
                }
            }
            else {
                int q2 = ValueforRome(qwe[2]);
                int q3 = ValueforRome(qwe[3]);
                int q1 = Value1(qwe[1]);
                if (q1 == 1) {
                    result = ValueforRome(qwe[0]) / ValueforRome3(qwe[2], qwe[3], qwe[4]);
                } else if (q1 == 2) {
                    result = ValueforRome(qwe[0]) * ValueforRome3(qwe[2], qwe[3], qwe[4]);
                } else if (q1 == 3) {
                    result = ValueforRome(qwe[0]) + ValueforRome3(qwe[2], qwe[3], qwe[4]);
                } else if (q1 == 4) {
                    result = ValueforRome(qwe[0]) - ValueforRome3(qwe[2], qwe[3], qwe[4]);
                }
                if (ValueforRome(qwe[0]) != 0 && ValueforRome3(qwe[2], qwe[3], qwe[4])!= 0) {
                    Transl(result);
                }
            }
        }
        if (a == 5 && Rometest(qwe[0]) && (Rometest(qwe[1]) || Rometest(qwe[2]) || Rometest(qwe[3]) || Rometest(qwe[4])) && Rometest(qwe[5])) {
            int q = ValueforRome(qwe[0]);
            int q5 = ValueforRome(qwe[5]);
            int result = 0;
            if (!Rometest(qwe[1]) && Rometest(qwe[2]) && Rometest(qwe[3]) && Rometest(qwe[4])) {
                int q1 = Value1(qwe[1]);
                int q2 = ValueforRome(qwe[2]);
                int q3 = ValueforRome(qwe[3]);
                int q4 = ValueforRome(qwe[4]);
                if (q1 == 1) {
                    result = ValueforRome(qwe[0]) / ValueforRome4(qwe[2], qwe[3], qwe[4], qwe[5]);
                } else if (q1 == 2) {
                    result = ValueforRome(qwe[0]) * ValueforRome4(qwe[2], qwe[3], qwe[4], qwe[5]);
                } else if (q1 == 3) {
                    result = ValueforRome(qwe[0]) + ValueforRome4(qwe[2], qwe[3], qwe[4], qwe[5]);
                } else if (q1 == 4) {
                    result = ValueforRome(qwe[0]) - ValueforRome4(qwe[2], qwe[3], qwe[4], qwe[5]);
                }
                if (ValueforRome(qwe[0]) != 0 && ValueforRome4(qwe[2], qwe[3], qwe[4], qwe[5]) != 0) {
                    Transl(result);
                }
            }
            else if (!Rometest(qwe[2]) && Rometest(qwe[3]) && Rometest(qwe[1]) && Rometest(qwe[4])) {
                int q1 = ValueforRome(qwe[1]);
                int q2 = Value1(qwe[2]);
                int q3 = ValueforRome(qwe[3]);
                int q4 = ValueforRome(qwe[4]);
                if (q2 == 1) {
                    result = ValueforRome2(qwe[0], qwe[1]) / ValueforRome3(qwe[3], qwe[4], qwe[5]);
                } else if (q2 == 2) {
                    result = ValueforRome2(qwe[0], qwe[1]) * ValueforRome3(qwe[3], qwe[4], qwe[5]);
                } else if (q2 == 3) {
                    result = ValueforRome2(qwe[0], qwe[1]) + ValueforRome3(qwe[3], qwe[4], qwe[5]);
                } else if (q2 == 4) {
                    result = ValueforRome2(qwe[0], qwe[1]) - ValueforRome3(qwe[3], qwe[4], qwe[5]);
                }
                if (ValueforRome2(qwe[0], qwe[1]) != 0 && ValueforRome3(qwe[3], qwe[4], qwe[5]) != 0) {
                    Transl(result);
                }
            }
            else if (!Rometest(qwe[3]) && Rometest(qwe[2]) && Rometest(qwe[1]) && Rometest(qwe[4])) {
                int q1 = ValueforRome(qwe[1]);
                int q2 = ValueforRome(qwe[2]);
                int q3 = Value1(qwe[3]);
                int q4 = ValueforRome(qwe[4]);
                if (q3 == 1) {
                    result = ValueforRome3(qwe[0], qwe[1], qwe[2]) / ValueforRome2(qwe[4], qwe[5]);
                } else if (q3 == 2) {
                    result = ValueforRome3(qwe[0], qwe[1], qwe[2]) * ValueforRome2(qwe[4], qwe[5]);
                } else if (q3 == 3) {
                    result = ValueforRome3(qwe[0], qwe[1], qwe[2]) + ValueforRome2(qwe[4], qwe[5]);
                } else if (q3 == 4) {
                    result = ValueforRome3(qwe[0], qwe[1], qwe[2]) - ValueforRome2(qwe[4], qwe[5]);
                }
                if (ValueforRome3(qwe[0], qwe[1], qwe[2]) != 0 && ValueforRome2(qwe[4], qwe[5]) != 0) {
                    Transl(result);
                }
            }
            else if (!Rometest(qwe[4]) && Rometest(qwe[1]) && Rometest(qwe[2]) && Rometest(qwe[3])) {
                int q1 = ValueforRome(qwe[1]);
                int q2 = ValueforRome(qwe[2]);
                int q3 = ValueforRome(qwe[3]);
                int q4 = Value1(qwe[4]);
                if (q4 == 1) {
                    result = ValueforRome4(qwe[0], qwe[1], qwe[2], qwe[3]) / ValueforRome(qwe[5]);
                } else if (q4 == 2) {
                    result = ValueforRome4(qwe[0], qwe[1], qwe[2], qwe[3]) * ValueforRome(qwe[5]);
                } else if (q4 == 3) {
                    result = ValueforRome4(qwe[0], qwe[1], qwe[2], qwe[3]) + ValueforRome(qwe[5]);
                } else if (q4 == 4) {
                    result = ValueforRome4(qwe[0], qwe[1], qwe[2], qwe[3]) - ValueforRome(qwe[5]);
                }
                if (ValueforRome4(qwe[0], qwe[1], qwe[2], qwe[3]) != 0 && ValueforRome(qwe[5]) != 0) {
                    Transl(result);
                }
            }
        }
        if (a == 6 && Rometest(qwe[0]) && Rometest(qwe[1]) && Rometest(qwe[5]) && Rometest(qwe[6]) && (!Rometest(qwe[2]) || !Rometest(qwe[4]) || !Rometest(qwe[3]))) {
            int q = ValueforRome(qwe[0]);
            int q1 = ValueforRome(qwe[1]);
            int q5 = ValueforRome(qwe[5]);
            int q6 = ValueforRome(qwe[6]);
            int result = 0;
            if (!Rometest(qwe[2]) && Rometest(qwe[3]) && Rometest(qwe[4])) {
                int q2 = Value1(qwe[2]);
                if (q2 == 1) {
                    result = ValueforRome2(qwe[0], qwe[1]) / ValueforRome4(qwe[3], qwe[4], qwe[5], qwe[6]);
                } else if (q2 == 2) {
                    result = ValueforRome2(qwe[0], qwe[1]) * ValueforRome4(qwe[3], qwe[4], qwe[5], qwe[6]);
                } else if (q2 == 3) {
                    result = ValueforRome2(qwe[0], qwe[1]) + ValueforRome4(qwe[3], qwe[4], qwe[5], qwe[6]);
                } else if (q2 == 4) {
                    result = ValueforRome2(qwe[0], qwe[1]) - ValueforRome4(qwe[3], qwe[4], qwe[5], qwe[6]);
                }
                if (ValueforRome2(qwe[0], qwe[1]) != 0 && ValueforRome4(qwe[3], qwe[4], qwe[5], qwe[6]) != 0) {
                    Transl(result);
                }
            }
            else if (Rometest(qwe[2]) && !Rometest(qwe[3]) && Rometest(qwe[4])) {
                int q3 = Value1(qwe[3]);
                if (q3 == 1) {
                    result = ValueforRome3(qwe[0], qwe[1], qwe[2]) / ValueforRome3(qwe[4], qwe[5], qwe[6]);
                } else if (q3 == 2) {
                    result = ValueforRome3(qwe[0], qwe[1], qwe[2]) * ValueforRome3(qwe[4], qwe[5], qwe[6]);
                } else if (q3 == 3) {
                    result = ValueforRome3(qwe[0], qwe[1], qwe[2]) + ValueforRome3(qwe[4], qwe[5], qwe[6]);
                } else if (q3 == 4) {
                    result = ValueforRome3(qwe[0], qwe[1], qwe[2]) - ValueforRome3(qwe[4], qwe[5], qwe[6]);
                }
                if (ValueforRome3(qwe[0], qwe[1], qwe[2]) != 0 && ValueforRome3(qwe[4], qwe[5], qwe[6]) != 0) {
                    Transl(result);
                }
            }
            else if (Rometest(qwe[2]) && Rometest(qwe[3]) && !Rometest(qwe[4])) {
                int q4 = Value1(qwe[4]);
                if (q4 == 1) {
                    result = ValueforRome4(qwe[0], qwe[1], qwe[2], qwe[3]) / ValueforRome2(qwe[5], qwe[6]);
                } else if (q4 == 2) {
                    result = ValueforRome4(qwe[0], qwe[1], qwe[2], qwe[3]) * ValueforRome2(qwe[5], qwe[6]);
                } else if (q4 == 3) {
                    result = ValueforRome4(qwe[0], qwe[1], qwe[2], qwe[3]) + ValueforRome2(qwe[5], qwe[6]);
                } else if (q4 == 4) {
                    result = ValueforRome4(qwe[0], qwe[1], qwe[2], qwe[3]) - ValueforRome2(qwe[5], qwe[6]);
                }
                if (ValueforRome4(qwe[0], qwe[1], qwe[2], qwe[3]) != 0 && ValueforRome2(qwe[5], qwe[6]) != 0) {
                    Transl(result);
                }
            }
        }
        if (a == 7 && Rometest(qwe[0]) && Rometest(qwe[1]) && Rometest(qwe[5]) && Rometest(qwe[6]) && Rometest(qwe[2]) && Rometest(qwe[7]) && (!Rometest(qwe[4]) || !Rometest(qwe[3]))) {
            int q = ValueforRome(qwe[0]);
            int q1 = ValueforRome(qwe[1]);
            int q2 = ValueforRome(qwe[2]);
            int q5 = ValueforRome(qwe[5]);
            int q6 = ValueforRome(qwe[6]);
            int q7 = ValueforRome(qwe[7]);
            int result = 0;
            if (!Rometest(qwe[3]) && Rometest(qwe[4])) {
                int q3 = Value1(qwe[3]);
                if (q3 == 1) {
                    result = ValueforRome3(qwe[0], qwe[1], qwe[2]) / ValueforRome4(qwe[4], qwe[5], qwe[6], qwe[7]);
                } else if (q3 == 2) {
                    result = ValueforRome3(qwe[0], qwe[1], qwe[2]) * ValueforRome4(qwe[4], qwe[5], qwe[6], qwe[7]);
                } else if (q3 == 3) {
                    result = ValueforRome3(qwe[0], qwe[1], qwe[2]) + ValueforRome4(qwe[4], qwe[5], qwe[6], qwe[7]);
                } else if (q3 == 4) {
                    result = ValueforRome3(qwe[0], qwe[1], qwe[2]) - ValueforRome4(qwe[4], qwe[5], qwe[6], qwe[7]);
                }
                if (ValueforRome3(qwe[0], qwe[1], qwe[2]) != 0 && ValueforRome4(qwe[4], qwe[5], qwe[6], qwe[7]) != 0) {
                    Transl(result);
                }
            }
            else if (Rometest(qwe[3]) && !Rometest(qwe[4])) {
                int q4 = Value1(qwe[4]);
                if (q4 == 1) {
                    result = ValueforRome4(qwe[0], qwe[1], qwe[2], qwe[3]) / ValueforRome3(qwe[5], qwe[6], qwe[7]);
                } else if (q4 == 2) {
                    result = ValueforRome4(qwe[0], qwe[1], qwe[2], qwe[3]) * ValueforRome3(qwe[5], qwe[6], qwe[7]);
                } else if (q4 == 3) {
                    result = ValueforRome4(qwe[0], qwe[1], qwe[2], qwe[3]) + ValueforRome3(qwe[5], qwe[6], qwe[7]);
                } else if (q4 == 4) {
                    result = ValueforRome4(qwe[0], qwe[1], qwe[2], qwe[3]) - ValueforRome3(qwe[5], qwe[6], qwe[7]);
                }
                if (ValueforRome4(qwe[0], qwe[1], qwe[2], qwe[3]) != 0 && ValueforRome3(qwe[5], qwe[6], qwe[7]) != 0) {
                    Transl(result);
                }
            }
        }
        if (a == 8 && Rometest(qwe[0]) && Rometest(qwe[1]) && Rometest(qwe[5]) && Rometest(qwe[6]) && Rometest(qwe[2]) && Rometest(qwe[7]) && Rometest(qwe[8]) && Rometest(qwe[3]) && !Rometest(qwe[4])) {
            int q = ValueforRome(qwe[0]);
            int q1 = ValueforRome(qwe[1]);
            int q2 = ValueforRome(qwe[2]);
            int q3 = ValueforRome(qwe[3]);
            int q5 = ValueforRome(qwe[5]);
            int q6 = ValueforRome(qwe[6]);
            int q7 = ValueforRome(qwe[7]);
            int q8 = ValueforRome(qwe[8]);
            int result = 0;
            if (!Rometest(qwe[4])) {
                int q4 = Value1(qwe[4]);
                if (q4 == 1) {
                    result = ValueforRome4(qwe[0], qwe[1], qwe[2], qwe[3]) / ValueforRome4(qwe[5], qwe[6], qwe[7], qwe[8]);
                } else if (q4 == 2) {
                    result = ValueforRome4(qwe[0], qwe[1], qwe[2], qwe[3]) * ValueforRome4(qwe[5], qwe[6], qwe[7], qwe[8]);
                } else if (q4 == 3) {
                    result = ValueforRome4(qwe[0], qwe[1], qwe[2], qwe[3]) + ValueforRome4(qwe[5], qwe[6], qwe[7], qwe[8]);
                } else if (q4 == 4) {
                    result = ValueforRome4(qwe[0], qwe[1], qwe[2], qwe[3]) - ValueforRome4(qwe[5], qwe[6], qwe[7], qwe[8]);
                }
                if (ValueforRome4(qwe[0], qwe[1], qwe[2], qwe[3]) != 0 && ValueforRome4(qwe[5], qwe[6], qwe[7], qwe[8]) != 0) {
                    Transl(result);
                }
            }
        }
        in.close();
    }
}
