package mx.com.bq.java.examples.se;

import java.util.List;
import java.util.ArrayList;

public class TestList {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
      al.add("pen");
      al.add("pencil");
      al.add("ink");
      al.add("notebook");

      System.out.println("ArrayList contains the string 'ink pen': "
                                           +al.contains("ink pen"));
      System.out.println("ArrayList contains the string 'pen': "
                                             +al.contains("pen"));
      System.out.println("ArrayList contains the string 'pencil': "
                                          +al.contains("pencil"));
      System.out.println("ArrayList contains the string 'book': "
                                           +al.contains("book"));
    }
}
