## Integer triangles(5kyu)
## 28.10.2022
## нахождение количества целых треугольников с периметром не более p
## [ссылка на задание](https://www.codewars.com/kata/55db7b239a11ac71d600009d/train/java)
## Код:
``` java
public static int giveTriang(int per) {
        int a = 1;
        int b = 1;
        double c = 1;
        int n = 0;

        for (; a + b + c <= per; a++) {
            for (b = a; a + b + c <= per; b++) {
                c = Math.sqrt(a * a + b * b + a * b);
                if ((c - (int) c) == 0) {
                    n++;
                    System.out.println(a + " " + b + " " + c);
                }
            }
            b = a;
        }
        return n;
    }
```
## Понравивщееся решение (автор g964)
``` java
public class IntTriangles {
    public static int giveTriang(int per) {
        int cnt = 0; int a = 3;
        while (a < per) {
            if (2*a > per) break;
            int b = a;
            while (b < per) {
                if (a + 2*b > per) break;
                double c = Math.sqrt(a*a + a*b + b*b);
                if ((c % 1 == 0) && (a+b+c <= per))
                    cnt++;
                b++;
            }
            a++;
        }
        return cnt;
    }
}
  
