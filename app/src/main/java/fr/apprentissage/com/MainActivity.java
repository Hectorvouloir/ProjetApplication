//N'oubliez pas de déclarer le bon package dans lequel se trouve le fichier !
package fr.apprentissage.com;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainActivity extends Activity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void main(String[] args) {
        HashMap<String, Integer> happy= new HashMap<String, Integer>();
        happy.put("a", 10);
        happy.put("b",3);
        happy.put("c",88);

        happy.toString();

        Toast.makeText(getApplicationContext(), "Hello Toast", Toast.LENGTH_SHORT).show();


    }

}
