# Description:

This Java application is a graphical user interface (GUI) implementation of the classic game "Rock, Paper, Scissors," built using the # Java Swing#  library. It allows users to play against the computer by selecting their move via interactive buttons and instantly displays the game's outcome.

# Key Features:  
1. # User Interface:  
   - Three buttons labeled *Rock*, *Paper*, and *Scissors* for user input.  
   - A text label to show the game result and the computer's randomly selected move.  
   - A responsive window with a flow layout for simplicity.  

2. # Game Logic:  
   - The computer randomly selects its move (Rock, Paper, or Scissors) using `Math.random()`.  
   - The winner is determined by comparing the user's choice with the computer's choice using predefined rules:  
     - Rock beats Scissors.  
     - Paper beats Rock.  
     - Scissors beat Paper.  
     - Matching choices result in a draw.  

3. # Functionality: 
   - When a user clicks a button, the `actionPerformed` method triggers the game logic, computes the result, and updates the result label dynamically.  
   - The result message includes the computer’s choice and the outcome (win, lose, or draw).  

# Technical Implementation:   
- Extends `JFrame` for the application window and implements `ActionListener` to handle button events.  
- Uses Swing components like `JButton` and `JLabel` for interactive elements.  
- Designed with a clean, event-driven architecture for easy maintenance.  

# Purpose:  
This application demonstrates basic GUI development, event handling, and game logic implementation in Java. It serves as an introductory example for building interactive desktop applications with Swing.
