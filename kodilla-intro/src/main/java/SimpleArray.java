public class SimpleArray {
    public static void main(String[] args) {

        String[] movies = new String[5];

            movies[0] = "Las Vegas Parano";
            movies[1] = "Forrest Gump";
            movies[2] = "Zielona Mila";
            movies[3] = "Miś";
            movies[4] = "Star Wars";

        String movie = movies[3];
         int numberOfElements = (movies.length);
        System.out.println ("Ta tablica zawiera" +" " + movies.length +" " + "elementów.");
    }
}
