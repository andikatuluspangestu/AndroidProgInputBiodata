package e.rpl.proginputbiodata;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Spinner;
public class MainActivity extends AppCompatActivity {
RadioGroup radioGroupJK;
RadioButton radioButtonJK;
Button Jawab;
TextView hasilNama, hasilAgama, hasilJK;
EditText input_nama;
Spinner spinnerAgama;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 getSupportActionBar().setTitle("Latihan Spinner dan RadioButton");
 getSupportActionBar().setSubtitle("RPL SMK N 1 Slawi");
 input_nama=(EditText)findViewById(R.id.inputNama);
 spinnerAgama=(Spinner)findViewById(R.id.pilihAgama);
 radioGroupJK = (RadioGroup) findViewById(R.id.radioGroupJK);
 hasilAgama= (TextView) findViewById(R.id.displayAgama);
 hasilJK=(TextView)findViewById(R.id.displayJK);
 hasilNama=(TextView) findViewById(R.id.displayNama);
 }
 public void HasilProses(View view) {
 String getNama = input_nama.getText().toString();
 String pilih_agama = String.valueOf(spinnerAgama.getSelectedItem());
 //memilih radio button pada button group
 int selectedId = radioGroupJK.getCheckedRadioButtonId();
 //membuat simpan radio
 radioButtonJK=(RadioButton) findViewById(selectedId);
 hasilNama.setText(getNama);
 hasilAgama.setText(pilih_agama);
 hasilJK.setText((CharSequence)radioButtonJK.getText());
 }
}
