package enums.entidades;

import enums.Status;

import java.util.Date;

public class TesteLoja {

    private int id;
    private Date data;
    private Status status;

    public TesteLoja(int id, Date data, Status status) {
        this.id = id;
        this.data = data;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "TesteLoja{" +
                "id=" + id +
                ", data=" + data +
                ", status=" + status +
                '}';
    }
}
