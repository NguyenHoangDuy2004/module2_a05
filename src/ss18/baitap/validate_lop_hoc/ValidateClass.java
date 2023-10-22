package ss18.baitap.validate_lop_hoc;

public class ValidateClass {
    private static final String regexClass = "^[ACP][0-9]{4}[GHILKM]$";

    public static Boolean validate (String string){
        if (string.matches(regexClass)){
            return true ;
        }
        return false ;
    }
}
