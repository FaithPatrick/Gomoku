import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        // 玩家信息输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入白棋棋手名称：");
        String whitePlayer = scanner.nextLine();
        System.out.println("请输入黑棋棋手名称：");
        String blackPlayer = scanner.nextLine();

        // 绘制初始棋盘
        int size = 15;
        int[][] board = new int[size][size];
        drawBoard(board, size);

        // 游戏开始
        int win = 0;
        int currentPlayer = 0;
        do {
            // 提醒下棋
            String currentPlayerName = currentPlayer == 0 ? whitePlayer : blackPlayer;
            System.out.println("该" + currentPlayerName + "下棋了");

            int x, y;
            boolean canPlace = true;
            do {
                if (!canPlace) {
                    System.out.println("这里不能放棋子，请重新输入");
                }
                String coord = scanner.nextLine();
                //拿到coord真实坐标
                y = coord.charAt(0) - 'A';
                x = Integer.valueOf(coord.substring(1)) - 1;

                canPlace = true;
                canPlace = canPlace && x >= 0 && x < size && y >= 0 && y < size;
                canPlace = canPlace && board[y][x] == 0;
            } while(!canPlace);
            board[y][x] = currentPlayer == 0 ? 1 : 2;

            // 绘制棋盘
            drawBoard(board, size);

            // TODO 检测是否触发胜利条件

            currentPlayer++;
            currentPlayer %= 2;
        } while(win == 0);

        // 显示胜利方
        if (win == 1) {
            System.out.println(whitePlayer + "赢了");
        } else if(win == 2) {
            System.out.println(blackPlayer + "赢了");
        } else {
            System.out.println("平局");
        }
    }

    /**
     * 绘制棋盘
     * @param board
     * @param size
     */
    public void drawBoard(int[][] board, int size) {
        System.out.print("   ");
        for (int i = 0; i < size; i++) {
            int num = i + 1;
            System.out.print(num < 10 ? num + "  " : num + " ");
        }
        System.out.println();
        for (int i = 0; i < size ; i++) {
            char y = (char)('A' + i);
            System.out.print(y + "  ");
            for (int j = 0; j < size; j++) {
                int value = board[i][j];
                char c = ' ';
                switch (value) {
                    case 0 : c = '.'; break;
                    case 1 : c = 'x'; break;
                    case 2 : c = 'o'; break;
                }
                System.out.print(c + "  ");
            }
            System.out.println();
        }
    }
}
