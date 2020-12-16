package InterfaceHeranca2;

public interface BancoDados extends SqlDCL,SqlDDl,SqlDMl {

    void abrirConexao();
    void fecharConexao();
}
