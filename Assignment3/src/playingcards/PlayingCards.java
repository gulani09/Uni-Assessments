package playingcards;

//File : PlayingCards.java
//Course Name : ITC538 - Programming in Java 1
//Assessment Item : Assignment 3
//Instructor Name : Recep Ulusoy
//Date : 19 May 2017
//Due on : 26 May 2017
//Student Id : 11619843
//Student Name : Gulani Senthuran

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
* (Display three cards randomly and two joker cards)
*
* This programme used to displays three cards randomly selected from
* a deck of 52. The card image files are
* named 1.png, 2.png, ..., 52.png and stored in the card/ directory.
* All three cards are distinct and selected randomly. An two joker cards are 
* displayed center one after another. 
* This file used HBox, VBox and BorderPane
*
* @author Gulani Senthuran
*/

public class PlayingCards extends Application {

 @Override
 public void start(Stage primaryStage) {

		// Create a border pane
		BorderPane borderPane = new BorderPane();
		// Place the notes in the pane
		borderPane.setTop(getHbox());
		borderPane.setCenter(getVbox());

		// Create the scene object and place it into the stage
     Scene scene = new Scene(borderPane);
		// Set the name of the stage
     primaryStage.setTitle("Random Playing Cards");
     primaryStage.setScene(scene);
		// Display the stage
     primaryStage.show();
 }

	/**
	 * This method used to get the hirizontal display cards.
	 * Three cards display randomly. 
	 * 
	 * @return HBox
	 */
	private HBox getHbox() {
		// Create horizontal box
     HBox hPane = new HBox(35);
		// Create space between each card
		hPane.setPadding(new Insets(15,15,15,15));
		// Card position set to center
		hPane.setAlignment(Pos.CENTER);
		// Store the 52 cards in the array
     boolean[] playCards = new boolean[52];
     // Choose 3 random distinct cards from the deck
     int count = 0;
     while (count < 3) {
         int card = (int) (Math.random() * 52);
         if (!playCards[card]) {
             playCards[card] = true;
				// Pass the selecte ranom card into image object
				Image image = new Image("cards/"+(++card)+".png");
             // Card png files start from 1, so increment card by one
             // for the correct file name.
             hPane.getChildren().add(new ImageView(image));
             count++;
         }
     }
		return hPane;
	}

	/**
	 * This method used to get the vertical display cards.
	 * Two joker card display at center
	 * 
	 * @return VBox
	 */
	private VBox getVbox() {
		// Create vertical box
		VBox vPane = new VBox(35);
		// Create space between each card
		vPane.setPadding(new Insets(15,15,15,15));
		// Card position set to center
		vPane.setAlignment(Pos.CENTER);
		// Choose the joker1 card and dispaly it
		Image joker1 = new Image("cards/53.png");
		ImageView jokerImageView1 = new ImageView(joker1);
		// Rotate the card by 45'
		jokerImageView1.setRotate(45);
		vPane.getChildren().add(jokerImageView1);

		// Choose the joker1 card and dispaly it
		Image joker2 = new Image("cards/54.png");
		ImageView jokerImageView2 = new ImageView(joker2);
		// rotate the card by 90'
		jokerImageView2.setRotate(90);
		vPane.getChildren().add(jokerImageView2);

		return vPane;
	}
}