package in.ankitatrawalkar.leetcode;

/*
    1108. Defanging an IP Address
    A defanged IP address replaces every period "." with "[.]".
 */
public class IPAddressDefanger {

    public static void main(String[] args) {
        String test = "255.100.50.0";
        System.out.println(IPAddressDefanger.defangIPaddr(test));
    }

    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

}
