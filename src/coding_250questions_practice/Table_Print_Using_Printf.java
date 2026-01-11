package coding_250questions_practice;
/*Table Print using System.out.printf
Print  lines of output; each line  (where ) contains the  of  in the form:
N x i = result.
Sample Input
2
Sample Output
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
*/

public class Table_Print_Using_Printf {
    public static void main(String[] args) {
        int a=2;
        System.out.printf("%dx1=%d%n",a,a*1);
        System.out.printf("%dx2=%d%n",a,a*2);
        System.out.printf("%dx3=%d%n",a,a*3);
        System.out.printf("%dx4=%d%n",a,a*4);
        System.out.printf("%dx5=%d%n",a,a*5);
        System.out.printf("%dx6=%d%n",a,a*6);
        System.out.printf("%dx7=%d%n",a,a*7);
        System.out.printf("%dx8=%d%n",a,a*8);
        System.out.printf("%dx9=%d%n",a,a*9);
        System.out.printf("%dx10=%d%n",a,a*10);

    }
}
