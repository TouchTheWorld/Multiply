import java.math.BigInteger;

/**
 * Created by namercx on 2016/10/16.
 */
public class Multiply {
    static String result(int input){                                          //阶乘的方法，静态，能直接调用
        BigInteger sum = new BigInteger("1");                                 //建立BigInteger的对象
        for (int i = input; i > 0; i--) {                                     //循环相乘
            sum = sum.multiply(new BigInteger(String.valueOf(i)));            //用sum代表结果
        }
        return sum.toString();                                                //装换为字符串，返回结果
    }

    static String subResult(int input, int start, int end){                   //截取阶乘的方法，静态，能直接调用
        String sum = result(input);                                             //调用计算阶乘的方法
        sum = sum.substring(start, end);                                        //调用截取字符串的方法，用sum代表结果
        return sum;                                                            //返回结果
    }
}
