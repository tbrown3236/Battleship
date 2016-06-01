package com.example.terrybrown.battleship;

import android.os.Bundle;
import android.widget.EditText;

/**
 * Created by terrybrown on 5/17/16.
 */
public class BattlePrefs extends BaseActivity {

    EditText edtFirstName;
    EditText edtLastName;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );

        setContentView(R.layout.battleprefs );
        edtFirstName = (EditText) findViewById( R.id.edtFirstName );
        edtLastName = (EditText) findViewById( R.id.edtLastName );
        edtFirstName.setText( user.getFirst_name() );
        edtLastName.setText( user.getLast_name() );
    }
}
