package com.company;

public class Main {

    public char[] chars = { ' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å' };

    public static void main(String[] args) {
        Main main = new Main();
        main.runProgram();
    }
    public void runProgram()
    {
        System.out.println("'C' is converted to number: " + convertToNumber('C'));
        System.out.println("'5' is converted to letter: " + convertToLetter(5));
    }
    public int convertToNumber(char ch)
    {
        int returnValue = -1;
        for (int i = 0; i < chars.length; i++)
        {
            if (ch == chars[i])
            {
                returnValue = i;
            }
        }
        return returnValue;
    }
    public char convertToLetter(int number)
    {
        return chars[number];
    }
}
