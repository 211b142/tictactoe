package com.example.tictactoe2;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;

import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    int player=1;//player1 is cross
    int [][]winningStates={{0,1,2},{3,4,5},{6,7,8}};
    int []gameState={-1,-1,-1,-1,-1,-1,-1,-1,-1};
    public void load(View view) {

        ImageView v = (ImageView) view;
        int tag = Integer.parseInt(v.getTag().toString());
        if (player == 1) {
            v.setImageResource(R.drawable.cross);
            gameState[tag]=player;
            Toast.makeText(this, tag + "" + "cross", Toast.LENGTH_SHORT).show();
            player = 0;
        } else {
            v.setImageResource(R.drawable.o);
            gameState[tag]=player;
            Toast.makeText(this, tag + "" + "o", Toast.LENGTH_SHORT).show();
            player = 1;
        }
        for (int i = 0; i < winningStates.length; i++) {
            if (gameState[winningStates[i][0]] == gameState[winningStates[i][1]] && gameState[winningStates[i][1]] == gameState[winningStates[i][2]] && gameState[winningStates[i][0]] > -1) {
                Toast.makeText(this, "winner is" + (player == 0 ? 1 : 0), Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "winner is" + (player == 0 ? 1 : 0), Toast.LENGTH_SHORT).show();
                isWinner=true;
            }
        }
    }




}
    public void reset(View view){
        android.support.v7.widget.GridLayout gridLayout=findViewById(R.id.gridLayout);
        int total_images=gridLayout.getChildCount();
        for (int i=0;i<total_images;i++){
            ImageView v=(ImageView) gridLayout.getChildAt(i);
            v.setImageDrawable(null);
        }
        isWinner=false;
        imageClicked=-1;
        player=1;
        for (int i=0;i<gameState.length;i++){
            gameState[i]=-1;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}