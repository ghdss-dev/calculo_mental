package cbersoftware.dev.calculo_mental.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import cbersoftware.dev.calculo_mental.R;
import cbersoftware.dev.calculo_mental.apoio.Util_calculo_mental;

public class Calculo_Mental extends AppCompatActivity {

    private TextView tvOperacao, tvPontos, tvDificuldade;
    private EditText etResposta;
    private Button btnConfirmar, btnContinuar;
    private int pontos = 0;
    private Util_calculo_mental calculoMental;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculo_mental);

        tvOperacao = findViewById(R.id.tvOperacao);
        tvPontos = findViewById(R.id.tvPontos);
        tvDificuldade = findViewById(R.id.tvDificuldade);
        etResposta = findViewById(R.id.etResposta);
        btnConfirmar = findViewById(R.id.btnConfirmar);
        btnContinuar = findViewById(R.id.btnContinuar);

        int dificuldade = 1;
        calculoMental = new Util_calculo_mental(dificuldade);

        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int respostaUsuario = Integer.parseInt(etResposta.getText().toString());
                boolean certo = false;

                switch (calculoMental.getOperacao()) {

                    case 0:
                        certo = calculoMental.somar(respostaUsuario);
                        break;

                    case 1:
                        certo = calculoMental.somar(respostaUsuario);
                        break;

                    case 2:
                        certo = calculoMental.somar(respostaUsuario);
                        break;
                }

                if (certo) {

                    pontos += 10;
                }

                atualizarTela();
            }
        });

        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculoMental = new Util_calculo_mental(dificuldade);
                atualizarTela();
            }
        });
    }

    private void atualizarTela() {

        tvOperacao.setText(calculoMental.toString());
        tvPontos.setText("Pontos: " + pontos);
        etResposta.setText("");
    }

}