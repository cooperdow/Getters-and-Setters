import java.util.ArrayList;
public class Song 
	{
	private String title;
	private String artist;
	private int seconds;
	static int longestSong=0;
	
	static ArrayList<Song>regress=new ArrayList<Song>();
	
	public Song(String t, String ar, int sc)
	{
	title=t;
	artist=ar;
	seconds=sc;
	}
	public static void main(String[] args) 
	{
	regress.add(new Song("Buffalo Soldier", "Bob Marley", 312));
	regress.add(new Song("Trampled Under Foot", "Led Zepplin", 450));
	regress.add(new Song("Stay", "Rihanna", 278));
	regress.add(new Song("Jump Around", "House of Pain", 365));
	regress.add(new Song("Fire and Brimstone", "Jim Tom", 253));
	printList();
	
	for (int i=0; i<regress.size(); i++)
		{
		regress.get(i).setSeconds(regress.get(i).getSeconds()-10);	
		}
	System.out.println(" ");
	System.out.println("SONGS WITH 10 LESS SECONDS");
	System.out.println(" ");
	System.out.println(".......................");
	printList();
	
	for (int i=0; i<regress.size(); i++)
		{
		if (longestSong<regress.get(i).getTitle().length())
			{
			longestSong=regress.get(i).getTitle().length();
			}
		//System.out.println(longestSong);
		}
	for (int i=0; i<regress.size(); i++)
		{
		if (regress.get(i).getTitle().length()==longestSong)
		regress.remove(i);
		}
	System.out.println(" ");
	System.out.println("REMOVE LONGEST SONG");
	System.out.println(" ");
	printList();
	
	for (int i=0; i<regress.size(); i++)
		{
		regress.get(0).setArtist("Cooper Dow");
		}
	System.out.println(" ");
	System.out.println("MY NAME AS TITLE");
	System.out.println(" ");
	printList();
	}
	
	public static void printList()
	{
	for (Song S: regress)
		{
		System.out.println("Song name: " + S.getTitle());
		System.out.println("Artist name: " + S.getArtist());
		System.out.println("Song length(in seconds): " + S.getSeconds());
		System.out.println("----------------");
		}
	}
	
	public String getTitle() 
		{
		return title;
		}
	public void setTitle(String title) 
		{
		this.title = title;
		}
	public String getArtist() 
		{
		return artist;
		}
	public void setArtist(String artist) 
		{
		this.artist = artist;
		}
	public int getSeconds() 
		{
		return seconds;
		}
	public void setSeconds(int seconds) 
		{
		this.seconds = seconds;
		}
	}
