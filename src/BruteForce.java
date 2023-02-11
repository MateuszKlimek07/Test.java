public class BruteForce {
    public static void main(String[] args) {
        bruteForce(7);
    }

    public static String bruteForce(int size) {
        int[] password = new int[size];
        String[] finalPassword = new String[size];
        for (int i = 0; i < size; i++) {
            password[i] = 0;
            finalPassword[i] = "";
        }
        String pass = "0000000";
        return computePermutations(size, password, 0, pass);
    }

    private static String computePermutations(int size, int[] password, int position, String pass) {
        String testString = "";
        String assemble = "";
        for (int i = 0; i < 10; i++) {
            password[position] = i;

            if (position != size - 1) {
                testString = computePermutations(size, password, position + 1, pass);
                if (testString != "") {
                    return testString;
                }
            } else if (position == size - 1) {
                for (int j = 0; j < size; j++) {

                    switch (password[j] + 1) {
                        case 1:
                            assemble = assemble + "0";
                            break;
                        case 2:
                            assemble = assemble + "1";
                            break;
                        case 3:
                            assemble = assemble + "2";
                            break;
                        case 4:
                            assemble = assemble + "3";
                            break;
                        case 5:
                            assemble = assemble + "4";
                            break;
                        case 6:
                            assemble = assemble + "5";
                            break;
                        case 7:
                            assemble = assemble + "6";
                            break;
                        case 8:
                            assemble = assemble + "7";
                            break;
                        case 9:
                            assemble = assemble + "8";
                            break;
                        case 10:
                            assemble = assemble + "9";
                            break;
                    }

                }
                System.out.println(assemble);
                if (assemble.equalsIgnoreCase(pass)) {
                    System.out.println("Password is: " + assemble);
                    break; //replace this with: return assemble;
                } else {
                    assemble = "";
                }
            }


        }
        return "";
    }
}