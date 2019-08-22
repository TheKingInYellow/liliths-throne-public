package com.lilithsthrone.utils.comparators;

import java.util.Comparator;

import com.lilithsthrone.game.inventory.clothing.AbstractClothing;

/**
 * Compares by zLayer, using the InventorySlot in index 0 of available equip slots.
 * 
 * @since 0.1.0
 * @version 0.3.4
 * @author Innoxia
 */
public class ClothingZLayerComparator implements Comparator<AbstractClothing> {
	@Override
	public int compare(AbstractClothing o1, AbstractClothing o2) {
		if (o2.getClothingType().getEquipSlots().get(0).getZLayer() > o1.getClothingType().getEquipSlots().get(0).getZLayer()) {
			return 1;
			
		} else if (o2.getClothingType().getEquipSlots().get(0).getZLayer() == o1.getClothingType().getEquipSlots().get(0).getZLayer()) {
			if (o2.getValue() > o1.getValue()) {
				return 1;
			} else if (o1.getValue() > o2.getValue()) {
				return -1;
			}
			return 0;
		} else {
			return -1;
		}
	}
}