package edu.zju.sc.aoot;

public class Die
{
	int faceValue;
	int numofsides;
	public Die(){
		faceValue = 0;
		numofsides = 6;
	}

	public Die(int v){
		numofsides = v;
	}

	public int numOfSides(){
		return numofsides;
	}


	public int topFace(){
		return faceValue;
	}
	
	public void roll() {
        faceValue = (int) (1 + Math.random() * numofsides);
    }
}
