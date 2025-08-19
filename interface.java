class phone{
	void voicecall(){
		System.out.println("make voice calls");
	}
	void sms(){
		System.out.println("we can send sms");
	}
}
	interface camera{
		void click();
		void record();
	}
	interface player{
		void play();
		void pause();
		void stop();
	}
	class smartphone extends phone implements camera,player{
		public void click(){
			System.out.println("you can make multiple click");
		}
		public void record(){
			System.out.println("you can record videos");
		}
		public void play(){
			System.out.println("play the songs");
		}
		public void pause(){
			System.out.println("pause the songs");
		}
		public void stop(){
			System.out.println("you options to stop the songs");
		}
}
		
public class Main {
	public static void main(String[] args) {
		smartphone obj=new smartphone();
		obj.voicecall();
		obj.sms();
		obj.click();
		obj.record();
		obj.play();
		obj.pause();
		obj.stop();
		
	}
}