package br.com.alura.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

import br.com.alura.agenda.modelo.Aluno;

/**
 * Created by lincolnvbassoto on 17/01/18.
 */

public class FormularioHelper {

    private final EditText campoNome;
    private final EditText campoEndereco;
    private final EditText campoTefelone;
    private final EditText campoSite;
    private final RatingBar campoNota;

    public FormularioHelper (FormularioActivity activity){
         campoNome = (EditText) activity.findViewById(R.id.formulario_nome);
         campoEndereco = (EditText) activity.findViewById(R.id.formulario_endereco);
         campoTefelone = (EditText) activity.findViewById(R.id.formulario_telefone);
         campoSite = (EditText) activity.findViewById(R.id.formulario_site);
         campoNota = (RatingBar) activity.findViewById(R.id.formulario_nota);
    }

    public Aluno pegaAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome(campoNome.getText().toString());
        aluno.setEndereco(campoEndereco.getText().toString());
        aluno.setTelefone(campoTefelone.getText().toString());
        aluno.setSite(campoSite.getText().toString());
        aluno.setNota(Double.valueOf(campoNota.getProgress()));

        return aluno;
    }
}