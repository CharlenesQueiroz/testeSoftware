/*/ Autora: Charlene Queiroz/*/

import org.junit.Test;
import org.junit.Before;
import model.Cliente;
import org.junit.Assert;


public class ClienteTest {

    Cliente cliente;
    String nome, email;

    @Before
    public void prepararContexto() {
        cliente = new Cliente();
       // cliente.isValidEmailAddress("Carlos@gmail.com");
       // cliente.verificaNome("Mario Carlos Silva");
    }

    /*/ Caso de Teste: TC 01 - Verificar se o nome que foi digitado é válido, contém somente letras.*/
    @Test
    public void verificaSeNomeValido() {
        nome = cliente.verificaNome("Mario Carlos Silva");
        Assert.assertEquals("Nome válido", nome);
    }

    /*/ Caso de Teste: TC 02 - Verificar se o nome que foi digitado é inválido, não contém somente letras./*/
    @Test
    public void verificaSeNomeInvalido() {
        nome = cliente.verificaNome("Ce1#$ carlos Manoel");
        Assert.assertEquals("Nome inválido", nome);
    }

    /*/ Caso de Teste: TC 03 - Verificar se o email que foi digitado é válido./*/
    @Test
    public void verificaSeEmailValido() {
        email = cliente.isValidEmailAddress("Carlos@gmail.com");
        Assert.assertEquals("Email válido", email);
    }

    /*/ Caso de Teste: TC 04 - Verificar se o email que foi digitado é inválido./*/
    @Test
    public void verificaSeEmailInvalido() {
        email = cliente.isValidEmailAddress("Carlosgmail.com");
        Assert.assertEquals("Email inválido", email);

    }

}
