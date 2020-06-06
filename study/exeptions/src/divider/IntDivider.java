package divider;

class IntDivider {

    int divide(String[] skaiciai) {

        if ( skaiciai == null ||skaiciai.length > 2 || skaiciai.length==0) {
            throw new IllegalArgumentException();
        }
        try {
            return Integer.parseInt(skaiciai[0].trim()) / Integer.parseInt(skaiciai[1].trim());
        }catch (Exception e){
            throw new IllegalArgumentException();
        }
    }
}
