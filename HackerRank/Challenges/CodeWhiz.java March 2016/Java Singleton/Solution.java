import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    String str;
    private static Singleton singleInstance = new Singleton();
    private  Singleton() {}
    public static Singleton getSingleInstance() {
        return singleInstance;
    }
}
