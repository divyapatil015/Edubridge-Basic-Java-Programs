package nov13;

interface Playable {
	public void play();
}

class Guitar implements Playable{
	@Override
	public void play() {
		System.out.println("Guitar is playing");		
	}
}

class Piano implements Playable{
	@Override
	public void play() {
		System.out.println("Piano is playing");		
	}
}
public class PracticeQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playable objGuitar = new Guitar();
		Playable objPiano = new Piano();
		
		objGuitar.play();
		objPiano.play();
		

	}

}
