public class Char {
    public static void main(String[] args) {
        char a = '1', b = 'A', c = 'B', d = 'a', e = 'b',
             l = '\u0040', m = '\u005A', n = '\u0071', o = '\u0072', p = '\u007A';
        int f = 40, g = 59, i = 79, j = 85, k = 90;

        // Напишите предложения для нахождения и вывода кодов ASCII,
        // соответствующих символам '1', 'A', 'B', 'a' и 'b'.
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println((int)c);
        System.out.println((int)d);
        System.out.println((int)e);

        // Напишите предложения для нахождения и вывода символов,
        // соответствующих десятичным кодам 40, 59, 79, 85 и 90.
        System.out.println((char)f);
        System.out.println((char)g);
        System.out.println((char)i);
        System.out.println((char)j);
        System.out.println((char)k);

        // Напишите предложения для нахождения и вывода символов,
        // соответствующих шестнадцатеричным кодам 40, 5A, 71, 72 и 7A.
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);

        // Что будет присвоено переменным
        int w = '1';
        int y = 'a';
        char z = 90;

        System.out.println(w);
        System.out.println(y);
        System.out.println(z);

        // Напишите программу, которая генерирует и
        // отображает случайную строчную латинскую букву.
        int u;
        u = 97 + (int)(Math.random() * 26);
        System.out.println((char)u);



    }
}
