public class BooleanExercise {
    public static void main(String[] args) {
/*        System.out.println(smartDepositBox(true, false)); // -> true
        System.out.println(smartDepositBox(false, true)); //-> true
        System.out.println(smartDepositBox(false, false)); // -> false*/

/*        System.out.println(smartDepositBoxVersionTwo(true, false)); // ->false
        System.out.println(smartDepositBoxVersionTwo(false, true)); //->false
        System.out.println(smartDepositBoxVersionTwo(false, false)); //->false
        System.out.println(smartDepositBoxVersionTwo(true, true)); // ->true*/

/*        System.out.println(verySmartDepositBoxVersionThree(false, true, true)); // true
        System.out.println(verySmartDepositBoxVersionThree(false, true, false)); // false*/

        System.out.println(bigBadaBoom(true, true)); //-> true
        System.out.println(bigBadaBoom(false, false)); // -> false
        System.out.println(bigBadaBoom(true, false)); //-> false
    }


    public static boolean bigBadaBoom(boolean cap1, boolean cap2) {
        return cap1 && cap2;
    }

    public static boolean verySmartDepositBoxVersionThree(boolean papaPermission,
                                                          boolean mamaPermission,
                                                          boolean omaPermission) {
//        return (mamaPermission && papaPermission) || omaPermission;
        return omaPermission || smartDepositBoxVersionTwo(mamaPermission, papaPermission);
    }


    public static boolean smartDepositBoxVersionTwo(boolean papaPermission, boolean mamaPermission) {
        return papaPermission && mamaPermission;
    }

    public static boolean smartDepositBox(boolean papaPermission, boolean mamaPermission) {
        //return papaPermission || mamaPermission;
        return papaPermission ^ mamaPermission;
    }

}
