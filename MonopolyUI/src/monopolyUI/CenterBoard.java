package monopolyUI;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.Box;
import java.awt.GridBagConstraints;
import java.util.Hashtable;
import java.util.List;

import javax.swing.JLabel;

import main.MonopolyGame;
import objectmodel.Dice.DiceThrowResult;
import objectmodel.Player;
import services.Utils;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;

public class CenterBoard extends JPanel {

	private static final long serialVersionUID = 1L;
	private DiceController dice;
	private final Hashtable<Player,JLabel> playerToLabel = new Hashtable<Player,JLabel>();

	/**
	 * This is the default constructor
	 */
	public CenterBoard(MonopolyGame game) {
		super();
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{217, 0};
		gridBagLayout.rowHeights = new int[]{142, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		dice = new DiceController(game);
		GridBagConstraints gbc_dice = new GridBagConstraints();
		gbc_dice.insets = new Insets(0, 0, 5, 0);
		gbc_dice.gridx = 1;
		gbc_dice.gridy = 0;
		add(dice, gbc_dice);
		
		Box playersBox = Box.createVerticalBox();
		GridBagConstraints gbc_playersBox = new GridBagConstraints();
		gbc_playersBox.insets = new Insets(0, 0, 5, 5);
		gbc_playersBox.gridx = 0;
		gbc_playersBox.gridy = 0;
		add(playersBox, gbc_playersBox);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(Utils.getImageIcon("cardsdeck.jpg"));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		for (Player player : game.getPlayers())
		{
			JLabel userLbl = new JLabel();
			playerToLabel.put(player, userLbl);
			UpdatePlayerLabelText(player);
			String colorImageName = "Box" + player.getPlayerColor().toString() + "32.png";
			userLbl.setIcon(Utils.getImageIcon(colorImageName));
			playersBox.add(userLbl);
		}
		
		initialize();
	}
	
	public void UpdatePlayerLabelText(Player player)
	{
		JLabel lbl = playerToLabel.get(player);
		lbl.setText(player.getName() + ", " + player.getMoney() + "$");
		if (!player.isInGame())
		{
			lbl.setEnabled(false);
		}
	}
	
	public void SimulateDiceThrow(DiceThrowResult diceThrow)
	{
		dice.SimulateThrow(diceThrow);
	}

	public void EnableDiceThrow()
    {
    	dice.EnableDiceThrow();
    }
	
	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
	}

}
