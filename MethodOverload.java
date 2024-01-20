public class MethodOverload {

    public static void main(String args[])
    {
        Addition obj = new Addition();
        System.out.println(obj.sum(2,3));
        System.out.println(obj.sum(1,2,3));
        System.out.println(obj.sum((float)1.1,(float)2.2));
    }
}

class Addition{

    int sum(int a, int b)
    {
        return a+b;
    }

    int sum(int a,int b,int c)
    {
        return a+b+c;
    }

    float sum(float a,float b)
    {
        return a+b;
    }
}

/*
 OUTPUT :
5
6
3.3000002
 */
