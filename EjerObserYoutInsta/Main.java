public class Main{
    public static void main(String[] args){
        InstaSubject insta = new InstaSubject();
        YTSubject youtube = new YTSubject();

        //Agrega observadores
        Observer observer1 = new InstaObserver();
        insta.addObserver(observer1);
        youtube.addObserver(new YTObserver());
        insta.addObserver(new InstaObserver());
        youtube.addObserver(new YTObserver());

        //Cambiar state 
        insta.newReal("Se ha agregado un reel 1");
        youtube.newVideo("Se ha agregado un nuevo video 1");

        insta.newReal("Se ha publicado el reel 2 ");
        youtube.newVideo("Se ha publicado el video 2 ");

        insta.removeObserver(observer1);

        insta.newReal("Se ha publicado el reel 3 ");
    }
}