package co.jce.edx.recursosdelsistema;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button,
                   button2;

    private String textos[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        //-> Accedemos a los componentes del "Activity"
        button = ( Button ) findViewById( R .id .button );
        button2 = ( Button ) findViewById( R .id .button2 );

        //-> Asignamos las cadenas de texto a los botones extrayendolas del fichero "strings.xml"
        textos = getResources() .getStringArray( R .array .textoBotones );
        button .setText( textos[ 0 ] );
        button2 .setText( textos[ 1 ] );

        //-> Asignamos un tamaño (dimensión) a las cadenas de los botones en el fichero "dimens.xml"
        button .setTextSize( getResources() .getDimension( R .dimen .tipo_grande ) );
        button2 .setTextSize( getResources() .getDimension( R .dimen .tipo_reducido ) );

        //-> Asignamos un color a las cadenas de texto de los botones en el fichero "colors.xml"
        //   El método getColor() quedará obsoleto apartir de la API 23.
        //   En su lugar debe usarse así: getColor ( int, Theme )
        button .setTextColor( getResources() .getColor( R .color .colorVerde ) );
        button2 .setTextColor( getResources() .getColor( R. color .colorRojo ) );
    }

}
