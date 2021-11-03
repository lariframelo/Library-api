import Pessoa.Pessoa;
import com.sun.xml.internal.ws.policy.AssertionSet;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class CadastroPessoasTeste {

    @Test
    @DisplayName("Deve criar o cadastro de pessoas")
    public void deveCriarCadastroPessoas(){
        //cenário e execução
        CadastroPessoas cadastro = new CadastroPessoas();

        //verificação
        Assertions.assertThat(cadastro.getPessoas()).isEmpty();
    }

    @Test
    @DisplayName("Deve Adicionar uma pessoa")
    public void deveAdicionarUmaPessoa(){
        //cenário
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();

        //execução
        cadastroPessoas.adicionar(pessoa);

        //verificação
        Assertions.assertThat(cadastroPessoas.getPessoas())
                .isNotEmpty()
                .hasSize(1)
                .contains(pessoa);
    }

    @Test (expected = PessoaSemNotException.class)
    public void naoDeveAdicionarPessoaComNomeVazio() {
        //cenário
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();

        //execução
        cadastroPessoas.adicionar(pessoa);
    }

    @Test
    public void deveRemoverUmaPessoa() {
        //cenario
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        cadastroPessoas.adicionar(pessoa);
        pessoa.setNome("Wilson");

        //execução
        cadastroPessoas.remover(pessoa);

        //verificação
        Assertions.assertThat(cadastroPessoas.getPessoas()).isEmpty();
    }
}
