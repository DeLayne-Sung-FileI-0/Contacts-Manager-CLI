//import java.nio.file.Path;
//import java.util.ArrayList;
//import java.util.List;
//
//public class TestingNewCode extends Main {
//
//    public static void main(String[] args) {
//
//        ArrayList<String> newContactNameList = new ArrayList<>();
//        ArrayList<String> newContactNumberList = new ArrayList<>();
//
//        newContactNameList.add("Sung Il Lee");
//        newContactNameList.add("DeLayne LaBove");
//        newContactNameList.add("Jennifer Lee");
//        newContactNameList.add("Jacques Boutte");
//
//        newContactNumberList.add("1234567890");
//        newContactNumberList.add("1234567897");
//        newContactNumberList.add("1234534890");
//        newContactNumberList.add("1234567777");
//
//        System.out.println("newContactNameList = " + newContactNameList);
//        System.out.println("newContactNumberList = " + newContactNumberList);
//
//    }
//
//    private static boolean fileContains(String needle, Path aFile) {
//        List<String> lines = readFile(aFile, false);
//        for (String line : lines) {
//            if (line.equals(needle)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//
//}
