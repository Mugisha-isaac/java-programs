package Arrays;

public class Three {
    public static void main(String args[]) {
        // String name = "mugishaisaac";
        // System.out.println(name.length());
        // System.out.println("first char is: " + name.charAt(0));
        // System.out.println("last char is: " + name.charAt(name.length() - 1));

        // for (int i = name.length() - 1; i >= 0; i--) {
        // System.out.print(name.charAt(i));
        // }

        // printing text
        String text = "He likes to play football";
        String[] splitData = text.split(" ");

        for (int i = 0; i < splitData.length; i++) {
            System.out.println(splitData[i]);
        }
    }
}
