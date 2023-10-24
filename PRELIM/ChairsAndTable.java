public class ChairsAndTable {

    public static void main(String[] args) {
        drawChairsAndTable();
    }

    public static void drawChairsAndTable() {
        String[] table = {
            "X                        X",
            "X                        X",
            "X       XXXXXXXXXX       X",
            "XXXXX   X        X   XXXXX",
            "X   X   X        X   X   X",
            "X   X   X        X   X   X"
        };

        for (String line : table) {
            System.out.println(line);
        }
    }
}