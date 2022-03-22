package MusicBox;
import java.util.Scanner;
public class MusicBoxGroup {
    public static void main(String[] args) {

        // March 7th 2022 --- MUSIC BOX --- TEAM: TENACIOUS TIGERS

        Scanner scanner = new Scanner(System.in);
        System.out.println("Available music types are Classical, Pop, and Country.");
        System.out.println("Please enter music genre:");
        String musicTypes = scanner.nextLine().toLowerCase().trim();

        switch (musicTypes) {
            default:
                System.out.println("The "+ musicTypes+ " music category is not available. Try again!");
                break;
            case "classical":
                System.out.println("Which song would you like to listen to? \n Four Seasons \n Fur Elise \n Finlandia \n Vocalise \n The Planets");
                String classicalSong = scanner.nextLine().toLowerCase().trim();
                switch (classicalSong) {
                    case "four seasons":
                    case "fur elise":
                    case "finlandia":
                    case "vocalise":
                    case "the planets":
                        // add the $$$$
                        System.out.println("Please enter $2.00 for this song");
                        double costClassical = scanner.nextDouble();
                        if (costClassical == 2) {
                            System.out.println("You are listening to " + classicalSong + ", please enjoy the song!");
                        } else if (costClassical < 2) {
                            while (costClassical < 2) {
                                System.out.println(costClassical+ "is not enough, please add: $" + (2 - costClassical) + " more.");
                                costClassical = scanner.nextDouble() + costClassical;
                                if (costClassical > 2) {
                                    System.out.println("You have entered $" + (costClassical - 2) + " more than required. Please enjoy your music while we process your change.");
                                    System.out.println("Here is your $" + (costClassical - 2) + " change.");
                                } else if (costClassical == 2) {
                                    System.out.println("You are listening to " + classicalSong + ", please enjoy the song!");
                                }

                            }
                        } else {
                            System.out.println("You have entered $" + (costClassical - 2) + " more than required. Please enjoy your music while we process your change.");
                            System.out.println("Here is your $" + (costClassical - 2) + " change.");
                        }

                        break;

                    default:
                        System.out.println("The " + classicalSong + " is not available song.");
                        break;

                }
                break;
            case "pop":
                System.out.println("Which song would you like to listen? \n Bad Guy \n Talk \n Please Me \n 7 ring \n Without Me ");
                String popSong = scanner.nextLine().toLowerCase().trim();
                switch (popSong) {
                    case "bad guy":
                    case "talk":
                    case "please me":
                    case "7 ring":
                    case "without me":
                        System.out.println("Please enter $4.00 for this song");
                        double costPop = scanner.nextDouble();
                        if (costPop == 4) {
                            System.out.println("You are listening to " + popSong + ". Enjoy the song!");
                        } else if (costPop < 4) {
                            while (costPop < 4) {
                                System.out.println(costPop+ " is not enough, please add $" + (4 - costPop) + " more");
                                costPop = scanner.nextDouble() + costPop;
                            }
                            if (costPop > 4) {
                                System.out.println("You have entered $" + (costPop - 4) + " more than required. Please enjoy the music while we processing your change!");
                                System.out.println("Here is your $" + (costPop - 4) + " change.");
                            } else {
                                System.out.println("You are listening to " + popSong + ". Enjoy the song!");
                            }
                        } else {
                            System.out.println("You have entered $" + (costPop - 4) + " more than required. Please enjoy the music while we processing your change!");
                            System.out.println("Here is your $" + (costPop - 4) + " change.");
                        }
                        break;
                    default:
                        System.out.println("The " + popSong + " is not available song.");
                        break;

                }
                break;
            case "country":
                System.out.println("Which song would you like to listen to? \n Meant To Be \n Heaven \n Simple \n One Number Away \n Get Along");
                String countrySong = scanner.nextLine().toLowerCase().trim();
                switch (countrySong) {
                    case "heaven":
                    case "simple":
                    case "one number away":
                    case "get along":
                    case "meant to be":
                        System.out.println("Please enter $3.00 for this song.");
                        double costCountry = scanner.nextDouble();
                        if (costCountry == 3) {
                            System.out.println("You are listening to " + countrySong + ". Enjoy the song!");
                        } else if (costCountry < 3) {
                            while (costCountry < 3) {
                                System.out.println(costCountry+ "is not enough, please add $" + (3 - costCountry) + " more");
                                costCountry = scanner.nextDouble() + costCountry;
                                if (costCountry > 3) {
                                    System.out.println("You have entered $" + (costCountry - 4) + " more than required. Please enjoy the music while we processing your change!");
                                    System.out.println("Here is your $" + (costCountry - 4) + " change.");

                                } else if (costCountry == 3) {
                                    System.out.println("You are listening to " + countrySong + ". Enjoy the song!");
                                }
                            }
                        } else {
                            System.out.println("You have entered $" + (costCountry - 3) + " more than required. Please enjoy the song while we process your change.");
                            System.out.println("Here is your $" + (costCountry - 3) + " change.");
                        }
                        break;
                    default:
                        System.out.println("The " + countrySong + " is not available song.");
                        break;
                }
                break;
        }
    }
}