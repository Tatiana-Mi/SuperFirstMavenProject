public class Main {

    public static String abbr(String str, int size){
        return str.substring(0, size - 3) + "...";
    }

//    public static boolean abbrTest(){
//        if(!"A...".equals(abbr("Anna",4))){
//            return false;
//        }if (!"Hello...".equals(abbr("Hello world",8))) {
//            return false;
//
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(abbrTest());
//
}
