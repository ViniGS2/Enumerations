package enums.entidades.aplicativo;

import enums.Status;
import enums.entidades.TesteLoja;

import java.util.Date;

public class Testee {
    public static void main(String[] args) {
        TesteLoja cliente = new TesteLoja(1000, new Date(), Status.PAGAMENTO_PENDENTE);

        Status status = Status.valueOf("ENVIADO"); //Precisa existir dentre os enums
        TesteLoja client2 = new TesteLoja(1000, new Date(), status);

        System.out.println(cliente);
        System.out.println(client2);
    }
}
