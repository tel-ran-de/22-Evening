public class Squirrels {
/*    Когда белки собираются вместе на вечеринку, они любят курить сигары.
Беличья вечеринка считается успешной,
если количество сигар составляет от 40 до 60 включительно.
 Если только это не выходные, в этом случае верхняя граница количества сигар отсутствует.
Верните true, если вечеринка с заданными значениями успешна, или false в противном случае.*/

    public static void main(String[] args) {

        System.out.println(cigarParty(30, false)); //→false
        System.out.println(cigarParty(50, false)); //→true
        System.out.println(cigarParty(70, true)); //→true
    }

    public static boolean cigarParty(int cigars, boolean weekend) {
        return weekend && (cigars > 40) || (cigars >= 40 && cigars <= 60);
    }
}
