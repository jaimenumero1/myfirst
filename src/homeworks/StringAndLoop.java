package homeworks;

import javax.imageio.stream.ImageInputStream;

public class StringAndLoop {

   public static StringBuilder sqeeze(String s) {


       StringBuilder sb = new StringBuilder();
       for (int i = 0; i < s.length(); i++) {
           char ch = s.charAt(i);
           if (ch != ' ')
               sb.append(ch);
       }
       return sb;
   }
       public static void main(String args []){


       StringBuilder sb = sqeeze("   manchester united is also known as red devil   ");
           System.out.println(sb);
       }
   }