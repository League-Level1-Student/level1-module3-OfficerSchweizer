
public class Netflix {

	public static void main(String[] args) {

		Movie starWars = new Movie("Star Wars", 9);
		Movie interstellar = new Movie("Interstellar", 8);
		Movie avengers = new Movie("Avengers", 7);
		Movie halloween = new Movie("Halloween", 6);
		Movie asdf = new Movie("asdf", 1);
		
		System.out.println(asdf.getTicketPrice());

		NetflixQueue queue = new NetflixQueue();

		queue.addMovie(asdf);
		queue.addMovie(halloween);
		queue.addMovie(avengers);
		queue.addMovie(interstellar);
		queue.addMovie(starWars);

		System.out.println(queue.movies);

		System.out.println("The best movie is " + queue.getBestMovie());
		System.out.println("The second best movie is " + queue.get2ndBestMovie());

	}
}
