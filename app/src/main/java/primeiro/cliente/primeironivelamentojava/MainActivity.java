package primeiro.cliente.primeironivelamentojava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import primeiro.cliente.primeironivelamentojava.model.Cliente;

public class MainActivity extends AppCompatActivity {

    Cliente objCliente;
    String TAG = "Minha_ideia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objCliente = new Cliente("etiene", "etiene@etiene.com","17 91111-2222",25, true);

        Log.i(TAG, "onCreate: objCliente nome:" +objCliente.getNome());
        Log.i(TAG, "OnCreate objCliente Email: "+objCliente.getEmail());
        Log.i(TAG, "OnCreate objCliente telefone: "+objCliente.getTelefone());
        Log.i(TAG, "OnCreate objCliente idade: "+objCliente.getIdade());
        Log.i(TAG, "OnCreate objCliente sexo: "+objCliente.isSexo());


    }
}