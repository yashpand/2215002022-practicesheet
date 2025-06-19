import java.util.Random;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

class otp {
    public static int generateOTP() {
        return 100000 + new Random().nextInt(900000); 
    }

    public static boolean areUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) set.add(otp);
        return set.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();

        System.out.println("OTPs: " + Arrays.toString(otps));
        System.out.println("Are all unique? " + areUnique(otps));
    }
}
