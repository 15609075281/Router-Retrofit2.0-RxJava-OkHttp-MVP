package mvp.hc;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/4/4.
 */
public class Info implements Serializable {

    private int id;

    private String name;


    private Info() {

    }

    public Info(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
