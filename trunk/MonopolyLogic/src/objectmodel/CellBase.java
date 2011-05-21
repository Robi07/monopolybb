//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2-70- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.26 at 10:31:45 PM IST 
//


package objectmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import main.GettingOutOfJailReason;

import objectmodel.DiceThrowResult;

import main.StateManager;


/**
 * <p>Java class for CellBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PassToll" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LandToll" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="City"/>
 *             &lt;enumeration value="Service"/>
 *             &lt;enumeration value="Jail"/>
 *             &lt;enumeration value="GotoJail"/>
 *             &lt;enumeration value="Parking"/>
 *             &lt;enumeration value="Chance"/>
 *             &lt;enumeration value="Community Chest"/>
 *             &lt;enumeration value="Go"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Buyable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Owned" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellBase", propOrder = {
    "price",
    "passToll",
    "landToll"
})
@XmlSeeAlso({
    Asset.class,
    City.class
})
public class CellBase {

    @XmlElement(name = "Price")
    protected Integer price;
    @XmlElement(name = "PassToll")
    protected Integer passToll;
    @XmlElement(name = "LandToll")
    protected Integer landToll;
    @XmlAttribute(name = "ID", required = true)
    protected int id;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "Buyable", required = true)
    protected boolean buyable;
    @XmlAttribute(name = "Owned", required = true)
    protected boolean owned;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrice(Integer value) {
        this.price = value;
    }

    /**
     * Gets the value of the passToll property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPassToll() {
        return passToll;
    }

    /**
     * Sets the value of the passToll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassToll(Integer value) {
        this.passToll = value;
    }

    /**
     * Gets the value of the landToll property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLandToll() {
        return landToll;
    }

    /**
     * Sets the value of the landToll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLandToll(Integer value) {
        this.landToll = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the buyable property.
     * 
     */
    public boolean isBuyable() {
        return buyable;
    }

    /**
     * Sets the value of the buyable property.
     * 
     */
    public void setBuyable(boolean value) {
        this.buyable = value;
    }

    /**
     * Gets the value of the owned property.
     * 
     */
    public boolean isOwned() {
        return owned;
    }

    /**
     * Sets the value of the owned property.
     * 
     */
    public void setOwned(boolean value) {
        this.owned = value;
    }

    /**
     * Checks if the player should roll the dice on this cell
     */
    public boolean shouldRollTheDice(Player thePlayer)
    {
    	if (type.equals("Parking") && thePlayer.isParking())
    	{
    		thePlayer.setParking(false);
    		return false;
    	}
    	
    	return true;
    }
    
    /**
     * Checks if the player should move from this cell
     */
    public boolean shouldMove(Player thePlayer, DiceThrowResult throwResult)
    {
    	if (type.equals("Jail") && thePlayer.isInJail())
    	{
    		boolean hasPass = false;
    		for (int i =0; i < thePlayer.getOwnedCards().getCard().size(); i++)
    		{
    			BonusCard card = thePlayer.getOwnedCards().getCard().get(i);
    			if (card.type.equals("Jail Pass"))
    			{
    				thePlayer.getOwnedCards().getCard().remove(i);
    				thePlayer.getPlayerActions().returnCardToDeck(card);
    				hasPass = true;
    				break;
    			}
    		}
    		if (!throwResult.isDouble() && !hasPass)
    		{
    			return false;
    		}
    		
    		thePlayer.setInJail(false);

                GettingOutOfJailReason reason = GettingOutOfJailReason.Double;
                if (hasPass)
                    reason = GettingOutOfJailReason.Card;

    		StateManager.getStateManager().setCurrentStateToPlayerGettingOutOfJail(this, 
					thePlayer.getName() + " is walking out of jail with a jail pass",
					thePlayer, reason);
    	}
    	
    	return true;
    }
    
    public void performPlayerLand(Player landedPlayer)
    {
        if (getType().compareTo("Go") == 0)
        {
            StateManager.getStateManager().setCurrentStateToPlayerLandedOnStartSquare(this, "Passing Go",      
                   landedPlayer);
        }

        if (landToll != null)
    	{
    		if (landToll > 0)
    		{
    			landedPlayer.getPlayerActions().payMoneyToBank(landToll);
    		}
    		else
    		{
    			landedPlayer.getPlayerActions().getMoneyFromBank(-landToll);
    		}
    	}
    	
    	if (type.equals("Chance"))
    	{
    		landedPlayer.getPlayerActions().drawChanceCard();
    	}
    	else if (type.equals("Community Chest"))
    	{
    		landedPlayer.getPlayerActions().drawCommunityChestCard();
    	}
    	else if (type.equals("Parking"))
    	{
    		landedPlayer.isParking = true;
    	}
    	else if (type.equals("GotoJail"))
    	{
    		landedPlayer.isInJail = true;
    		landedPlayer.getPlayerActions().moveToCell("Jail (Free Pass)", false);    		
    	}
    }
    
    public void returnToBank()
    {
    	owned = false;
    }
    
    public void setOwner(Player newOwner){}
}
