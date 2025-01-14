package homework16;

public class DfsVoyager implements Voyager {

    @Override
    public int lookupIslands(int[][] worldMap) {
        if (worldMap.length == 0) return 0;

        int islands = 0;
        int rows = worldMap.length;
        int columns = worldMap[0].length;

        // Проходим по карте
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (worldMap[i][j] == 1) {
                    islands++;
                    dfs(worldMap, i, j); // Заменяем 1 на 0 в ячейке, чтобы ещё раз не увеличить счётчик
                }
            }
        }
        return islands;
    }

    public void dfs(int[][] worldMap, int row, int column) {
        // Проверяем значение ряда и столбца, чтобы не выйти за границы массива, а также содержимое ячейки
        if (row < 0 || row >= worldMap.length || column < 0 || column >= worldMap[0].length) return;
        if (worldMap[row][column] != 1) return;

        worldMap[row][column] = 0;

        // Проверяем ячейки рядом с помощью рекурсии
        dfs(worldMap, row + 1, column);
        dfs(worldMap, row - 1, column);
        dfs(worldMap, row, column + 1);
        dfs(worldMap, row, column - 1);
    }
}
