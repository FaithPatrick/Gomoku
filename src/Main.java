import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        // 玩家信息输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入白棋棋手名称：");
        String whitePLayer = scanner.nextLine();
        System.out.println("请输入黑棋棋手名称：");
        String blackPlayer = scanner.nextLine();

        // 绘制初始棋盘
        drawBoard();

        // 游戏开始
        int win = 0;

        // Loop
        do {
            // 下棋
            // 绘制棋盘
            // 检测是否触发胜利条件
        } while(win == 0);
        // End Loop


    }

    /*
    绘制棋盘
     */
    public void drawBoard() {

    }
}
