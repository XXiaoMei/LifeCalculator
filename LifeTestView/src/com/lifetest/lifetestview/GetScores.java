package com.lifetest.lifetestview;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GetScores extends Activity{
	private TextView scores;
	private ArrayList<PageEntity> list;
	private double score=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_getscores);
		
		scores=(TextView)findViewById(R.id.scores);
		Intent intent=getIntent();
		list=(ArrayList<PageEntity>)intent.getSerializableExtra("list");  
		for(int i=0;i<list.size();i++){
			setKey(i, list.get(i).getSelect());
		}
		
		scores.setText(score+"");
	}
	
	public void setKey(int i, int pos) {
		// mDataMap = new HashMap<String, Double>();
		switch (i) {
		case 0:
			// sex
			if (pos == 0) {
				score =score+ 86;
			} else {
				score =score+ 89;
			}

			break;
		case 1:
			// wedding
			if (pos == 0) {
				score = score+3;
			} else {
				score = score+0;
			}

			break;
		case 2:
			// together
			if (pos == 0) {
				score = score+0.25;
			} else {
				score = score+0;
			}
			break;
		case 3:
			// press
			if (pos == 0) {
				score = score+0.75;
			} else {
				score = score-3;
			}
			break;
		case 4:
			// relief
			if (pos == 0) {
				score =score+ 1;
			} else {
				score = score-2;
			}
			break;
		case 5:
			// sleeping
			if (pos == 0) {
				score = score-1;
			} else {
				score =score+ 1;
			}
			break;
		case 6:
			// education
			if (pos == 0) {
				score = score+0.5;
			} else {
				score = score-0.5;
			}
			break;
		case 7:
			// working time
			if (pos == 0) {
				score = score+2;
			} else {
				score = score+1;
			}
			break;
		case 8:
			// optimistic
			if (pos == 0) {
				score = score+2;
			} else {
				score = score-1;
			}
			break;
		case 9:
			// air
			if (pos == 0) {
				score =score+ 0.5;
			} else {
				score =score+ 0;
			}
			break;
		case 10:
			// Seat belts
			if (pos == 0) {
				score =score+ 0.75;
			} else {
				score = score+0;
			}
			break;
		case 11:
			// coffee
			if (pos == 0) {
				score =score+ 0.5;
			} else {
				score = score-0.5;
			}
			break;
		case 12:
			// Green tea
			if (pos == 0) {
				score =score+ 0.5;
			} else {
				score = score+0;
			}

			break;
		case 13:
			// smoke
			if (pos == 0) {
				score =score -4;
			} else {
				score = score+0;
			}

			break;
		case 14:
			// smoking every
			if (pos == 0) {
				score = score-0.5;
			} else {
				score = score+0;
			}
			break;
		case 15:
			// smoking times
			if (pos == 0) {
				score = score-5;
			} else if (pos == 1) {
				score =score -10;
			} else if (pos == 2) {
				score = score-15;
			} else {
				score = score+0;
			}
			break;
		case 16:
			// beer
			if (pos == 0) {
				score = score-7;
			} else {
				score =score+ 0;
			}
			break;
		case 17:
			// aspirin
			if (pos == 0) {
				score =score+ 2;
			} else {
				score = score+0;
			}
			break;
		case 18:
			// sunscreen
			if (pos == 0) {
				score = score-1;
			} else {
				score = score+0.5;
			}
			break;
		case 19:
			// danger
			if (pos == 0) {
				score = score+10;
			} else {
				score = score+0;
			}
			break;
		case 20:
			// Dental floss
			if (pos == 0) {
				score = score+1;
			} else {
				score = score-1;
			}
			break;
		case 21:
			// fast food
			if (pos == 0) {
				score = score+4;
			} else {
				score = score-2;
			}
			break;
		case 22:
			// barbecue food
			if (pos == 0) {
				score =score+ 1;
			} else {
				score = score+0;
			}
			break;
		case 23:
			// Calcium supplements
			if (pos == 0) {
				score = score+0.5;
			} else {
				score = score+0;
			}
			break;
		case 24:
			// retail
			if (pos == 0) {
				score = score+0.5;
			} else {
				score =score+ 0;
			}
			break;
		case 25:
			// Popsicle
			if (pos == 0) {
				score = score-1;
			} else {
				score = score+0;
			}

			break;
		case 26:
			// fat
			if (pos == 0) {
				score = score-5;
			} else {
				score = score+0;
			}
			break;
		case 27:
			// iron
			if (pos == 0) {
				score = score+2;
			} else {
				score = score+0;
			}
			break;
		case 28:
			// exercise
			if (pos == 0) {
				score = score+5;
			} else if (pos == 1) {
				score = score+3;
			} else {
				score = score-1;
			}
			break;
		case 29:
			// defecation
			if (pos == 0) {
				score = score-0.5;
			} else {
				score = score+0;
			}
			break;
		case 30:
			// cholesterol
			if (pos == 0) {
				score = score-2;
			} else {
				score = score+0;
			}
			break;
		case 31:
			// sys
			if (pos == 0) {
				score =score+ 2;
			} else if (pos == 1) {
				score = score-5;
			} else {
				score = score+0;
			}
			break;
		case 32:
			// dia
			if (pos == 0) {
				score = score+7;
			} else {
				score = score+0;
			}
			break;
		case 33:
			// Blood sugar
			if (pos == 0) {
				score = score+0.5;
			} else {
				score = score+0;
			}
			break;
		case 34:
			// Heart disease
			if (pos == 0) {
				score = score+-2;
			} else {
				score = score+0;
			}

			break;
		case 35:
			// Heart disease && diabetes
			if (pos == 0) {
				score =score+ 2;
			} else {
				score = score+0;
			}
			break;
		case 36:
			// cancer
			if (pos == 0) {
				score = score-1;
			} else {
				score = score+0;
			}
			break;
		case 37:
			// mother
			if (pos == 0) {
				score = score+2;
			} else {
				score = score+0;
			}
			break;
		case 38:
			// father
			if (pos == 0) {
				score = score+2;
			} else {
				score = score+0;
			}
			break;

		case 39:
			// over 98th years
			if (pos == 0) {
				score = score+2;
			} else {
				score = score+0;
			}
			break;
		case 40:
			// fertility
			if (pos == 0) {
				score =score+ 2;
			} else {
				score = score+0;
			}
			break;
		default:
			break;
		}
	}
}
