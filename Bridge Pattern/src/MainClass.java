
public class MainClass {

	public static void main(String[] args) {
		IResource artRes = new ArtistResource();
		LongForm lf = new LongForm(artRes);
		lf.show(); //long, artist
		
		ShortForm sf = new ShortForm(artRes);
		sf.show(); //short, artist
		
		IResource albRes = new AlbumResource();
		lf = new LongForm(albRes);
		lf.show(); //long, album
		
		sf = new ShortForm(albRes);
		sf.show(); //short, album
		
		//thus, 2*2=4 combinations made without actually building their individual functions
		//any newly added resource or form, can easily be used just y creating object and calling function
	}

}
