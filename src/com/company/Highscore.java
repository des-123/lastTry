
import com.company.Input;


public class Highscore {




    // determine the high score
    int highScore = 0;

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        while (line != null)                 // read the score file line by line
        {
            try {
                int score = Integer.parseInt(line.trim());   // parse each line as an int
                if (score > highScore)                       // and keep track of the largest
                {
                    highScore = score;
                }
            } catch (NumberFormatException e1) {
                // ignore invalid scores
                //System.err.println("ignoring invalid score: " + line);
            }
            line = reader.readLine();
        }
        reader.close();

    catch (IOException ex) {
        System.err.println("ERROR reading scores from file");
    }



    // display the high score
    if (points > highScore)
    {
        System.out.println("You now have the new high score! The previous high score was " + highScore);
    } else if (points == highScore) {
        System.out.println("You tied the high score!");
    } else {
        System.out.println("The all time high score was " + highScore);
    }


    // append the last score to the end of the file
    try {
        BufferedWriter output = new BufferedWriter(new FileWriter(file, true));
        output.newLine();
        output.append("" + points);
        output.close();

    } catch (IOException ex1) {
        System.out.printf("ERROR writing score to file: %s\n", ex1);
    }
}






