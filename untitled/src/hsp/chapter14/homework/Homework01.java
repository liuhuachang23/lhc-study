package hsp.chapter14.homework;


import java.util.*;
/**
 * ����������� DAO<T>�������ж���һ��Map ��Ա������Map �ļ�Ϊ String ���ͣ�ֵΪ T ���͡�
 *
 * �ֱ𴴽����·�����
 * (1) public void save(String id,T entity)�� ���� T ���͵Ķ��� Map ��Ա������
 * (2) public T get(String id)���� map �л�ȡ id ��Ӧ�Ķ���
 * (3) public void update(String id,T entity)���滻 map ��keyΪid������,��Ϊ entity ����
 * (4) public List<T> list()������ map �д�ŵ����� T ����
 * (5) public void delete(String id)��ɾ��ָ�� id ����
 *
 * ����һ�� User �ࣺ
 * ���������private��Ա������int���ͣ� id��age����String ���ͣ�name��
 *
 * ���� DAO ��Ķ��� �ֱ������ save��get��update��list��delete ���������� User ����
 * ʹ�� Junit ��Ԫ��������в��ԡ�
 *
 * ˼·����
 * 1. ����User��
 * 2. ����Dao<T>������
 */
public class Homework01 {
    public static void main(String[] args) {
    }


    public void Test() {
        DAO<User> dao = new DAO<>();
        dao.save("001", new User(1, "jack", 20));
        dao.save("002", new User(2, "tom", 19));
        dao.save("003", new User(3, "mary", 22));

        System.out.println(dao.list());
        System.out.println(dao.get("001"));
        dao.delete("001");

    }
}

class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public DAO(Map<String, T> map) {
        this.map = map;
    }

    public DAO() {
    }

    public Map<String, T> getMap() {
        return map;
    }

    public void setMap(Map<String, T> map) {
        this.map = map;
    }


    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        List<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for (T t : values) {
            list.add(t);
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }

}

class User {
    private int id;
    private String name;
    private int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}