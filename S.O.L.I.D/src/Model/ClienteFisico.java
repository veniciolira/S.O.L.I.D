package Model;

import java.text.SimpleDateFormat;
import java.util.UUID;

public class ClienteFisico {

    UUID uuid;

    String nomeCompleto;

    String cpf;

    String rg;

    String orgaoEmissor;

    Class sexo;

    SimpleDateFormat nascimento;

    public ClienteFisico(String nomeCompleto, String cpf, String ssp) {
        this.uuid = uuid;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.rg = rg;
        this.orgaoEmissor = orgaoEmissor;
        this.sexo = sexo;
        this.nascimento = nascimento;
    }

    public ClienteFisico(String orgaoEmissor) {

    }

    public ClienteFisico(int i, Contato cli2cont, Endereco cli2end, boolean b, String s, int i1, String pedro_alves, String s1, String estado_da_paraiba, Sexo cli2sex, String s2) {

    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public Class getSexo() {
        return sexo;
    }

    public void setSexo(Class sexo) {
        this.sexo = sexo;
    }

    public SimpleDateFormat getNascimento() {
        return nascimento;
    }

    public void setNascimento(SimpleDateFormat nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "ClienteFisico{" +
                "uuid=" + uuid +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", orgaoEmissor='" + orgaoEmissor + '\'' +
                ", sexo=" + sexo +
                ", nascimento=" + nascimento +
                '}';
    }
}
