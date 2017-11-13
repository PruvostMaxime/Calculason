package risiapps.com.calculason;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.text.DecimalFormat;

import risiapps.com.calculason.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';

    private char CURRENT_ACTION;

    private double valueOne = Double.NaN;
    private double valueTwo;

    private DecimalFormat decimalFormat;

    public void Credits(View view) {
        Intent intent = new Intent(MainActivity.this, Credits.class);
        startActivity(intent);
        ImageView credits = (ImageView) this.findViewById(R.id.credits);
        final MediaPlayer ah = MediaPlayer.create(this, R.raw.ah);
        credits.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                ah.start();
                Toast.makeText(MainActivity.this, "Y'a plus rien :)", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        decimalFormat = new DecimalFormat("#.########################################################################################################");

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + ".");
                final MediaPlayer dot = MediaPlayer.create(MainActivity.this, R.raw.point);
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.point);
                dot.start();
            }
        });

            binding.buttonZero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    binding.editText.setText(binding.editText.getText() + "0");
                    final MediaPlayer zero = MediaPlayer.create(MainActivity.this,R.raw.zero);
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.zero);
                    zero.start();
                }
            });

            binding.buttonOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    binding.editText.setText(binding.editText.getText() + "1");
                    final MediaPlayer un = MediaPlayer.create(MainActivity.this,R.raw.un);
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.un);
                    un.start();
                }
            });

            binding.buttonTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    binding.editText.setText(binding.editText.getText() + "2");
                    final MediaPlayer deux = MediaPlayer.create(MainActivity.this,R.raw.deux);
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.deux);
                    deux.start();
                }
            });

            binding.buttonThree.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    binding.editText.setText(binding.editText.getText() + "3");
                    final MediaPlayer trois = MediaPlayer.create(MainActivity.this,R.raw.trois);
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.trois);
                    trois.start();
                }
            });

            binding.buttonFour.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    binding.editText.setText(binding.editText.getText() + "4");
                    final MediaPlayer quatre = MediaPlayer.create(MainActivity.this,R.raw.quatre);
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.quatre);
                    quatre.start();
                }
            });

            binding.buttonFive.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    binding.editText.setText(binding.editText.getText() + "5");
                    final MediaPlayer cinq = MediaPlayer.create(MainActivity.this,R.raw.cinq);
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.cinq);
                    cinq.start();
                }
            });

            binding.buttonSix.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    binding.editText.setText(binding.editText.getText() + "6");
                    final MediaPlayer six = MediaPlayer.create(MainActivity.this,R.raw.six);
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.six);
                    six.start();
                }
            });

            binding.buttonSeven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    binding.editText.setText(binding.editText.getText() + "7");
                    final MediaPlayer sept = MediaPlayer.create(MainActivity.this,R.raw.sept);
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.sept);
                    sept.start();
                }
            });

            binding.buttonEight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    binding.editText.setText(binding.editText.getText() + "8");
                    final MediaPlayer huit = MediaPlayer.create(MainActivity.this,R.raw.huit);
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.huit);
                    huit.start();
                }
            });

            binding.buttonNine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    binding.editText.setText(binding.editText.getText() + "9");
                    final MediaPlayer neuf = MediaPlayer.create(MainActivity.this,R.raw.neuf);
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.neuf);
                    neuf.start();

                }
            });


            binding.buttonAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    computeCalculation();
                    CURRENT_ACTION = ADDITION;
                    binding.infoTextView.setText(decimalFormat.format(valueOne) + "+");
                    binding.editText.setText(null);
                    final MediaPlayer add = MediaPlayer.create(MainActivity.this,R.raw.add);
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.add);
                    add.start();
                }
            });

            binding.buttonSubtract.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    computeCalculation();
                    CURRENT_ACTION = SUBTRACTION;
                    binding.infoTextView.setText(decimalFormat.format(valueOne) + "-");
                    binding.editText.setText(null);
                    final MediaPlayer substract = MediaPlayer.create(MainActivity.this,R.raw.moins);
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.moins);
                    substract.start();
                }
            });

            binding.buttonMultiply.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    computeCalculation();
                    CURRENT_ACTION = MULTIPLICATION;
                    binding.infoTextView.setText(decimalFormat.format(valueOne) + "*");
                    binding.editText.setText(null);
                    final MediaPlayer multiply = MediaPlayer.create(MainActivity.this,R.raw.multiple);
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.multiple);
                    multiply.start();
                }
            });

            binding.buttonDivide.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    computeCalculation();
                    CURRENT_ACTION = DIVISION;
                    binding.infoTextView.setText(decimalFormat.format(valueOne) + "/");
                    binding.editText.setText(null);
                    final MediaPlayer divide = MediaPlayer.create(MainActivity.this,R.raw.divise);
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.divise);
                    divide.start();
                }
            });

            binding.buttonEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    computeCalculation();
                    binding.infoTextView.setText(binding.infoTextView.getText().toString() +
                            decimalFormat.format(valueTwo) + " = " + decimalFormat.format(valueOne));
                    valueOne = Double.NaN;
                    CURRENT_ACTION = '0';
                    final MediaPlayer egal = MediaPlayer.create(MainActivity.this,R.raw.equal);
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.equal);
                    egal.start();
                }
            });


            binding.buttonClear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(binding.editText.getText().length() > 0) {
                        CharSequence currentText = binding.editText.getText();
                        binding.editText.setText(currentText.subSequence(0, currentText.length()-1));
                        final MediaPlayer nukeMP = MediaPlayer.create(MainActivity.this,R.raw.nuke);
                        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.nuke);
                        nukeMP.start();

                    }
                    else {
                        final MediaPlayer nukeMP = MediaPlayer.create(MainActivity.this,R.raw.nuke);
                        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.nuke);
                        nukeMP.start();
                        valueOne = Double.NaN;
                        valueTwo = Double.NaN;
                        binding.editText.setText("");
                        binding.infoTextView.setText("");
                    }
                }
            });
        }

    private void computeCalculation() {
        if(!Double.isNaN(valueOne)) {
            valueTwo = Double.parseDouble(binding.editText.getText().toString());
            binding.editText.setText(null);

            if(CURRENT_ACTION == ADDITION)
                valueOne = this.valueOne + valueTwo;
            else if(CURRENT_ACTION == SUBTRACTION)
                valueOne = this.valueOne - valueTwo;
            else if(CURRENT_ACTION == MULTIPLICATION)
                valueOne = this.valueOne * valueTwo;
            else if(CURRENT_ACTION == DIVISION)
                valueOne = this.valueOne / valueTwo;
        }
        else {
            try {
                valueOne = Double.parseDouble(binding.editText.getText().toString());
            }
            catch (Exception e){}
        }
    }
}
