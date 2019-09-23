package com.klyagin;

public class DefanginganIPAddress {

    public static String defangIPaddr(String address) {
        if (!isValidIPAdress(address)) throw new IllegalArgumentException("Not an Ip Adress");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length() ; i++) {
            if (address.charAt(i) == '.') {
                sb.append("[.]");
            } else {
                sb.append(address.charAt(i));
            }
        }

        return sb.toString();
    }

    public static boolean isValidIPAdress(String add){
        String[] group = add.split("\\.");
        if (group.length != 4) return false;
        try{
            for(String s : group){
                if (s.startsWith(".")) return false;
                Integer value = Integer.parseInt(s);
                if (value < 0 || value > 255) return false;
                return true;
            }
        }catch (NumberFormatException e){
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
        System.out.println(defangIPaddr("255.100.50.0"));
        System.out.println(defangIPaddr("0.100.50.0"));
        System.out.println(defangIPaddr(".100.50.0"));
        /** Result:
         Runtime: 1 ms, faster than 56.79% of Java online submissions for Defanging an IP Address.
         Memory Usage: 34.5 MB, less than 100.00% of Java online submissions for Defanging an IP Address.
         **/
    }
}
