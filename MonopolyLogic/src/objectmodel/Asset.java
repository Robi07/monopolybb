//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2-70- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.26 at 10:31:45 PM IST 
//


package objectmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import main.StateManager;


/**
 * <p>Java class for Asset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Asset">
 *   &lt;complexContent>
 *     &lt;extension base="{}CellBase">
 *       &lt;sequence>
 *         &lt;element name="Group" type="{}Assets"/>
 *         &lt;element name="GroupToll" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Owner" type="{}Player" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asset", propOrder = {
    "group",
    "groupToll",
    "owner"
})
public class Asset
    extends CellBase
{

    @XmlElement(name = "Group", required = true)
    protected Assets group;
    @XmlElement(name = "GroupToll")
    protected int groupToll;
    @XmlElement(name = "Owner")
    protected Player owner;

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link Assets }
     *     
     */
    public Assets getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link Assets }
     *     
     */
    public void setGroup(Assets value) {
        this.group = value;
    }

    /**
     * Gets the value of the groupToll property.
     * 
     */
    public int getGroupToll() {
        return groupToll;
    }

    /**
     * Sets the value of the groupToll property.
     * 
     */
    public void setGroupToll(int value) {
        this.groupToll = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link Player }
     *     
     */
    public Player getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Player }
     *     
     */
    @Override
    public void setOwner(Player value) {
        this.owner = value;
    }

    @Override
    public void performPlayerLand(Player landedPlayer)
    {
    	// does the asset have an owner?
    	if(owned)
    	{
    		// who owns the asset?
    		if (this.owner == landedPlayer)
    		{
    			// we own it - nothing to do!
    			StateManager.getStateManager().setCurrentStateToPlayerLanded(this, 
    					landedPlayer.getName() + " already owns the asset", landedPlayer, this);
    		}
    		// crap! someone else owns the asset!
    		else
    		{
    			int payToll = landToll;
    			// does he own the whole asset group?
    			if (RealEstate.getRealEstate().doesOwnAsset(owner, group.getName()))
    			{
    				payToll = groupToll;
    			}
    					
    			landedPlayer.getPlayerActions().payToPlayer(owner, payToll);
    			StateManager.getStateManager().setCurrentStateToPlayerPaying(this, 
    					landedPlayer.getName() + " has to pay " + payToll + " to " + owner.getName(),
    					landedPlayer, payToll);
    		}
    	}
    	// no one owns the asset
    	else
    	{
    		// does the player have enough money to buy the asset?
    		if (landedPlayer.getMoney() > price)
    		{
    			// does the player want to buy the asset?
    			if (landedPlayer.getInputObject().buyCell(this))
    			{
    				// yep! buy the asset...
    				landedPlayer.getPlayerActions().payMoneyToBank(price);
    				landedPlayer.getOwnedCells().getCell().add(this);
    				this.owner = landedPlayer;
    				owned = true;
    				StateManager.getStateManager().setCurrentStateToPlayerBuying(this, 
    						landedPlayer.getName() + " has just bought " + name, landedPlayer, this);
    			}
    		}
    		// not enough $$$
    		else
    		{
    			StateManager.getStateManager().setCurrentStateToPlayerLanded(this, 
    					landedPlayer.getName() + " doesn't have enough money for " + name,
    					landedPlayer, this);
    		}
    	}
    }
    
    @Override
    public void returnToBank()
    {
    	owned = false;
    	owner = null;
    }
}
