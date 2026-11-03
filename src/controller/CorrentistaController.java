package controller;

import model.Correntista;
import java.util.ArrayList;
import java.util.List;

public class CorrentistaController {

    private ArrayList<Correntista> correntistas;

    public CorrentistaController() {
        correntistas = new ArrayList<>();
    }

    public String validarDados(Correntista correntista) {
        List<String> erros = new ArrayList<>();

        if (correntista.getNome() == null || 
                correntista.getNome().trim().isEmpty()) {
            erros.add("Nome é obrigatório.");
        }

        if (correntista.getCpf() == null || 
                !correntista.getCpf().matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            erros.add("CPF inválido. Use o formato 000.000.000-00.");
        } else if (buscarPorCpf(correntista.getCpf()) != null) {
            erros.add("CPF já cadastrado.");
        }

        if (correntista.getEmail() == null || 
                !correntista.getEmail().matches("^[^@]+@[^@]+\\.[^@]+$")) {
            erros.add("E-mail inválido.");
        }

        if (correntista.getTelefone() == null || 
                !correntista.getTelefone().matches("^\\(\\d{2}\\) \\d{5}-\\d{4}$")) {
            erros.add("Telefone inválido. Use o formato (00) 00000-0000.");
        }
        
        if (correntista.getDataNascimento()== null || 
                !correntista.getDataNascimento().matches("^\\d{2}/\\d{2}/\\d{4}$")) {
            erros.add("Data de nascimento inválida. Use o formato dd/mm/aaaa.");
        }
        
        if (correntista.getTipoConta() == null || 
                correntista.getTipoConta().trim().isEmpty()) {
            erros.add("Selecione o tipo de conta.");
        }
        
        if (correntista.getTipoPessoa() == null || 
                correntista.getTipoPessoa().trim().isEmpty()) {
            erros.add("Selecione o tipo de pessoa (PF ou PJ).");
        }
        
        if (correntista.getSenha() == null || 
                correntista.getSenha().length() < 6) {
            erros.add("Senha deve ter no mínimo 6 caracteres.");
        }

        return erros.isEmpty() ? null : String.join("\n", erros);
    }

    public String cadastrar(Correntista correntista) {
        String erro = validarDados(correntista);
        if (erro != null) {
            return erro;
        }
        //correntista.setObservacoes(observacoes == null ? "" : observacoes.trim());
        correntistas.add(correntista);
        return null;
    }

    public Correntista buscarPorCpf(String cpf) {
        for (Correntista correntista : correntistas) {
            if (correntista.getCpf().equals(cpf)) {
                return correntista;
            }
        }
        return null;
    }

    public ArrayList<Correntista> listarTodos() {
        return correntistas;
    }

    public int tamanho() {
        return correntistas.size();
    }
}