package hsp.chapter19.tankgame08;

/**
 * @Auther: ������
 * @Date: 2022/4/13 19:00
 * @Description: һ�� Node ����,��ʾһ������̹����Ϣ
 */
public class Node {
    private int x;
    private int y;
    private int d;

    public Node(int x, int y, int d) {
        this.x = x;
        this.y = y;
        this.d = d;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}

