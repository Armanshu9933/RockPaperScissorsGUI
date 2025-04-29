import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RockPaperScissorsGUI extends JFrame implements ActionListener
{
    private JButton rockButton;
    private JButton paperButton;
    private JButton scissorsButton;
    private JLabel resultLabel;

    public RockPaperScissorsGUI()
    {
        setTitle("Rock, Paper, Scissors");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        rockButton = new JButton("Rock");
        paperButton = new JButton("Paper");
        scissorsButton = new JButton("Scissors");
        resultLabel = new JLabel("Choose your move!");

        rockButton.addActionListener(this);
        paperButton.addActionListener(this);
        scissorsButton.addActionListener(this);

        add(rockButton);
        add(paperButton);
        add(scissorsButton);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String[] choices = { "Rock", "Paper", "Scissors" };
        String userChoice = e.getActionCommand();
        String computerChoice = choices[(int)(Math.random() * 3)];

        String result = determineWinner(userChoice, computerChoice);
        resultLabel.setText("Computer chose " + computerChoice + ". " + result);
    }

    private String determineWinner(String user, String computer)
    {
        if (user.equals(computer))
        {
            return "It's a draw!";
        }
        else if ((user.equals("Rock") && computer.equals("Scissors")) ||
                 (user.equals("Paper") && computer.equals("Rock")) ||
                 (user.equals("Scissors") && computer.equals("Paper")))
        {
            return "You win!";
        }
        else
        {
            return "You lose!";
        }
    }

    public static void main(String[] args)
    {
        new RockPaperScissorsGUI();
    }
};
