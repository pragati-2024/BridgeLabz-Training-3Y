public class music{
    public static void main(String[] args) {
        String[] songs = {"Song1", "Song2", "Song3"};
        int option = 0;
        while (option != 4) {
            System.out.println("Options:");
            System.out.println("1. Play all songs");
            System.out.println("2. Play a song by index");
            System.out.println("3. Search for a song by name");
            System.out.println("4. Exit");
            System.out.print("Enter option: ");
            option = Integer.parseInt(System.console().readLine());
            switch (option) {
                case 1:
                    for (String song : songs) {
                        System.out.println(song);
                    }
                    break;
                case 2:
                    System.out.print("Enter index: ");
                    int index = Integer.parseInt(System.console().readLine());
                    if (index >= 0 && index < songs.length) {
                        System.out.println(songs[index]);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case 3:
                    System.out.print("Enter song name: ");
                    String name = System.console().readLine();
                    boolean found = false;
                    for (String song : songs) {
                        if (song.equals(name)) {
                            System.out.println(name);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Song not found");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option");
            }
            System.out.println();
        }
    }
}
