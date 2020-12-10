package TemMuito;

public class Teste {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Link");
//      contato.setEndereco("Hyrule");
//        contato.setTelefone("21 99140-8817");

        Endereco end = new Endereco();
        end.setNomeRua("Rua gerudo");
        end.setNumero("n/a");
        end.setComplemento("vazio");
        end.setCidade("Castle Town");
        end.setEstado("Hyrule");
        end.setCep("9999999999");

        contato.setEndereco(end);

        Telefone telefone = new Telefone();
        telefone.setDdd("21");
        telefone.setTipo("celular");
        telefone.setNumero("21 99140-8817");

        Telefone telefone2 = new Telefone();
        telefone2.setDdd("21");
        telefone2.setTipo("celular");
        telefone2.setNumero("21 99140-5584");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

//        contato.setTelefone(telefone);
        contato.setTelefones(telefones);
        System.out.println(contato.getNome());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }
//        if (contato != null && contato.getTelefone() != null) {
//            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
//        }
        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " "+ t.getNumero());
            }
        }
    }
}