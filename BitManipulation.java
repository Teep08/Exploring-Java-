public class BitManipulation {
    public static void main(String args[])
    {
        //Binary AND &
        int answer = 5 & 6; 
        System.out.println(answer); // 4

        //Binary OR |
        int ans = 5 | 6;
        System.out.println(ans); // 7

        //Binary XOR ^
        int answ = 5 ^ 6;
        System.out.println(answ); // 3

        //Binary One's Complement ~
        System.out.println(~5); // -6

        //Binary left shift <<
        //Formula - a<<b = a * 2^b
        int answe = 5 << 2;
        System.out.println(answe); //20

        //Binary right shift >>
        //Formula - a<<b = a / 2^b
        int an = 5 >> 2;
        System.out.println(an); //1

    }
    
}
