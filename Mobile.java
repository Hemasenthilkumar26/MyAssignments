package week2.day1;

public class Mobile {
	public void switchOn() {
		System.out.println("Switch on the mobile");
	}
	public void sendText() {
		System.out.println("Send Text");
	}
	public void callSomeone() {
		System.out.println("Call Someone");
	}
	public void shareDocument() {
		System.out.println("Share Document");
	}
	public void onlineTransaction() {
		System.out.println("Online Transaction");
	}
	public void playGames() {
		System.out.println("play Games");
	}
	public void watchMovie() {
		System.out.println("watch Movie");
	}
	public void playMusic() {
		System.out.println("play Music");
	}
	public void restartMobile() {
		System.out.println("Restart the Mobile");
	}
	public void switchOff() {
		System.out.println("Switch Off the mobile");
	}
public static void main(String[] args)
{
Mobile myMob=new Mobile();
myMob.switchOn();
myMob.sendText();
myMob.callSomeone();
myMob.shareDocument();
myMob.onlineTransaction();
myMob.playGames();
myMob.sendText();
myMob.watchMovie();
myMob.playMusic();
myMob.restartMobile();
myMob.switchOff();
}

}
