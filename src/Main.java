/**
 *Уч бурчтук деген класс тузунуз.
 *Класстын 3 полеси болсун a, b, c.
 *Класстын "area" деген методу болсун.
 *"area" методу полелериндеги маалыматтарга(маалымат объектти тузгондон кийин берилет)
 *таянып консолго уч бурчтуктун аянтын чыгарсын.
 *
 */
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.a = 8;
        triangle.b=8;
        triangle.c=5;

        triangle.area();
    }
}