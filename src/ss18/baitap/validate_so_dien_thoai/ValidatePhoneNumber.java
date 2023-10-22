package ss18.baitap.validate_so_dien_thoai;

public class ValidatePhoneNumber {
    private static final String regexPhoneNumber = "^\\([0-9]{2}\\)-\\([0-9]{10}\\)$";

    public static Boolean validate (String string){
        if (string.matches(regexPhoneNumber)){
            return true ;
        }
        return false ;
    }
}
