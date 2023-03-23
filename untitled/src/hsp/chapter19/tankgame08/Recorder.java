package hsp.chapter19.tankgame08;


import java.io.*;
import java.util.Vector;

/**
 * @Auther: ������
 * @Date: 2022/4/13 18:26
 * @Description: ��¼�����Ϣ, ���ļ�����
 */
public class Recorder {

    //�������,��¼�ҷ����ٵз�̹����
    private static int allEnemyTankNum = 0;
    //����һ��Node����
    private static Vector<Node> nodes = new Vector<>();

    //����IO����,����д���ݵ��ļ���
    private static BufferedWriter bw = null;
    private static BufferedReader br = null;
    private static ObjectOutputStream oos = null;
    private static String recordFile = "src\\hsp\\chapter19\\tankgame08\\myRecord.txt";

    //����һ������̹�˼��ϣ����� MyPanel�ഫ���� ����̹�˼���
    private static Vector<EnemyTank> enemyTanks = new Vector<>();

    //��MyPanel���� ����������������������̹�˴���
    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        Recorder.enemyTanks = enemyTanks;
    }

    //����һ���������ڶ�ȡrecordFile�ļ�, �ָ������Ϣ
    //�÷����ڼ����Ͼּ�����ʱ�� ��MyPanel �е���
    public static Vector<Node> getNodesAndEnemyTankRec() {
        try {
            br = new BufferedReader(new FileReader(recordFile));
            allEnemyTankNum = Integer.parseInt(br.readLine());
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] xyd = line.split(" ");
                Node node = new Node(Integer.parseInt(xyd[0]), Integer.parseInt(xyd[1]), Integer.parseInt(xyd[2]));
                nodes.add(node);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nodes;
    }

    //����һ������,��¼����Ϸ�˳�ʱ,��¼allEnemyTankNum ���ļ� recordFile
    //���ӹ���,�Ǳ������̹�˵�����ͷ���
    public static void keepRecord() {
        try {
            bw = new BufferedWriter(new FileWriter(recordFile));
            bw.write(allEnemyTankNum + "\r\n");
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                if (enemyTank.isLive()) {
                    String record = enemyTank.getX() + " " + enemyTank.getY() + " " + enemyTank.getD();
                    bw.write(record + "\r\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

    //���ҷ�̹�˻���һ���з�̹��ʱ,allEnemyTankNum�ͼ�1
    public static void addAllEnemyTankNum() {
        Recorder.allEnemyTankNum++;
    }

    public static String getRecordFile() {
        return recordFile;
    }
}
