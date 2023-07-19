package java.jvm;

public class Test {
    public void test1(){

        //Aşağıda yazılan kod bloklarına 'source code' yani kaynak kod denir.
        System.out.println("Hello World");

        //Daha sonra çalıştıra bastığımızda 'javac' komutu çağırılır ve Test.java class'ı 'byte code' a çevrilir.
        //Bu derleme esnasında compiler hatası alabiliriz. Hangi durumlarda bu hataları alırız:

        /*  Syntax error.
        *
        * int a = 4 yazımında ; olmadığı için compiler hatası alacağız.
        *
        *
        * */

        /*
        * Undefined variable error
        *
        * int a = b + 3; ifadesi b'nin ne olduğu bilinmediği veya tanımlanmadığı için compiler hatası alır.
        *
        * */

        /*
        * Tip uyumsuzuluğu
        *
        * int a = "3"; burada String olarak 3 yazıldığından dolayı hata alırız.
        *
        * */


    }
}
