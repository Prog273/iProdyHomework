package homework16;

public class Main {
    public static void main(String[] args) {
        int[][] worldMap = {
                {1, 1, 0, 0, 0, 1},
                {1, 0, 0, 1, 1, 0},
                {0, 0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 1}
        };

       DfsVoyager voyager = new DfsVoyager();
        int result = voyager.lookupIslands(worldMap);
        System.out.println("Количество островов: " + result);
    }
}
