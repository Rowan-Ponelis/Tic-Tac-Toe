import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {

        String one = " ";
        String two = " ";
        String three = " ";
        String four = " ";
        String five = " ";
        String six = " ";
        String seven = " ";
        String eight = " ";
        String nine = " ";
        String userOne = "t";
        String userTwo = "f";
        String winGame = "f";
        String Error1 = "f";
        String Error2 = "f";

            while (winGame == "f") {

            Scanner sc = new Scanner(System.in);
            String User = sc.next();

            if (userOne == "t") {
                System.out.println("Player 1's Turn is:");
                switch (User) {
                    case "1":
                        if (one == " ") {
                            one = "x";
                        } else {
                            System.out.println("Error: Cannot perform actions");
                            Error1 = "t";
                        }
                        break;
                    case "2":
                        if (two == " ") {
                            two = "x";
                        } else {
                            System.out.println("Error: Cannot perform actions");
                            Error1 = "t";
                        }
                        break;


                    case "3":
                        if (three == " ") {
                            three = "x";
                        } else {
                            System.out.println("Error: Cannot perform actions");
                            Error1 = "t";
                        }
                        break;


                    case "4":
                        if (four == " ") {
                            four = "x";
                        } else {
                            System.out.println("Error: Cannot perform actions");
                            Error1 = "t";
                        }
                        break;

                    case "5":
                        if (five == " ") {
                            five = "x";
                        } else {
                            System.out.println("Error: Cannot perform actions");
                            Error1 = "t";
                        }
                        break;

                    case "6":
                        if (six == " ") {
                            six = "x";
                        } else {
                            System.out.println("Error: Cannot perform actions");
                            Error1 = "t";
                        }
                        break;

                    case "7":
                        if (seven == " ") {
                            seven = "x";
                        } else {
                            System.out.println("Error: Cannot perform actions");
                            Error1 = "t";
                        }
                        break;

                    case "8":
                        if (eight == " ") {
                            eight = "x";
                        } else {
                            System.out.println("Error: Cannot perform actions");
                            Error1 = "t";
                        }
                        break;

                    case "9":
                        if (nine == " ") {
                            nine = "x";
                        } else {
                            System.out.println("Error: Cannot perform actions");
                            Error1 = "t";
                        }
                        break;
                }
            }

            if (userTwo == "t") {
                System.out.println("Player 2's Turn is:");
                switch (User) {
                    case "1":
                        if (one == " ") {
                            one = "o";
                        } else {
                            System.out.println("Error: Cannot perform actions");
                            Error2 = "t";
                        }
                        break;
                    case "2":
                        if (two == " ") {
                            two = "o";
                        } else {
                            System.out.println("Error: Cannot perform actions");
                            Error2 = "t";
                        }
                        break;

                    case "3":
                        if (three == " ") {
                            three = "o";
                        } else {
                            System.out.println("Error: Cannot perform actions");
                            Error2 = "t";
                        }
                        break;

                    case "4":
                        if (four == " ") {
                            four = "o";
                        } else {
                            System.out.println("Error: Cannot perform actions");
                            Error2 = "t";
                        }
                        break;

                    case "5":
                        if (five == " ") {
                            five = "o";
                        } else {
                            System.out.println("Error: Cannot perform actions");
                            Error2 = "t";
                        }
                        break;

                    case "6":
                        if (six == " ") {
                            six = "o";
                        } else {
                            System.out.println("Error: Cannot perform actions");
                            Error2 = "t";
                        }
                        break;

                    case "7":
                        if (seven == " ") {
                            seven = "o";
                        } else {
                            System.out.println("Error: Cannot perform actions");
                            Error2 = "t";
                        }
                        break;

                    case "8":
                        if (eight == " ") {
                            eight = "o";
                        } else {
                            System.out.println("Error: Cannot perform actions");
                            Error2 = "t";
                        }
                        break;

                    case "9":
                        if (nine == " ") {
                            nine = "o";
                        } else {
                            System.out.println("Error: Cannot perform actions");
                            Error2 = "t";
                        }
                        break;

                }
            }

                if (one == "x" && two == "x" && three == "x") {
                    winGame = "t";
                    System.out.println("");
                    System.out.println("Player 1 WINS!!!");
                } else if (four == "x" && five == "x" && six == "x") {
                    winGame = "t";
                    System.out.println("");
                    System.out.println("Player 1 WINS!!!");
                } else if (seven == "x" && eight == "x" && nine == "x") {
                    winGame = "t";
                    System.out.println("");
                    System.out.println("Player 1 WINS!!!");
                }

                if (one == "x" && four == "x" && seven == "x") {
                    winGame = "t";
                    System.out.println("");
                    System.out.println("Player 1 WINS!!!");
                } else if (two == "x" && five == "x" && eight == "x") {
                    winGame = "t";
                    System.out.println("");
                    System.out.println("Player 1 WINS!!!");
                } else if (three == "x" && five == "x" && nine == "x") {
                    winGame = "t";
                    System.out.println("");
                    System.out.println("Player 1 WINS!!!");
                }

                if (one == "o" && five == "o" && nine == "o") {
                    winGame = "t";
                    System.out.println("");
                    System.out.println("Player 2 WINS!!!");
                } else if (three == "o" && five == "o" && seven == "o") {
                    winGame = "t";
                    System.out.println("");
                    System.out.println("Player 2 WINS!!!");
                }

            if (one == "o" && two == "o" && three == "o") {
                winGame = "t";
                System.out.println("");
                System.out.println("Player 2 WINS!!!");
            } else if (four == "o" && five == "o" && six == "o") {
                winGame = "t";
                System.out.println("");
                System.out.println("Player 2 WINS!!!");
            } else if (seven == "o" && eight == "o" && nine == "o") {
                winGame = "t";
                System.out.println("");
                System.out.println("Player 2 WINS!!!");
            }

            if (one == "o" && four == "o" && seven == "o") {
                winGame = "t";
                System.out.println("");
                System.out.println("Player 2 WINS!!!");
            } else if (two == "o" && five == "o" && eight == "o") {
                winGame = "t";
                System.out.println("");
                System.out.println("Player 2 WINS!!!");
            } else if (three == "o" && six == "o" && nine == "o") {
                winGame = "t";
                System.out.println("");
                System.out.println("Player 2 WINS!!!");
            }

            if (one == "o" && five == "o" && nine == "o") {
                winGame = "t";
                System.out.println("");
                System.out.println("Player 2 WINS!!!");
            } else if (three == "o" && five == "o" && seven == "o") {
                winGame = "t";
                System.out.println("");
                System.out.println("Player 2 WINS!!!");
            }

            System.out.println("  " + one + "  |  " + two + "  |  " + three + "");
            System.out.println(" ____|_____|_____");
            System.out.println("  " + four + "  |  " + five + "  |  " + six + "  ");
            System.out.println(" ____|_____|_____");
            System.out.println("  " + seven + "  |  " + eight + "  |  " + nine + "  ");
            System.out.println("     |     |     ");


                if (userOne == "t") {
                    userOne = "f";
                    userTwo = "t";
                } else if (userOne == "f") {
                    userOne = "t";
                    userTwo = "f";
                }

                if (Error1 == "t") {
                    userOne = "t";
                    userTwo = "f";
                } else if (Error2 == "t") {
                    userOne = "f";
                    userTwo = "t";
                }
            Error1 = "f";
            Error2 = "f";

        }
    }
}