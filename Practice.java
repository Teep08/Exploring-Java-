import java.util.ArrayList;

class Practice
{
    public static void main(String args[])
    {
       ArrayList<Integer> arrl = new ArrayList<>();
       arrl.add(1);
       arrl.add(4);

      Object onj =  arrl.clone();
      System.out.println(arrl);
       System.out.println(onj);
    }

}