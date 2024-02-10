package Constant;

public class JavaRoundDown {

     public static double roundDown(String value) {
          value = value.replace(".", ",");
          String[] array = value.split(",");
          value = array[0];
          int l = value.length();
          int begin = l - 2;
          value = value.substring(0, begin);
          value =value+"00";
          return Double.parseDouble(value);
     }
     
     public static String exchangeKh(double value){
        double data =  value * JavaConstant.exchangeRate;
        return String.valueOf(data);
     }
     
}
