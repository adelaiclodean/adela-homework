package homework03;

public class ArtAlbum extends Book {

    private final String paperQuality;

    public ArtAlbum(String name, int numeberOfpages, String paperQuality) {
        super(name, numeberOfpages);
        this.paperQuality = paperQuality;
    }
    //public void print(){
    //System.out.println("listeaza artAlbum");
    // }
}


