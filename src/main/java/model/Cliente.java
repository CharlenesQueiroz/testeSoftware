/*/ Autora: Charlene Queiroz/*/

package model;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import br.com.caelum.stella.*;
import br.com.caelum.stella.validation.CPFValidator;
import java.util.List;


public class Cliente {

    private String msg;

    public static void main(String[] args) {

        System.out.println(isValidEmailAddress("garbosoftware@gmail.com"));
        System.out.println(isValidEmailAddress("aaabbb@gmail.com"));
        System.out.println(isValidEmailAddress("invalido@com.br"));
        System.out.println(isValidEmailAddress("inv@lido@com.br"));

        System.out.println(verificaNome("Carlos Manoel Baatista"));

        /*
        String cpf = "721.880.652-04";
        boolean valido = valida(cpf);
       //cadastra(valido);
        */

    }

    /*Aqui estou verificando o email*/
    public static String isValidEmailAddress(String email) {
        boolean result = true;
        String msg;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
            msg = "Email válido";

        } catch (AddressException ex) {
            result = false;
            msg = "Email inválido";
        }
        return msg;

    }

    public String getMsg() {
        return msg;
    }


    /*Aqui estou verificando o nome*/
    public static String verificaNome(String nome) {

        boolean result = true;
        String msg = "Nome válido";

        if (!nome.matches("^[a-zA-Z\\s]*$")) {
            result = false;
            msg = "Nome inválido";
        }

        return msg;

    }


    /*Aqui estou verificando o CPF

    public static boolean valida(String cpf) {
        CPFValidator cpfValidator = new CPFValidator();
        List<ValidationMessage> erros = cpfValidator.invalidMessagesFor(cpf);
        if(erros.size() > 0){
            return false;
        }else{ return true;
        }
            System.out.println(erros);//Sysout só para exemplificar, aqui você imprime seus erros, seja na web ou na sua aplicação return false; }

        }
    }
    */

}
