package Constant;

public class JavaRoundUpKhr {

     public static String roundUp3length(String[] listStr) {
          int lengthChar = listStr.length;
          int num = Integer.parseInt(listStr[lengthChar - 3]) + 1;
          String numStr = "" + num;
          listStr[lengthChar - 3] = numStr;
          listStr[lengthChar - 2] = "0";
          listStr[lengthChar - 1] = "0";

          String valueData = "";
          for (int j = 0; j < listStr.length; j++) {
               valueData += listStr[j];
          }
          return  valueData;
     }
}
