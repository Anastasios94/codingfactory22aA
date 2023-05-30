package gr.aueb.cf.ch11;

public class MobileContactApp {

    final static String[][] contacts = new String[500][3];
    static int pivot = -1;

    public static void main(String[] args) {

    }

    /*
     * CRUD Services that are provided to service layer
     */

    public static int getIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i <= pivot; i++) {
            if (contacts[i][2].equals(phoneNumber)){
                return i;
            }
        }

        return -1; //if not found
    }
}
