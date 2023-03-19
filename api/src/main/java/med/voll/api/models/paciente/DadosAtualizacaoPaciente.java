package med.voll.api.models.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.models.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
                @NotNull Long id,

                String nome,

                String telefone,

                DadosEndereco endereco) {

}
