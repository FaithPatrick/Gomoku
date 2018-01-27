import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        // 玩家信息输入
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入白棋棋手名称：");
//        String whitePLayer = scanner.nextLine();
//        System.out.println("请输入黑棋棋手名称：");
//        String blackPlayer = scanner.nextLine();

        // 绘制初始棋盘
        drawBoard();

        // 游戏开始
        int win = 0;

        // 下棋 Loop
        do {
            // 下棋
            // 绘制棋盘
            // 检测是否触发胜利条件
        } while(win == 0);

        if (win == 1) {
            System.out.println(whitePlayer + "赢了");
        } else if(win == 2) {
            System.out.println(blackPlayer + "赢了");
        } else {
            System.out.println("平局");
        }

    }

    /*
    绘制棋盘
     */
    public void drawBoard() {
        int size = 15;
        int[][] board = new int[size][size];
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
