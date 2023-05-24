package med.voll.api.medico;

public record DadosListagemMedicos(String nome, String email, String crm, EspecialidadeEnum especialidadeEnum) {

    public DadosListagemMedicos(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
