public class Chuoi {
    private static Object subString;

    public static void main(String[] args) {
        String sentence = "Java programming is fun and powerful";
        boolean chua = sentence.contains("is");
        if(chua){
            System.out.println("Co");
        }else{
            System.out.println("Khong");
        }
    }
}
